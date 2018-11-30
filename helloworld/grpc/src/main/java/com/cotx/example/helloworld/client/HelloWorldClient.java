package com.cotx.example.helloworld.client;

import com.cotx.example.helloworld.GreeterGrpc;
import com.cotx.example.helloworld.HelloReply;
import com.cotx.example.helloworld.HelloRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class HelloWorldClient {

    private final ManagedChannel channel;
    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    public HelloWorldClient(int port, String host) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext(true));
    }

    private HelloWorldClient(ManagedChannelBuilder<?> channelBuilder){
        channel = channelBuilder.build();
        blockingStub=GreeterGrpc.newBlockingStub(channel);
    }

    public void shutDown()throws InterruptedException{
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void greet(String name){
        HelloRequest request=HelloRequest.newBuilder().setName(name).build();
        HelloReply response;

        //blockingStub.sayHello(request);
        try {
            response = blockingStub.sayHello(request);
        }catch (StatusRuntimeException e){
            System.out.println("RPC调用失败："+e.getMessage());
            return;
        }
        System.out.println("服务器返回信息："+response.getName());
    }

    public static void main(String[] args) throws Exception{
        HelloWorldClient client = new HelloWorldClient(50051, "127.0.0.1");
        try {
            for (int i=0;i<3;i++){
                client.greet("world:"+i);
            }
        }finally {
            client.shutDown();
        }

    }
}

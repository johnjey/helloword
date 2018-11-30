package com.cotx.client;

import com.cotx.ovsctl.message.Bool;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsController;
import com.cotx.ovsctl.service.AddControllerRequest;
import com.cotx.ovsctl.service.BridgeConfigGrpc;
import com.cotx.ovsctl.service.CommonField;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class BridgeConfigClient {
    private final ManagedChannel channel;
    private final BridgeConfigGrpc.BridgeConfigBlockingStub blockingStub;

    public BridgeConfigClient(int port, String host) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext(true));
    }

    private BridgeConfigClient(ManagedChannelBuilder<?> channelBuilder){
        channel = channelBuilder.build();
        blockingStub=BridgeConfigGrpc.newBlockingStub(channel);
    }

    public void shutDown()throws InterruptedException{
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void addController(String name,OvsController controller){
        AddControllerRequest.Builder builder = AddControllerRequest.newBuilder();
        builder.setController(controller);
        CommonField commonField = CommonField.newBuilder()
                .setBridgeName(name)
                .build();
        builder.setBridgeName(commonField);

        AddControllerRequest request = builder.build();

        //rpc 调用返回Boolean类型
        Bool response;
        try {
            response = blockingStub.addController(request);
        }catch (StatusRuntimeException e){
            System.out.println("RPC调用失败："+e.getMessage());
            return;
        }
        System.out.println("服务器返回信息："+response);
    }
}

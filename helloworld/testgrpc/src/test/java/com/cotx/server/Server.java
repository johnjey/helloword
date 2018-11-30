package com.cotx.server;

import io.grpc.BindableService;
import io.grpc.ServerBuilder;

public class Server {
    private static int port=50051;
    private static io.grpc.Server server;

    public static void start(BindableService bindableService) throws Exception {
        server=ServerBuilder.forPort(port)
                .addService(bindableService)
                .build()
                .start();
        System.out.println("service start");
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                Server.stop();
                System.err.println("*** server shut down");
            }
        });
    }
    private static void stop() {
        if (server != null) {
            server.shutdown();
        }
    }
    // block 一直到程序退出
    public static void blockUntilShutDown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
    /*public static void main(String[] args) throws Exception {
        Server server = new Server();
        server.start(new BridgeConfigImpl());
        server.blockUntilShutDown();
    }*/
}

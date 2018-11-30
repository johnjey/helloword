package com.cotx.service;

import com.cotx.ovsctl.message.Bool;
import com.cotx.ovsctl.message.Void;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsInterface;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsPort;
import com.cotx.ovsctl.service.*;
import io.grpc.stub.StreamObserver;

public class BridgeConfigImpl extends BridgeConfigGrpc.BridgeConfigImplBase {
    @Override
    public void addController(AddControllerRequest request, StreamObserver<Bool> responseObserver) {
        System.out.println("获取桥名称："+request.getBridgeName().getBridgeName());
        System.out.println(request.getBridgeName());
        System.out.println(request.getController());
        /**
         * toString方法已经在AbstractMessage类中实现，而且是final修饰的,不可重写，直接调用即可。
         */
        System.out.println(request.getController().toString());

        Bool.Builder builder = Bool.newBuilder();
        builder.setValues(true);
        Bool bool = builder.build();
        responseObserver.onNext(bool);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteController(DeleteControllerRequest request, StreamObserver<Void> responseObserver) {
        super.deleteController(request, responseObserver);
    }

    @Override
    public void getControllers(CommonField request, StreamObserver<GetControllersResponse> responseObserver) {
        super.getControllers(request, responseObserver);
    }

    @Override
    public void addPort(AddPortRequest request, StreamObserver<Bool> responseObserver) {
        super.addPort(request, responseObserver);
    }

    @Override
    public void addTunnelPort(AddTunnelPortRequest request, StreamObserver<Void> responseObserver) {
        super.addTunnelPort(request, responseObserver);
    }

    @Override
    public void deletePort(PortRequest request, StreamObserver<Bool> responseObserver) {
        super.deletePort(request, responseObserver);
    }

    @Override
    public void getPorts(CommonField request, StreamObserver<GetPortsResponse> responseObserver) {
        super.getPorts(request, responseObserver);
    }

    @Override
    public void getPortByUuid(PortRequest request, StreamObserver<OvsPort> responseObserver) {
        super.getPortByUuid(request, responseObserver);
    }

    @Override
    public void getInterfaces(PortRequest request, StreamObserver<GetInterfacesResponse> responseObserver) {
        super.getInterfaces(request, responseObserver);
    }

    @Override
    public void getInterface(InterfaceRequest request, StreamObserver<OvsInterface> responseObserver) {
        super.getInterface(request, responseObserver);
    }

    @Override
    public void addInterface(AddInterfaceRequest request, StreamObserver<Bool> responseObserver) {
        super.addInterface(request, responseObserver);
    }

    @Override
    public void deleteInterface(InterfaceRequest request, StreamObserver<Bool> responseObserver) {
        super.deleteInterface(request, responseObserver);
    }
}

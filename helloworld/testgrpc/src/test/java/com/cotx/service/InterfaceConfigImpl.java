package com.cotx.service;



import com.cotx.ovsctl.message.base.Bool;
import com.cotx.ovsctl.message.base.Void;
import com.cotx.ovsctl.message.service.interfaceconfig.*;
import com.cotx.ovsctl.service.interfaceconfig.InterfaceConfigGrpc;
import io.grpc.stub.StreamObserver;

public class InterfaceConfigImpl extends InterfaceConfigGrpc.InterfaceConfigImplBase {

    @Override
    public void addAccessMode(AddAccessModeRequest request, StreamObserver<Bool> responseObserver) {
        super.addAccessMode(request, responseObserver);
    }

    @Override
    public void removeAccessMode(CommonField request, StreamObserver<Bool> responseObserver) {
        super.removeAccessMode(request, responseObserver);
    }

    @Override
    public void addTrunkMode(AddTrunkModeRequest request, StreamObserver<Bool> responseObserver) {
        super.addTrunkMode(request, responseObserver);
    }

    @Override
    public void removeTrunkMode(CommonField request, StreamObserver<Bool> responseObserver) {
        super.removeTrunkMode(request, responseObserver);
    }

    @Override
    public void addRateLimit(AddRateLimitRequest request, StreamObserver<Bool> responseObserver) {
        super.addRateLimit(request, responseObserver);
    }

    @Override
    public void removeRateLimit(CommonField request, StreamObserver<Bool> responseObserver) {
        super.removeRateLimit(request, responseObserver);
    }

    @Override
    public void addTunnelMode(AddTunnelModeRequest request, StreamObserver<Bool> responseObserver) {
        super.addTunnelMode(request, responseObserver);
    }

    @Override
    public void removeTunnelMode(CommonField request, StreamObserver<Bool> responseObserver) {
        super.removeTunnelMode(request, responseObserver);
    }

    @Override
    public void addPatchMode(AddPatchModeRequest request, StreamObserver<Bool> responseObserver) {
        super.addPatchMode(request, responseObserver);
    }

    @Override
    public void removePatchMode(RemovePatchModeRequest request, StreamObserver<Bool> responseObserver) {
        super.removePatchMode(request, responseObserver);
    }

    @Override
    public void getInterfaces(Void request, StreamObserver<GetInterfacesResponse> responseObserver) {
        super.getInterfaces(request, responseObserver);
    }
}

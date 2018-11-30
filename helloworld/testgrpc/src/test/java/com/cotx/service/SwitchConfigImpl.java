package com.cotx.service;


import com.cotx.ovsctl.message.service.switchconfig.AddBridgeRequest;
import com.cotx.ovsctl.message.service.switchconfig.BridgeRequest;
import com.cotx.ovsctl.message.service.switchconfig.GetBridgeResponse;
import com.cotx.ovsctl.message.service.switchconfig.GetBridgesResponse;
import com.cotx.ovsctl.service.switchconfig.SwitchConfigGrpc;
import io.grpc.stub.StreamObserver;

public class SwitchConfigImpl extends SwitchConfigGrpc.SwitchConfigImplBase {

    @Override
    public void addBridge(AddBridgeRequest request, StreamObserver<com.cotx.ovsctl.message.base.Bool> responseObserver) {
        super.addBridge(request, responseObserver);
    }

    @Override
    public void deleteBridge(BridgeRequest request, StreamObserver<com.cotx.ovsctl.message.base.Bool> responseObserver) {
        super.deleteBridge(request, responseObserver);
    }

    @Override
    public void getBridge(BridgeRequest request, StreamObserver<GetBridgeResponse> responseObserver) {
        super.getBridge(request, responseObserver);
    }

    @Override
    public void getBridges(com.cotx.ovsctl.message.base.Void request, StreamObserver<GetBridgesResponse> responseObserver) {
        super.getBridges(request, responseObserver);
    }
}

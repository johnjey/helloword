package com.cotx.ovsctl.service.switchconfig;

import com.cotx.ovsctl.message.base.Bool;
import com.cotx.ovsctl.message.base.Void;
import com.cotx.ovsctl.message.service.switchconfig.AddBridgeRequest;
import com.cotx.ovsctl.message.service.switchconfig.BridgeRequest;
import com.cotx.ovsctl.message.service.switchconfig.GetBridgeResponse;
import com.cotx.ovsctl.message.service.switchconfig.GetBridgesResponse;
import com.cotx.ovsctl.message.service.switchconfig.SwitchConfigProto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: service/SwitchConfigService.proto")
public final class SwitchConfigGrpc {

  private SwitchConfigGrpc() {}

  public static final String SERVICE_NAME = "SwitchConfig";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AddBridgeRequest,
          Bool> getAddBridgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBridge",
      requestType = AddBridgeRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddBridgeRequest,
          Bool> getAddBridgeMethod() {
    io.grpc.MethodDescriptor<AddBridgeRequest, Bool> getAddBridgeMethod;
    if ((getAddBridgeMethod = SwitchConfigGrpc.getAddBridgeMethod) == null) {
      synchronized (SwitchConfigGrpc.class) {
        if ((getAddBridgeMethod = SwitchConfigGrpc.getAddBridgeMethod) == null) {
          SwitchConfigGrpc.getAddBridgeMethod = getAddBridgeMethod = 
              io.grpc.MethodDescriptor.<AddBridgeRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SwitchConfig", "addBridge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddBridgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new SwitchConfigMethodDescriptorSupplier("addBridge"))
                  .build();
          }
        }
     }
     return getAddBridgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BridgeRequest,
          Bool> getDeleteBridgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBridge",
      requestType = BridgeRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BridgeRequest,
          Bool> getDeleteBridgeMethod() {
    io.grpc.MethodDescriptor<BridgeRequest, Bool> getDeleteBridgeMethod;
    if ((getDeleteBridgeMethod = SwitchConfigGrpc.getDeleteBridgeMethod) == null) {
      synchronized (SwitchConfigGrpc.class) {
        if ((getDeleteBridgeMethod = SwitchConfigGrpc.getDeleteBridgeMethod) == null) {
          SwitchConfigGrpc.getDeleteBridgeMethod = getDeleteBridgeMethod = 
              io.grpc.MethodDescriptor.<BridgeRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SwitchConfig", "deleteBridge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BridgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new SwitchConfigMethodDescriptorSupplier("deleteBridge"))
                  .build();
          }
        }
     }
     return getDeleteBridgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BridgeRequest,
          GetBridgeResponse> getGetBridgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBridge",
      requestType = BridgeRequest.class,
      responseType = GetBridgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BridgeRequest,
          GetBridgeResponse> getGetBridgeMethod() {
    io.grpc.MethodDescriptor<BridgeRequest, GetBridgeResponse> getGetBridgeMethod;
    if ((getGetBridgeMethod = SwitchConfigGrpc.getGetBridgeMethod) == null) {
      synchronized (SwitchConfigGrpc.class) {
        if ((getGetBridgeMethod = SwitchConfigGrpc.getGetBridgeMethod) == null) {
          SwitchConfigGrpc.getGetBridgeMethod = getGetBridgeMethod = 
              io.grpc.MethodDescriptor.<BridgeRequest, GetBridgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SwitchConfig", "getBridge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BridgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetBridgeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SwitchConfigMethodDescriptorSupplier("getBridge"))
                  .build();
          }
        }
     }
     return getGetBridgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Void,
          GetBridgesResponse> getGetBridgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBridges",
      requestType = Void.class,
      responseType = GetBridgesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Void,
          GetBridgesResponse> getGetBridgesMethod() {
    io.grpc.MethodDescriptor<Void, GetBridgesResponse> getGetBridgesMethod;
    if ((getGetBridgesMethod = SwitchConfigGrpc.getGetBridgesMethod) == null) {
      synchronized (SwitchConfigGrpc.class) {
        if ((getGetBridgesMethod = SwitchConfigGrpc.getGetBridgesMethod) == null) {
          SwitchConfigGrpc.getGetBridgesMethod = getGetBridgesMethod = 
              io.grpc.MethodDescriptor.<Void, GetBridgesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SwitchConfig", "getBridges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetBridgesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SwitchConfigMethodDescriptorSupplier("getBridges"))
                  .build();
          }
        }
     }
     return getGetBridgesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SwitchConfigStub newStub(io.grpc.Channel channel) {
    return new SwitchConfigStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SwitchConfigBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SwitchConfigBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SwitchConfigFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SwitchConfigFutureStub(channel);
  }

  /**
   */
  public static abstract class SwitchConfigImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Adds a bridge with a given description.
     * </pre>
     */
    public void addBridge(AddBridgeRequest request,
                          io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBridgeMethod(), responseObserver);
    }

    /**
     * <pre>
     *Remove a bridge.
     * </pre>
     */
    public void deleteBridge(BridgeRequest request,
                             io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBridgeMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get a bridge.
     * </pre>
     */
    public void getBridge(BridgeRequest request,
                          io.grpc.stub.StreamObserver<GetBridgeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBridgeMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get all bridges.
     * </pre>
     */
    public void getBridges(Void request,
        io.grpc.stub.StreamObserver<GetBridgesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBridgesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddBridgeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddBridgeRequest,
                      Bool>(
                  this, METHODID_ADD_BRIDGE)))
          .addMethod(
            getDeleteBridgeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      BridgeRequest,
                      Bool>(
                  this, METHODID_DELETE_BRIDGE)))
          .addMethod(
            getGetBridgeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      BridgeRequest,
                      GetBridgeResponse>(
                  this, METHODID_GET_BRIDGE)))
          .addMethod(
            getGetBridgesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      Void,
                      GetBridgesResponse>(
                  this, METHODID_GET_BRIDGES)))
          .build();
    }
  }

  /**
   */
  public static final class SwitchConfigStub extends io.grpc.stub.AbstractStub<SwitchConfigStub> {
    private SwitchConfigStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SwitchConfigStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SwitchConfigStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SwitchConfigStub(channel, callOptions);
    }

    /**
     * <pre>
     *Adds a bridge with a given description.
     * </pre>
     */
    public void addBridge(AddBridgeRequest request,
                          io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBridgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Remove a bridge.
     * </pre>
     */
    public void deleteBridge(BridgeRequest request,
                             io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBridgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get a bridge.
     * </pre>
     */
    public void getBridge(BridgeRequest request,
                          io.grpc.stub.StreamObserver<GetBridgeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBridgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get all bridges.
     * </pre>
     */
    public void getBridges(Void request,
        io.grpc.stub.StreamObserver<GetBridgesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBridgesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SwitchConfigBlockingStub extends io.grpc.stub.AbstractStub<SwitchConfigBlockingStub> {
    private SwitchConfigBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SwitchConfigBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SwitchConfigBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SwitchConfigBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Adds a bridge with a given description.
     * </pre>
     */
    public Bool addBridge(AddBridgeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddBridgeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Remove a bridge.
     * </pre>
     */
    public Bool deleteBridge(BridgeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBridgeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get a bridge.
     * </pre>
     */
    public GetBridgeResponse getBridge(BridgeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBridgeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get all bridges.
     * </pre>
     */
    public GetBridgesResponse getBridges(Void request) {
      return blockingUnaryCall(
          getChannel(), getGetBridgesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SwitchConfigFutureStub extends io.grpc.stub.AbstractStub<SwitchConfigFutureStub> {
    private SwitchConfigFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SwitchConfigFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SwitchConfigFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SwitchConfigFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Adds a bridge with a given description.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> addBridge(
        AddBridgeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBridgeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Remove a bridge.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> deleteBridge(
        BridgeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBridgeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get a bridge.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetBridgeResponse> getBridge(
        BridgeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBridgeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get all bridges.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetBridgesResponse> getBridges(
        Void request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBridgesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_BRIDGE = 0;
  private static final int METHODID_DELETE_BRIDGE = 1;
  private static final int METHODID_GET_BRIDGE = 2;
  private static final int METHODID_GET_BRIDGES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SwitchConfigImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SwitchConfigImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_BRIDGE:
          serviceImpl.addBridge((AddBridgeRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_DELETE_BRIDGE:
          serviceImpl.deleteBridge((BridgeRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_GET_BRIDGE:
          serviceImpl.getBridge((BridgeRequest) request,
              (io.grpc.stub.StreamObserver<GetBridgeResponse>) responseObserver);
          break;
        case METHODID_GET_BRIDGES:
          serviceImpl.getBridges((Void) request,
              (io.grpc.stub.StreamObserver<GetBridgesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SwitchConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SwitchConfigBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SwitchConfigProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SwitchConfig");
    }
  }

  private static final class SwitchConfigFileDescriptorSupplier
      extends SwitchConfigBaseDescriptorSupplier {
    SwitchConfigFileDescriptorSupplier() {}
  }

  private static final class SwitchConfigMethodDescriptorSupplier
      extends SwitchConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SwitchConfigMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SwitchConfigGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SwitchConfigFileDescriptorSupplier())
              .addMethod(getAddBridgeMethod())
              .addMethod(getDeleteBridgeMethod())
              .addMethod(getGetBridgeMethod())
              .addMethod(getGetBridgesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package com.cotx.ovsctl.service.portconfig;

import com.cotx.ovsctl.message.base.Bool;
import com.cotx.ovsctl.message.service.portconfig.CommonRequestPara;
import com.cotx.ovsctl.message.service.portconfig.PortConfigProto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *PortConfig service interface
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: service/PortConfigService.proto")
public final class PortConfigGrpc {

  private PortConfigGrpc() {}

  public static final String SERVICE_NAME = "PortConfig";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CommonRequestPara,
          Bool> getEnableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enable",
      requestType = CommonRequestPara.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CommonRequestPara,
          Bool> getEnableMethod() {
    io.grpc.MethodDescriptor<CommonRequestPara, Bool> getEnableMethod;
    if ((getEnableMethod = PortConfigGrpc.getEnableMethod) == null) {
      synchronized (PortConfigGrpc.class) {
        if ((getEnableMethod = PortConfigGrpc.getEnableMethod) == null) {
          PortConfigGrpc.getEnableMethod = getEnableMethod = 
              io.grpc.MethodDescriptor.<CommonRequestPara, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PortConfig", "enable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonRequestPara.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new PortConfigMethodDescriptorSupplier("enable"))
                  .build();
          }
        }
     }
     return getEnableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CommonRequestPara,
          Bool> getDisableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "disable",
      requestType = CommonRequestPara.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CommonRequestPara,
          Bool> getDisableMethod() {
    io.grpc.MethodDescriptor<CommonRequestPara, Bool> getDisableMethod;
    if ((getDisableMethod = PortConfigGrpc.getDisableMethod) == null) {
      synchronized (PortConfigGrpc.class) {
        if ((getDisableMethod = PortConfigGrpc.getDisableMethod) == null) {
          PortConfigGrpc.getDisableMethod = getDisableMethod = 
              io.grpc.MethodDescriptor.<CommonRequestPara, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PortConfig", "disable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonRequestPara.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new PortConfigMethodDescriptorSupplier("disable"))
                  .build();
          }
        }
     }
     return getDisableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CommonRequestPara,
          Bool> getIsEnabledMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isEnabled",
      requestType = CommonRequestPara.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CommonRequestPara,
          Bool> getIsEnabledMethod() {
    io.grpc.MethodDescriptor<CommonRequestPara, Bool> getIsEnabledMethod;
    if ((getIsEnabledMethod = PortConfigGrpc.getIsEnabledMethod) == null) {
      synchronized (PortConfigGrpc.class) {
        if ((getIsEnabledMethod = PortConfigGrpc.getIsEnabledMethod) == null) {
          PortConfigGrpc.getIsEnabledMethod = getIsEnabledMethod = 
              io.grpc.MethodDescriptor.<CommonRequestPara, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PortConfig", "isEnabled"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonRequestPara.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new PortConfigMethodDescriptorSupplier("isEnabled"))
                  .build();
          }
        }
     }
     return getIsEnabledMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PortConfigStub newStub(io.grpc.Channel channel) {
    return new PortConfigStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PortConfigBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PortConfigBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PortConfigFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PortConfigFutureStub(channel);
  }

  /**
   * <pre>
   *PortConfig service interface
   * </pre>
   */
  public static abstract class PortConfigImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Enable administratively a port. 
     * </pre>
     */
    public void enable(CommonRequestPara request,
                       io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disable administratively a port. 
     * </pre>
     */
    public void disable(CommonRequestPara request,
                        io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getDisableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the information about the administrative state of a port. 
     * </pre>
     */
    public void isEnabled(CommonRequestPara request,
                          io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getIsEnabledMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      CommonRequestPara,
                      Bool>(
                  this, METHODID_ENABLE)))
          .addMethod(
            getDisableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      CommonRequestPara,
                      Bool>(
                  this, METHODID_DISABLE)))
          .addMethod(
            getIsEnabledMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      CommonRequestPara,
                      Bool>(
                  this, METHODID_IS_ENABLED)))
          .build();
    }
  }

  /**
   * <pre>
   *PortConfig service interface
   * </pre>
   */
  public static final class PortConfigStub extends io.grpc.stub.AbstractStub<PortConfigStub> {
    private PortConfigStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortConfigStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortConfigStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortConfigStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enable administratively a port. 
     * </pre>
     */
    public void enable(CommonRequestPara request,
                       io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disable administratively a port. 
     * </pre>
     */
    public void disable(CommonRequestPara request,
                        io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the information about the administrative state of a port. 
     * </pre>
     */
    public void isEnabled(CommonRequestPara request,
                          io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsEnabledMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *PortConfig service interface
   * </pre>
   */
  public static final class PortConfigBlockingStub extends io.grpc.stub.AbstractStub<PortConfigBlockingStub> {
    private PortConfigBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortConfigBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortConfigBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortConfigBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enable administratively a port. 
     * </pre>
     */
    public Bool enable(CommonRequestPara request) {
      return blockingUnaryCall(
          getChannel(), getEnableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disable administratively a port. 
     * </pre>
     */
    public Bool disable(CommonRequestPara request) {
      return blockingUnaryCall(
          getChannel(), getDisableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the information about the administrative state of a port. 
     * </pre>
     */
    public Bool isEnabled(CommonRequestPara request) {
      return blockingUnaryCall(
          getChannel(), getIsEnabledMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *PortConfig service interface
   * </pre>
   */
  public static final class PortConfigFutureStub extends io.grpc.stub.AbstractStub<PortConfigFutureStub> {
    private PortConfigFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PortConfigFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PortConfigFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PortConfigFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enable administratively a port. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> enable(
        CommonRequestPara request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disable administratively a port. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> disable(
        CommonRequestPara request) {
      return futureUnaryCall(
          getChannel().newCall(getDisableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the information about the administrative state of a port. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> isEnabled(
        CommonRequestPara request) {
      return futureUnaryCall(
          getChannel().newCall(getIsEnabledMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENABLE = 0;
  private static final int METHODID_DISABLE = 1;
  private static final int METHODID_IS_ENABLED = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PortConfigImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PortConfigImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENABLE:
          serviceImpl.enable((CommonRequestPara) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_DISABLE:
          serviceImpl.disable((CommonRequestPara) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_IS_ENABLED:
          serviceImpl.isEnabled((CommonRequestPara) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
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

  private static abstract class PortConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PortConfigBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PortConfigProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PortConfig");
    }
  }

  private static final class PortConfigFileDescriptorSupplier
      extends PortConfigBaseDescriptorSupplier {
    PortConfigFileDescriptorSupplier() {}
  }

  private static final class PortConfigMethodDescriptorSupplier
      extends PortConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PortConfigMethodDescriptorSupplier(String methodName) {
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
      synchronized (PortConfigGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PortConfigFileDescriptorSupplier())
              .addMethod(getEnableMethod())
              .addMethod(getDisableMethod())
              .addMethod(getIsEnabledMethod())
              .build();
        }
      }
    }
    return result;
  }
}

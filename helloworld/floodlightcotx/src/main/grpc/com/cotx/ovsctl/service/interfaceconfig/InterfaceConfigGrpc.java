package com.cotx.ovsctl.service.interfaceconfig;

import com.cotx.ovsctl.message.base.Bool;
import com.cotx.ovsctl.message.base.Void;
import com.cotx.ovsctl.message.service.interfaceconfig.AddAccessModeRequest;
import com.cotx.ovsctl.message.service.interfaceconfig.AddPatchModeRequest;
import com.cotx.ovsctl.message.service.interfaceconfig.AddRateLimitRequest;
import com.cotx.ovsctl.message.service.interfaceconfig.AddTrunkModeRequest;
import com.cotx.ovsctl.message.service.interfaceconfig.AddTunnelModeRequest;
import com.cotx.ovsctl.message.service.interfaceconfig.CommonField;
import com.cotx.ovsctl.message.service.interfaceconfig.GetInterfacesResponse;
import com.cotx.ovsctl.message.service.interfaceconfig.InterfaceConfigProto;
import com.cotx.ovsctl.message.service.interfaceconfig.RemovePatchModeRequest;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *InterfaceConfig service interface
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: service/InterfaceConfigService.proto")
public final class InterfaceConfigGrpc {

  private InterfaceConfigGrpc() {}

  public static final String SERVICE_NAME = "InterfaceConfig.InterfaceConfig";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AddAccessModeRequest,
          Bool> getAddAccessModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addAccessMode",
      requestType = AddAccessModeRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddAccessModeRequest,
          Bool> getAddAccessModeMethod() {
    io.grpc.MethodDescriptor<AddAccessModeRequest, Bool> getAddAccessModeMethod;
    if ((getAddAccessModeMethod = InterfaceConfigGrpc.getAddAccessModeMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getAddAccessModeMethod = InterfaceConfigGrpc.getAddAccessModeMethod) == null) {
          InterfaceConfigGrpc.getAddAccessModeMethod = getAddAccessModeMethod = 
              io.grpc.MethodDescriptor.<AddAccessModeRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "addAccessMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddAccessModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("addAccessMode"))
                  .build();
          }
        }
     }
     return getAddAccessModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CommonField,
          Bool> getRemoveAccessModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeAccessMode",
      requestType = CommonField.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CommonField,
          Bool> getRemoveAccessModeMethod() {
    io.grpc.MethodDescriptor<CommonField, Bool> getRemoveAccessModeMethod;
    if ((getRemoveAccessModeMethod = InterfaceConfigGrpc.getRemoveAccessModeMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getRemoveAccessModeMethod = InterfaceConfigGrpc.getRemoveAccessModeMethod) == null) {
          InterfaceConfigGrpc.getRemoveAccessModeMethod = getRemoveAccessModeMethod = 
              io.grpc.MethodDescriptor.<CommonField, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "removeAccessMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("removeAccessMode"))
                  .build();
          }
        }
     }
     return getRemoveAccessModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddTrunkModeRequest,
          Bool> getAddTrunkModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addTrunkMode",
      requestType = AddTrunkModeRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddTrunkModeRequest,
          Bool> getAddTrunkModeMethod() {
    io.grpc.MethodDescriptor<AddTrunkModeRequest, Bool> getAddTrunkModeMethod;
    if ((getAddTrunkModeMethod = InterfaceConfigGrpc.getAddTrunkModeMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getAddTrunkModeMethod = InterfaceConfigGrpc.getAddTrunkModeMethod) == null) {
          InterfaceConfigGrpc.getAddTrunkModeMethod = getAddTrunkModeMethod = 
              io.grpc.MethodDescriptor.<AddTrunkModeRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "addTrunkMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddTrunkModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("addTrunkMode"))
                  .build();
          }
        }
     }
     return getAddTrunkModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CommonField,
          Bool> getRemoveTrunkModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeTrunkMode",
      requestType = CommonField.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CommonField,
          Bool> getRemoveTrunkModeMethod() {
    io.grpc.MethodDescriptor<CommonField, Bool> getRemoveTrunkModeMethod;
    if ((getRemoveTrunkModeMethod = InterfaceConfigGrpc.getRemoveTrunkModeMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getRemoveTrunkModeMethod = InterfaceConfigGrpc.getRemoveTrunkModeMethod) == null) {
          InterfaceConfigGrpc.getRemoveTrunkModeMethod = getRemoveTrunkModeMethod = 
              io.grpc.MethodDescriptor.<CommonField, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "removeTrunkMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("removeTrunkMode"))
                  .build();
          }
        }
     }
     return getRemoveTrunkModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddRateLimitRequest,
          Bool> getAddRateLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRateLimit",
      requestType = AddRateLimitRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddRateLimitRequest,
          Bool> getAddRateLimitMethod() {
    io.grpc.MethodDescriptor<AddRateLimitRequest, Bool> getAddRateLimitMethod;
    if ((getAddRateLimitMethod = InterfaceConfigGrpc.getAddRateLimitMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getAddRateLimitMethod = InterfaceConfigGrpc.getAddRateLimitMethod) == null) {
          InterfaceConfigGrpc.getAddRateLimitMethod = getAddRateLimitMethod = 
              io.grpc.MethodDescriptor.<AddRateLimitRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "addRateLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddRateLimitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("addRateLimit"))
                  .build();
          }
        }
     }
     return getAddRateLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CommonField,
          Bool> getRemoveRateLimitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeRateLimit",
      requestType = CommonField.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CommonField,
          Bool> getRemoveRateLimitMethod() {
    io.grpc.MethodDescriptor<CommonField, Bool> getRemoveRateLimitMethod;
    if ((getRemoveRateLimitMethod = InterfaceConfigGrpc.getRemoveRateLimitMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getRemoveRateLimitMethod = InterfaceConfigGrpc.getRemoveRateLimitMethod) == null) {
          InterfaceConfigGrpc.getRemoveRateLimitMethod = getRemoveRateLimitMethod = 
              io.grpc.MethodDescriptor.<CommonField, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "removeRateLimit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("removeRateLimit"))
                  .build();
          }
        }
     }
     return getRemoveRateLimitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddTunnelModeRequest,
          Bool> getAddTunnelModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addTunnelMode",
      requestType = AddTunnelModeRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddTunnelModeRequest,
          Bool> getAddTunnelModeMethod() {
    io.grpc.MethodDescriptor<AddTunnelModeRequest, Bool> getAddTunnelModeMethod;
    if ((getAddTunnelModeMethod = InterfaceConfigGrpc.getAddTunnelModeMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getAddTunnelModeMethod = InterfaceConfigGrpc.getAddTunnelModeMethod) == null) {
          InterfaceConfigGrpc.getAddTunnelModeMethod = getAddTunnelModeMethod = 
              io.grpc.MethodDescriptor.<AddTunnelModeRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "addTunnelMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddTunnelModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("addTunnelMode"))
                  .build();
          }
        }
     }
     return getAddTunnelModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CommonField,
          Bool> getRemoveTunnelModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeTunnelMode",
      requestType = CommonField.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CommonField,
          Bool> getRemoveTunnelModeMethod() {
    io.grpc.MethodDescriptor<CommonField, Bool> getRemoveTunnelModeMethod;
    if ((getRemoveTunnelModeMethod = InterfaceConfigGrpc.getRemoveTunnelModeMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getRemoveTunnelModeMethod = InterfaceConfigGrpc.getRemoveTunnelModeMethod) == null) {
          InterfaceConfigGrpc.getRemoveTunnelModeMethod = getRemoveTunnelModeMethod = 
              io.grpc.MethodDescriptor.<CommonField, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "removeTunnelMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("removeTunnelMode"))
                  .build();
          }
        }
     }
     return getRemoveTunnelModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddPatchModeRequest,
          Bool> getAddPatchModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPatchMode",
      requestType = AddPatchModeRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddPatchModeRequest,
          Bool> getAddPatchModeMethod() {
    io.grpc.MethodDescriptor<AddPatchModeRequest, Bool> getAddPatchModeMethod;
    if ((getAddPatchModeMethod = InterfaceConfigGrpc.getAddPatchModeMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getAddPatchModeMethod = InterfaceConfigGrpc.getAddPatchModeMethod) == null) {
          InterfaceConfigGrpc.getAddPatchModeMethod = getAddPatchModeMethod = 
              io.grpc.MethodDescriptor.<AddPatchModeRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "addPatchMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddPatchModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("addPatchMode"))
                  .build();
          }
        }
     }
     return getAddPatchModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<RemovePatchModeRequest,
          Bool> getRemovePatchModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removePatchMode",
      requestType = RemovePatchModeRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<RemovePatchModeRequest,
          Bool> getRemovePatchModeMethod() {
    io.grpc.MethodDescriptor<RemovePatchModeRequest, Bool> getRemovePatchModeMethod;
    if ((getRemovePatchModeMethod = InterfaceConfigGrpc.getRemovePatchModeMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getRemovePatchModeMethod = InterfaceConfigGrpc.getRemovePatchModeMethod) == null) {
          InterfaceConfigGrpc.getRemovePatchModeMethod = getRemovePatchModeMethod = 
              io.grpc.MethodDescriptor.<RemovePatchModeRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "removePatchMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RemovePatchModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("removePatchMode"))
                  .build();
          }
        }
     }
     return getRemovePatchModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Void,
          GetInterfacesResponse> getGetInterfacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInterfaces",
      requestType = Void.class,
      responseType = GetInterfacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Void,
          GetInterfacesResponse> getGetInterfacesMethod() {
    io.grpc.MethodDescriptor<Void, GetInterfacesResponse> getGetInterfacesMethod;
    if ((getGetInterfacesMethod = InterfaceConfigGrpc.getGetInterfacesMethod) == null) {
      synchronized (InterfaceConfigGrpc.class) {
        if ((getGetInterfacesMethod = InterfaceConfigGrpc.getGetInterfacesMethod) == null) {
          InterfaceConfigGrpc.getGetInterfacesMethod = getGetInterfacesMethod = 
              io.grpc.MethodDescriptor.<Void, GetInterfacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterfaceConfig.InterfaceConfig", "getInterfaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetInterfacesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InterfaceConfigMethodDescriptorSupplier("getInterfaces"))
                  .build();
          }
        }
     }
     return getGetInterfacesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InterfaceConfigStub newStub(io.grpc.Channel channel) {
    return new InterfaceConfigStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InterfaceConfigBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InterfaceConfigBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InterfaceConfigFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InterfaceConfigFutureStub(channel);
  }

  /**
   * <pre>
   *InterfaceConfig service interface
   * </pre>
   */
  public static abstract class InterfaceConfigImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Adds an access interface to a VLAN. 
     * </pre>
     */
    public void addAccessMode(AddAccessModeRequest request,
                              io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddAccessModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes an access interface to a VLAN. 
     * </pre>
     */
    public void removeAccessMode(CommonField request,
                                 io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveAccessModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a trunk interface for VLANs. 
     * </pre>
     */
    public void addTrunkMode(AddTrunkModeRequest request,
                             io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddTrunkModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes trunk mode configuration from an interface. 
     * </pre>
     */
    public void removeTrunkMode(CommonField request,
                                io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveTrunkModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a rate limit on an interface. 
     * </pre>
     */
    public void addRateLimit(AddRateLimitRequest request,
                             io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRateLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes rate limit from an interface. 
     * </pre>
     */
    public void removeRateLimit(CommonField request,
                                io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveRateLimitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a tunnel mode to supplied interface. 
     * </pre>
     */
    public void addTunnelMode(AddTunnelModeRequest request,
                              io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddTunnelModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a tunnel interface. 
     * </pre>
     */
    public void removeTunnelMode(CommonField request,
                                 io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveTunnelModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a patch mode to the supplied interface. 
     * </pre>
     */
    public void addPatchMode(AddPatchModeRequest request,
                             io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPatchModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a patch mode from the supplied interface. 
     * </pre>
     */
    public void removePatchMode(RemovePatchModeRequest request,
                                io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getRemovePatchModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Provides the interfaces configured on a device. 
     * </pre>
     */
    public void getInterfaces(Void request,
        io.grpc.stub.StreamObserver<GetInterfacesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInterfacesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddAccessModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddAccessModeRequest,
                      Bool>(
                  this, METHODID_ADD_ACCESS_MODE)))
          .addMethod(
            getRemoveAccessModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      CommonField,
                      Bool>(
                  this, METHODID_REMOVE_ACCESS_MODE)))
          .addMethod(
            getAddTrunkModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddTrunkModeRequest,
                      Bool>(
                  this, METHODID_ADD_TRUNK_MODE)))
          .addMethod(
            getRemoveTrunkModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      CommonField,
                      Bool>(
                  this, METHODID_REMOVE_TRUNK_MODE)))
          .addMethod(
            getAddRateLimitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddRateLimitRequest,
                      Bool>(
                  this, METHODID_ADD_RATE_LIMIT)))
          .addMethod(
            getRemoveRateLimitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      CommonField,
                      Bool>(
                  this, METHODID_REMOVE_RATE_LIMIT)))
          .addMethod(
            getAddTunnelModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddTunnelModeRequest,
                      Bool>(
                  this, METHODID_ADD_TUNNEL_MODE)))
          .addMethod(
            getRemoveTunnelModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      CommonField,
                      Bool>(
                  this, METHODID_REMOVE_TUNNEL_MODE)))
          .addMethod(
            getAddPatchModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddPatchModeRequest,
                      Bool>(
                  this, METHODID_ADD_PATCH_MODE)))
          .addMethod(
            getRemovePatchModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      RemovePatchModeRequest,
                      Bool>(
                  this, METHODID_REMOVE_PATCH_MODE)))
          .addMethod(
            getGetInterfacesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      Void,
                      GetInterfacesResponse>(
                  this, METHODID_GET_INTERFACES)))
          .build();
    }
  }

  /**
   * <pre>
   *InterfaceConfig service interface
   * </pre>
   */
  public static final class InterfaceConfigStub extends io.grpc.stub.AbstractStub<InterfaceConfigStub> {
    private InterfaceConfigStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InterfaceConfigStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterfaceConfigStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterfaceConfigStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adds an access interface to a VLAN. 
     * </pre>
     */
    public void addAccessMode(AddAccessModeRequest request,
                              io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddAccessModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes an access interface to a VLAN. 
     * </pre>
     */
    public void removeAccessMode(CommonField request,
                                 io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveAccessModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a trunk interface for VLANs. 
     * </pre>
     */
    public void addTrunkMode(AddTrunkModeRequest request,
                             io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddTrunkModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes trunk mode configuration from an interface. 
     * </pre>
     */
    public void removeTrunkMode(CommonField request,
                                io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveTrunkModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a rate limit on an interface. 
     * </pre>
     */
    public void addRateLimit(AddRateLimitRequest request,
                             io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRateLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes rate limit from an interface. 
     * </pre>
     */
    public void removeRateLimit(CommonField request,
                                io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveRateLimitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a tunnel mode to supplied interface. 
     * </pre>
     */
    public void addTunnelMode(AddTunnelModeRequest request,
                              io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddTunnelModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a tunnel interface. 
     * </pre>
     */
    public void removeTunnelMode(CommonField request,
                                 io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveTunnelModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a patch mode to the supplied interface. 
     * </pre>
     */
    public void addPatchMode(AddPatchModeRequest request,
                             io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPatchModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a patch mode from the supplied interface. 
     * </pre>
     */
    public void removePatchMode(RemovePatchModeRequest request,
                                io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemovePatchModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Provides the interfaces configured on a device. 
     * </pre>
     */
    public void getInterfaces(Void request,
        io.grpc.stub.StreamObserver<GetInterfacesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInterfacesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *InterfaceConfig service interface
   * </pre>
   */
  public static final class InterfaceConfigBlockingStub extends io.grpc.stub.AbstractStub<InterfaceConfigBlockingStub> {
    private InterfaceConfigBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InterfaceConfigBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterfaceConfigBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterfaceConfigBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adds an access interface to a VLAN. 
     * </pre>
     */
    public Bool addAccessMode(AddAccessModeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddAccessModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes an access interface to a VLAN. 
     * </pre>
     */
    public Bool removeAccessMode(CommonField request) {
      return blockingUnaryCall(
          getChannel(), getRemoveAccessModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a trunk interface for VLANs. 
     * </pre>
     */
    public Bool addTrunkMode(AddTrunkModeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddTrunkModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes trunk mode configuration from an interface. 
     * </pre>
     */
    public Bool removeTrunkMode(CommonField request) {
      return blockingUnaryCall(
          getChannel(), getRemoveTrunkModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a rate limit on an interface. 
     * </pre>
     */
    public Bool addRateLimit(AddRateLimitRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddRateLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes rate limit from an interface. 
     * </pre>
     */
    public Bool removeRateLimit(CommonField request) {
      return blockingUnaryCall(
          getChannel(), getRemoveRateLimitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a tunnel mode to supplied interface. 
     * </pre>
     */
    public Bool addTunnelMode(AddTunnelModeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddTunnelModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a tunnel interface. 
     * </pre>
     */
    public Bool removeTunnelMode(CommonField request) {
      return blockingUnaryCall(
          getChannel(), getRemoveTunnelModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a patch mode to the supplied interface. 
     * </pre>
     */
    public Bool addPatchMode(AddPatchModeRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPatchModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a patch mode from the supplied interface. 
     * </pre>
     */
    public Bool removePatchMode(RemovePatchModeRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemovePatchModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Provides the interfaces configured on a device. 
     * </pre>
     */
    public GetInterfacesResponse getInterfaces(Void request) {
      return blockingUnaryCall(
          getChannel(), getGetInterfacesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *InterfaceConfig service interface
   * </pre>
   */
  public static final class InterfaceConfigFutureStub extends io.grpc.stub.AbstractStub<InterfaceConfigFutureStub> {
    private InterfaceConfigFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InterfaceConfigFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterfaceConfigFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterfaceConfigFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adds an access interface to a VLAN. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> addAccessMode(
        AddAccessModeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddAccessModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes an access interface to a VLAN. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> removeAccessMode(
        CommonField request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveAccessModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a trunk interface for VLANs. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> addTrunkMode(
        AddTrunkModeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddTrunkModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes trunk mode configuration from an interface. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> removeTrunkMode(
        CommonField request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveTrunkModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a rate limit on an interface. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> addRateLimit(
        AddRateLimitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRateLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes rate limit from an interface. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> removeRateLimit(
        CommonField request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveRateLimitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a tunnel mode to supplied interface. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> addTunnelMode(
        AddTunnelModeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddTunnelModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a tunnel interface. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> removeTunnelMode(
        CommonField request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveTunnelModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a patch mode to the supplied interface. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> addPatchMode(
        AddPatchModeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPatchModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a patch mode from the supplied interface. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> removePatchMode(
        RemovePatchModeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemovePatchModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Provides the interfaces configured on a device. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetInterfacesResponse> getInterfaces(
        Void request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInterfacesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ACCESS_MODE = 0;
  private static final int METHODID_REMOVE_ACCESS_MODE = 1;
  private static final int METHODID_ADD_TRUNK_MODE = 2;
  private static final int METHODID_REMOVE_TRUNK_MODE = 3;
  private static final int METHODID_ADD_RATE_LIMIT = 4;
  private static final int METHODID_REMOVE_RATE_LIMIT = 5;
  private static final int METHODID_ADD_TUNNEL_MODE = 6;
  private static final int METHODID_REMOVE_TUNNEL_MODE = 7;
  private static final int METHODID_ADD_PATCH_MODE = 8;
  private static final int METHODID_REMOVE_PATCH_MODE = 9;
  private static final int METHODID_GET_INTERFACES = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InterfaceConfigImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InterfaceConfigImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ACCESS_MODE:
          serviceImpl.addAccessMode((AddAccessModeRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_REMOVE_ACCESS_MODE:
          serviceImpl.removeAccessMode((CommonField) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_ADD_TRUNK_MODE:
          serviceImpl.addTrunkMode((AddTrunkModeRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_REMOVE_TRUNK_MODE:
          serviceImpl.removeTrunkMode((CommonField) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_ADD_RATE_LIMIT:
          serviceImpl.addRateLimit((AddRateLimitRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_REMOVE_RATE_LIMIT:
          serviceImpl.removeRateLimit((CommonField) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_ADD_TUNNEL_MODE:
          serviceImpl.addTunnelMode((AddTunnelModeRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_REMOVE_TUNNEL_MODE:
          serviceImpl.removeTunnelMode((CommonField) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_ADD_PATCH_MODE:
          serviceImpl.addPatchMode((AddPatchModeRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_REMOVE_PATCH_MODE:
          serviceImpl.removePatchMode((RemovePatchModeRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_GET_INTERFACES:
          serviceImpl.getInterfaces((Void) request,
              (io.grpc.stub.StreamObserver<GetInterfacesResponse>) responseObserver);
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

  private static abstract class InterfaceConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InterfaceConfigBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return InterfaceConfigProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InterfaceConfig");
    }
  }

  private static final class InterfaceConfigFileDescriptorSupplier
      extends InterfaceConfigBaseDescriptorSupplier {
    InterfaceConfigFileDescriptorSupplier() {}
  }

  private static final class InterfaceConfigMethodDescriptorSupplier
      extends InterfaceConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InterfaceConfigMethodDescriptorSupplier(String methodName) {
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
      synchronized (InterfaceConfigGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InterfaceConfigFileDescriptorSupplier())
              .addMethod(getAddAccessModeMethod())
              .addMethod(getRemoveAccessModeMethod())
              .addMethod(getAddTrunkModeMethod())
              .addMethod(getRemoveTrunkModeMethod())
              .addMethod(getAddRateLimitMethod())
              .addMethod(getRemoveRateLimitMethod())
              .addMethod(getAddTunnelModeMethod())
              .addMethod(getRemoveTunnelModeMethod())
              .addMethod(getAddPatchModeMethod())
              .addMethod(getRemovePatchModeMethod())
              .addMethod(getGetInterfacesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

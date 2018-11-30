package com.cotx.ovsctl.service.bridgeconfig;

import com.cotx.ovsctl.message.base.Bool;
import com.cotx.ovsctl.message.base.Void;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsInterface;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsPort;
import com.cotx.ovsctl.message.service.bridgeconfig.AddControllerRequest;
import com.cotx.ovsctl.message.service.bridgeconfig.AddInterfaceRequest;
import com.cotx.ovsctl.message.service.bridgeconfig.AddPortRequest;
import com.cotx.ovsctl.message.service.bridgeconfig.AddTunnelPortRequest;
import com.cotx.ovsctl.message.service.bridgeconfig.BridgeConfigProto;
import com.cotx.ovsctl.message.service.bridgeconfig.CommonField;
import com.cotx.ovsctl.message.service.bridgeconfig.DeleteControllerRequest;
import com.cotx.ovsctl.message.service.bridgeconfig.GetControllersResponse;
import com.cotx.ovsctl.message.service.bridgeconfig.GetInterfacesResponse;
import com.cotx.ovsctl.message.service.bridgeconfig.GetPortsResponse;
import com.cotx.ovsctl.message.service.bridgeconfig.InterfaceRequest;
import com.cotx.ovsctl.message.service.bridgeconfig.PortRequest;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *BridgeConfig service interface
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: service/BridgeConfigService.proto")
public final class BridgeConfigGrpc {

  private BridgeConfigGrpc() {}

  public static final String SERVICE_NAME = "BridgeConfig.BridgeConfig";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<AddControllerRequest,
          Bool> getAddControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addController",
      requestType = AddControllerRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddControllerRequest,
          Bool> getAddControllerMethod() {
    io.grpc.MethodDescriptor<AddControllerRequest, Bool> getAddControllerMethod;
    if ((getAddControllerMethod = BridgeConfigGrpc.getAddControllerMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getAddControllerMethod = BridgeConfigGrpc.getAddControllerMethod) == null) {
          BridgeConfigGrpc.getAddControllerMethod = getAddControllerMethod = 
              io.grpc.MethodDescriptor.<AddControllerRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "addController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("addController"))
                  .build();
          }
        }
     }
     return getAddControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DeleteControllerRequest,
          Void> getDeleteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteController",
      requestType = DeleteControllerRequest.class,
      responseType = Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DeleteControllerRequest,
          Void> getDeleteControllerMethod() {
    io.grpc.MethodDescriptor<DeleteControllerRequest, Void> getDeleteControllerMethod;
    if ((getDeleteControllerMethod = BridgeConfigGrpc.getDeleteControllerMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getDeleteControllerMethod = BridgeConfigGrpc.getDeleteControllerMethod) == null) {
          BridgeConfigGrpc.getDeleteControllerMethod = getDeleteControllerMethod = 
              io.grpc.MethodDescriptor.<DeleteControllerRequest, Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "deleteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeleteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Void.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("deleteController"))
                  .build();
          }
        }
     }
     return getDeleteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CommonField,
          GetControllersResponse> getGetControllersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getControllers",
      requestType = CommonField.class,
      responseType = GetControllersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CommonField,
          GetControllersResponse> getGetControllersMethod() {
    io.grpc.MethodDescriptor<CommonField, GetControllersResponse> getGetControllersMethod;
    if ((getGetControllersMethod = BridgeConfigGrpc.getGetControllersMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getGetControllersMethod = BridgeConfigGrpc.getGetControllersMethod) == null) {
          BridgeConfigGrpc.getGetControllersMethod = getGetControllersMethod = 
              io.grpc.MethodDescriptor.<CommonField, GetControllersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "getControllers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetControllersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("getControllers"))
                  .build();
          }
        }
     }
     return getGetControllersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddPortRequest,
          Bool> getAddPortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPort",
      requestType = AddPortRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddPortRequest,
          Bool> getAddPortMethod() {
    io.grpc.MethodDescriptor<AddPortRequest, Bool> getAddPortMethod;
    if ((getAddPortMethod = BridgeConfigGrpc.getAddPortMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getAddPortMethod = BridgeConfigGrpc.getAddPortMethod) == null) {
          BridgeConfigGrpc.getAddPortMethod = getAddPortMethod = 
              io.grpc.MethodDescriptor.<AddPortRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "addPort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddPortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("addPort"))
                  .build();
          }
        }
     }
     return getAddPortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddTunnelPortRequest,
          Void> getAddTunnelPortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addTunnelPort",
      requestType = AddTunnelPortRequest.class,
      responseType = Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddTunnelPortRequest,
          Void> getAddTunnelPortMethod() {
    io.grpc.MethodDescriptor<AddTunnelPortRequest, Void> getAddTunnelPortMethod;
    if ((getAddTunnelPortMethod = BridgeConfigGrpc.getAddTunnelPortMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getAddTunnelPortMethod = BridgeConfigGrpc.getAddTunnelPortMethod) == null) {
          BridgeConfigGrpc.getAddTunnelPortMethod = getAddTunnelPortMethod = 
              io.grpc.MethodDescriptor.<AddTunnelPortRequest, Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "addTunnelPort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddTunnelPortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Void.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("addTunnelPort"))
                  .build();
          }
        }
     }
     return getAddTunnelPortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PortRequest,
          Bool> getDeletePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePort",
      requestType = PortRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PortRequest,
          Bool> getDeletePortMethod() {
    io.grpc.MethodDescriptor<PortRequest, Bool> getDeletePortMethod;
    if ((getDeletePortMethod = BridgeConfigGrpc.getDeletePortMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getDeletePortMethod = BridgeConfigGrpc.getDeletePortMethod) == null) {
          BridgeConfigGrpc.getDeletePortMethod = getDeletePortMethod = 
              io.grpc.MethodDescriptor.<PortRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "deletePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("deletePort"))
                  .build();
          }
        }
     }
     return getDeletePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CommonField,
          GetPortsResponse> getGetPortsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPorts",
      requestType = CommonField.class,
      responseType = GetPortsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CommonField,
          GetPortsResponse> getGetPortsMethod() {
    io.grpc.MethodDescriptor<CommonField, GetPortsResponse> getGetPortsMethod;
    if ((getGetPortsMethod = BridgeConfigGrpc.getGetPortsMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getGetPortsMethod = BridgeConfigGrpc.getGetPortsMethod) == null) {
          BridgeConfigGrpc.getGetPortsMethod = getGetPortsMethod = 
              io.grpc.MethodDescriptor.<CommonField, GetPortsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "getPorts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CommonField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetPortsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("getPorts"))
                  .build();
          }
        }
     }
     return getGetPortsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PortRequest,
          OvsPort> getGetPortByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPortByUuid",
      requestType = PortRequest.class,
      responseType = OvsPort.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PortRequest,
          OvsPort> getGetPortByUuidMethod() {
    io.grpc.MethodDescriptor<PortRequest, OvsPort> getGetPortByUuidMethod;
    if ((getGetPortByUuidMethod = BridgeConfigGrpc.getGetPortByUuidMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getGetPortByUuidMethod = BridgeConfigGrpc.getGetPortByUuidMethod) == null) {
          BridgeConfigGrpc.getGetPortByUuidMethod = getGetPortByUuidMethod = 
              io.grpc.MethodDescriptor.<PortRequest, OvsPort>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "getPortByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OvsPort.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("getPortByUuid"))
                  .build();
          }
        }
     }
     return getGetPortByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PortRequest,
          GetInterfacesResponse> getGetInterfacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInterfaces",
      requestType = PortRequest.class,
      responseType = GetInterfacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PortRequest,
          GetInterfacesResponse> getGetInterfacesMethod() {
    io.grpc.MethodDescriptor<PortRequest, GetInterfacesResponse> getGetInterfacesMethod;
    if ((getGetInterfacesMethod = BridgeConfigGrpc.getGetInterfacesMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getGetInterfacesMethod = BridgeConfigGrpc.getGetInterfacesMethod) == null) {
          BridgeConfigGrpc.getGetInterfacesMethod = getGetInterfacesMethod = 
              io.grpc.MethodDescriptor.<PortRequest, GetInterfacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "getInterfaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetInterfacesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("getInterfaces"))
                  .build();
          }
        }
     }
     return getGetInterfacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<InterfaceRequest,
          OvsInterface> getGetInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInterface",
      requestType = InterfaceRequest.class,
      responseType = OvsInterface.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<InterfaceRequest,
          OvsInterface> getGetInterfaceMethod() {
    io.grpc.MethodDescriptor<InterfaceRequest, OvsInterface> getGetInterfaceMethod;
    if ((getGetInterfaceMethod = BridgeConfigGrpc.getGetInterfaceMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getGetInterfaceMethod = BridgeConfigGrpc.getGetInterfaceMethod) == null) {
          BridgeConfigGrpc.getGetInterfaceMethod = getGetInterfaceMethod = 
              io.grpc.MethodDescriptor.<InterfaceRequest, OvsInterface>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "getInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  InterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OvsInterface.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("getInterface"))
                  .build();
          }
        }
     }
     return getGetInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddInterfaceRequest,
          Bool> getAddInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addInterface",
      requestType = AddInterfaceRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddInterfaceRequest,
          Bool> getAddInterfaceMethod() {
    io.grpc.MethodDescriptor<AddInterfaceRequest, Bool> getAddInterfaceMethod;
    if ((getAddInterfaceMethod = BridgeConfigGrpc.getAddInterfaceMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getAddInterfaceMethod = BridgeConfigGrpc.getAddInterfaceMethod) == null) {
          BridgeConfigGrpc.getAddInterfaceMethod = getAddInterfaceMethod = 
              io.grpc.MethodDescriptor.<AddInterfaceRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "addInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("addInterface"))
                  .build();
          }
        }
     }
     return getAddInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<InterfaceRequest,
          Bool> getDeleteInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteInterface",
      requestType = InterfaceRequest.class,
      responseType = Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<InterfaceRequest,
          Bool> getDeleteInterfaceMethod() {
    io.grpc.MethodDescriptor<InterfaceRequest, Bool> getDeleteInterfaceMethod;
    if ((getDeleteInterfaceMethod = BridgeConfigGrpc.getDeleteInterfaceMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getDeleteInterfaceMethod = BridgeConfigGrpc.getDeleteInterfaceMethod) == null) {
          BridgeConfigGrpc.getDeleteInterfaceMethod = getDeleteInterfaceMethod = 
              io.grpc.MethodDescriptor.<InterfaceRequest, Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig.BridgeConfig", "deleteInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  InterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("deleteInterface"))
                  .build();
          }
        }
     }
     return getDeleteInterfaceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BridgeConfigStub newStub(io.grpc.Channel channel) {
    return new BridgeConfigStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BridgeConfigBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BridgeConfigBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BridgeConfigFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BridgeConfigFutureStub(channel);
  }

  /**
   * <pre>
   *BridgeConfig service interface
   * </pre>
   */
  public static abstract class BridgeConfigImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Adds a controller to a given bridge. 
     * </pre>
     */
    public void addController(AddControllerRequest request,
                              io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a controller from a given bridge. 
     * </pre>
     */
    public void deleteController(DeleteControllerRequest request,
                                 io.grpc.stub.StreamObserver<Void> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get controllers of a given bridge. 
     * </pre>
     */
    public void getControllers(CommonField request,
                               io.grpc.stub.StreamObserver<GetControllersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetControllersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a port to a given bridge. 
     * </pre>
     */
    public void addPort(AddPortRequest request,
                        io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a port with tunnel configure to a given bridge. 
     * </pre>
     */
    public void addTunnelPort(AddTunnelPortRequest request,
                              io.grpc.stub.StreamObserver<Void> responseObserver) {
      asyncUnimplementedUnaryCall(getAddTunnelPortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a port from a given bridge. 
     * </pre>
     */
    public void deletePort(PortRequest request,
                           io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get ports of a given bridge. 
     * </pre>
     */
    public void getPorts(CommonField request,
                         io.grpc.stub.StreamObserver<GetPortsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void getPortByUuid(PortRequest request,
                              io.grpc.stub.StreamObserver<OvsPort> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortByUuidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get interfaces from a given bridge,or get interfaces from a given port. 
     * </pre>
     */
    public void getInterfaces(PortRequest request,
                              io.grpc.stub.StreamObserver<GetInterfacesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInterfacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void getInterface(InterfaceRequest request,
                             io.grpc.stub.StreamObserver<OvsInterface> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInterfaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void addInterface(AddInterfaceRequest request,
                             io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddInterfaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void deleteInterface(InterfaceRequest request,
                                io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInterfaceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddControllerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddControllerRequest,
                      Bool>(
                  this, METHODID_ADD_CONTROLLER)))
          .addMethod(
            getDeleteControllerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      DeleteControllerRequest,
                      Void>(
                  this, METHODID_DELETE_CONTROLLER)))
          .addMethod(
            getGetControllersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      CommonField,
                      GetControllersResponse>(
                  this, METHODID_GET_CONTROLLERS)))
          .addMethod(
            getAddPortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddPortRequest,
                      Bool>(
                  this, METHODID_ADD_PORT)))
          .addMethod(
            getAddTunnelPortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddTunnelPortRequest,
                      Void>(
                  this, METHODID_ADD_TUNNEL_PORT)))
          .addMethod(
            getDeletePortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      PortRequest,
                      Bool>(
                  this, METHODID_DELETE_PORT)))
          .addMethod(
            getGetPortsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      CommonField,
                      GetPortsResponse>(
                  this, METHODID_GET_PORTS)))
          .addMethod(
            getGetPortByUuidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      PortRequest,
                      OvsPort>(
                  this, METHODID_GET_PORT_BY_UUID)))
          .addMethod(
            getGetInterfacesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      PortRequest,
                      GetInterfacesResponse>(
                  this, METHODID_GET_INTERFACES)))
          .addMethod(
            getGetInterfaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      InterfaceRequest,
                      OvsInterface>(
                  this, METHODID_GET_INTERFACE)))
          .addMethod(
            getAddInterfaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddInterfaceRequest,
                      Bool>(
                  this, METHODID_ADD_INTERFACE)))
          .addMethod(
            getDeleteInterfaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      InterfaceRequest,
                      Bool>(
                  this, METHODID_DELETE_INTERFACE)))
          .build();
    }
  }

  /**
   * <pre>
   *BridgeConfig service interface
   * </pre>
   */
  public static final class BridgeConfigStub extends io.grpc.stub.AbstractStub<BridgeConfigStub> {
    private BridgeConfigStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BridgeConfigStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BridgeConfigStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BridgeConfigStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adds a controller to a given bridge. 
     * </pre>
     */
    public void addController(AddControllerRequest request,
                              io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a controller from a given bridge. 
     * </pre>
     */
    public void deleteController(DeleteControllerRequest request,
                                 io.grpc.stub.StreamObserver<Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get controllers of a given bridge. 
     * </pre>
     */
    public void getControllers(CommonField request,
                               io.grpc.stub.StreamObserver<GetControllersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetControllersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a port to a given bridge. 
     * </pre>
     */
    public void addPort(AddPortRequest request,
                        io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a port with tunnel configure to a given bridge. 
     * </pre>
     */
    public void addTunnelPort(AddTunnelPortRequest request,
                              io.grpc.stub.StreamObserver<Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddTunnelPortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a port from a given bridge. 
     * </pre>
     */
    public void deletePort(PortRequest request,
                           io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get ports of a given bridge. 
     * </pre>
     */
    public void getPorts(CommonField request,
                         io.grpc.stub.StreamObserver<GetPortsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPortsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void getPortByUuid(PortRequest request,
                              io.grpc.stub.StreamObserver<OvsPort> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPortByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get interfaces from a given bridge,or get interfaces from a given port. 
     * </pre>
     */
    public void getInterfaces(PortRequest request,
                              io.grpc.stub.StreamObserver<GetInterfacesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInterfacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void getInterface(InterfaceRequest request,
                             io.grpc.stub.StreamObserver<OvsInterface> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void addInterface(AddInterfaceRequest request,
                             io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void deleteInterface(InterfaceRequest request,
                                io.grpc.stub.StreamObserver<Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInterfaceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *BridgeConfig service interface
   * </pre>
   */
  public static final class BridgeConfigBlockingStub extends io.grpc.stub.AbstractStub<BridgeConfigBlockingStub> {
    private BridgeConfigBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BridgeConfigBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BridgeConfigBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BridgeConfigBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adds a controller to a given bridge. 
     * </pre>
     */
    public Bool addController(AddControllerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a controller from a given bridge. 
     * </pre>
     */
    public Void deleteController(DeleteControllerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get controllers of a given bridge. 
     * </pre>
     */
    public GetControllersResponse getControllers(CommonField request) {
      return blockingUnaryCall(
          getChannel(), getGetControllersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a port to a given bridge. 
     * </pre>
     */
    public Bool addPort(AddPortRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a port with tunnel configure to a given bridge. 
     * </pre>
     */
    public Void addTunnelPort(AddTunnelPortRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddTunnelPortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a port from a given bridge. 
     * </pre>
     */
    public Bool deletePort(PortRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get ports of a given bridge. 
     * </pre>
     */
    public GetPortsResponse getPorts(CommonField request) {
      return blockingUnaryCall(
          getChannel(), getGetPortsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public OvsPort getPortByUuid(PortRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPortByUuidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get interfaces from a given bridge,or get interfaces from a given port. 
     * </pre>
     */
    public GetInterfacesResponse getInterfaces(PortRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInterfacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public OvsInterface getInterface(InterfaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInterfaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public Bool addInterface(AddInterfaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddInterfaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public Bool deleteInterface(InterfaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInterfaceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *BridgeConfig service interface
   * </pre>
   */
  public static final class BridgeConfigFutureStub extends io.grpc.stub.AbstractStub<BridgeConfigFutureStub> {
    private BridgeConfigFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BridgeConfigFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BridgeConfigFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BridgeConfigFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Adds a controller to a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> addController(
        AddControllerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a controller from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Void> deleteController(
        DeleteControllerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get controllers of a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetControllersResponse> getControllers(
        CommonField request) {
      return futureUnaryCall(
          getChannel().newCall(getGetControllersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a port to a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> addPort(
        AddPortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a port with tunnel configure to a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Void> addTunnelPort(
        AddTunnelPortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddTunnelPortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a port from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> deletePort(
        PortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get ports of a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetPortsResponse> getPorts(
        CommonField request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPortsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<OvsPort> getPortByUuid(
        PortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPortByUuidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get interfaces from a given bridge,or get interfaces from a given port. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetInterfacesResponse> getInterfaces(
        PortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInterfacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<OvsInterface> getInterface(
        InterfaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInterfaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> addInterface(
        AddInterfaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddInterfaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Bool> deleteInterface(
        InterfaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInterfaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CONTROLLER = 0;
  private static final int METHODID_DELETE_CONTROLLER = 1;
  private static final int METHODID_GET_CONTROLLERS = 2;
  private static final int METHODID_ADD_PORT = 3;
  private static final int METHODID_ADD_TUNNEL_PORT = 4;
  private static final int METHODID_DELETE_PORT = 5;
  private static final int METHODID_GET_PORTS = 6;
  private static final int METHODID_GET_PORT_BY_UUID = 7;
  private static final int METHODID_GET_INTERFACES = 8;
  private static final int METHODID_GET_INTERFACE = 9;
  private static final int METHODID_ADD_INTERFACE = 10;
  private static final int METHODID_DELETE_INTERFACE = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BridgeConfigImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BridgeConfigImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CONTROLLER:
          serviceImpl.addController((AddControllerRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_DELETE_CONTROLLER:
          serviceImpl.deleteController((DeleteControllerRequest) request,
              (io.grpc.stub.StreamObserver<Void>) responseObserver);
          break;
        case METHODID_GET_CONTROLLERS:
          serviceImpl.getControllers((CommonField) request,
              (io.grpc.stub.StreamObserver<GetControllersResponse>) responseObserver);
          break;
        case METHODID_ADD_PORT:
          serviceImpl.addPort((AddPortRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_ADD_TUNNEL_PORT:
          serviceImpl.addTunnelPort((AddTunnelPortRequest) request,
              (io.grpc.stub.StreamObserver<Void>) responseObserver);
          break;
        case METHODID_DELETE_PORT:
          serviceImpl.deletePort((PortRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_GET_PORTS:
          serviceImpl.getPorts((CommonField) request,
              (io.grpc.stub.StreamObserver<GetPortsResponse>) responseObserver);
          break;
        case METHODID_GET_PORT_BY_UUID:
          serviceImpl.getPortByUuid((PortRequest) request,
              (io.grpc.stub.StreamObserver<OvsPort>) responseObserver);
          break;
        case METHODID_GET_INTERFACES:
          serviceImpl.getInterfaces((PortRequest) request,
              (io.grpc.stub.StreamObserver<GetInterfacesResponse>) responseObserver);
          break;
        case METHODID_GET_INTERFACE:
          serviceImpl.getInterface((InterfaceRequest) request,
              (io.grpc.stub.StreamObserver<OvsInterface>) responseObserver);
          break;
        case METHODID_ADD_INTERFACE:
          serviceImpl.addInterface((AddInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<Bool>) responseObserver);
          break;
        case METHODID_DELETE_INTERFACE:
          serviceImpl.deleteInterface((InterfaceRequest) request,
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

  private static abstract class BridgeConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BridgeConfigBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BridgeConfigProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BridgeConfig");
    }
  }

  private static final class BridgeConfigFileDescriptorSupplier
      extends BridgeConfigBaseDescriptorSupplier {
    BridgeConfigFileDescriptorSupplier() {}
  }

  private static final class BridgeConfigMethodDescriptorSupplier
      extends BridgeConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BridgeConfigMethodDescriptorSupplier(String methodName) {
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
      synchronized (BridgeConfigGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BridgeConfigFileDescriptorSupplier())
              .addMethod(getAddControllerMethod())
              .addMethod(getDeleteControllerMethod())
              .addMethod(getGetControllersMethod())
              .addMethod(getAddPortMethod())
              .addMethod(getAddTunnelPortMethod())
              .addMethod(getDeletePortMethod())
              .addMethod(getGetPortsMethod())
              .addMethod(getGetPortByUuidMethod())
              .addMethod(getGetInterfacesMethod())
              .addMethod(getGetInterfaceMethod())
              .addMethod(getAddInterfaceMethod())
              .addMethod(getDeleteInterfaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}

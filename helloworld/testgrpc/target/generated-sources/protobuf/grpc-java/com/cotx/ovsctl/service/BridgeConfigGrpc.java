package com.cotx.ovsctl.service;

import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsInterface;
import com.cotx.ovsctl.message.ovsdb.ovs.core.OvsPort;
import com.cotx.ovsctl.message.service.BridgeConfigProto;

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
    comments = "Source: BridgeConfigService.proto")
public final class BridgeConfigGrpc {

  private BridgeConfigGrpc() {}

  public static final String SERVICE_NAME = "BridgeConfig";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddControllerRequest,
      com.cotx.ovsctl.message.Bool> getAddControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addController",
      requestType = com.cotx.ovsctl.service.AddControllerRequest.class,
      responseType = com.cotx.ovsctl.message.Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddControllerRequest,
      com.cotx.ovsctl.message.Bool> getAddControllerMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddControllerRequest, com.cotx.ovsctl.message.Bool> getAddControllerMethod;
    if ((getAddControllerMethod = BridgeConfigGrpc.getAddControllerMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getAddControllerMethod = BridgeConfigGrpc.getAddControllerMethod) == null) {
          BridgeConfigGrpc.getAddControllerMethod = getAddControllerMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.AddControllerRequest, com.cotx.ovsctl.message.Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "addController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.AddControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.message.Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("addController"))
                  .build();
          }
        }
     }
     return getAddControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.DeleteControllerRequest,
      com.cotx.ovsctl.message.Void> getDeleteControllerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteController",
      requestType = com.cotx.ovsctl.service.DeleteControllerRequest.class,
      responseType = com.cotx.ovsctl.message.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.DeleteControllerRequest,
      com.cotx.ovsctl.message.Void> getDeleteControllerMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.DeleteControllerRequest, com.cotx.ovsctl.message.Void> getDeleteControllerMethod;
    if ((getDeleteControllerMethod = BridgeConfigGrpc.getDeleteControllerMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getDeleteControllerMethod = BridgeConfigGrpc.getDeleteControllerMethod) == null) {
          BridgeConfigGrpc.getDeleteControllerMethod = getDeleteControllerMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.DeleteControllerRequest, com.cotx.ovsctl.message.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "deleteController"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.DeleteControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.message.Void.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("deleteController"))
                  .build();
          }
        }
     }
     return getDeleteControllerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.CommonField,
      com.cotx.ovsctl.service.GetControllersResponse> getGetControllersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getControllers",
      requestType = com.cotx.ovsctl.service.CommonField.class,
      responseType = com.cotx.ovsctl.service.GetControllersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.CommonField,
      com.cotx.ovsctl.service.GetControllersResponse> getGetControllersMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.CommonField, com.cotx.ovsctl.service.GetControllersResponse> getGetControllersMethod;
    if ((getGetControllersMethod = BridgeConfigGrpc.getGetControllersMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getGetControllersMethod = BridgeConfigGrpc.getGetControllersMethod) == null) {
          BridgeConfigGrpc.getGetControllersMethod = getGetControllersMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.CommonField, com.cotx.ovsctl.service.GetControllersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "getControllers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.CommonField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.GetControllersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("getControllers"))
                  .build();
          }
        }
     }
     return getGetControllersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddPortRequest,
      com.cotx.ovsctl.message.Bool> getAddPortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addPort",
      requestType = com.cotx.ovsctl.service.AddPortRequest.class,
      responseType = com.cotx.ovsctl.message.Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddPortRequest,
      com.cotx.ovsctl.message.Bool> getAddPortMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddPortRequest, com.cotx.ovsctl.message.Bool> getAddPortMethod;
    if ((getAddPortMethod = BridgeConfigGrpc.getAddPortMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getAddPortMethod = BridgeConfigGrpc.getAddPortMethod) == null) {
          BridgeConfigGrpc.getAddPortMethod = getAddPortMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.AddPortRequest, com.cotx.ovsctl.message.Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "addPort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.AddPortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.message.Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("addPort"))
                  .build();
          }
        }
     }
     return getAddPortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddTunnelPortRequest,
      com.cotx.ovsctl.message.Void> getAddTunnelPortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addTunnelPort",
      requestType = com.cotx.ovsctl.service.AddTunnelPortRequest.class,
      responseType = com.cotx.ovsctl.message.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddTunnelPortRequest,
      com.cotx.ovsctl.message.Void> getAddTunnelPortMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddTunnelPortRequest, com.cotx.ovsctl.message.Void> getAddTunnelPortMethod;
    if ((getAddTunnelPortMethod = BridgeConfigGrpc.getAddTunnelPortMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getAddTunnelPortMethod = BridgeConfigGrpc.getAddTunnelPortMethod) == null) {
          BridgeConfigGrpc.getAddTunnelPortMethod = getAddTunnelPortMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.AddTunnelPortRequest, com.cotx.ovsctl.message.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "addTunnelPort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.AddTunnelPortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.message.Void.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("addTunnelPort"))
                  .build();
          }
        }
     }
     return getAddTunnelPortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.PortRequest,
      com.cotx.ovsctl.message.Bool> getDeletePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePort",
      requestType = com.cotx.ovsctl.service.PortRequest.class,
      responseType = com.cotx.ovsctl.message.Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.PortRequest,
      com.cotx.ovsctl.message.Bool> getDeletePortMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.PortRequest, com.cotx.ovsctl.message.Bool> getDeletePortMethod;
    if ((getDeletePortMethod = BridgeConfigGrpc.getDeletePortMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getDeletePortMethod = BridgeConfigGrpc.getDeletePortMethod) == null) {
          BridgeConfigGrpc.getDeletePortMethod = getDeletePortMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.PortRequest, com.cotx.ovsctl.message.Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "deletePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.PortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.message.Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("deletePort"))
                  .build();
          }
        }
     }
     return getDeletePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.CommonField,
      com.cotx.ovsctl.service.GetPortsResponse> getGetPortsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPorts",
      requestType = com.cotx.ovsctl.service.CommonField.class,
      responseType = com.cotx.ovsctl.service.GetPortsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.CommonField,
      com.cotx.ovsctl.service.GetPortsResponse> getGetPortsMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.CommonField, com.cotx.ovsctl.service.GetPortsResponse> getGetPortsMethod;
    if ((getGetPortsMethod = BridgeConfigGrpc.getGetPortsMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getGetPortsMethod = BridgeConfigGrpc.getGetPortsMethod) == null) {
          BridgeConfigGrpc.getGetPortsMethod = getGetPortsMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.CommonField, com.cotx.ovsctl.service.GetPortsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "getPorts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.CommonField.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.GetPortsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("getPorts"))
                  .build();
          }
        }
     }
     return getGetPortsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.PortRequest,
          OvsPort> getGetPortByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPortByUuid",
      requestType = com.cotx.ovsctl.service.PortRequest.class,
      responseType = OvsPort.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.PortRequest,
          OvsPort> getGetPortByUuidMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.PortRequest, OvsPort> getGetPortByUuidMethod;
    if ((getGetPortByUuidMethod = BridgeConfigGrpc.getGetPortByUuidMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getGetPortByUuidMethod = BridgeConfigGrpc.getGetPortByUuidMethod) == null) {
          BridgeConfigGrpc.getGetPortByUuidMethod = getGetPortByUuidMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.PortRequest, OvsPort>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "getPortByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.PortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OvsPort.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("getPortByUuid"))
                  .build();
          }
        }
     }
     return getGetPortByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.PortRequest,
      com.cotx.ovsctl.service.GetInterfacesResponse> getGetInterfacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInterfaces",
      requestType = com.cotx.ovsctl.service.PortRequest.class,
      responseType = com.cotx.ovsctl.service.GetInterfacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.PortRequest,
      com.cotx.ovsctl.service.GetInterfacesResponse> getGetInterfacesMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.PortRequest, com.cotx.ovsctl.service.GetInterfacesResponse> getGetInterfacesMethod;
    if ((getGetInterfacesMethod = BridgeConfigGrpc.getGetInterfacesMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getGetInterfacesMethod = BridgeConfigGrpc.getGetInterfacesMethod) == null) {
          BridgeConfigGrpc.getGetInterfacesMethod = getGetInterfacesMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.PortRequest, com.cotx.ovsctl.service.GetInterfacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "getInterfaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.PortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.GetInterfacesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("getInterfaces"))
                  .build();
          }
        }
     }
     return getGetInterfacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.InterfaceRequest,
          OvsInterface> getGetInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInterface",
      requestType = com.cotx.ovsctl.service.InterfaceRequest.class,
      responseType = OvsInterface.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.InterfaceRequest,
          OvsInterface> getGetInterfaceMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.InterfaceRequest, OvsInterface> getGetInterfaceMethod;
    if ((getGetInterfaceMethod = BridgeConfigGrpc.getGetInterfaceMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getGetInterfaceMethod = BridgeConfigGrpc.getGetInterfaceMethod) == null) {
          BridgeConfigGrpc.getGetInterfaceMethod = getGetInterfaceMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.InterfaceRequest, OvsInterface>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "getInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.InterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  OvsInterface.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("getInterface"))
                  .build();
          }
        }
     }
     return getGetInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddInterfaceRequest,
      com.cotx.ovsctl.message.Bool> getAddInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addInterface",
      requestType = com.cotx.ovsctl.service.AddInterfaceRequest.class,
      responseType = com.cotx.ovsctl.message.Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddInterfaceRequest,
      com.cotx.ovsctl.message.Bool> getAddInterfaceMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.AddInterfaceRequest, com.cotx.ovsctl.message.Bool> getAddInterfaceMethod;
    if ((getAddInterfaceMethod = BridgeConfigGrpc.getAddInterfaceMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getAddInterfaceMethod = BridgeConfigGrpc.getAddInterfaceMethod) == null) {
          BridgeConfigGrpc.getAddInterfaceMethod = getAddInterfaceMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.AddInterfaceRequest, com.cotx.ovsctl.message.Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "addInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.AddInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.message.Bool.getDefaultInstance()))
                  .setSchemaDescriptor(new BridgeConfigMethodDescriptorSupplier("addInterface"))
                  .build();
          }
        }
     }
     return getAddInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cotx.ovsctl.service.InterfaceRequest,
      com.cotx.ovsctl.message.Bool> getDeleteInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteInterface",
      requestType = com.cotx.ovsctl.service.InterfaceRequest.class,
      responseType = com.cotx.ovsctl.message.Bool.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cotx.ovsctl.service.InterfaceRequest,
      com.cotx.ovsctl.message.Bool> getDeleteInterfaceMethod() {
    io.grpc.MethodDescriptor<com.cotx.ovsctl.service.InterfaceRequest, com.cotx.ovsctl.message.Bool> getDeleteInterfaceMethod;
    if ((getDeleteInterfaceMethod = BridgeConfigGrpc.getDeleteInterfaceMethod) == null) {
      synchronized (BridgeConfigGrpc.class) {
        if ((getDeleteInterfaceMethod = BridgeConfigGrpc.getDeleteInterfaceMethod) == null) {
          BridgeConfigGrpc.getDeleteInterfaceMethod = getDeleteInterfaceMethod = 
              io.grpc.MethodDescriptor.<com.cotx.ovsctl.service.InterfaceRequest, com.cotx.ovsctl.message.Bool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BridgeConfig", "deleteInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.service.InterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cotx.ovsctl.message.Bool.getDefaultInstance()))
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
    public void addController(com.cotx.ovsctl.service.AddControllerRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a controller from a given bridge. 
     * </pre>
     */
    public void deleteController(com.cotx.ovsctl.service.DeleteControllerRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Void> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteControllerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get controllers of a given bridge. 
     * </pre>
     */
    public void getControllers(com.cotx.ovsctl.service.CommonField request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.service.GetControllersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetControllersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a port to a given bridge. 
     * </pre>
     */
    public void addPort(com.cotx.ovsctl.service.AddPortRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds a port with tunnel configure to a given bridge. 
     * </pre>
     */
    public void addTunnelPort(com.cotx.ovsctl.service.AddTunnelPortRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Void> responseObserver) {
      asyncUnimplementedUnaryCall(getAddTunnelPortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a port from a given bridge. 
     * </pre>
     */
    public void deletePort(com.cotx.ovsctl.service.PortRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get ports of a given bridge. 
     * </pre>
     */
    public void getPorts(com.cotx.ovsctl.service.CommonField request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.service.GetPortsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void getPortByUuid(com.cotx.ovsctl.service.PortRequest request,
        io.grpc.stub.StreamObserver<OvsPort> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPortByUuidMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get interfaces from a given bridge,or get interfaces from a given port. 
     * </pre>
     */
    public void getInterfaces(com.cotx.ovsctl.service.PortRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.service.GetInterfacesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInterfacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void getInterface(com.cotx.ovsctl.service.InterfaceRequest request,
        io.grpc.stub.StreamObserver<OvsInterface> responseObserver) {
      asyncUnimplementedUnaryCall(getGetInterfaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void addInterface(com.cotx.ovsctl.service.AddInterfaceRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getAddInterfaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void deleteInterface(com.cotx.ovsctl.service.InterfaceRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInterfaceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddControllerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.AddControllerRequest,
                com.cotx.ovsctl.message.Bool>(
                  this, METHODID_ADD_CONTROLLER)))
          .addMethod(
            getDeleteControllerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.DeleteControllerRequest,
                com.cotx.ovsctl.message.Void>(
                  this, METHODID_DELETE_CONTROLLER)))
          .addMethod(
            getGetControllersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.CommonField,
                com.cotx.ovsctl.service.GetControllersResponse>(
                  this, METHODID_GET_CONTROLLERS)))
          .addMethod(
            getAddPortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.AddPortRequest,
                com.cotx.ovsctl.message.Bool>(
                  this, METHODID_ADD_PORT)))
          .addMethod(
            getAddTunnelPortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.AddTunnelPortRequest,
                com.cotx.ovsctl.message.Void>(
                  this, METHODID_ADD_TUNNEL_PORT)))
          .addMethod(
            getDeletePortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.PortRequest,
                com.cotx.ovsctl.message.Bool>(
                  this, METHODID_DELETE_PORT)))
          .addMethod(
            getGetPortsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.CommonField,
                com.cotx.ovsctl.service.GetPortsResponse>(
                  this, METHODID_GET_PORTS)))
          .addMethod(
            getGetPortByUuidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.PortRequest,
                      OvsPort>(
                  this, METHODID_GET_PORT_BY_UUID)))
          .addMethod(
            getGetInterfacesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.PortRequest,
                com.cotx.ovsctl.service.GetInterfacesResponse>(
                  this, METHODID_GET_INTERFACES)))
          .addMethod(
            getGetInterfaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.InterfaceRequest,
                      OvsInterface>(
                  this, METHODID_GET_INTERFACE)))
          .addMethod(
            getAddInterfaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.AddInterfaceRequest,
                com.cotx.ovsctl.message.Bool>(
                  this, METHODID_ADD_INTERFACE)))
          .addMethod(
            getDeleteInterfaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cotx.ovsctl.service.InterfaceRequest,
                com.cotx.ovsctl.message.Bool>(
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
    public void addController(com.cotx.ovsctl.service.AddControllerRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a controller from a given bridge. 
     * </pre>
     */
    public void deleteController(com.cotx.ovsctl.service.DeleteControllerRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteControllerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get controllers of a given bridge. 
     * </pre>
     */
    public void getControllers(com.cotx.ovsctl.service.CommonField request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.service.GetControllersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetControllersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a port to a given bridge. 
     * </pre>
     */
    public void addPort(com.cotx.ovsctl.service.AddPortRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds a port with tunnel configure to a given bridge. 
     * </pre>
     */
    public void addTunnelPort(com.cotx.ovsctl.service.AddTunnelPortRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Void> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddTunnelPortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a port from a given bridge. 
     * </pre>
     */
    public void deletePort(com.cotx.ovsctl.service.PortRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get ports of a given bridge. 
     * </pre>
     */
    public void getPorts(com.cotx.ovsctl.service.CommonField request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.service.GetPortsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPortsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void getPortByUuid(com.cotx.ovsctl.service.PortRequest request,
        io.grpc.stub.StreamObserver<OvsPort> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPortByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get interfaces from a given bridge,or get interfaces from a given port. 
     * </pre>
     */
    public void getInterfaces(com.cotx.ovsctl.service.PortRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.service.GetInterfacesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInterfacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void getInterface(com.cotx.ovsctl.service.InterfaceRequest request,
        io.grpc.stub.StreamObserver<OvsInterface> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void addInterface(com.cotx.ovsctl.service.AddInterfaceRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public void deleteInterface(com.cotx.ovsctl.service.InterfaceRequest request,
        io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool> responseObserver) {
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
    public com.cotx.ovsctl.message.Bool addController(com.cotx.ovsctl.service.AddControllerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a controller from a given bridge. 
     * </pre>
     */
    public com.cotx.ovsctl.message.Void deleteController(com.cotx.ovsctl.service.DeleteControllerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteControllerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get controllers of a given bridge. 
     * </pre>
     */
    public com.cotx.ovsctl.service.GetControllersResponse getControllers(com.cotx.ovsctl.service.CommonField request) {
      return blockingUnaryCall(
          getChannel(), getGetControllersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a port to a given bridge. 
     * </pre>
     */
    public com.cotx.ovsctl.message.Bool addPort(com.cotx.ovsctl.service.AddPortRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds a port with tunnel configure to a given bridge. 
     * </pre>
     */
    public com.cotx.ovsctl.message.Void addTunnelPort(com.cotx.ovsctl.service.AddTunnelPortRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddTunnelPortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a port from a given bridge. 
     * </pre>
     */
    public com.cotx.ovsctl.message.Bool deletePort(com.cotx.ovsctl.service.PortRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get ports of a given bridge. 
     * </pre>
     */
    public com.cotx.ovsctl.service.GetPortsResponse getPorts(com.cotx.ovsctl.service.CommonField request) {
      return blockingUnaryCall(
          getChannel(), getGetPortsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public OvsPort getPortByUuid(com.cotx.ovsctl.service.PortRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPortByUuidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get interfaces from a given bridge,or get interfaces from a given port. 
     * </pre>
     */
    public com.cotx.ovsctl.service.GetInterfacesResponse getInterfaces(com.cotx.ovsctl.service.PortRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInterfacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public OvsInterface getInterface(com.cotx.ovsctl.service.InterfaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInterfaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public com.cotx.ovsctl.message.Bool addInterface(com.cotx.ovsctl.service.AddInterfaceRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddInterfaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public com.cotx.ovsctl.message.Bool deleteInterface(com.cotx.ovsctl.service.InterfaceRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.cotx.ovsctl.message.Bool> addController(
        com.cotx.ovsctl.service.AddControllerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a controller from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cotx.ovsctl.message.Void> deleteController(
        com.cotx.ovsctl.service.DeleteControllerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteControllerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get controllers of a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cotx.ovsctl.service.GetControllersResponse> getControllers(
        com.cotx.ovsctl.service.CommonField request) {
      return futureUnaryCall(
          getChannel().newCall(getGetControllersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a port to a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cotx.ovsctl.message.Bool> addPort(
        com.cotx.ovsctl.service.AddPortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds a port with tunnel configure to a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cotx.ovsctl.message.Void> addTunnelPort(
        com.cotx.ovsctl.service.AddTunnelPortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddTunnelPortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a port from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cotx.ovsctl.message.Bool> deletePort(
        com.cotx.ovsctl.service.PortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get ports of a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cotx.ovsctl.service.GetPortsResponse> getPorts(
        com.cotx.ovsctl.service.CommonField request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPortsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<OvsPort> getPortByUuid(
        com.cotx.ovsctl.service.PortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPortByUuidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get interfaces from a given bridge,or get interfaces from a given port. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cotx.ovsctl.service.GetInterfacesResponse> getInterfaces(
        com.cotx.ovsctl.service.PortRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInterfacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<OvsInterface> getInterface(
        com.cotx.ovsctl.service.InterfaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInterfaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cotx.ovsctl.message.Bool> addInterface(
        com.cotx.ovsctl.service.AddInterfaceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddInterfaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a port from a given bridge. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cotx.ovsctl.message.Bool> deleteInterface(
        com.cotx.ovsctl.service.InterfaceRequest request) {
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
          serviceImpl.addController((com.cotx.ovsctl.service.AddControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool>) responseObserver);
          break;
        case METHODID_DELETE_CONTROLLER:
          serviceImpl.deleteController((com.cotx.ovsctl.service.DeleteControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Void>) responseObserver);
          break;
        case METHODID_GET_CONTROLLERS:
          serviceImpl.getControllers((com.cotx.ovsctl.service.CommonField) request,
              (io.grpc.stub.StreamObserver<com.cotx.ovsctl.service.GetControllersResponse>) responseObserver);
          break;
        case METHODID_ADD_PORT:
          serviceImpl.addPort((com.cotx.ovsctl.service.AddPortRequest) request,
              (io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool>) responseObserver);
          break;
        case METHODID_ADD_TUNNEL_PORT:
          serviceImpl.addTunnelPort((com.cotx.ovsctl.service.AddTunnelPortRequest) request,
              (io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Void>) responseObserver);
          break;
        case METHODID_DELETE_PORT:
          serviceImpl.deletePort((com.cotx.ovsctl.service.PortRequest) request,
              (io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool>) responseObserver);
          break;
        case METHODID_GET_PORTS:
          serviceImpl.getPorts((com.cotx.ovsctl.service.CommonField) request,
              (io.grpc.stub.StreamObserver<com.cotx.ovsctl.service.GetPortsResponse>) responseObserver);
          break;
        case METHODID_GET_PORT_BY_UUID:
          serviceImpl.getPortByUuid((com.cotx.ovsctl.service.PortRequest) request,
              (io.grpc.stub.StreamObserver<OvsPort>) responseObserver);
          break;
        case METHODID_GET_INTERFACES:
          serviceImpl.getInterfaces((com.cotx.ovsctl.service.PortRequest) request,
              (io.grpc.stub.StreamObserver<com.cotx.ovsctl.service.GetInterfacesResponse>) responseObserver);
          break;
        case METHODID_GET_INTERFACE:
          serviceImpl.getInterface((com.cotx.ovsctl.service.InterfaceRequest) request,
              (io.grpc.stub.StreamObserver<OvsInterface>) responseObserver);
          break;
        case METHODID_ADD_INTERFACE:
          serviceImpl.addInterface((com.cotx.ovsctl.service.AddInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool>) responseObserver);
          break;
        case METHODID_DELETE_INTERFACE:
          serviceImpl.deleteInterface((com.cotx.ovsctl.service.InterfaceRequest) request,
              (io.grpc.stub.StreamObserver<com.cotx.ovsctl.message.Bool>) responseObserver);
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

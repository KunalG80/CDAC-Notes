# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc
import warnings

import order_manager_pb2 as order__manager__pb2

GRPC_GENERATED_VERSION = '1.68.0'
GRPC_VERSION = grpc.__version__
_version_not_supported = False

try:
    from grpc._utilities import first_version_is_lower
    _version_not_supported = first_version_is_lower(GRPC_VERSION, GRPC_GENERATED_VERSION)
except ImportError:
    _version_not_supported = True

if _version_not_supported:
    raise RuntimeError(
        f'The grpc package installed is at version {GRPC_VERSION},'
        + f' but the generated code in order_manager_pb2_grpc.py depends on'
        + f' grpcio>={GRPC_GENERATED_VERSION}.'
        + f' Please upgrade your grpc module to grpcio>={GRPC_GENERATED_VERSION}'
        + f' or downgrade your generated code using grpcio-tools<={GRPC_VERSION}.'
    )


class OrderManagerStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.PlaceOrder = channel.unary_unary(
                '/sales.OrderManager/PlaceOrder',
                request_serializer=order__manager__pb2.OrderInput.SerializeToString,
                response_deserializer=order__manager__pb2.OrderStatus.FromString,
                _registered_method=True)
        self.FetchOrders = channel.unary_stream(
                '/sales.OrderManager/FetchOrders',
                request_serializer=order__manager__pb2.CustomerInput.SerializeToString,
                response_deserializer=order__manager__pb2.CustomerOrder.FromString,
                _registered_method=True)


class OrderManagerServicer(object):
    """Missing associated documentation comment in .proto file."""

    def PlaceOrder(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def FetchOrders(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_OrderManagerServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'PlaceOrder': grpc.unary_unary_rpc_method_handler(
                    servicer.PlaceOrder,
                    request_deserializer=order__manager__pb2.OrderInput.FromString,
                    response_serializer=order__manager__pb2.OrderStatus.SerializeToString,
            ),
            'FetchOrders': grpc.unary_stream_rpc_method_handler(
                    servicer.FetchOrders,
                    request_deserializer=order__manager__pb2.CustomerInput.FromString,
                    response_serializer=order__manager__pb2.CustomerOrder.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'sales.OrderManager', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))
    server.add_registered_method_handlers('sales.OrderManager', rpc_method_handlers)


 # This class is part of an EXPERIMENTAL API.
class OrderManager(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def PlaceOrder(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/sales.OrderManager/PlaceOrder',
            order__manager__pb2.OrderInput.SerializeToString,
            order__manager__pb2.OrderStatus.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

    @staticmethod
    def FetchOrders(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_stream(
            request,
            target,
            '/sales.OrderManager/FetchOrders',
            order__manager__pb2.CustomerInput.SerializeToString,
            order__manager__pb2.CustomerOrder.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)

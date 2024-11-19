# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import order_manager_pb2 as order__manager__pb2


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
                )
        self.FetchOrders = channel.unary_stream(
                '/sales.OrderManager/FetchOrders',
                request_serializer=order__manager__pb2.CustomerInput.SerializeToString,
                response_deserializer=order__manager__pb2.CustomerOrder.FromString,
                )


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
        return grpc.experimental.unary_unary(request, target, '/sales.OrderManager/PlaceOrder',
            order__manager__pb2.OrderInput.SerializeToString,
            order__manager__pb2.OrderStatus.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

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
        return grpc.experimental.unary_stream(request, target, '/sales.OrderManager/FetchOrders',
            order__manager__pb2.CustomerInput.SerializeToString,
            order__manager__pb2.CustomerOrder.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

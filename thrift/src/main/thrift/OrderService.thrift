namespace java org.exercise.service

include "OrderReq.thrift"
include "OrderResp.thrift"

service OrderService{
    OrderResp.OrderResp createOrder(OrderReq.OrderReq request);
}
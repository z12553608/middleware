package org.exercise.afterclass.transactionClient;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.exercise.order.OrderReq;
import org.exercise.order.OrderResp;
import org.exercise.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * @author 邓紫棋的小跟班-YU.
 * @version 1.0
 * @date 2022/4/29 16:50
 */
public class TransactionClient {
    public static final String SERVER_IP="127.0.0.1";
    public static final int SERVER_PORT=1978;
    public static OrderService.Client client=null;
    public static OrderResp queryOrder(OrderReq req) {
        try (TTransport transport = new TSocket(SERVER_IP, SERVER_PORT)) {
            //TTransport tTransport = new TFramedTransport(transport);
            TProtocol protocol = new TBinaryProtocol(transport);
            client = new OrderService.Client(protocol);
            transport.open();
            return client.createOrder(req);
        } catch (TException e) {
            throw new RuntimeException(e);
        }
    }
}

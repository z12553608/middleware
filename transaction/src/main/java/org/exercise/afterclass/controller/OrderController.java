package org.exercise.afterclass.controller;

import com.alibaba.fastjson2.JSON;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.exercise.order.OrderReq;
import org.exercise.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author wuxiaoling
 * @version 1.0
 * @description
 * @date 2021/8/24 7:36 下午
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    public static final String SERVER_IP="127.0.0.1";
    public static final int SERVER_PORT=1978;
    public static OrderService.Client client=null;
    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String getOrder(OrderReq req) {
        try (TTransport transport = new TSocket(SERVER_IP, SERVER_PORT)) {
            TProtocol protocol = new TBinaryProtocol(transport);
            client = new OrderService.Client(protocol);
            transport.open();
            return JSON.toJSONString(client.createOrder(req));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

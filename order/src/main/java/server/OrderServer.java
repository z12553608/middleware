package server;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.exercise.service.OrderService;
import service.OrderServerImpl;

import java.net.ServerSocket;

/**
 * @author 邓紫棋的小跟班-YU.
 * @version 1.0
 * @date 2022/4/27 16:32
 */
public class OrderServer {
    public static final int SERVER_PORT=1978;
    public static void main(String[] args) throws Exception {
        //设置服务端
        ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
        TServerSocket TSocket = new TServerSocket(serverSocket);
        //设置接口实现类
        OrderService.Processor processor =new OrderService.Processor<OrderService.Iface>(new OrderServerImpl());
        //设置传输协议
        TBinaryProtocol.Factory Tfactory = new TBinaryProtocol.Factory();
        //初始化服务器启动参数
        TServer.Args Sargs = new TServer.Args(TSocket);
        Sargs.processor(processor);
        Sargs.protocolFactory(Tfactory);

        //启动服务器
        TServer tServer = new TSimpleServer(Sargs);
        System.out.println("Order服务启动");
        tServer.serve();
    }
}

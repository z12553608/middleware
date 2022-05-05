package server;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.exercise.service.StockService;
import service.StockServerImpl;

import java.net.ServerSocket;

/**
 * @author 邓紫棋的小跟班-YU.
 * @version 1.0
 * @date 2022/4/27 16:32
 */
public class StockServer {
    public static final int SERVER_PORT=1979;
    public static void main(String[] args) throws Exception {
        //设置服务端
        ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
        TServerSocket TSocket = new TServerSocket(serverSocket);
        //设置接口实现类
        StockService.Processor processor =new StockService.Processor<StockService.Iface>(new StockServerImpl());
        //设置传输协议
        TBinaryProtocol.Factory Tfactory = new TBinaryProtocol.Factory();
        //初始化服务器启动参数
        TServer.Args Sargs = new TServer.Args(TSocket);
        Sargs.processor(processor);
        Sargs.protocolFactory(Tfactory);

        //启动服务器
        TServer tServer = new TSimpleServer(Sargs);
        System.out.println("Stock服务启动");
        tServer.serve();
    }
}

package orderClient;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.layered.TFramedTransport;
import org.exercise.order.OrderResp;
import org.exercise.pricing.PricingReq;
import org.exercise.pricing.PricingResp;
import org.exercise.service.PricingService;
import org.exercise.service.StockService;
import org.exercise.stock.StockReq;
import org.exercise.stock.StockResp;


/**
 * @author 邓紫棋的小跟班-YU.
 * @version 1.0
 * @date 2022/4/27 11:50
 */
public class OrderClient {
    public static final String SERVER_IP = "127.0.0.1";
    public static final int SERVER_PORT = 1979;
    public static final int SERVER_PORT_P = 1980;
    public static OrderResp sendReq(StockReq stockReq,PricingReq pricingReq) {
        TTransport transport = null;
        TTransport transport_p = null;
        try {
            transport = new TSocket(SERVER_IP, SERVER_PORT);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            StockService.Client client = new StockService.Client(protocol);
            System.out.println(client.getStock(stockReq));

            transport_p = new TSocket(SERVER_IP, SERVER_PORT_P);
            transport_p.open();
            TProtocol protocol_p = new TBinaryProtocol(transport_p);
            PricingService.Client client_p = new PricingService.Client(protocol_p);
            System.out.println(client_p.getPricing(pricingReq));
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//    public static PricingResp sendPriReq(PricingReq pricingReq) {
//        TTransport transport = null;
//        try {
//            transport = new TSocket(SERVER_IP, SERVER_PORT);
//            transport.open();
//            TProtocol protocol = new TBinaryProtocol(transport);
//            PricingService.Client client = new PricingService.Client(protocol);
//            return client.getPricing(pricingReq);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }


}

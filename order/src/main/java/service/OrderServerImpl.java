package service;

import orderClient.OrderClient;
import org.apache.thrift.TException;
import org.exercise.order.OrderReq;
import org.exercise.order.OrderResp;
import org.exercise.pricing.PricingReq;
import org.exercise.pricing.PricingResp;
import org.exercise.service.OrderService;
import org.exercise.stock.StockReq;
import org.exercise.stock.StockResp;


/**
 * @author 邓紫棋的小跟班-YU.
 * @version 1.0
 * @date 2022/4/27 16:33
 */
public class OrderServerImpl implements OrderService.Iface {
    public OrderResp createOrder(OrderReq request) throws TException {
        System.out.println(request);
        //同时请求库存中心和定价中心，拿到对应的数据根据情况返回订单信息
        OrderResp resp =new OrderResp();
        try {
            //构建一个库存中心的请求体
            StockReq stockReq=new StockReq();
            stockReq.setProductName(request.getProductName());
            stockReq.setCount(request.getCount());
            //库存中心的请求体请求库存中心返回信息添加到订单信息中
            //此处构建定价中心的请求体
            PricingReq pricingReq=new PricingReq();
            pricingReq.setCount(request.getCount());
            pricingReq.setProductName(request.getProductName());


            OrderResp orderResp = OrderClient.sendReq(stockReq,pricingReq);
            resp.setCode(0);
            resp.setMsg("5555");
            resp.setProductName(request.getProductName());
            resp.setOrderId(123882556);
            return resp;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

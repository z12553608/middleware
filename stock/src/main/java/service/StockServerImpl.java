package service;

import org.apache.thrift.TException;
import org.exercise.service.StockService;
import org.exercise.stock.StockReq;
import org.exercise.stock.StockResp;

import java.util.ArrayList;
import java.util.List;


/**
 * @author 邓紫棋的小跟班-YU.
 * @version 1.0
 * @date 2022/4/27 16:33
 */
public class StockServerImpl implements StockService.Iface {
    /**
     * 库存中心。返回库存信息
     * **/
    public StockResp getStock(StockReq request) throws TException {
        StockResp resp=new StockResp();
        resp.setProductName(request.getProductName());
        List<String> ll=new ArrayList<String>();
        if (request.getCount()>5){
            resp.setCode(0);
            resp.setMsg("库存不足");
        }else {
            resp.setCode(1);
            resp.setMsg("成功");
            ll.add("productOne".equals(request.getProductName()) ? "po1":"pt1");
            resp.setProductList(ll);
        }
        System.out.println("库存"+resp);
        return resp;
    }
}

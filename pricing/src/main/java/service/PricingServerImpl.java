package service;

import org.apache.thrift.TException;
import org.exercise.pricing.PricingReq;
import org.exercise.pricing.PricingResp;
import org.exercise.service.PricingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 邓紫棋的小跟班-YU.
 * @version 1.0
 * @date 2022/4/29 15:57
 */
public class PricingServerImpl implements PricingService.Iface {
    /**
     * 定价中心，返回物品单价信息
     * **/
    public PricingResp getPricing(PricingReq request) throws TException {
        PricingResp resp=new PricingResp();
        resp.setProductName(request.getProductName());
        List<String> ll=new ArrayList<String>();
        Integer ran=new Random().nextInt((10-1)+1)+1;
        System.out.println("随机数"+ran);
        if (ran==5){
            resp.setCode(0);
            resp.setMsg("服务异常");
        }else {
            ll.add("productOne".equals(request.getProductName())? "50.0":"60.0");
            resp.setPricingList(ll);
            resp.setCode(1);
            resp.setMsg("成功");
        }
        System.out.println("定价中心"+resp);
        return resp;
    }
}

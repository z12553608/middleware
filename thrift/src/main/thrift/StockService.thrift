namespace java org.exercise.service

include "StockResp.thrift"
include "StockReq.thrift"

service StockService{
    StockResp.StockResp getStock(StockReq.StockReq request)
}
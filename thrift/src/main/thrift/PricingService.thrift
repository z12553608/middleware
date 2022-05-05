namespace java org.exercise.service

include "PricingReq.thrift"
include "PricingResp.thrift"

service PricingService{
    PricingResp.PricingResp getPricing(PricingReq.PricingReq request)
}
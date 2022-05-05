namespace java org.exercise.pricing

struct PricingResp {

 1: required string productName;
 2: optional list<string> pricingList;
  3: required i32 code;
  4: required string msg;
}
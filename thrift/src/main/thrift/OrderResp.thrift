namespace java org.exercise.order

struct OrderResp {

 1: required i64 orderId;

 2: required string productName;

 3: optional list<string> productList;

 4: optional list<string> pricList;
 5: required i32 code;
 6: required string msg;
}
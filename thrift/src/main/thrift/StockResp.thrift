namespace java org.exercise.stock

struct StockResp {
 1: required string productName;
 2: optional list<string> productList;
 3: required i32 code;
 4: required string msg;
}
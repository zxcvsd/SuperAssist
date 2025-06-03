package com.zxcvsd.payment.model.payConfig.base;

public class AliPayConfig {
    private String url; // 支付宝网关（固定）
    private String appid; // APPID 即创建应用后生成
    private String private_kry; // 开发者私钥，由开发者自己生成
    private String format; // 参数返回格式，只支持 JSON（固定）
    private String charset; // 编码集，支持 GBK/UTF-8
    private String alipay_public_key; // 支付宝公钥，由支付宝生成
    private String sign_type; // 生成签名字符串所使用的签名算法类型，目前支持 RSA2 算法
}

package cn.message.model.alipay;

/**
 * 支付宝服务窗环境常量
 * 这个类希望放到api中 让web层可以访问到
 */
public class AlipayServiceEnvConstants {

    /**支付宝公钥-从支付宝生活号详情页面获取*/
	public static final String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";
    
    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      =  "UTF-8";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           =  "UTF-8";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA2";
    
    /**开发者账号PID*/
    public static final String PARTNER           = "";

    /** 服务窗appId  */
    //TODO !!!! 注：该appId必须设为开发者自己的生活号id  
    public static final String APP_ID            = "2015041000044041";

    public static final String PRIVATE_KEYYuan = "MIICXgIBAAKBgQDIByktrZ+LhRACBhj4N6U1FAAEL06clJJjkUBa/Gx/Pu4fOYwpJ1mBILOGyPDL53hVm9kL+1d4Tms2bUxJsY6cqUBg6uO1Vqo3I99LxRf0n5t76cID2v6NpQhR25tH4aWqG4z4avsW4fpSy2hDzGEB5u4oDeU/eNxx28+UImwR+wIDAQABAoGBAKNCRPfFR/zmA+TC+UpOkIa75i+ENRNTqA+gE/ivIhbRVCUkISPNvB3KhPyzsOWb7PlilEpVQFUvHA52MtfLFeuQ6XBlsPOkWR8Gyh5H42DsULbak78/6BevFB23IszPc/hOn/zE7FF6BuoZy0WlExhnWUCkiewhPebRkIccQyKxAkEA9sK89DukOjdazS2fBOVkBZYJwEHjMIFrKi7wFmJBfc7Of/0FIgP9ZYCSyEKy1JPmJNcuUvs9TIybkeXSC6lyzwJBAM+EemWgX84PlYkuJHdd360qsbGvtdOG0FaD5rVSRp257slwXbNrIzgcgAo+FSKGy76izTZZsxgdc0yCni5VqRUCQQDhk952irsz+PyKCsWPDUCllqZtWg4dfoH/+w7B96qVHuRJvnzdvrX7/1Cvv8GJcXb3gLq5YzGDdBqXgnfE72+jAkAHVVst9Djug0Z5jpPjVAHvkK6u5NK8IuuB4y9oAPxV3pg9ribhjEu2U+uCcSc2DSVuGzq9TPYzR/cnIQaOBKDxAkEA2W2/R2PdIuU6PaD/uTE6l5dv/mBQWyMozLhxQ+dWKvYBqJlikC4mxHDD3OFJT8AtZSLbMoiVbNs1E7SvHmMt7w==";
    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY       = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAMgHKS2tn4uFEAIGGPg3pTUUAAQvTpyUkmORQFr8bH8+7h85jCknWYEgs4bI8MvneFWb2Qv7V3hOazZtTEmxjpypQGDq47VWqjcj30vFF/Sfm3vpwgPa/o2lCFHbm0fhpaobjPhq+xbh+lLLaEPMYQHm7igN5T943HHbz5QibBH7AgMBAAECgYEAo0JE98VH/OYD5ML5Sk6QhrvmL4Q1E1OoD6AT+K8iFtFUJSQhI828HcqE/LOw5Zvs+WKUSlVAVS8cDnYy18sV65DpcGWw86RZHwbKHkfjYOxQttqTvz/oF68UHbcizM9z+E6f/MTsUXoG6hnLRaUTGGdZQKSJ7CE95tGQhxxDIrECQQD2wrz0O6Q6N1rNLZ8E5WQFlgnAQeMwgWsqLvAWYkF9zs5//QUiA/1lgJLIQrLUk+Yk1y5S+z1MjJuR5dILqXLPAkEAz4R6ZaBfzg+ViS4kd13frSqxsa+104bQVoPmtVJGnbnuyXBds2sjOByACj4VIobLvqLNNlmzGB1zTIKeLlWpFQJBAOGT3naKuzP4/IoKxY8NQKWWpm1aDh1+gf/7DsH3qpUe5Em+fN2+tfv/UK+/wYlxdveAurljMYN0GpeCd8Tvb6MCQAdVWy30OO6DRnmOk+NUAe+Qrq7k0rwi64HjL2gA/FXemD2uJuGMS7ZT64JxJzYNJW4bOr1M9jNH9ychBo4EoPECQQDZbb9HY90i5To9oP+5MTqXl2/+YFBbIyjMuHFD51Yq9gGomWKQLibEcMPc4UlPwC1lItsyiJVs2zUTtK8eYy3v";
    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIByktrZ+LhRACBhj4N6U1FAAEL06clJJjkUBa/Gx/Pu4fOYwpJ1mBILOGyPDL53hVm9kL+1d4Tms2bUxJsY6cqUBg6uO1Vqo3I99LxRf0n5t76cID2v6NpQhR25tH4aWqG4z4avsW4fpSy2hDzGEB5u4oDeU/eNxx28+UImwR+wIDAQAB";
    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
}
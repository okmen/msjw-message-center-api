package cn.message.model.alipay;

/**
 * 支付宝服务窗环境常量
 * 这个类希望放到api中 让web层可以访问到
 */
public class AlipayServiceEnvConstants {

    /**支付宝公钥-从支付宝生活号详情页面获取*/
	public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1enDJFrhV3BXiXli2MKBRc3GPlag17iKdnZ7uEr4sCUUAh4oz1dnU3ukSTrl98YCB7BNaOarDMwwtph226BquIzuVuL9bIGkwarrZddR+rlC6/sbrIBiYzDqFvXnqPddV04QtgMyBNsjPSneDn0bxamjUI80vZImYITznzJGNQNdCXQCGm9N8aBX/S1mG7ycPogHr/HTszvIB144My/SwbHubMqIczn9BsZEfvoAuVH4P+vddjcPIeow4FgOQSBHRfRH9LYfvxiE1aTDr7WRzpAJL2n4VJoXf30amd956F9fnCWlNXJ3qKbQWUomLP7GRqqRgHjG4oUEyqEKwJqaHwIDAQAB";
    
    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      =  "utf-8";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           =  "utf-8";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA2";
    
    /**开发者账号PID*/
    public static final String PARTNER           = "";

    /** 服务窗appId  */
    //TODO !!!! 注：该appId必须设为开发者自己的生活号id  
    public static final String APP_ID            = "2016082201786470";

    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY       = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDHaKUHE1t/gbOlvfvh/lajinXLMJXF16MlhcRtPYU1xDXspTN4dieEjABKNuGxYc72Jiu6MVdG0Jo3j6/bsQsekeRtTjwDpyzxwEnGMs+hbhxdJ4l7RpRb9f3WzGhlSQzVjIPsq0+RgWpLV1+hJ/CCUYbmuXjmbp51y5prJswv8drqKHi5Vp97Vsdm//Tx1bHcQEGCv4UhNVdDVgGYCRmGSHwNbpR+NXp1BS6SLIjjUpIKOJfgrBFKnAtPm4f7hnf+ch0DHw7SJVb4z/W1fEmy2VJuAgigNdEzhSaOC/2mHj3zO6Qu/cMkp6C3ZB4QdO5jjhixctka7fh9TBoy9+OzAgMBAAECggEBAJrTAO7RdMU3KwiQzbTWCObJZlPw0RjfKGjFx5EZpwfr5AJs8d2hv2UGXmNA4VMcIdi0IldaX+03ocVp5pyohX2iwLytdaNQdXDuX1lnshYgrB0XyYLRdfdAs2nHI3cglLppczSafhj3ZlRA7prtq6tDKX6SmvAvCxFil+6CHR9LRgzKMMHtHrkGCqxCnVzTDLadoDVdV66oLolJN9/fzDxa8B++uEItCYps/O6rR8yWA0eZj9/74XUhIimrtjCGQAh0BMykOjOIupFVHX3bQURBGmcOdGZeHFhCQtts7CQhf0oXh1+oXVgwtbdaSUpqQfkDexbC72tGhL4Wln8PQeECgYEA61dBOqJFgAzM+Sd2yUnrJQGL5ZIRuw56Hzae3DvNhzbc1eVpLmw8DaAwSZS4IjoaNwO5iBRaqu1ia/t30mUWrC9geCQs1yiXaucr7Fe8DcCupZr2vpz6FM0DC2G/ZFig/JGStX4mfYkIIafCdeiPfvxmnSpMq4mGS5eBpnfMsycCgYEA2OnmJeZ1Hd8W0UZ+CJ9cgX7yTq7yBndFxKFGBZ5xZzk6SC7UMeyEQ3BHQ3mUZ/1pIycIbqK+GoLN1zg3wPTlwuulIMW0iuWw3ggvGcrw60U/Y8CqmFT3GUgl11Nr+YLe3FcFJ3xB9yQOB2wfTySZH0rKusRbVc4mc+cfVUE6MpUCgYB3p4hxsFmXzmpU75y0oRGeYhfn5AmBys2KmzHQFdPcwKctVZPR15P89Yo3jxbDyDjV6d3l8ztaFpHpBxUX8u/BIeFxlCr8RhYec2TgqIbjkyj46D42EggQlV/L5Knz8h//6l/mSTp2rzpkKjBz1IdI8DmYBQ6wVJ7kRibUJar9FwKBgQDB1nshYUlFcWeNikX0ZJyg6BWWdMW5O3qwVUIioU1L5hsMCDT9jBNBxKMaTBpvt0ft7uKdI3dob32MlyNTnkV4I2ZD3AkTmmCseXnFvdH/HLmh5blNOZg7Ensmadjydp27H1RuzZ6RQLn8rgVojxb6nLZ/ohrQmdFI/7/DSu+75QKBgQCua4XB5i3kZ0oz9/ykFxlNZl/Cbm+aqaIlQ8Mrd7eKlEDP8HmQ8OhuJL14jpIFt1h/vgmlVwfIQY6B7qED8sNAETNoVNDDoIZwVJt1QuEoOxN1vxRfEg0W7Tn/p0jOPfsG/0SgXYtyAcbBkasuFV5GSAqbjJIjckGtm3a+PBIqKQ==";
    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx2ilBxNbf4Gzpb374f5Wo4p1yzCVxdejJYXEbT2FNcQ17KUzeHYnhIwASjbhsWHO9iYrujFXRtCaN4+v27ELHpHkbU48A6cs8cBJxjLPoW4cXSeJe0aUW/X91sxoZUkM1YyD7KtPkYFqS1dfoSfwglGG5rl45m6edcuaaybML/Ha6ih4uVafe1bHZv/08dWx3EBBgr+FITVXQ1YBmAkZhkh8DW6UfjV6dQUukiyI41KSCjiX4KwRSpwLT5uH+4Z3/nIdAx8O0iVW+M/1tXxJstlSbgIIoDXRM4Umjgv9ph498zukLv3DJKegt2QeEHTuY44YsXLZGu34fUwaMvfjswIDAQAB";
    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE        = "authorization_code";
}
package cn.message.model.alipay;

/**
 * 支付宝服务窗环境常量
 * 这个类希望放到api中 让web层可以访问到
 */
public class AlipayServiceEnvConstants {

	/**支付宝公钥-从支付宝生活号详情页面获取*/
	public static final String ALIPAY_PUBLIC_KEY_TEST = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1enDJFrhV3BXiXli2MKBRc3GPlag17iKdnZ7uEr4sCUUAh4oz1dnU3ukSTrl98YCB7BNaOarDMwwtph226BquIzuVuL9bIGkwarrZddR+rlC6/sbrIBiYzDqFvXnqPddV04QtgMyBNsjPSneDn0bxamjUI80vZImYITznzJGNQNdCXQCGm9N8aBX/S1mG7ycPogHr/HTszvIB144My/SwbHubMqIczn9BsZEfvoAuVH4P+vddjcPIeow4FgOQSBHRfRH9LYfvxiE1aTDr7WRzpAJL2n4VJoXf30amd956F9fnCWlNXJ3qKbQWUomLP7GRqqRgHjG4oUEyqEKwJqaHwIDAQAB";
    
    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET_TEST      =  "UTF-8";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET_TEST           =  "UTF-8";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE_TEST         = "RSA2";
    
    /**开发者账号PID*/
    public static final String PARTNER_TEST           = "";

    /** 服务窗appId  */
    //TODO !!!! 注：该appId必须设为开发者自己的生活号id  
    public static final String APP_ID_TEST            = "2016082201786470";

    public static final String PRIVATE_KEYYuan_TEST = "MIIEpQIBAAKCAQEA0JlegJ6jCWjejDQd9FVjUyHCZLveuXJNX/5Nshq7mus4L8Q0bAC/8UVyTZ97WWR5fpk9+/WDxDtYX4gM7CPaIsRYqgWqJ3N2uKu+zZNzWS03hL9WF/T6oOwV4qDCEMdbJYWvx5VrsvZNqkkjp/ophiABxi+tg0tBnm1M+DMlkdxeiB9QQXrTgQHNjllOBKTJuLPlBolVNU5iqIh0hRyAUJ1J1KV63n9YQWk8iBIO3prpGq/cQEl6nL1XrM0sder116Q3jgfgmNsXC4UXIE1N6XfVTmLEWOqRaxc6VnCS7hHh1QcF7BsUsrDG7KCRedpMcT11+lPX5IBANarIeJGTcQIDAQABAoIBAQCEL8xdASobumLcweIBhWKtuYTwRMU9CxvRKtudc6dS4p/2VQVLM6ZuhC2M1vVZjnwXJ5DJ66kWXuz/jL1znryKr5XoGDLdUSP4no0IxNmhty+pZX5vLATumOy9clXIQCyYOIFNnnhjLgXFVRfNSI+ruPim2GvB+ZyZgnX2CqNSLAeiqrdvCfMcxo8rA7QAVvgHYRymmpg0dUtOX7b0NLdNRkph0voTCYZLzsbR0tjIN5+iWJsvwi0AtvcwYJnq+m8QvXlkY7gswtthVy1iMgl7vq/x+ZPXP5Omd2kII7NbabzN+xQVFJ0Q0CMFDmTBaiBuKtWWCcgXPlQYmKlr00QBAoGBAPufDbN9KzGvaNGcrvCxgU3//totwyUShB+d4+FhfhCmOC2mW+G2wKckkZVLFgs5npyaFH05ME9tm5k2jiHtukOqmUOZQWHvDmKKaULU2tJ0HiATo8pahDvjzJ3NFaC224VUVJfo5wFxnOGoOKtmP5Keb7wT7/LyjZeIrWbdZx9RAoGBANQ6p/54oW4rolqnWCPTHTfZ8AikSMpe2FFYOCzJ9/GVLiPDGH6mJpzDNUJc/bliPKRRaYST8TtwmJQRhjL1o9GU4cNIyWzrcTPbGlVEMHcoOQCjcSkbolGYbwuLaNsRfi97IzjjZ3Jom4vg8ZJRgALXzRlUOmiIU9xAkZ5In2ohAoGBAMbSelgOmrfq289tmEo2aG8CzhUGPgGoLOByuWMYzy1GunNP1aB38Kjh22t1Zli+Udd6ZKBCNSs998pL8mla2Gipf+uLSL+izuIMbnpRiQrsl/VOr4iwl3ZfXQp/yAwzESi8Zw+WCBr69DTW4NiGtcscCDw8IMj+4eUQKbxzTA3RAoGAEz0h/4KF98vC0v76kXzQ2EBMbywdYSMJ7w3VQdIpROAmJ53G+awsMefMSzDM22JZZvfuXdNfeejyG/IevT3hVN1vPdm6UMJjJ7VEBNjCn/qoeDNYzcYwh78OyfggUEOcsccy4TRUK13qQ9rna0EyHo/biuFEzjcVixDbYoLo2KECgYEAvl3mnpu5SG0mHT8lcoiO1UYLdQlf+IOzLFOiCsi27LbIzfhBjWauIgtqixt2T7ETDfquboC0q5E2un50KXa2G52ap5RSsyJJ6enNUWtqb6qkMNoo8aWtJzocOBrmjRtTciHY/7hBqnCkAsXVJHgURdeyIlcFzuw+OGLDzNfQrMU=";
    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY_TEST       = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDQmV6AnqMJaN6MNB30VWNTIcJku965ck1f/k2yGrua6zgvxDRsAL/xRXJNn3tZZHl+mT379YPEO1hfiAzsI9oixFiqBaonc3a4q77Nk3NZLTeEv1YX9Pqg7BXioMIQx1slha/HlWuy9k2qSSOn+imGIAHGL62DS0GebUz4MyWR3F6IH1BBetOBAc2OWU4EpMm4s+UGiVU1TmKoiHSFHIBQnUnUpXref1hBaTyIEg7emukar9xASXqcvVeszSx16vXXpDeOB+CY2xcLhRcgTU3pd9VOYsRY6pFrFzpWcJLuEeHVBwXsGxSysMbsoJF52kxxPXX6U9fkgEA1qsh4kZNxAgMBAAECggEBAIQvzF0BKhu6YtzB4gGFYq25hPBExT0LG9Eq251zp1Lin/ZVBUszpm6ELYzW9VmOfBcnkMnrqRZe7P+MvXOevIqvlegYMt1RI/iejQjE2aG3L6llfm8sBO6Y7L1yVchALJg4gU2eeGMuBcVVF81Ij6u4+KbYa8H5nJmCdfYKo1IsB6Kqt28J8xzGjysDtABW+AdhHKaamDR1S05ftvQ0t01GSmHS+hMJhkvOxtHS2Mg3n6JYmy/CLQC29zBgmer6bxC9eWRjuCzC22FXLWIyCXu+r/H5k9c/k6Z3aQgjs1tpvM37FBUUnRDQIwUOZMFqIG4q1ZYJyBc+VBiYqWvTRAECgYEA+58Ns30rMa9o0Zyu8LGBTf/+2i3DJRKEH53j4WF+EKY4LaZb4bbApySRlUsWCzmenJoUfTkwT22bmTaOIe26Q6qZQ5lBYe8OYoppQtTa0nQeIBOjylqEO+PMnc0VoLbbhVRUl+jnAXGc4ag4q2Y/kp5vvBPv8vKNl4itZt1nH1ECgYEA1Dqn/nihbiuiWqdYI9MdN9nwCKRIyl7YUVg4LMn38ZUuI8MYfqYmnMM1Qlz9uWI8pFFphJPxO3CYlBGGMvWj0ZThw0jJbOtxM9saVUQwdyg5AKNxKRuiUZhvC4to2xF+L3sjOONncmibi+DxklGAAtfNGVQ6aIhT3ECRnkifaiECgYEAxtJ6WA6at+rbz22YSjZobwLOFQY+Aags4HK5YxjPLUa6c0/VoHfwqOHba3VmWL5R13pkoEI1Kz33ykvyaVrYaKl/64tIv6LO4gxuelGJCuyX9U6viLCXdl9dCn/IDDMRKLxnD5YIGvr0NNbg2Ia1yxwIPDwgyP7h5RApvHNMDdECgYATPSH/goX3y8LS/vqRfNDYQExvLB1hIwnvDdVB0ilE4CYnncb5rCwx58xLMMzbYllm9+5d01956PIb8h69PeFU3W892bpQwmMntUQE2MKf+qh4M1jNxjCHvw7J+CBQQ5yxxzLhNFQrXepD2udrQTIej9uK4UTONxWLENtigujYoQKBgQC+Xeaem7lIbSYdPyVyiI7VRgt1CV/4g7MsU6IKyLbstsjN+EGNZq4iC2qLG3ZPsRMN+q5ugLSrkTa6fnQpdrYbnZqnlFKzIknp6c1Ra2pvqqQw2ijxpa0nOhw4GuaNG1NyIdj/uEGqcKQCxdUkeBRF17IiVwXO7D44YsPM19CsxQ==";
    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY_TEST        = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0JlegJ6jCWjejDQd9FVjUyHCZLveuXJNX/5Nshq7mus4L8Q0bAC/8UVyTZ97WWR5fpk9+/WDxDtYX4gM7CPaIsRYqgWqJ3N2uKu+zZNzWS03hL9WF/T6oOwV4qDCEMdbJYWvx5VrsvZNqkkjp/ophiABxi+tg0tBnm1M+DMlkdxeiB9QQXrTgQHNjllOBKTJuLPlBolVNU5iqIh0hRyAUJ1J1KV63n9YQWk8iBIO3prpGq/cQEl6nL1XrM0sder116Q3jgfgmNsXC4UXIE1N6XfVTmLEWOqRaxc6VnCS7hHh1QcF7BsUsrDG7KCRedpMcT11+lPX5IBANarIeJGTcQIDAQAB";
    /**支付宝网关*/
    public static final String ALIPAY_GATEWAY_TEST    = "https://openapi.alipay.com/gateway.do";

    /**授权访问令牌的授权类型*/
    public static final String GRANT_TYPE_TEST        = "authorization_code";
    
	
    
    
    
    
    
    /**支付宝公钥-从支付宝生活号详情页面获取*/
	public static final String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";
    
    /**签名编码-视支付宝服务窗要求*/
    public static final String SIGN_CHARSET      =  "UTF-8";

    /**字符编码-传递给支付宝的数据编码*/
    public static final String CHARSET           =  "UTF-8";

    /**签名类型-视支付宝服务窗要求*/
    public static final String SIGN_TYPE         = "RSA";
    
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
    
    
    //芝麻信用网关地址  测试app统一使用https://zmopenapi.zmxy.com.cn/sandbox.do  这个网关（区别于上线使用的https://zmopenapi.zmxy.com.cn/openapi.do）
    public static final String ZMXY_GETWAY = "https://zmopenapi.zmxy.com.cn/openapi.do";
    //芝麻 RSA 公钥
    public static final String ZMXY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCV87gwJevIa+/06CBz6qdaEBYnjAMsOKEWvCYlTNcjrxtZswMmovwTxWU6ZH1lXcXkNQDmn6owZLwaez3VJ/UUVIlgU5di7WuJkVOi+5OSD4Nt+AEMbhiWtf3h+UwAcGhSY+G8z0v0aAyuspWe9AUb5/qfQMAaNuQTn9oc0EfrZwIDAQAB";
    //商户 RSA 私钥
    public static final String ZMXY_PRIVATE_KEY = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAN2BNUztWH7nQgzcl7ty+b50NgTEhFuJzvm8LQ6ZmyGUZGAwL7xdd3BPEj/z077iIqg7vxzwV0bqPMVQQIrkGXjNfyFyqZ/9hEH3wpn8PxupX0BojLZgaM7NtOXklCQ/XB9VQm76sD/hBV/bH/Ko5RPV6/aFVRpRQk9a5OKrQ5ntAgMBAAECgYEAq98qIHq6BB4lHh28jnJ0XteFYsWpfe28cAMXYxDFUpT2HbzGDX7ownhYTM9BKggFpExXynijAB+Y7/GJYzwClkwqgfbmYoW55V1AnH5gfavgPXUOf+asPuBuuSz1gVA40Mzrle9rHvzBsECJg+hZm1GKtS6qYIvBg+IH0Zj2FnECQQDxE4CfNmteemdIA/lepw0ae5mEgyiehsoq3brI32MwfzGIVrTEnca+/ThSORx75zS5t+OR8Dq8AgfLNvQjlgDbAkEA6zeLJtCdApz6kUSCNspReJu3YFeo6oSyMT2JP+s2gfmJysOkAVk41icZh0gn5uM7a/7g+/l8x+KLUvfgTzdG1wJBANUOp14OelXFWAINgRZmDO6azdKPGBcCiSnZTHq68q6put0DxD8AMeYZZO1GDCZ07+Qy4KzZ4w7FvJ2cs6e/qoECQEEev4efedifXT+al/JTUPrzIXGq0zkaQ7seLkFj/VM+osdgIqe8699eM9MgRuvFPU5I4kDgcYtlTO1Lcu57f0ECQQDod00NPsYURtZm89ExwD/20Qp0agU4SHWGmVoO6Z0t/FduaISWEp6M53dpeiQd12bbozUCcVPX8l/aRVSt3Ggd";
    //数据编码格式
    public static final String charset = "UTF-8";
    //芝麻分配给商户的 appId
    public static final String appId = "1001884";
    
    
    /**支付宝预发网关*/
    public static final String ALIPAY_GATEWAY_PRE= "https://openapipre.alipay.com/gateway.do";
    /**支付宝卡包公钥*/
    public static final String CARD_PUBLIC_KEY   = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkG3desA/veyJ6/DDk2VCxD/UrdjsTDRSMalD+pc4T49z60u4TnZSoLM6UrdKAXQgOc/W+S80s6Y4tmgxPTvp80woBHBgG7yPt+6JT+eQe4LnpZtKMP4MtQMKPmwFYkPXmOm4O14zTkdNN2euZBIFDoOF7jzlst++Uwab+vcmeLFLu83gVRQG919awk1ZBb7l5H5dhplJm0gU5/CfMRtsJcojfrLVLbtw8SLbUbQDIlzwDm9riRrgLT9V17a7l2bSDERND6r+ARzY13i6cA1Qiso4g6mn7iVDcG4p5+D7ruJXzT8jLjqURL3GKEyUuKU+egmNB6l70t8r3ANuwF/GmwIDAQAB";
    
}
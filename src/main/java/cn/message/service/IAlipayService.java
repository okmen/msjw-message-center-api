package cn.message.service;

import com.alipay.api.AlipayApiException;

import cn.message.model.alipay.AlipayPostMessageModel;
import cn.message.model.alipay.AlipayUserInfo;

public interface IAlipayService {
	
	/**
	 * 处理支付宝消息
	 * @param model
	 * @return
	 */
	void processPostMessage(AlipayPostMessageModel model);

	/**
	 * 支付宝授权回调
	 * @param code
	 * @param state
	 * @return
	 */
	AlipayUserInfo callback4UserId(String code);
	
	public String getAppAuthToken(String appAuthCode) throws AlipayApiException;
}

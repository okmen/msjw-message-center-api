package cn.message.service;

import com.alibaba.fastjson.JSONObject;

import cn.message.bean.CardReceive;
import cn.message.model.alipay.AlipayPostMessageModel;
import cn.message.model.alipay.AlipayUserInfo;
import cn.sdk.bean.BaseBean;

public interface IAlipayService {
	
	/**
	 * 支付宝领卡
	 * @param cardReceive
	 * @return
	 */
	int insertCardReceive(CardReceive cardReceive);
	
	/**
	 * 支付宝查询领卡数量
	 * @param certNo 身份证号
	 * @param type 类型
	 * @return
	 */
	int queryReceiveCardCount(String certNo, String type);
	
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
	
	/**
	 * 上传驾驶证正面照片
	 * @param base64Img
	 * @return
	 */
	BaseBean uploadJsCardImg(String base64Img); 
	
	/**
	 * 上传行驶证正面照片
	 * @param base64Img
	 * @return
	 */
	BaseBean uploadXsCardImg(String base64Img); 
	
	/**
	 * 发送证件信息到支付宝
	 * @param bizContent
	 * @return
	 */
	BaseBean sendCardInfo(String bizContent);
}

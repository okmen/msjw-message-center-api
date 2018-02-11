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
	 * 发送证件信息到支付宝（测试公众号）
	 * @param bizContent
	 * @return
	 */
	BaseBean sendCardInfoTest(String bizContent);
	
	/**
	 * 发送证件信息到支付宝
	 * @param bizContent
	 * @return
	 */
	BaseBean sendCardInfo(String bizContent);
	
	/**
	 * 修改卡包状态
	 * @param cardno 身份证
	 * @param cardtype 卡类型
	 * @param uid 支付宝唯一标识
	 * @return
	 */
	boolean updateCardReceiveType(String cardno, String cardtype, String uid);
}

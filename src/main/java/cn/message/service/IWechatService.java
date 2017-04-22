package cn.message.service;
import java.util.Map;

import cn.message.bean.WechatPostMessageModel;
import cn.message.bean.WechatUserInfo;
import cn.message.bean.message.request.IMessage;

public interface IWechatService {
	/**
	 * 微信验证服务器
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 */
	boolean checkServer(String signature, String timestamp, String nonce);
	
	/**
	 * 处理微信主动发送过来的post消息
	 * @param model 
	 * @return
	 */
	IMessage processPostMessage(WechatPostMessageModel model);
	
	/**
	 * 创建菜单
	 * @return
	 */
	String createMenu(String json);
	
	/**
	 * 查询菜单
	 * @return
	 */
	String queryMenu();
	
	/**
	 * 微信授权回调
	 * @param code
	 * @param state
	 * @return
	 */
	WechatUserInfo callback4OpenId(String code,String state);
	
	/**
	 * 获取sdkConfig配置参数
	 * @param url
	 * @return
	 */
	Map<String, Object> sdkConfig(String url);
}

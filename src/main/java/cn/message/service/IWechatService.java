package cn.message.service;
import java.util.Map;
import cn.message.model.wechat.WechatPostMessageModel;
import cn.message.model.wechat.WechatUserInfo;
import cn.message.model.wechat.message.IMessage;

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
	String createMenu();
	
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
	
	/**
	 * 获取accessToken
	 * @param temp
	 * @return
	 */
	String queryAccessToken();
	
	/**
	 * 获取accessToken
	 * @param temp
	 * @return
	 */
	String createAccessToken();
	
	/**
	 * 获取jsapi_ticket
	 * @return
	 */
	String getJsapiTicket();
	
	/**
	 * 卡券配置
	 * @param openId
	 * @param cardId
	 * @return
	 */
	Map<String, Object> cardConfig(String openId,String cardId);
	
	/**
	 * 激活驾驶证
	 * @param openId
	 * @param cardId
	 * @param decryptCode
	 * @return
	 * @throws Exception
	 */
	boolean activeJsCard(String openId,String cardId,String decryptCode) throws Exception;
	
	/**
	 * 修改驾驶证
	 * @param code
	 * @param cardId
	 * @param ljjf
	 * @param zjcx
	 * @param syrq
	 * @return
	 */
	boolean updateJsCard(String code,String cardId,String ljjf,String zjcx,String syrq);
	
	/**
	 * 激活行驶证
	 * @param openId
	 * @param cardId
	 * @param decryptCode
	 * @return
	 * @throws Exception
	 */
	boolean activeXsCard(String openId,String cardId,String decryptCode) throws Exception;
	

	/**
	 * 获取api_ticket
	 * @return
	 */
	String getApiTicket();
}

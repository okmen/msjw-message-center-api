package cn.message.service;

import java.util.Map;

/**
 * @author gxg
 */
public interface ITemplateMessageService {
	
	/**
	 * 发送模板消息
	 * @param openId 
	 * @param url 点击该模板消息跳转的页面
	 * @param propertys 属性数组 按模板中的数量依次传递
	 */
	boolean sendMessage(String openId,String url,Map<String, String> map);
}

package cn.message.service;

import java.util.Map;

import cn.message.model.wechat.TemplateDataModel.Property;

/**
 * @author gxg
 */
public interface ITemplateMessageService {
	
	/**
	 * 发送模板消息
	 * @param openId 
	 * @param templateId 模板id
	 * @param url 点击该模板消息跳转的页面
	 * @param propertys 属性数组 按模板中的数量依次传递
	 */
	boolean sendMessage(String openId,String templateId,String url,Map<String, Property> map);
	
	boolean hmdahs() throws Exception;
}

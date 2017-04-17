package cn.message.service;

public interface IMobileMessageService {
	/**
	 * 发送手机短信消息
	 * @param mobile 手机号码
	 * @param content 发送内容
	 * @return
	 */
	boolean sendMessage(String mobile,String content);
}

package cn.message.service;

public interface IMobileMessageService {
	/**
	 * 发送手机短信消息
	 */
	void sendMessage(String mobile,String content);
}

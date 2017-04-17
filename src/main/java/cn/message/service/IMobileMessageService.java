package cn.message.service;

public interface IMobileMessageService {
	/**
	 * 发送手机短信消息
	 */
	boolean sendMessage(String mobile,String content);
}

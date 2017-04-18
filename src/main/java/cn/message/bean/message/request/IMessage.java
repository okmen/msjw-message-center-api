package cn.message.bean.message.request;

import java.io.Serializable;

public interface IMessage extends Serializable {
	/**
	 * 文本消息
	 */
	public static final String MESSAGE_TYPE_TEXT = "text";
	
	/**
	 * 语音消息
	 */
	public static final String MESSAGE_TYPE_VOICE = "voice";

	/**
	 * 视频消息
	 */
	public static final String MESSAGE_TYPE_VIDEO = "video";
	
	/**
	 * 事件消息
	 */
	public static final String MESSAGE_TYPE_EVENT = "event"; 
	
	 //转换成xml返回给微信
    public String toXml();
}

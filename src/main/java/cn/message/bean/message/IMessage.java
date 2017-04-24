package cn.message.bean.message;

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
	
	
	public static final String KEYWORD_SZ = "深圳";
	public static final String KEYWORD_SZJJ = "深圳交警";
	
	 //转换成xml返回给微信
    public String toXml();
}

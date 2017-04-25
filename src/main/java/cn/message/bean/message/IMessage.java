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
	
	/**
	 * 图片消息
	 */
	public static final String MESSAGE_TYPE_IMAGE = "image";
	
	/**
	 * 小视频消息
	 */
	public static final String MESSAGE_TYPE_SHORT_VIDEO = "shortvideo";
	
	/**
	 * 定位消息
	 */
	public static final String MESSAGE_TYPE_SHORT_LOCATION = "location";
	
	/**
	 * 链接消息
	 */
	public static final String MESSAGE_TYPE_SHORT_LINK = "link";
	
	/**
	 * 音乐消息
	 */
	public static final String MESSAGE_TYPE_MUSIC = "music";
	
	/**
	 * 图文消息
	 */
	public static final String MESSAGE_TYPE_NEWS = "news";
	
	
	public static final String KEYWORD_SZ = "深圳";
	public static final String KEYWORD_SZJJ = "深圳交警";
	public static final String KEYWORD_XJYH = "星级用户";
	public static final String KEYWORD_TX = "腾讯";
	
	public static final String KEYWORD_HW= "华为";
	public static final String KEYWORD_SP = "视频";
	
	public static final String KEYWORD_XCDCWJ = "宣传调查问卷";
	public static final String KEYWORD_DYZP = "打印照片";
	
	 //转换成xml返回给微信
    public String toXml();
}

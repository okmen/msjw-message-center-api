package cn.message.bean.message;


public interface IEvent extends IMessage {
	/**
	 * 扫描二维码(未关注时扫描,微信会自动关注)/关注事件
	 */
	public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";
	
	/**
	 * 取消订阅事件
	 */
	public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";

	/**
	 * 扫描二维码(已关注时)
	 */
	public static final String EVENT_TYPE_SCAN = "SCAN";
	
	/**
	 * 上报地理位置
	 */
	public static final String EVENT_TYPE_LOCATION = "LOCATION";
	
	/**
	 * 用户点击自定义菜单拉取消息
	 */
	public static final String EVENT_TYPE_CLICK = "CLICK";
	
	/**
	 * 用户点击自定义菜单跳转
	 */
	public static final String EVENT_TYPE_VIEW = "VIEW";
	
	/**
	 * 便民信息
	 */
	public static final String EVENT_KEY_CONVENIENCE_INFOMATION = "convenience_information";
	
	/**
	 * 办事指南
	 */
	public static final String EVENT_KEY_SERVICE_GUIDE = "service_guide";
}

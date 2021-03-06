package cn.message.model.wechat.message;


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
	 * 用户领卡事件
	 */
	public static final String EVENT_USER_GET_CARD = "user_get_card";
	
	/**
	 * 用户查看卡事件
	 */
	public static final String EVENT_USER_VIEW_CARD = "user_view_card";
	
	/**
	 * 用户删卡事件
	 */
	public static final String EVENT_USER_DEL_CARD = "user_del_card";
}

package cn.message.model.alipay.message;

public interface IMessage {
	/**
	 * 文本消息
	 */
	public static final String MESSAGE_TYPE_TEXT = "text";
	
	/**
	 * 事件消息
	 */
	public static final String MESSAGE_TYPE_EVENT = "event";
	
	/**
	 * 图文消息
	 */
	public static final String MESSAGE_TYPE_IMAGE_TEXT = "image-text";
	
	 //转换成xml返回给支付宝
    /*public String toJson();*/
}

package cn.message.model.alipay;

import java.io.Serializable;

public class AlipayPostMessageModel implements Serializable{
	//消息来源用户id
	private String fromUserId;
	//应用id
	private String fromAlipayUserId;
	//消息类型
	private String msgType;
	//事件类型
	private String eventType;
	//操作动作参数
	private String actionParam;
	//文本
	private String content;
	public String getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}
	public String getFromAlipayUserId() {
		return fromAlipayUserId;
	}
	public void setFromAlipayUserId(String fromAlipayUserId) {
		this.fromAlipayUserId = fromAlipayUserId;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getActionParam() {
		return actionParam;
	}
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public AlipayPostMessageModel(){}
	public AlipayPostMessageModel(String fromUserId, String fromAlipayUserId,
			String msgType, String eventType, String actionParam, String content) {
		super();
		this.fromUserId = fromUserId;
		this.fromAlipayUserId = fromAlipayUserId;
		this.msgType = msgType;
		this.eventType = eventType;
		this.actionParam = actionParam;
		this.content = content;
	}
	@Override
	public String toString() {
		return "AlipayPostMessageModel [fromUserId=" + fromUserId
				+ ", fromAlipayUserId=" + fromAlipayUserId + ", msgType="
				+ msgType + ", eventType=" + eventType + ", actionParam="
				+ actionParam + ", content=" + content + "]";
	}
}

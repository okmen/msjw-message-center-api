package cn.message.bean;

import java.io.Serializable;

public class WechatPostMessageModel implements Serializable{
	//消息来源用户openId
	private String fromUserName;
	//开发者微信号
	private String ToUserName;
	//消息类型
	private String MsgType;
	//事件类型
	private String event;
	//事件key
	private String eventKey;
	//文本
	private String content;
	
	private String msgId;
	
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	
	public String getEventKey() {
		return eventKey;
	}
	
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	public WechatPostMessageModel(String fromUserName, String toUserName,
			String msgType, String event, String content, String msgId,String eventKey) {
		this.fromUserName = fromUserName;
		this.ToUserName = toUserName;
		this.MsgType = msgType;
		this.event = event;
		this.content = content;
		this.msgId = msgId;
		this.eventKey = eventKey;
	}
	
	@Override
	public String toString() {
		return "WechatPostMessageModel [fromUserName=" + fromUserName
				+ ", ToUserName=" + ToUserName + ", MsgType=" + MsgType
				+ ", Event=" + event + ", eventKey=" + eventKey + ", content="
				+ content + ", msgId=" + msgId + "]";
	}
}	

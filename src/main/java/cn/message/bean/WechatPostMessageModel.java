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
	private String Event;
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
		return Event;
	}
	public void setEvent(String event) {
		Event = event;
	}
	public WechatPostMessageModel(String fromUserName, String toUserName,
			String msgType, String event) {
		this.fromUserName = fromUserName;
		ToUserName = toUserName;
		MsgType = msgType;
		Event = event;
	}
	@Override
	public String toString() {
		return "WechatPostMessageModel [fromUserName=" + fromUserName
				+ ", ToUserName=" + ToUserName + ", MsgType=" + MsgType
				+ ", Event=" + Event + "]";
	}
}	

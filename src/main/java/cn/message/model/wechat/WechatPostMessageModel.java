package cn.message.model.wechat;

import java.io.Serializable;

public class WechatPostMessageModel implements Serializable{
	//消息来源用户openId
	private String fromUserName;
	//开发者微信号
	private String toUserName;
	//消息类型
	private String msgType;
	//事件类型
	private String event;
	//事件key
	private String eventKey;
	//文本
	private String content;
	
	private String msgId;
	
	private String cardId;
	
	private String code;
	
	private String outerStr;
	
	private String isGiveByFriend;
	
	private String giveOpenId;

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
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

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOuterStr() {
		return outerStr;
	}

	public void setOuterStr(String outerStr) {
		this.outerStr = outerStr;
	}

	public String getIsGiveByFriend() {
		return isGiveByFriend;
	}

	public void setIsGiveByFriend(String isGiveByFriend) {
		this.isGiveByFriend = isGiveByFriend;
	}

	public String getGiveOpenId() {
		return giveOpenId;
	}

	public void setGiveOpenId(String giveOpenId) {
		this.giveOpenId = giveOpenId;
	}

	public WechatPostMessageModel(String fromUserName, String toUserName,
			String msgType, String event, String eventKey, String content,
			String msgId, String cardId, String code, String outerStr,
			String isGiveByFriend, String giveOpenId) {
		super();
		this.fromUserName = fromUserName;
		this.toUserName = toUserName;
		this.msgType = msgType;
		this.event = event;
		this.eventKey = eventKey;
		this.content = content;
		this.msgId = msgId;
		this.cardId = cardId;
		this.code = code;
		this.outerStr = outerStr;
		this.isGiveByFriend = isGiveByFriend;
		this.giveOpenId = giveOpenId;
	}

	@Override
	public String toString() {
		return "WechatPostMessageModel [fromUserName=" + fromUserName
				+ ", toUserName=" + toUserName + ", msgType=" + msgType
				+ ", event=" + event + ", eventKey=" + eventKey + ", content="
				+ content + ", msgId=" + msgId + ", cardId=" + cardId
				+ ", code=" + code + ", outerStr=" + outerStr
				+ ", isGiveByFriend=" + isGiveByFriend + ", giveOpenId="
				+ giveOpenId + "]";
	}
}	

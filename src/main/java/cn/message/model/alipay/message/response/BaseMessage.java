package cn.message.model.alipay.message.response;

import cn.message.model.alipay.message.IMessage;

public abstract class BaseMessage implements IMessage {
	private String to_user_id;
	private String msg_type;
	public String getTo_user_id() {
		return to_user_id;
	}
	public void setTo_user_id(String to_user_id) {
		this.to_user_id = to_user_id;
	}
	public String getMsg_type() {
		return msg_type;
	}
	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}
	
	public BaseMessage(String msg_type){
		this.msg_type = msg_type;
	}
}

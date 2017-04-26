package cn.message.bean.message.response;

import cn.message.bean.message.IMessage;

/**
 * 回复消息
 * @author gaoxigang
 *
 */
public abstract class BaseResponseMessage implements IMessage{

	
	// 接收方帐号（收到的OpenID）  
    private String toUserName;  
    // 开发者微信号  
    private String fromUserName;  
    // 消息创建时间 （整型）  
    private long createTime; 
    // 位0x0001被标志时，星标刚收到的消息  
    private int funcFlag;
    private String msgType;
	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public int getFuncFlag() {
		return funcFlag;
	}

	public void setFuncFlag(int funcFlag) {
		this.funcFlag = funcFlag;
	}
	
	public String getMsgType() {
		return msgType;
	}
	
	public BaseResponseMessage(String msgType) {
		this.msgType = msgType;
	}

	public BaseResponseMessage(){}
}

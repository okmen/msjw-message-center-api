package cn.message.model.wechat.message.response;
public class TextMessage extends BaseMessage{
	
    private String content; 
    public String getContent() {
		return content;
	}
    public void setContent(String content) {
		this.content = content;
	}
    /**
     * 注意这里构造函数的toUserName 是 接收到微信消息的fromUserName  因为是回复消息 所以正好相反,哪里来回哪里去
     * @param toUserName
     * @param fromUserName
     * @param createTime
     * @param content
     */
	public TextMessage(String content) {
		super(MESSAGE_TYPE_TEXT);
		this.content = content;
	}
	
	public TextMessage(){}
	
	@Override
	public String toXml(){
		StringBuffer sb = new StringBuffer();
		sb.append("<xml>");
		sb.append("<ToUserName><![CDATA["+this.getToUserName()+"]]></ToUserName>");
        sb.append("<FromUserName><![CDATA["+this.getFromUserName()+"]]></FromUserName>");
        sb.append("<CreateTime>"+this.getCreateTime()+"</CreateTime>");
        sb.append("<MsgType><![CDATA["+this.getMsgType()+"]]></MsgType>");
        sb.append("<Content><![CDATA["+this.getContent()+"]]></Content>");
        sb.append("</xml>");
        return sb.toString();
	}
}

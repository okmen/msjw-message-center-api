package cn.message.bean.message.request.message;


public class TextRequestMessage extends BaseRequestMessage {
	
    private String content; 
    
    public String getContent() {
		return content;
	}
    
    public void setContent(String content) {
		this.content = content;
	}
    
	public TextRequestMessage(String toUserName,String fromUserName,long createTime,String content) {
		super(toUserName,fromUserName,createTime,MESSAGE_TYPE_TEXT);
		this.content = content;
	}
	
	@Override
	public String toXml(){
		return "";
	}
}

package cn.message.bean.message.response;

public class NewsResponseMessage extends BaseResponseMessage{
	//图文消息个数，限制为10条以内
	private int articleCount;
	
	//标题
	private String [] title;
	
	//描述
	private String [] description;
	
	// 图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
	private String [] picUrl;
	
	//点击图文消息跳转的链接
	private String [] url;
	
	public NewsResponseMessage(String toUserName, String fromUserName,
			long createTime, int articleCount,
			String[] title, String[] description, String[] picUrl, String[] url) {
		super(toUserName, fromUserName, createTime, MESSAGE_TYPE_NEWS);
		this.articleCount = articleCount;
		this.title = title;
		this.description = description;
		this.picUrl = picUrl;
		this.url = url;
	}

	@Override
	public String toXml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<xml>");
		sb.append("<ToUserName><![CDATA["+this.getToUserName()+"]]></ToUserName>");
        sb.append("<FromUserName><![CDATA["+this.getFromUserName()+"]]></FromUserName>");
        sb.append("<CreateTime>"+this.getCreateTime()+"</CreateTime>");
        sb.append("<MsgType><![CDATA["+this.getMsgType()+"]]></MsgType>");
        sb.append("<ArticleCount><![CDATA["+this.articleCount+"]]></ArticleCount>");
        sb.append("<Articles>");
        
        for (int i = 0; i < this.title.length; i++) {
			sb.append("<item>");
			 	sb.append("<Title><![CDATA["+this.title[i]+"]]></Title>");
		        sb.append("<Description><![CDATA["+this.description[i]+"]]></Description>");
		        sb.append("<PicUrl><![CDATA["+this.picUrl[i]+"]]></PicUrl>");
		        sb.append("<Url><![CDATA["+this.url[i]+"]]></Url>");
			sb.append("</item>");
		}
        
        sb.append("</Articles>");
        sb.append("</xml>");
        return sb.toString();
	}

	public int getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}

	public String[] getTitle() {
		return title;
	}

	public void setTitle(String[] title) {
		this.title = title;
	}

	public String[] getDescription() {
		return description;
	}

	public void setDescription(String[] description) {
		this.description = description;
	}

	public String[] getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String[] picUrl) {
		this.picUrl = picUrl;
	}

	public String[] getUrl() {
		return url;
	}

	public void setUrl(String[] url) {
		this.url = url;
	}
}

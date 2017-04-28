package cn.message.model.alipay.message.response;

public class ImageTextMessage extends BaseMessage{
	private ImageText[] articles;
	public ImageText[] getArticles() {
		return articles;
	}
	public void setArticles(ImageText[] articles) {
		this.articles = articles;
	}
	
	public ImageTextMessage(ImageText[] articles) {
		super(MESSAGE_TYPE_IMAGE_TEXT);
		this.articles = articles;
	}
	
	/**
	 * 图文实体
	 * @author gaoxigang
	 *
	 */
	public static class ImageText{
		private String action_name;
		private String desc;
		private String image_url;
		private String title;
		private String url;
		public String getAction_name() {
			return action_name;
		}
		public void setAction_name(String action_name) {
			this.action_name = action_name;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getImage_url() {
			return image_url;
		}
		public void setImage_url(String image_url) {
			this.image_url = image_url;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public ImageText(String action_name, String desc, String image_url,
				String title, String url) {
			super();
			this.action_name = action_name;
			this.desc = desc;
			this.image_url = image_url;
			this.title = title;
			this.url = url;
		}
	}
}

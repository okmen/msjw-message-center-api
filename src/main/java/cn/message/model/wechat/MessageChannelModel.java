package cn.message.model.wechat;

import java.io.Serializable;
import java.util.Map;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MessageChannelModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4862952784054958029L;

	private String openid;					//用户openid	必填
	private String biz_template_id;			//城市服务分配给公众号的模板id	必填
	private String result_page_style_id;	//结果页样式id	推送结果页必填
	private String deal_msg_style_id;		//办事记录样式id	推送办事记录必填
	private String card_style_id;			//页卡样式id	推送页卡必填
	private String order_no;				//同一订单号的记录会合成一条办事记录	必填
	private String url;						//跳转链接。用于服务通知、结果页	推送结果页必填
	private Map<String, Property> data;		//模板对应json数据，其中color字段只对服务通知有效	必填
	
	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getBiz_template_id() {
		return biz_template_id;
	}

	public void setBiz_template_id(String biz_template_id) {
		this.biz_template_id = biz_template_id;
	}

	public String getResult_page_style_id() {
		return result_page_style_id;
	}

	public void setResult_page_style_id(String result_page_style_id) {
		this.result_page_style_id = result_page_style_id;
	}

	public String getDeal_msg_style_id() {
		return deal_msg_style_id;
	}

	public void setDeal_msg_style_id(String deal_msg_style_id) {
		this.deal_msg_style_id = deal_msg_style_id;
	}

	public String getCard_style_id() {
		return card_style_id;
	}

	public void setCard_style_id(String card_style_id) {
		this.card_style_id = card_style_id;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, Property> getData() {
		return data;
	}

	public void setData(Map<String, Property> data) {
		this.data = data;
	}

	public class Property implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = -9168317242758460172L;
		
		private String value;
		private String color;
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public Property(String value, String color) {
			super();
			this.value = value;
			this.color = color;
		}
		public Property(){}
		@Override
		public String toString() {
			return "Property [value=" + value + ", color=" + color + "]";
		}
	}
	
	@Override 
    public String toString() { 
		return ReflectionToStringBuilder.toString(this); 
    }
}

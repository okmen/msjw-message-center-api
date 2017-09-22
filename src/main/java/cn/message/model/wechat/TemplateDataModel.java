package cn.message.model.wechat;

import java.io.Serializable;
import java.util.Map;

public class TemplateDataModel implements Serializable {
	private String touser;
	private String template_id;
	private String url;
	private Map<String, Property> data;
	public String getTouser() {
		return touser;
	}
	public void setTouser(String touser) {
		this.touser = touser;
	}
	public String getTemplate_id() {
		return template_id;
	}
	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
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
	public static class WechatTemlate1{
		private String first;
		private String keyword1;
		private String keyword2;
		private String remark;
		public String getFirst() {
			return first;
		}
		public void setFirst(String first) {
			this.first = first;
		}
		public String getKeyword1() {
			return keyword1;
		}
		public void setKeyword1(String keyword1) {
			this.keyword1 = keyword1;
		}
		public String getKeyword2() {
			return keyword2;
		}
		public void setKeyword2(String keyword2) {
			this.keyword2 = keyword2;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public WechatTemlate1(){}
		public WechatTemlate1(String first,String keyword2){
			this.first = first;
			this.keyword2 = keyword2;
		}
		@Override
		public String toString() {
			return "WechatTemlate1 [first=" + first + ", keyword1=" + keyword1
					+ ", keyword2=" + keyword2 + ", remark=" + remark + "]";
		}
	}
	@Override
	public String toString() {
		return "TemplateDataModel [touser=" + touser + ", template_id="
				+ template_id + ", url=" + url + ", data=" + data + "]";
	}
}	

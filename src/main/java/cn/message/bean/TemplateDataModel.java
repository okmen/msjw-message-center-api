package cn.message.bean;

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

	@Override
	public String toString() {
		return "TemplateDataModel [touser=" + touser + ", template_id="
				+ template_id + ", url=" + url + ", data=" + data + "]";
	}
}	

package cn.message.model.alipay;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TemplateDataAlipayModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -362441875383931862L;
	private String to_user_id;
	private Template template;
	public String getTo_user_id() {
		return to_user_id;
	}
	public void setTo_user_id(String to_user_id) {
		this.to_user_id = to_user_id;
	}
	public Template getTemplate() {
		return template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}
	public TemplateDataAlipayModel(String to_user_id,Template template){
		this.to_user_id = to_user_id;
		this.template = template;
	}
	public static class Template{
		private String template_id;
		private Map<String, Object> context;
		public Template(String template_id,String head_color,String url,String action_name,Map<String, Property> map){
			this.template_id = template_id;
			context = new HashMap<String, Object>();
			context.put("head_color", head_color);
			context.put("url", url);
			context.put("action_name", action_name);
			
			for (String key : map.keySet()) {
				context.put(key,map.get(key));
			}
		}
		
		public String getTemplate_id() {
			return template_id;
		}
		public void setTemplate_id(String template_id) {
			this.template_id = template_id;
		}
		public Map<String, Object> getContext() {
			return context;
		}
		public void setContext(Map<String, Object> context) {
			this.context = context;
		}
	}
	
	public static class Property {
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
}	

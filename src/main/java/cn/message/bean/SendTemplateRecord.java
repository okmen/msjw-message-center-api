package cn.message.bean;

import java.util.Date;

public class SendTemplateRecord {
	private Integer id;
	private String openId;
	private String idCard;
	private String lxdh;
	private String xh;
	private String pch;
	private String response;
	private String request;
	private Date createTime;
	private String state;
	private String type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getIdCard() {
		return idCard;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getPch() {
		return pch;
	}
	public void setPch(String pch) {
		this.pch = pch;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public SendTemplateRecord(String openId, String idCard,String lxdh,
			String xh, String pch, String response, String request,
			Date createTime,String state,String type) {
		this.openId = openId;
		this.idCard = idCard;
		this.lxdh = lxdh;
		this.xh = xh;
		this.pch = pch;
		this.response = response;
		this.request = request;
		this.createTime = createTime;
		this.state = state;
		this.type = type;
	}
	
	public SendTemplateRecord(){}
	public SendTemplateRecord(Integer id, String openId, String idCard,
			String lxdh, String xh, String pch, String response,
			String request, Date createTime, String state,String type) {
		super();
		this.id = id;
		this.openId = openId;
		this.idCard = idCard;
		this.lxdh = lxdh;
		this.xh = xh;
		this.pch = pch;
		this.response = response;
		this.request = request;
		this.createTime = createTime;
		this.state = state;
		this.type = type;
	}
	@Override
	public String toString() {
		return "SendTemplateRecord [id=" + id + ", openId=" + openId
				+ ", idCard=" + idCard + ", lxdh=" + lxdh + ", xh=" + xh
				+ ", pch=" + pch + ", response=" + response + ", request="
				+ request + ", createTime=" + createTime + ", state=" + state
				+ ", type=" + type + "]";
	}
}

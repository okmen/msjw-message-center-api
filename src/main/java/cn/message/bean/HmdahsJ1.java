package cn.message.bean;

import java.util.Date;

import org.dom4j.Element;

public class HmdahsJ1 {
	private Integer id;
	private String pch;
	private String xh;
	private String uId;
	private String lxdh;
	private String jszhm;
	private String hphm;
	private String hpzl;
	private String message;
	private String hslx;
	private Integer state;
	private Integer stateAlipay;
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPch() {
		return pch;
	}
	public void setPch(String pch) {
		this.pch = pch;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getJszhm() {
		return jszhm;
	}
	public void setJszhm(String jszhm) {
		this.jszhm = jszhm;
	}
	public String getHphm() {
		return hphm;
	}
	public void setHphm(String hphm) {
		this.hphm = hphm;
	}
	public String getHpzl() {
		return hpzl;
	}
	public void setHpzl(String hpzl) {
		this.hpzl = hpzl;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getHslx() {
		return hslx;
	}
	public void setHslx(String hslx) {
		this.hslx = hslx;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getStateAlipay() {
		return stateAlipay;
	}
	public void setStateAlipay(Integer stateAlipay) {
		this.stateAlipay = stateAlipay;
	}
	
	public HmdahsJ1(String pch, String xh, String uId, String lxdh,
			String jszhm, String hphm, String hpzl, String message,
			String hslx, Date createTime,Integer state,Integer stateAlipay) {
		this.pch = pch;
		this.xh = xh;
		this.uId = uId;
		this.lxdh = lxdh;
		this.jszhm = jszhm;
		this.hphm = hphm;
		this.hpzl = hpzl;
		this.message = message;
		this.hslx = hslx;
		this.createTime = createTime;
		this.state = state;
		this.stateAlipay = stateAlipay;
	}
	
	public HmdahsJ1(Element pch, Element xh, Element uId, Element lxdh,
			Element jszhm, Element hphm, Element hpzl, Element message,
			Element hslx, Date createTime,Integer state,Integer stateAlipay) {
		if(null != pch) this.pch = pch.getText();
		
		if(null != xh) this.xh = xh.getText();
		
		if(null != uId) this.uId = uId.getText();
		
		if(null != lxdh) this.lxdh = lxdh.getText();
		
		if(null != jszhm) this.jszhm = jszhm.getText();
		
		if(null != hphm) this.hphm = hphm.getText();
		
		if(null != hpzl) this.hpzl = hpzl.getText();
		
		if(null != message) this.message = message.getText();
		
		if(null != hslx) this.hslx = hslx.getText();
		
		this.createTime = createTime;
		this.state = state;
		this.stateAlipay = stateAlipay;
	}
	
	public HmdahsJ1(){}
	@Override
	public String toString() {
		return "HmdahsJ1 [id=" + id + ", pch=" + pch + ", xh=" + xh + ", uId="
				+ uId + ", lxdh=" + lxdh + ", jszhm=" + jszhm + ", hphm="
				+ hphm + ", hpzl=" + hpzl + ", message=" + message + ", hslx="
				+ hslx + ", state=" + state + ", stateAlipay=" + stateAlipay
				+ ", createTime=" + createTime + "]";
	}
}

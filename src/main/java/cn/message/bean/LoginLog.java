package cn.message.bean;

import java.util.Date;

public class LoginLog {
	private Integer id;
	private String name;
	private String cert;
	private String phone;
	private Date listtime;
	private String openid;
	private String email;
	private String isrz;
	private String uid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCert() {
		return cert;
	}
	public void setCert(String cert) {
		this.cert = cert;
	}
	public String getPhone() {
		if(null == phone) return "";
		
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getListtime() {
		return listtime;
	}
	public void setListtime(Date listtime) {
		this.listtime = listtime;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIsrz() {
		return isrz;
	}
	public void setIsrz(String isrz) {
		this.isrz = isrz;
	}
	public String getUid() {
		if(null == uid) return "";
		
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof LoginLog)) {
			return false;
		}
		
		LoginLog loginLog = (LoginLog) o;
		return loginLog.getUid().equals(getUid()) && loginLog.getPhone().equals(getPhone());
	}

	// Idea from effective Java : Item 9
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + getUid().hashCode();
		result = 31 * result + getPhone().hashCode();
		return result;
	}
}

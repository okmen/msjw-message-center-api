package cn.message.bean;

import java.util.Date;

public class UserBind {
	private Integer id;
	private String openId;
	private String idCard;
	private String mobileNumber;
	private Date bindDate;
	private Date unbindDate;
	private Integer isBind;
	private String clientType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOpenId() {
		if(null == openId) return "";
		
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getMobileNumber() {
		if(null == mobileNumber) return ""; 
			
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getBindDate() {
		return bindDate;
	}
	public void setBindDate(Date bindDate) {
		this.bindDate = bindDate;
	}
	public Date getUnbindDate() {
		return unbindDate;
	}
	public void setUnbindDate(Date unbindDate) {
		this.unbindDate = unbindDate;
	}
	public Integer getIsBind() {
		return isBind;
	}
	public void setIsBind(Integer isBind) {
		this.isBind = isBind;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	@Override
	public String toString() {
		return "UserBind [id=" + id + ", openId=" + openId + ", idCard="
				+ idCard + ", mobileNumber=" + mobileNumber + ", bindDate="
				+ bindDate + ", unbindDate=" + unbindDate + ", isBind="
				+ isBind + ", clientType=" + clientType + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof UserBind)) {
			return false;
		}
		
		UserBind user = (UserBind) o;
		return user.getOpenId().equals(getOpenId()) && user.getMobileNumber().equals(getMobileNumber());
	}

	// Idea from effective Java : Item 9
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + getOpenId().hashCode();
		result = 31 * result + getMobileNumber().hashCode();
		return result;
	}
}

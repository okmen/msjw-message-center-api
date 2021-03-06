package cn.message.model.alipay;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AlipayUserInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String alipayId;
	private String nickName;
	private String avatar;
	private String mobile;
	private String shsm;
	
	public String getAlipayId() {
		return alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getShsm() {
		return shsm;
	}
	public void setShsm(String shsm) {
		this.shsm = shsm;
	}
	public AlipayUserInfo() {
		
	}
	public AlipayUserInfo(String alipayId, String nickName, String avatar, String mobile) {
		this.alipayId = alipayId;
		this.nickName = nickName;
		this.avatar = avatar;
		this.mobile = mobile;
	}
	public AlipayUserInfo(String alipayId, String nickName, String avatar, String mobile,String shsm) {
		this.alipayId = alipayId;
		this.nickName = nickName;
		this.avatar = avatar;
		this.mobile = mobile;
		this.shsm = shsm;
	}
	@Override 
    public String toString() { 
            return ReflectionToStringBuilder.toString(this); 
    }
}

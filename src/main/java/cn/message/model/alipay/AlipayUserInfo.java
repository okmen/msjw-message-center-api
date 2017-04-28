package cn.message.model.alipay;

import java.io.Serializable;

public class AlipayUserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userId;
	private String nickName;
	private String avatar;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public AlipayUserInfo(String userId, String nickName, String avatar) {
		this.userId = userId;
		this.nickName = nickName;
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "AlipayUserInfo [userId=" + userId + ", nickName=" + nickName
				+ ", avatar=" + avatar + "]";
	}

}

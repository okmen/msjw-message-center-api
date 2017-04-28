package cn.message.model.wechat;

import java.io.Serializable;

public class WechatUserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String openId;
	private String nickName;
	private String headUrlImg;
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getHeadUrlImg() {
		return headUrlImg;
	}
	public void setHeadUrlImg(String headUrlImg) {
		this.headUrlImg = headUrlImg;
	}
	@Override
	public String toString() {
		return "WechatUserInfo [openId=" + openId + ", nickName=" + nickName
				+ ", headUrlImg=" + headUrlImg + "]";
	}
}

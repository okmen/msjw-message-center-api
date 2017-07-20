package cn.message.bean;

import java.util.Date;

public class WxMembercard {
	private Integer id;
	private String openid;
	private String idno;
	private String cardid;
	private String code;
	private Integer isgivebyfriend;
	private String giveopenid;
	private Integer state;
	private String outerid;
	private String outerstr;
	private Date intime;
	private String userid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getIsgivebyfriend() {
		return isgivebyfriend;
	}
	public void setIsgivebyfriend(Integer isgivebyfriend) {
		this.isgivebyfriend = isgivebyfriend;
	}
	public String getGiveopenid() {
		return giveopenid;
	}
	public void setGiveopenid(String giveopenid) {
		this.giveopenid = giveopenid;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getOuterid() {
		return outerid;
	}
	public void setOuterid(String outerid) {
		this.outerid = outerid;
	}
	public String getOuterstr() {
		return outerstr;
	}
	public void setOuterstr(String outerstr) {
		this.outerstr = outerstr;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
}

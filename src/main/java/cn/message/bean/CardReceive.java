package cn.message.bean;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * 支付宝卡包
 * @author Mbenben
 *
 */
public class CardReceive implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5723764825740640094L;

	private BigInteger id;
	private String alipayUserId;//支付宝生活号唯一标识
	private String certNo;//身份证号
	private String realName;//姓名
	private String gender;//性别
	private String archiveNumber;//档案编号
	private String type;//类型 driver-领取驾驶证  deleted_driver-删除驾驶证  car-领取行驶证 deleted_car-删除行驶证
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getAlipayUserId() {
		return alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getArchiveNumber() {
		return archiveNumber;
	}
	public void setArchiveNumber(String archiveNumber) {
		this.archiveNumber = archiveNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "CardReceive [id=" + id + ", alipayUserId=" + alipayUserId + ", certNo=" + certNo + ", realName="
				+ realName + ", gender=" + gender + ", archiveNumber=" + archiveNumber + ", type=" + type + "]";
	}
	
}

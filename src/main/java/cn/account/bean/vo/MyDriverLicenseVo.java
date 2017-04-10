package cn.account.bean.vo;
/**
 * 驾驶证
 * @author Mbenben
 *
 */
public class MyDriverLicenseVo {
	private String fileNumber;
	private String status;
	private String availableScore;
	private String physicalExaminationDate;
	private String effectiveDate;
	private Integer isReceive;
	
	public String getFileNumber() {
		return fileNumber;
	}
	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAvailableScore() {
		return availableScore;
	}
	public void setAvailableScore(String availableScore) {
		this.availableScore = availableScore;
	}
	public String getPhysicalExaminationDate() {
		return physicalExaminationDate;
	}
	public void setPhysicalExaminationDate(String physicalExaminationDate) {
		this.physicalExaminationDate = physicalExaminationDate;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Integer getIsReceive() {
		return isReceive;
	}
	public void setIsReceive(Integer isReceive) {
		this.isReceive = isReceive;
	}
	
}

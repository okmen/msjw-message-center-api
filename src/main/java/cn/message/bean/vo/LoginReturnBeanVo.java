package cn.message.bean.vo;

import java.io.Serializable;

/**
 * 登录返回的对象
 * @author Mbenben
 *
 */
public class LoginReturnBeanVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 认证基本信息
	 */
	private AuthenticationBasicInformationVo authenticationBasicInformation;
	/**
	 * 认证基本信息
	 */
	private IdentityVerificationAuditResultsVo identityVerificationAuditResults;
	public AuthenticationBasicInformationVo getAuthenticationBasicInformation() {
		return authenticationBasicInformation;
	}
	public void setAuthenticationBasicInformation(AuthenticationBasicInformationVo authenticationBasicInformation) {
		this.authenticationBasicInformation = authenticationBasicInformation;
	}
	public IdentityVerificationAuditResultsVo getIdentityVerificationAuditResults() {
		return identityVerificationAuditResults;
	}
	public void setIdentityVerificationAuditResults(IdentityVerificationAuditResultsVo identityVerificationAuditResults) {
		this.identityVerificationAuditResults = identityVerificationAuditResults;
	}
	
}

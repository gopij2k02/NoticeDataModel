package com.myspace.noticedatamodel;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PPD implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long appID;
	private java.lang.String coverageTypeCode;
	private java.time.LocalDateTime dispositionDate;
	private java.lang.Boolean dispositionInd;
	private java.lang.String dispositionStatusCode;
	private java.lang.String eligibilityCategory;
	private java.lang.String eligibleKeyCode;
	private java.lang.Short generalTypeID;
	private java.lang.Short msn;
	private java.lang.Long pid;
	private java.lang.Boolean programRenewInd;
	private java.lang.String specialCategory;

	private java.lang.String programCode;

	private java.lang.String programCategory;

	private java.lang.String outputActionCode;

	private java.lang.String programDenielReason;

	private java.lang.String generalTypeCode;

	private java.lang.String letterCode;

	private java.lang.Boolean flagALTCS;

	private java.lang.Boolean flagCSRA;

	private java.lang.String caaCode;

	private java.lang.String responseRequiredCode;

	private java.lang.String kidscareSwitch;

	private java.lang.Boolean flagCustomerLogin;

	private java.lang.String applicationType;

	private int noticeTypeID;

	public PPD() {
	}

	public java.lang.Long getAppID() {
		return this.appID;
	}

	public void setAppID(java.lang.Long appID) {
		this.appID = appID;
	}

	public java.lang.String getCoverageTypeCode() {
		return this.coverageTypeCode;
	}

	public void setCoverageTypeCode(java.lang.String coverageTypeCode) {
		this.coverageTypeCode = coverageTypeCode;
	}

	public java.time.LocalDateTime getDispositionDate() {
		return this.dispositionDate;
	}

	public void setDispositionDate(java.time.LocalDateTime dispositionDate) {
		this.dispositionDate = dispositionDate;
	}

	public java.lang.Boolean getDispositionInd() {
		return this.dispositionInd;
	}

	public void setDispositionInd(java.lang.Boolean dispositionInd) {
		this.dispositionInd = dispositionInd;
	}

	public java.lang.String getDispositionStatusCode() {
		return this.dispositionStatusCode;
	}

	public void setDispositionStatusCode(java.lang.String dispositionStatusCode) {
		this.dispositionStatusCode = dispositionStatusCode;
	}

	public java.lang.String getEligibilityCategory() {
		return this.eligibilityCategory;
	}

	public void setEligibilityCategory(java.lang.String eligibilityCategory) {
		this.eligibilityCategory = eligibilityCategory;
	}

	public java.lang.String getEligibleKeyCode() {
		return this.eligibleKeyCode;
	}

	public void setEligibleKeyCode(java.lang.String eligibleKeyCode) {
		this.eligibleKeyCode = eligibleKeyCode;
	}

	public java.lang.Short getGeneralTypeID() {
		return this.generalTypeID;
	}

	public void setGeneralTypeID(java.lang.Short generalTypeID) {
		this.generalTypeID = generalTypeID;
	}

	public java.lang.Short getMsn() {
		return this.msn;
	}

	public void setMsn(java.lang.Short msn) {
		this.msn = msn;
	}

	public java.lang.Long getPid() {
		return this.pid;
	}

	public void setPid(java.lang.Long pid) {
		this.pid = pid;
	}

	public java.lang.Boolean getProgramRenewInd() {
		return this.programRenewInd;
	}

	public void setProgramRenewInd(java.lang.Boolean programRenewInd) {
		this.programRenewInd = programRenewInd;
	}

	public java.lang.String getSpecialCategory() {
		return this.specialCategory;
	}

	public void setSpecialCategory(java.lang.String specialCategory) {
		this.specialCategory = specialCategory;
	}

	public java.lang.String getProgramCode() {
		return this.programCode;
	}

	public void setProgramCode(java.lang.String programCode) {
		this.programCode = programCode;
	}

	public java.lang.String getProgramCategory() {
		return this.programCategory;
	}

	public void setProgramCategory(java.lang.String programCategory) {
		this.programCategory = programCategory;
	}

	public java.lang.String getOutputActionCode() {
		return this.outputActionCode;
	}

	public void setOutputActionCode(java.lang.String outputActionCode) {
		this.outputActionCode = outputActionCode;
	}

	public java.lang.String getProgramDenielReason() {
		return this.programDenielReason;
	}

	public void setProgramDenielReason(java.lang.String programDenielReason) {
		this.programDenielReason = programDenielReason;
	}

	public java.lang.String getGeneralTypeCode() {
		return this.generalTypeCode;
	}

	public void setGeneralTypeCode(java.lang.String generalTypeCode) {
		this.generalTypeCode = generalTypeCode;
	}

	public java.lang.String getLetterCode() {
		return this.letterCode;
	}

	public void setLetterCode(java.lang.String letterCode) {
		this.letterCode = letterCode;
	}

	public java.lang.Boolean getFlagALTCS() {
		return this.flagALTCS;
	}

	public void setFlagALTCS(java.lang.Boolean flagALTCS) {
		this.flagALTCS = flagALTCS;
	}

	public java.lang.Boolean getFlagCSRA() {
		return this.flagCSRA;
	}

	public void setFlagCSRA(java.lang.Boolean flagCSRA) {
		this.flagCSRA = flagCSRA;
	}

	public java.lang.String getCaaCode() {
		return this.caaCode;
	}

	public void setCaaCode(java.lang.String caaCode) {
		this.caaCode = caaCode;
	}

	public java.lang.String getResponseRequiredCode() {
		return this.responseRequiredCode;
	}

	public void setResponseRequiredCode(java.lang.String responseRequiredCode) {
		this.responseRequiredCode = responseRequiredCode;
	}

	public java.lang.String getKidscareSwitch() {
		return this.kidscareSwitch;
	}

	public void setKidscareSwitch(java.lang.String kidscareSwitch) {
		this.kidscareSwitch = kidscareSwitch;
	}

	public java.lang.Boolean getFlagCustomerLogin() {
		return this.flagCustomerLogin;
	}

	public void setFlagCustomerLogin(java.lang.Boolean flagCustomerLogin) {
		this.flagCustomerLogin = flagCustomerLogin;
	}

	public java.lang.String getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(java.lang.String applicationType) {
		this.applicationType = applicationType;
	}

	public int getNoticeTypeID() {
		return this.noticeTypeID;
	}

	public void setNoticeTypeID(int noticeTypeID) {
		this.noticeTypeID = noticeTypeID;
	}

	public PPD(java.lang.Long appID, java.lang.String coverageTypeCode,
			java.time.LocalDateTime dispositionDate,
			java.lang.Boolean dispositionInd,
			java.lang.String dispositionStatusCode,
			java.lang.String eligibilityCategory,
			java.lang.String eligibleKeyCode, java.lang.Short generalTypeID,
			java.lang.Short msn, java.lang.Long pid,
			java.lang.Boolean programRenewInd,
			java.lang.String specialCategory, java.lang.String programCode,
			java.lang.String programCategory,
			java.lang.String outputActionCode,
			java.lang.String programDenielReason,
			java.lang.String generalTypeCode, java.lang.String letterCode,
			java.lang.Boolean flagALTCS, java.lang.Boolean flagCSRA,
			java.lang.String caaCode, java.lang.String responseRequiredCode,
			java.lang.String kidscareSwitch,
			java.lang.Boolean flagCustomerLogin,
			java.lang.String applicationType, int noticeTypeID) {
		this.appID = appID;
		this.coverageTypeCode = coverageTypeCode;
		this.dispositionDate = dispositionDate;
		this.dispositionInd = dispositionInd;
		this.dispositionStatusCode = dispositionStatusCode;
		this.eligibilityCategory = eligibilityCategory;
		this.eligibleKeyCode = eligibleKeyCode;
		this.generalTypeID = generalTypeID;
		this.msn = msn;
		this.pid = pid;
		this.programRenewInd = programRenewInd;
		this.specialCategory = specialCategory;
		this.programCode = programCode;
		this.programCategory = programCategory;
		this.outputActionCode = outputActionCode;
		this.programDenielReason = programDenielReason;
		this.generalTypeCode = generalTypeCode;
		this.letterCode = letterCode;
		this.flagALTCS = flagALTCS;
		this.flagCSRA = flagCSRA;
		this.caaCode = caaCode;
		this.responseRequiredCode = responseRequiredCode;
		this.kidscareSwitch = kidscareSwitch;
		this.flagCustomerLogin = flagCustomerLogin;
		this.applicationType = applicationType;
		this.noticeTypeID = noticeTypeID;
	}

}
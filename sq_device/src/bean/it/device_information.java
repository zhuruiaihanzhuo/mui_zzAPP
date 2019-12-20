package bean.it;

import java.sql.Timestamp;

public class device_information {

	private int id;
	private String  department;//部门
	private String  office;//科室或班组
	private String  category;//设备类型
	private String  type;//设备型号
	private String  deviceIP;//设备IP
	private String zcNumber;//资产编号
	private String  staffName;//员工姓名
	private String  staffNumber;//工号
	private String  staffPhone;//员工手机
	private String  staffMail;//员工邮箱
	private String state;//状态	
	private String  description;//异常描述
	private String  applicant;
	private Timestamp  applyDate;
	
	public device_information() {
		super();
	}
	
	
	
	public device_information(String department, String office,
			String category, String type, String deviceIP, String zcNumber,
			String staffName, String staffNumber, String staffPhone,
			String staffMail, String state, String description,
			String applicant, Timestamp applyDate) {
		super();
		this.department = department;
		this.office = office;
		this.category = category;
		this.type = type;
		this.deviceIP = deviceIP;
		this.zcNumber = zcNumber;
		this.staffName = staffName;
		this.staffNumber = staffNumber;
		this.staffPhone = staffPhone;
		this.staffMail = staffMail;
		this.state = state;
		this.description = description;
		this.applicant = applicant;
		this.applyDate = applyDate;
	}





	





	@Override
	public String toString() {
		return "device_information [id=" + id + ", department=" + department
				+ ", office=" + office + ", category=" + category + ", type="
				+ type + ", deviceIP=" + deviceIP + ", zcNumber=" + zcNumber
				+ ", staffName=" + staffName + ", staffNumber=" + staffNumber
				+ ", staffPhone=" + staffPhone + ", staffMail=" + staffMail
				+ ", state=" + state + ", description=" + description
				+ ", applicant=" + applicant + ", applyDate=" + applyDate + "]";
	}



	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getDepartment() {
		return department;
	}





	public void setDepartment(String department) {
		this.department = department;
	}





	public String getOffice() {
		return office;
	}





	public void setOffice(String office) {
		this.office = office;
	}





	public String getCategory() {
		return category;
	}





	public void setCategory(String category) {
		this.category = category;
	}





	public String getType() {
		return type;
	}





	public void setType(String type) {
		this.type = type;
	}





	public String getDeviceIP() {
		return deviceIP;
	}





	public void setDeviceIP(String deviceIP) {
		this.deviceIP = deviceIP;
	}





	public String getZcNumber() {
		return zcNumber;
	}





	public void setZcNumber(String zcNumber) {
		this.zcNumber = zcNumber;
	}





	public String getStaffName() {
		return staffName;
	}





	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}





	public String getStaffNumber() {
		return staffNumber;
	}





	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}





	public String getStaffPhone() {
		return staffPhone;
	}





	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}





	public String getStaffMail() {
		return staffMail;
	}





	public void setStaffMail(String staffMail) {
		this.staffMail = staffMail;
	}





	public String getState() {
		return state;
	}





	public void setState(String state) {
		this.state = state;
	}





	public String getDescription() {
		return description;
	}





	public void setDescription(String description) {
		this.description = description;
	}





	public String getApplicant() {
		return applicant;
	}





	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}





	public Timestamp getApplyDate() {
		return applyDate;
	}





	public void setApplyDate(Timestamp applyDate) {
		this.applyDate = applyDate;
	}
	
	
	
	
	
	
	
	
	
}

package bean.zz;

import java.sql.Timestamp;


public class Lqx {

	private int id;
	private String propNum;//申请编号
	private String proposerL;//申请人
	private String groupL;
	private String principalL;//负责人
	private String qcL;
	private String departmentL;
	private String descriptionL;
	private String stateL;
	private String supplierL;//来料单位
	private String itemNameL;
	private String itemNumL;
	private String lotL;
	private String urlString;
	private String sortL;//缺陷类别
	private String sortNum;//缺陷类别
	private String qc_real;//质控专员
	private String sort_real;//确认缺陷类别
	private Timestamp apTime;//申请时间
	private String qc_resu;
	private String princ_resu;
	private String qr_resu;//质控结果
	
	private Timestamp qcTime;//巡检批准时间
	private Timestamp prTime;//班长审批时间
	private Timestamp qrTime;//质控审批时间
	private String    qcDescr;//巡检备注
	private String    prDescr;//班长备注
	private String    qrDescr;//质控备注
	

	
	
	public Lqx() {
		super();
	}
	
	
	
	public Lqx(String propNum, String proposerL, String groupL,
			String principalL, String qcL, String departmentL,
			String descriptionL, String stateL, String supplierL,
			String itemNameL, String itemNumL, String lotL, String urlString,
			String sortL, String sortNum, String qc_real, String sort_real,
			Timestamp apTime, String qc_resu, String princ_resu,
			String qr_resu, Timestamp qcTime, Timestamp prTime,
			Timestamp qrTime, String qcDescr, String prDescr, String qrDescr) {
		super();
		this.propNum = propNum;
		this.proposerL = proposerL;
		this.groupL = groupL;
		this.principalL = principalL;
		this.qcL = qcL;
		this.departmentL = departmentL;
		this.descriptionL = descriptionL;
		this.stateL = stateL;
		this.supplierL = supplierL;
		this.itemNameL = itemNameL;
		this.itemNumL = itemNumL;
		this.lotL = lotL;
		this.urlString = urlString;
		this.sortL = sortL;
		this.sortNum = sortNum;
		this.qc_real = qc_real;
		this.sort_real = sort_real;
		this.apTime = apTime;
		this.qc_resu = qc_resu;
		this.princ_resu = princ_resu;
		this.qr_resu = qr_resu;
		this.qcTime = qcTime;
		this.prTime = prTime;
		this.qrTime = qrTime;
		this.qcDescr = qcDescr;
		this.prDescr = prDescr;
		this.qrDescr = qrDescr;
	}



	public Lqx(int id, String propNum, String proposerL, String groupL,
			String principalL, String qcL, String departmentL,
			String descriptionL, String stateL, String supplierL,
			String itemNameL, String itemNumL, String lotL, String urlString,
			String sortL, String sortNum, String qc_real, String sort_real,
			Timestamp apTime, String qc_resu, String princ_resu,
			String qr_resu, Timestamp qcTime, Timestamp prTime,
			Timestamp qrTime, String qcDescr, String prDescr, String qrDescr) {
		super();
		this.id = id;
		this.propNum = propNum;
		this.proposerL = proposerL;
		this.groupL = groupL;
		this.principalL = principalL;
		this.qcL = qcL;
		this.departmentL = departmentL;
		this.descriptionL = descriptionL;
		this.stateL = stateL;
		this.supplierL = supplierL;
		this.itemNameL = itemNameL;
		this.itemNumL = itemNumL;
		this.lotL = lotL;
		this.urlString = urlString;
		this.sortL = sortL;
		this.sortNum = sortNum;
		this.qc_real = qc_real;
		this.sort_real = sort_real;
		this.apTime = apTime;
		this.qc_resu = qc_resu;
		this.princ_resu = princ_resu;
		this.qr_resu = qr_resu;
		this.qcTime = qcTime;
		this.prTime = prTime;
		this.qrTime = qrTime;
		this.qcDescr = qcDescr;
		this.prDescr = prDescr;
		this.qrDescr = qrDescr;
	}



	@Override
	public String toString() {
		return "Lqx [id=" + id + ", propNum=" + propNum + ", proposerL="
				+ proposerL + ", groupL=" + groupL + ", principalL="
				+ principalL + ", qcL=" + qcL + ", departmentL=" + departmentL
				+ ", descriptionL=" + descriptionL + ", stateL=" + stateL
				+ ", supplierL=" + supplierL + ", itemNameL=" + itemNameL
				+ ", itemNumL=" + itemNumL + ", lotL=" + lotL + ", urlString="
				+ urlString + ", sortL=" + sortL + ", sortNum=" + sortNum
				+ ", qc_real=" + qc_real + ", sort_real=" + sort_real
				+ ", apTime=" + apTime + ", qc_resu=" + qc_resu
				+ ", princ_resu=" + princ_resu + ", qr_resu=" + qr_resu
				+ ", qcTime=" + qcTime + ", prTime=" + prTime + ", qrTime="
				+ qrTime + ", qcDescr=" + qcDescr + ", prDescr=" + prDescr
				+ ", qrDescr=" + qrDescr + "]";
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPropNum() {
		return propNum;
	}
	public void setPropNum(String propNum) {
		this.propNum = propNum;
	}
	public String getProposerL() {
		return proposerL;
	}
	public void setProposerL(String proposerL) {
		this.proposerL = proposerL;
	}
	public String getGroupL() {
		return groupL;
	}
	public void setGroupL(String groupL) {
		this.groupL = groupL;
	}
	public String getPrincipalL() {
		return principalL;
	}
	public void setPrincipalL(String principalL) {
		this.principalL = principalL;
	}
	public String getQcL() {
		return qcL;
	}
	public void setQcL(String qcL) {
		this.qcL = qcL;
	}
	public String getDepartmentL() {
		return departmentL;
	}
	public void setDepartmentL(String departmentL) {
		this.departmentL = departmentL;
	}
	public String getDescriptionL() {
		return descriptionL;
	}
	public void setDescriptionL(String descriptionL) {
		this.descriptionL = descriptionL;
	}
	public String getStateL() {
		return stateL;
	}
	public void setStateL(String stateL) {
		this.stateL = stateL;
	}
	public String getSupplierL() {
		return supplierL;
	}
	public void setSupplierL(String supplierL) {
		this.supplierL = supplierL;
	}
	public String getItemNameL() {
		return itemNameL;
	}
	public void setItemNameL(String itemNameL) {
		this.itemNameL = itemNameL;
	}
	public String getItemNumL() {
		return itemNumL;
	}
	public void setItemNumL(String itemNumL) {
		this.itemNumL = itemNumL;
	}
	public String getLotL() {
		return lotL;
	}
	public void setLotL(String lotL) {
		this.lotL = lotL;
	}
	public String getUrlString() {
		return urlString;
	}
	public void setUrlString(String urlString) {
		this.urlString = urlString;
	}
	public String getSortL() {
		return sortL;
	}
	public void setSortL(String sortL) {
		this.sortL = sortL;
	}
	public String getSortNum() {
		return sortNum;
	}
	public void setSortNum(String sortNum) {
		this.sortNum = sortNum;
	}
	public String getQc_real() {
		return qc_real;
	}
	public void setQc_real(String qc_real) {
		this.qc_real = qc_real;
	}
	public String getSort_real() {
		return sort_real;
	}
	public void setSort_real(String sort_real) {
		this.sort_real = sort_real;
	}
	public Timestamp getApTime() {
		return apTime;
	}
	public void setApTime(Timestamp apTime) {
		this.apTime = apTime;
	}
	public String getQc_resu() {
		return qc_resu;
	}
	public void setQc_resu(String qc_resu) {
		this.qc_resu = qc_resu;
	}
	public String getPrinc_resu() {
		return princ_resu;
	}
	public void setPrinc_resu(String princ_resu) {
		this.princ_resu = princ_resu;
	}
	public String getQr_resu() {
		return qr_resu;
	}
	public void setQr_resu(String qr_resu) {
		this.qr_resu = qr_resu;
	}
	public Timestamp getQcTime() {
		return qcTime;
	}
	public void setQcTime(Timestamp qcTime) {
		this.qcTime = qcTime;
	}
	public Timestamp getPrTime() {
		return prTime;
	}
	public void setPrTime(Timestamp prTime) {
		this.prTime = prTime;
	}
	public Timestamp getQrTime() {
		return qrTime;
	}
	public void setQrTime(Timestamp qrTime) {
		this.qrTime = qrTime;
	}
	public String getQcDescr() {
		return qcDescr;
	}
	public void setQcDescr(String qcDescr) {
		this.qcDescr = qcDescr;
	}
	public String getPrDescr() {
		return prDescr;
	}
	public void setPrDescr(String prDescr) {
		this.prDescr = prDescr;
	}
	public String getQrDescr() {
		return qrDescr;
	}
	public void setQrDescr(String qrDescr) {
		this.qrDescr = qrDescr;
	}
	
	


	


	
}

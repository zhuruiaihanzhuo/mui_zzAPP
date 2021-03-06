package bean.user_auth;

import java.sql.Timestamp;

public class Grou {

	private int id;
	private  String grou;
	private  String text;
	private String  principal;
	private String  qc;
	private String  department;
	private String  creater;
	private Timestamp time;
	
	
	
	


	public Grou() {
		super();
	}
	
	@Override
	public String toString() {
		return "Grou [id=" + id + ", grou=" + grou + ", text=" + text
				+ ", principal=" + principal + ", qc=" + qc + ", department="
				+ department + ", creater=" + creater + ", time=" + time + "]";
	}




	public Grou(String grou, String text, String principal, String qc,
			String department, String creater, Timestamp time) {
		super();
		this.grou = grou;
		this.text = text;
		this.principal = principal;
		this.qc = qc;
		this.department = department;
		this.creater = creater;
		this.time = time;
	}




	public Grou(int id, String grou, String text, String principal, String qc,
			String department, String creater, Timestamp time) {
		super();
		this.id = id;
		this.grou = grou;
		this.text = text;
		this.principal = principal;
		this.qc = qc;
		this.department = department;
		this.creater = creater;
		this.time = time;
	}




	public String getText() {
		return text;
	}




	public void setText(String text) {
		this.text = text;
	}

	


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrou() {
		return grou;
	}
	public void setGrou(String grou) {
		this.grou =grou;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getQc() {
		return qc;
	}
	public void setQc(String qc) {
		this.qc = qc;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}	
	
	
}

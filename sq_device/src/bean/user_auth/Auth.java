package bean.user_auth;

import java.sql.Timestamp;

public class Auth {

	private int id;
	private  String user_id;
	private  String role_id;
	private  String creater;
	private Timestamp time;
	
	
	
	
	public Auth() {
		super();
	}
	
	
	
	
	public Auth(String user_id, String role_id, String creater,
			Timestamp time) {
		super();
		this.user_id = user_id;
		this.role_id = role_id;
		this.creater = creater;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
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
	@Override
	public String toString() {
		return "Auth [id=" + id + ", user_id=" + user_id + ", role_id="
				+ role_id + ", creater=" + creater + ", time=" + time + "]";
	}

	
	
}

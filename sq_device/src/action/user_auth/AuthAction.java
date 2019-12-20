package action.user_auth;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;





import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import util.JsonDateValueProcessor;
import action.SuperAction;
import bean.user_auth.Auth;
import bean.user_auth.Permissions;
import dao.uesr_auth.AuthDao;
import dao.uesr_auth.PermissionsDao;
import dao.uesr_auth.impl.AuthDaoImpl;
import dao.uesr_auth.impl.PermissionsDaoImpl;

public class AuthAction extends SuperAction{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Object uauth;
	private Object cauth;



	public Object getCauth() {
		return cauth;
	}



	public void setCauth(Object cauth) {
		this.cauth = cauth;
	}



	public Object getUauth() {
		return uauth;
	}



	public void setUauth(Object uauth) {
		this.uauth = uauth;
	}



	public String queryByUser() {
		
		String user_id=request.getParameter("user_id");
		System.out.println("----------------------------"+user_id);
		AuthDao aDao=new AuthDaoImpl();
		List<Auth> result=aDao.qureyByUser(user_id);
		
		
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Timestamp.class , new JsonDateValueProcessor());
		JSONArray js=JSONArray.fromObject(result,jsonConfig);
		JSONObject obj=new JSONObject();
		obj.put("data", js.toString());
	
		this.uauth=obj;
		return "authQuery_success";
	}
	
	public String addAuth() {
		 Auth auth=new Auth();
		String creater=request.getParameter("creater");
		String user_id= request.getParameter("user_id");
		String role_id= request.getParameter("role_id");
		Date date =new Date();
		Timestamp createTime = new Timestamp(date.getTime());
		auth.setCreater(creater);
		auth.setRole_id(role_id);
		auth.setUser_id(user_id);
		auth.setTime(createTime);
		AuthDao aDao1=new AuthDaoImpl();
		List<Auth> result=aDao1.checkAuth(auth);
		if (result.isEmpty()) {
			
			System.out.println(auth);
			AuthDao aDao=new AuthDaoImpl();
			aDao.addAuth(auth);
			this.cauth=1;
				return "addAuth1_success";
			
		}else{
			System.out.println("此权限存在"+result);
			this.cauth=-1;
			return "addAuth1_success";
		}
	}
	
}

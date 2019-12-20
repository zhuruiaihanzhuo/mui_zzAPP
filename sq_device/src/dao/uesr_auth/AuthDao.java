package dao.uesr_auth;

import java.util.List;

import bean.user_auth.Permissions;
import bean.user_auth.Auth;

public interface AuthDao {

	public boolean addAuth(Auth auth);
	public List<Auth> qureyByUser(String user_id);
	public List<Auth> checkAuth(Auth auth);
	
}

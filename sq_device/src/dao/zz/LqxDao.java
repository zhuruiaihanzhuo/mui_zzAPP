package dao.zz;

import java.util.List;



import bean.zz.Lqx;

public interface LqxDao {

	
	public boolean creatF(Lqx lqx);
	public boolean updateL(Lqx lqx);
	public List<Lqx> queryB(String stateL);
	public List<Lqx> queryA(String user);
}

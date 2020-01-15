package dao.zz;

import java.util.List;



import bean.zz.Lqx;

public interface LqxDao {

	
	public boolean creatF(Lqx lqx);
	public boolean updateL(Lqx lqx);
	public List<Lqx> queryB(String user);
	public List<Lqx> queryA(String user);
	public List<Lqx> queryYSQ(String user);
	public List<Lqx> queryBM(String depar);
	public List<Lqx> queryZK();
}

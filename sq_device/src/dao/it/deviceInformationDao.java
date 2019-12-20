package dao.it;

import java.util.List;

import bean.it.Fszc;
import bean.it.device_information;

public interface deviceInformationDao {

	
	public boolean addInformation(device_information device);
	public List<Fszc> query();
	public List<Fszc> queryByDepartment(String depatment);
	
}

package action.it;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import action.SuperAction;
import bean.it.Fszc;
import dao.it.FszcDao;
import dao.it.impl.FszcDaoImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import sun.misc.BASE64Decoder;
import util.JsonDateValueProcessor;
public class FszcAction extends SuperAction{
private Object fszc;	
private Object fszc2;
	public Object getFszc2() {
	return fszc2;
}
public void setFszc2(Object fszc2) {
	this.fszc2 = fszc2;
}
	public Object getFszc() {
	return fszc;
}
public void setFszc(Object fszc) {
	this.fszc = fszc;
}



public String  add(){
	String  department=request.getParameter("department");
	FszcDao fDao=new FszcDaoImpl();
	Fszc fszc= new Fszc();
	System.out.println(request.getParameter("shebeibianhao"));
	//int i=Integer.parseInt((request.getParameter("shebeibianhao")));
/*	System.out.println(request.getParameter("jiancharen"));
	System.out.println(request.getParameter("bumen"));
	System.out.println(i);
	System.out.println(request.getParameter("beizhu"));*/
		String  category=request.getParameter("category");
     String brand=request.getParameter("brand");
     String type=request.getParameter("type");
     String ccNumber=request.getParameter("ccNumber");
     String zcNumber=request.getParameter("zcNumber");      
     String personIC=request.getParameter("personIC");  
     String personCY=request.getParameter("personCY"); 
     String area=request.getParameter("area");      
     String zpCount=request.getParameter("zpCount");  
     String state=request.getParameter("state");  
     String newfcNumber=request.getParameter("newfcNumber");      
     String admin=request.getParameter("admin");  
     String wxNumber=request.getParameter("wxNumber");  
     String wxPerson=request.getParameter("wxPerson");  
     String remarks=request.getParameter("remarks");      
     String lururen=request.getParameter("lururen");  
     String office=request.getParameter("office"); 
   
     Date date=new Date();     
     Timestamp lurushijian = new Timestamp(date.getTime());
     fszc.setDepartment(department);
     fszc.setAdmin(admin);
     fszc.setArea(area);
     fszc.setBrand(brand);
     fszc.setCategory(category);
     fszc.setCcNumber(ccNumber);
     fszc.setLururen(lururen);
     fszc.setLurushijian(lurushijian);
     fszc.setNewfcNumber(newfcNumber);
     fszc.setOffice(office);
     fszc.setPersonCY(personCY);
     fszc.setPersonIC(personIC);
     fszc.setRemarks(remarks);
     fszc.setState(state);
     fszc.setType(type);
     fszc.setWxNumber(wxNumber);
     fszc.setWxPerson(wxPerson);
     fszc.setZcNumber(zcNumber);
     fszc.setZpCount(zpCount);
   fDao.addFszc(fszc);
    	 
		return "add_success";
	
}






	public String  query() {
	
	FszcDao fDao=new FszcDaoImpl();
	String department=request.getParameter("department");
	System.out.println(department);
	List<Fszc> result =fDao.query();
	System.out.println();
	JsonConfig jsonConfig = new JsonConfig();
	jsonConfig.registerJsonValueProcessor(Timestamp.class , new JsonDateValueProcessor());
	JSONArray js=JSONArray.fromObject(result,jsonConfig);
	JSONObject obj=new JSONObject();


    obj.put("data", js.toString());
    System.out.println(obj);
    this.fszc=obj;
	if (result !=null) {
		
	

		return "queryAll_success";
	}
	else {
		return "query_error";
	}
}
	public String  queryByDepartment() {
		
		FszcDao fDao=new FszcDaoImpl();
		String department=request.getParameter("department");
		System.out.println(department);
		List<Fszc> result =fDao.queryByDepartment(department);
		System.out.println();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Timestamp.class , new JsonDateValueProcessor());
		JSONArray js=JSONArray.fromObject(result,jsonConfig);
		JSONObject obj=new JSONObject();


	    obj.put("data", js.toString());
	    System.out.println(obj);
	    this.fszc2=obj;
		if (result !=null) {
			
		

			return "queryByDepartment_success";
		}
		else {
			return "query_error";
		}
	}
	
	


	
	
	public String  test() {
		
		String user=request.getParameter("user");
	String imgDatas=request.getParameter("imgDatas");
	System.out.println(imgDatas+"shenmegui");
	
	String bs = "data:image/png;base64,";
	String base = imgDatas.replace(bs, "");
	BASE64Decoder decoder = new BASE64Decoder();
	DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHHmmss");

	Date date = new Date();

	String dateString = dateFormat.format(date);
	System.out.println(dateString);
	String imgFilePath=null;
	try {
		//解码
		byte[] b = decoder.decodeBuffer(base);
		for (int i = 0; i < b.length; ++i) {
			//调整异常数据
			if (b[i] < 0) {
			    b[i] += 256;
			}
		}
		imgFilePath = "D:\\tu\\"+user+"_"+dateString+".png";
		System.out.println(imgFilePath);
		OutputStream out = new FileOutputStream(imgFilePath);
		out.write(b);
		out.flush();
		out.close();

	} catch (Exception e) {
		return "error";
	}
	return "queryAll_success";

	
	
	
	
	

	
}
	
	
	
}
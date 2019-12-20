package action.zz;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import action.SuperAction;

import bean.zz.Lqx;

import dao.zz.LqxDao;
import dao.zz.impl.LqxDaoImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import sun.misc.BASE64Decoder;
import util.JsonDateValueProcessor;

public class LqxAction extends SuperAction{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Object lqx;	
private Object lqxt;
private Object lqxH;

public Object getLqxH() {
	return lqxH;
}

public void setLqxH(Object lqxH) {
	this.lqxH = lqxH;
}

public Object getLqxt() {
	return lqxt;
}

public void setLqxt(Object lqxt) {
	this.lqxt = lqxt;
}

public Object getLqx() {
	return lqx;
}

public void setLqx(Object lqx) {
	this.lqx = lqx;
}









	public String  queryL() {
		LqxDao lqxDao=new LqxDaoImpl();
		String stateL=request.getParameter("stateL");
		System.out.println(stateL);
		List<Lqx> result =lqxDao.queryB(stateL);
		System.out.println();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Timestamp.class , new JsonDateValueProcessor());
		JSONArray js=JSONArray.fromObject(result,jsonConfig);
		JSONObject obj=new JSONObject();


	    obj.put("data", js.toString());
	    System.out.println(obj);
	    this.lqxt=obj;
	    return "queryL_success";
}
	
	public String  queryH() {
		LqxDao lqxDao=new LqxDaoImpl();
		String user=request.getParameter("user");
		System.out.println(user);
		List<Lqx> result =lqxDao.queryA(user);
		System.out.println();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Timestamp.class , new JsonDateValueProcessor());
		JSONArray js=JSONArray.fromObject(result,jsonConfig);
		JSONObject obj=new JSONObject();


	    obj.put("data", js.toString());
	    System.out.println(obj);
	    this.lqxH=obj;
	    return "queryH_success";
}
	
	
	
	
	public String  creatF() {
		
		String user=request.getParameter("user");
	String imgDatas=request.getParameter("imgDatas");
	String department=request.getParameter("department");
	String proposer=request.getParameter("proposer");
	String group=request.getParameter("group");
	String principal=request.getParameter("principal");
	String qc=request.getParameter("qc");
	String description=request.getParameter("description");
	String supplier=request.getParameter("supplier");
	String itemName=request.getParameter("itemName");
	String itemNum=request.getParameter("itemNum");
	String lot=request.getParameter("lot");
	String sort=request.getParameter("sort");
	String sortNum=request.getParameter("sortNum");
	String stateL=request.getParameter("stateL");
	String qc_real=request.getParameter("qc_real");
	System.out.println(qc_real+"*******************************************");
	String resuAll="流程未到";
	 Date date1=new Date();     
     Timestamp apTime = new Timestamp(date1.getTime());
     
	Lqx lqx=new Lqx();
	lqx.setApTime(apTime);
	lqx.setDepartmentL(department);
	lqx.setDescriptionL(description);
	lqx.setGroupL(group);
	lqx.setItemNameL(itemName);
	lqx.setItemNumL(itemNum);
	lqx.setLotL(lot);
	lqx.setPrincipalL(principal);
	lqx.setProposerL(proposer);
	lqx.setQcL(qc);
	lqx.setQc_real(qc_real);
	lqx.setSortL(sort);
	lqx.setSortNum(sortNum);
	lqx.setSupplierL(supplier);
	lqx.setStateL(stateL);
	lqx.setQcTime(apTime);
	lqx.setQrTime(apTime);
	lqx.setPrTime(apTime);
	lqx.setPrinc_resu(resuAll);
	lqx.setQc_resu(resuAll);
	lqx.setQr_resu(resuAll);
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
		imgFilePath = "D:\\images\\"+user+"_"+dateString+".png";
		String imgFilePath2 = "images\\"+user+"_"+dateString+".png";
		String propNum=dateString+user;
		lqx.setUrlString(imgFilePath2);
		lqx.setPropNum(propNum);
		System.out.println(imgFilePath);
		OutputStream out = new FileOutputStream(imgFilePath);
		out.write(b);
		out.flush();
		out.close();
	

	} catch (Exception e) {
		
		System.out.println("catchichichicchi");
		return "error";
	}
	LqxDao lDao= new LqxDaoImpl();
	lDao.creatF(lqx);
	System.out.println("daodizahuisi");
	this.lqx=lqx;
	return "add_success";
	
}
	public String updateL(){
		String stateL=request.getParameter("stateL");
	if (stateL.equals("未通过(班长驳回)")) {
		String prDescr=request.getParameter("prDescr");
		String propNum=request.getParameter("propNum");
		String princ_resu=request.getParameter("princ_resu");
		 Date date=new Date();     
	     Timestamp prTime = new Timestamp(date.getTime());
		System.out.println(stateL+prDescr+propNum+princ_resu);
		Lqx lqx=new Lqx();
		lqx.setStateL(stateL);
		lqx.setPrDescr(prDescr);
		lqx.setPropNum(propNum);
		lqx.setPrinc_resu(princ_resu);
		lqx.setPrTime(prTime);
		LqxDao lDao=new LqxDaoImpl();
		
		lDao.updateL(lqx);
		return "update_success";
	}else if (stateL.equals("巡检审批")) {
		
		String prDescr=request.getParameter("prDescr");
		String propNum=request.getParameter("propNum");
		String princ_resu=request.getParameter("princ_resu");
		 Date date=new Date();     
	     Timestamp prTime = new Timestamp(date.getTime());
		System.out.println(stateL+prDescr+propNum+princ_resu);
		Lqx lqx=new Lqx();
		lqx.setStateL(stateL);
		lqx.setPrDescr(prDescr);
		lqx.setPropNum(propNum);
		lqx.setPrinc_resu(princ_resu);
		lqx.setPrTime(prTime);
		LqxDao lDao=new LqxDaoImpl();
		
		lDao.updateL(lqx);
		return "update_success";
		
	}else if (stateL.equals("未通过(巡检驳回)")) {
		String qcDescr=request.getParameter("qcDescr");
		String propNum=request.getParameter("propNum");
		String qc_resu=request.getParameter("qc_resu");
		 Date date=new Date();     
	     Timestamp qcTime = new Timestamp(date.getTime());
		System.out.println(stateL+qcDescr+propNum+qc_resu);
		Lqx lqx=new Lqx();
		lqx.setStateL(stateL);
		lqx.setQcDescr(qcDescr);
		lqx.setPropNum(propNum);
		lqx.setQc_resu(qc_resu);
		lqx.setQcTime(qcTime);
		LqxDao lDao=new LqxDaoImpl();
		lDao.updateL(lqx);
		return "update_success";
	}else if (stateL.equals("质控审批")) {
		String qcDescr=request.getParameter("qcDescr");
		String propNum=request.getParameter("propNum");
		String qc_resu=request.getParameter("qc_resu");
		 Date date=new Date();     
	     Timestamp qcTime = new Timestamp(date.getTime());
		System.out.println(stateL+qcDescr+propNum+qc_resu);
		Lqx lqx=new Lqx();
		lqx.setStateL(stateL);
		lqx.setQcDescr(qcDescr);
		lqx.setPropNum(propNum);
		lqx.setQc_resu(qc_resu);
		lqx.setQcTime(qcTime);
		LqxDao lDao=new LqxDaoImpl();
		lDao.updateL(lqx);
		return "update_success";
	}else if (stateL.equals("未通过(质控驳回)")) {
		String qrDescr=request.getParameter("qrDescr");
		String propNum=request.getParameter("propNum");
		String qr_resu=request.getParameter("qr_resu");
		 Date date=new Date();     
	     Timestamp qrTime = new Timestamp(date.getTime());
	
		Lqx lqx=new Lqx();
		lqx.setStateL(stateL);
		lqx.setQrDescr(qrDescr);
		lqx.setPropNum(propNum);
		lqx.setQr_resu(qr_resu);
		lqx.setQrTime(qrTime);
		LqxDao lDao=new LqxDaoImpl();
		lDao.updateL(lqx);
		return "update_success";
	}else if (stateL.equals("完结(巡检)")) {
		System.out.println("daodishaqingk");
		String qcDescr=request.getParameter("qcDescr");
		String propNum=request.getParameter("propNum");
		String qc_resu=request.getParameter("qc_resu");
		 Date date=new Date();     
	     Timestamp qcTime = new Timestamp(date.getTime());
	     System.out.println("daodishaqingk2");
		Lqx lqx=new Lqx();
		lqx.setStateL(stateL);
		lqx.setQcDescr(qcDescr);
		lqx.setPropNum(propNum);
		lqx.setQc_resu(qc_resu);
		lqx.setQcTime(qcTime);
		LqxDao lDao=new LqxDaoImpl();
		lDao.updateL(lqx);
		return "update_success";
	
	}else if (stateL.equals("完结(质控)")) {
		String qrDescr=request.getParameter("qrDescr");
		String propNum=request.getParameter("propNum");
		String qr_resu=request.getParameter("qr_resu");
		String sort_real=request.getParameter("sort_real");
		 Date date=new Date();     
	     Timestamp qrTime = new Timestamp(date.getTime());
	
		Lqx lqx=new Lqx();
		lqx.setStateL(stateL);
		lqx.setQrDescr(qrDescr);
		lqx.setPropNum(propNum);
		lqx.setQr_resu(qr_resu);
		lqx.setQrTime(qrTime);
		lqx.setSort_real(sort_real);
		LqxDao lDao=new LqxDaoImpl();
		lDao.updateL(lqx);
		
		return "update_success";
	}else {
		System.out.println(stateL+"测试");
		System.out.println(stateL.equals("巡检审批"));
		return "update_error";
	}
	
	
		
		
	}
	
	
}
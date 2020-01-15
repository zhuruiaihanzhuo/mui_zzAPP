<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>附属资产信息查询</title>
 <meta name="viewport" content="width=device-width,minimum-scale=1.0, maximum-scale=2.0" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="resource/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="resource/easyui/themes/icon.css">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body style="padding: 5px">

	<div class="easyui-layout" data-options="fit:true">
		
					<div class="easyui-panel"  id="dg" data-options="fit:true,title:'<center>零缺陷信息查询</center>',tools:'#tool'">
					<a href="javascript:;" style="background-color:#33FFFF;color:#0000FF" class="easyui-linkbutton" onclick="$('#dg1').datagrid('toExcel','零缺陷记录.xls')">导出到EXCEL</a>
						<table id="dg1">
							<thead>
								<tr>
								<th data-options="field:'apTime',align:'center',width:fixWidth(0.1),sortable:true">申请时间
										</th>
									<th data-options="field:'proposerL',align:'center',width:fixWidth(0.05),sortable:true">申请人
										</th>
									<th data-options="field:'groupL',align:'center',width:fixWidth(0.05),sortable:true">班组/科室
										</th>
									<th data-options="field:'principalL',align:'center',width:fixWidth(0.05),sortable:true">负责人</th>
									
									<th data-options="field:'qcL',align:'center',width:fixWidth(0.05),sortable:true">巡检
										</th>
										<th data-options="field:'departmentL',align:'center',width:fixWidth(0.05),sortable:true">部门
										</th>
									
									
									<th data-options="field:'descriptionL',align:'center',width:fixWidth(0.05),sortable:true">异常描述</th>
								<th data-options="field:'supplierL',align:'center',width:fixWidth(0.05),sortable:true">来料单位</th>
								
								<th data-options="field:'itemNameL',align:'center',width:fixWidth(0.05),sortable:true">物料名称</th>
									
									<th data-options="field:'itemNumL',align:'center',width:fixWidth(0.05),sortable:true">物料编码
										</th>
										<th data-options="field:'lotL',align:'center',width:fixWidth(0.05),sortable:true">生产订单
										</th>
									
									
									<th data-options="field:'sortL',align:'center',width:fixWidth(0.05),sortable:true">缺陷类别</th>
								<th data-options="field:'sortNum',align:'center',width:fixWidth(0.05),sortable:true">缺陷数</th>
								<th data-options="field:'stateL',align:'center',width:fixWidth(0.05),sortable:true">判定结果</th>
									<th data-options="field:'sort_real',align:'center',width:fixWidth(0.05),sortable:true">确认类别
										</th>
										<!-- <th data-options="field:'princ_resu',align:'center',width:fixWidth(0.05),sortable:true">班组审核
										</th>
									
									
									<th data-options="field:'remarks',align:'qc_resu',width:fixWidth(0.05),sortable:true">巡检审核</th>
								<th data-options="field:'lururen',align:'center',width:fixWidth(0.05),sortable:true">录入人</th>
								<th data-options="field:'lurushijian',align:'center',width:fixWidth(0.07),sortable:true">录入时间</th>
								</tr> -->
							</thead>
						</table>
		</div>
		</div>
		<input id="department" type="text">
		<div id="tool">
	
		<a href="pc/zz/lqx_queryZK.jsp" class="icon-reload" title="刷新数据" ></a>
	</div>
</body>
<script type="text/javascript" src="js/easyUI/jquery.min.js"></script>
<script type="text/javascript" src="js/easyUI/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="js/datagrid-filter/datagrid-filter.js"></script>
	<script type="text/javascript" src="js/duan_fs/lqx.js"></script>
	<script type="text/javascript" src="js/duan_fs/datagrid-export.js"></script>
<script>
	$(document).ready(function(){
	var department="<%=session.getAttribute("bumen")%>";
	$('#department').val(department);
	todatagrid1();
	showLqxZK();
	
	});
	window.addEventListener("orientationchange", function() {

				window.location.reload(); 
}, false);
		function fixWidth(percent)  {  
    return document.body.clientWidth * percent ;//这里你可以自己做调整  
}  
   		
   </script>
</html>
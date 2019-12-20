<%@ page language="java" import="java.util.*" pageEncoding="utf-8"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>菜单</title>
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

<!-- 	<div class="easyui-layout" data-options="fit:true"> -->
		
					<div class="easyui-panel"  id="dg" data-options="fit:true,title:'<center>菜单查询</center>'">
						<table id="dg1">
							<thead>
								<tr>

									<th id="uname" data-options="field:'text',align:'center',width:fixWidth(0.2)">
										</th>
									
							</thead>
						</table>
		</div>
		
		
		
	 <div id="win" class="easyui-dialog" title="提示"  style="width: 400px; padding: 10px 20px; height: 410px;"
       closed="true" buttons="#dlg-buttons">                             
       <form id="fm" name="frm" method="post" style="margin-top: 20px; margin-left: 20px;">
           <div class="fitem">
            <td>角色:</td>
	    <td><input class="easyui-combobox" id="text" name="text" data-options="valueField:'id',textField:'text',editable:false" /></td>
           
               </div>
           
          
           <div id="dlg-buttons" style="display: block">
               <a id="confirm" href="javascript:void(0)" class="easyui-linkbutton c6" iconcls="icon-ok" onclick="submitForm()" style="width: 90px">提交</a>
               <a href="javascript:void(0)" class="easyui-linkbutton" iconcls="icon-cancel" onclick="javascript:$('#win').dialog('close')" style="width: 90px">取消</a>
           </div>
       </form>
   </div>
		
		
		
		
		
		
		
</body>
<script type="text/javascript" src="js/easyUI/jquery.min.js"></script>
<script type="text/javascript" src="js/easyUI/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/duan_fs/auth.js"></script>
<script type="text/javascript"
	src="js/datagrid-filter/datagrid-filter.js"></script>
<script>

	var uid="<%=request.getParameter("uid")%>";	
	var user="<%=session.getAttribute("uid")%>";	
	var username1="<%=session.getAttribute("user")%>";
	uname1=decodeURI(username1);
	var id2=decodeURI(user);
	var user_id=decodeURI(uid);
	var username="<%=request.getParameter("username")%>";
	var  uname	=decodeURI(username);
	$(document).ready(function(){
	todatagrid();
	show();
	
$("#uname").html(uname);
var un=document.getElementById("uname");
un.style.textAlign = 'center';
un.style.color = 'blue';
un.style.width = "10%";
	});

	window.addEventListener("orientationchange", function() {

				window.location.reload(); 
}, false);
		function fixWidth(percent)  {  
    return document.body.clientWidth * percent ;//这里可以自己做调整  
}  
   		function  todatagrid(){
		/* 	$(document).bind('contextmenu',function(e){
				e.preventDefault();
				$('#mm').menu('show', {
					left: e.pageX,
					top: e.pageY
				});
			}); */
		
        	
       

	
    var dg1=$('#dg1').datagrid({
    	  	 title:"记录列表",
    		 idField:'id', 
    		
    		 loadMsg:'Processing, please wait …', 
    		 singleSelect:true,
    		 pagination:true,
    		 remoteSort:false,
     		 width:'auto',              
			 height:'auto',
			 	  toolbar:[
   	{
   		text:'添加权限',
   		iconCls:'icon-add',
   	 	handler:function(){  	 	
   	 	 addFile();
   		} 
   		}	
   		]
   
    	   
 });  
             
 

		};
	
	
   </script>
</html>

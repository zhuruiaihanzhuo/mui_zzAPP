
    function addFile(){
        $('#win').dialog({
                title: '新增',
                width: 450,
                height: 240,
                top:150,
                closed: false,//显示对话框
                cache: false,
                modal: true
            });    
    }
   
    
    
    function submitForm(){
    	
    	if(user_id!=null&& "" !=user_id &&$("#text").val() !=null&&"" != $("#text").val() && id2!=null&& "" != id2){
    		
    	$.ajax({
		
		type:"post",
		dataType:"json",
		url:'permissions/Auth_addAuth.do',
		data:{
		user_id:user_id,
		role_id:$("#text").val(),
		creater:uname1
		
		
		},
		success:function(data){
			var resu=data;
			 if(resu==1){
		    	   alert("添加成功");
		       }else{
		    	   alert("该用户已有此权限");
		       }
			 
			  $('#win').dialog({
		            closed: true, // 隱藏列表 
		        });
		      
		        location.reload() ; 
		/*$('#dg1').datagrid('loadData',data.data);*/
		}
	
	});
	
    	 
    }
    else
    {
    	alert("信息不完整");
    }
    } 
    
    function show(){
    	

    	$.ajax({
    		
    		type:"post",
    		dataType:"json",
    		url:'permissions/Auth_queryByUser.do',
    		data:{
    		user_id:user_id
    		},
    		success:function(data){
    		
    		$('#dg1').datagrid('loadData',data.data);
    		}
    	
    	});
    	
    	$.ajax({
    		
    		type:"post",
    		dataType:"json",
    		url:'permissions/Auth_queryByUser.do',
    		data:{
    		user_id:id2
    		},
    		success:function(data){

    		
    		var data1=data.data;
    		var test=[];
    		 var i=0;
    		 for ( var machine in data1) {
    		       i=i++;
                    test.push({
                        "id" : data1[machine].id,
                        "text" : data1[machine].text
                    });
                    
                       $("#text").combobox("loadData", test);   
                      $("#text").combobox('setValue', data1[0].id);
                    
                
                   };
    		
    		
    		
    		
    		}
    	
    	});
    	}	
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<script type="text/javascript" src="/nis-manage/js/js/jquery-1.8.0.min.js"></script>    
<title>区域管理</title>
</head>
<body>
	<script>
	$(function(){
		$('#tb_area').datagrid({    
		    url:'${pageContext.request.contextPath}/area/alist',    
		    columns:[[    
		        {field:'aname',title:'区域名称'},    
		        {field:'atime',title:'排序'},    
		        {field:'state',title:'状态'},
		        {field:'xxx',title:'操作',formatter:function(value,row,index){
		        	return "";
		        }}
		    ]]    
		}); 
	});
	
	</script>
</body>
<table id="tb_area"></table>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>系统主界面</title>
    <!-- 第一步：导入jQuery核心库，在压缩文件的根目录下 -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<!--第二步：导入easyUI核心库，在压缩文件的根目录下-->
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<!--第三步：导入语言包，在locale文件下-->
<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
<!--第四步：导入easyUi皮肤包，在themes/default文件夹下-->
<link type="text/css" rel="stylesheet" href="css/easyui.css"/>
<!--第五步：导入图标库，在themes文件下-->
<link type="text/css" rel="stylesheet" href="css/icon.css"/>
<style type="text/css">
#head{
	height:80px;
	background:url(images/u14.png) no-repeat; 
	}
ul,li{
	margin:0;
	padding:0;
	list-style:none;
	}
li{
	padding-top:10px;
	text-align:center;}
a{
	text-decoration:none;
	font-size:16px;
   }
#query_user .caozuo{
	font-size:12px;
	text-decoration:underline;
}
</style>
</head>
 
<body class="easyui-layout">
	<div data-options="region:'north',href:'north.jsp',border:false" style="height:83px;"></div>
    <div data-options="region:'west',title:'菜单管理',iconCls:'icon-edit',href:'menu.html'" style="width:150px;">
    </div>
    <div data-options="region:'center'"></div>
 
</body>
 
</html>
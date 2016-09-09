<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户登录</title>
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
    
    <link type="text/css" rel="stylesheet" href="css/login.css">
<script src="js/jquery.min.js" language="javascript"></script>
<script language="javascript">
(function(){
	$(function(){
		var imgs = $("#imageShow>div:eq(0) img");
		var as =  $("#imageShow>div:eq(1) a");
		
		/**
			设置第几个图片显示
		**/
		var index = 0;
		var timeout;
		var setImg = function(){
			window.clearTimeout(timeout);
			if(index>=imgs.size()){
				index=0;	
			}
			imgs.fadeOut(1000);
			imgs.eq(index).fadeIn(3000);
			
			as.removeClass("the");
			as.eq(index).addClass("the");
			index ++;
			timeout = window.setTimeout(setImg,5000);//定时执行下一次
		}
		
		
		/**
			执行
		**/
		setImg();
		
		/**
			绑定单击事件
		**/
		$.each(as,function(i,v){
			$(v).click(function(){
				index = i;
				setImg();	
			});
		});
	});	

	
	
})(jQuery);
</script>
</head>

<body>
<div class="logo"></div>
<div class="frame">
	<div class="left">
    	<div id="imageShow" class="div1">
            <div style="width:658px; height:417px; overflow:hidden;">
            	<img src="images/u28.jpg" />
            	<img src="images/u28.jpg" style="display: none;"/>
           	  	<img src="images/u28.jpg" style="display: none;"/>
           	  	<img src="images/u28.jpg" style="display: none;"/>
            </div>
            <div class="btn1">
                <a class="the" href="javascript:void(0);"></a>
                <a href="javascript:void(0);"></a>
                <a href="javascript:void(0);"></a>
                <a href="javascript:void(0);"></a>
            </div>
            <div class="yun"></div>
        </div>
    </div>
    <div class="right">
    	<form method="post">
            <div class="div2">
                <div class="title">系统帐户登陆</div>
                <div style="padding:0 15px;">
                    <input type="text" class="user" name="userName" placeholder="请输入用户名" required>
                    <input type="password" class="pwd" name="userPwd" placeholder="请输入密码" required>
                    <a href="javascript:alert('开发中...')" class="a1">忘记密码了？</a>
                    <input type="button" value="" class="submit">
                    <div style="height:125px;">
                    </div>
                    <div style="color:#5B7E9B;">没有注册系统帐户？</div>
                    <div class="reg"><a href="reg.jsp"> </a></div>
                </div>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript">
$(function(){
$(".submit").click(function(){
	$(".right form").form("submit",{
		url:'login.action',
		onSubmit:function(){
		
		},
		success:function(data){
		
		}
	});
	 
});
});
</script>

</body>
</html>

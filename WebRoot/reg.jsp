<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册</title>
 <link type="text/css" rel="stylesheet" href="css/msg.css">

</head>

<body>
<div class="top_hr">
<div class="logo"></div>
<div class="title">用户注册</div>
<div class="menu">
	<a href="./login.jsp">登陆</a>
    <a href="./reg.jsp">注册</a>
</div>
</div>
<div style="clear:both;">
<form action="reg" method="post">
  <table width="100%" border="0" cellspacing="5" cellpadding="0">
    <tr>
      <td width="30%" align="right">登陆帐户：</td>
      <td><input class="input user" style="width:50%;" type="text" name="loginName"  placeholder="请输入2-20位的用户名" required="required"  pattern="^\w{2,8}$"/></td>
    </tr>
    <tr>
      <td align="right">登陆密码：</td>
      <td><input class="input pwd" style="width:50%;" type="password" name="loginPwd"  placeholder="请输入2-20位的密码" required="required" pattern="^\w{2,20}$"/></td>
    </tr>
    <tr>
      <td align="right">密码确认：</td>
      <td><input class="input pwd" style="width:50%;" type="password" name="loginPwdConfirm"  placeholder="请再次输入密码" required="required"/></td>
    </tr>
    <tr>
      <td width="30%" align="right">真实姓名：</td>
      <td><input class="input" style="width:50%;" type="text" name="cusName"  placeholder="请输入真实姓名" required="required" /></td>
    </tr>
    <tr>
      <td align="right">手机号码：</td>
      <td><input class="input" style="width:50%;" type="text" name="cusPhone"  placeholder="请输入手机号码" required="required" /></td>
     </tr>
    <tr>
      <td align="right">&nbsp;</td>
      <td><input class="btn" style="height:40px; line-height:40px; font-size:16px; padding:0 30px;" type="submit" value="我要注册系统帐户"/></td>
    </tr>
  </table>
  </form>
</div>

</body></html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
  
<div id="head">
	<div style="height:30px; float:right; margin:0; margin-top:50px; margin-right:1px;">
		欢迎<strong style="color:red;">${user.userName } </strong>
    	<a class="easyui-linkbutton p" data-options="plain:true" href="javascript:void(0)">个人中心</a> |
    	<a class="easyui-linkbutton p" data-options="plain:true" href="updatePwd.html">修改密码</a> | 
        <a class="easyui-linkbutton outLogin" data-options="plain:true" href="javascript:void(0)">安全退出</a>
    </div> 
    
</div>
<script type="text/javascript">
//退出系统
$("#head .outLogin").click(function(){
		$.messager.confirm('提示信息','是否退出系统',function(r){
				if(r){
				    $.post("outLogin.action");
					window.location='loginDemo.html';
					}
			
			});
	
	});
//
$("#head .p").click(function(){
	var href=$(this).attr('href');
	var panel=$("body").layout("panel","center");
	panel.panel('refresh',href);
	return false;
});

</script>
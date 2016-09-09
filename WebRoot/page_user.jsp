<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 <div style="margin: 10px;">角色名称：<input class="easyui-combobox _role"  name="roleId" data-options="textField:'roleName',valueField:'roleId',url:'queryRole.action'"/>
	用户名：<input class="easyui-textbox" name="userName"/>
	<a class="easyui-linkbutton _query" href="javascript:void(0)">查询</a>

</div>
<div id="query_user"></div>
<script type="text/javascript">
$(function(){
//页面加载时创建表格
$("#query_user").datagrid({
	url:'pageAll.action',
	title:'用户信息',
	pagination:true,
	pageList:[2,5,8],
	pageSize:2,
	columns:[[
		{field:'userId',title:'用户编号',width:80},
		{field:'roleId',title:'角色名称',width:120,formatter:function(value,row,index){
			 if(row.roleId==1){
			 	return "系统管理员";
			 }else if(row.roleId==2){
			 	return "配送点管理员";
			 }else{
			 	return "普通用户";
			 }
		}},
		{field:'userName',title:'登录帐号',width:80},
		{field:'userPwd',title:'登录密码',width:80,formatter:function(value,row,index){
			return "******";
		}},
		{field:'userRealName',title:'真实姓名',width:80},
		{field:'userState',title:'用户状态',width:80},
		{field:'aa',title:'操作',width:150,formatter:function(value,row,index){
			return "<a style=\"font-size:12px;\" href=\"javascript:deleteUser("+row.userId+")\">锁定帐号</a> &nbsp;&nbsp;<a style=\"font-size:12px;\" href=\"javascript:queryInfo("+row.userId+")\">查看详情</a>";
		}}
	]]

});
//锁定用户操作
window.deleteUser=function(id){
	alert(id);

}
//查看用户详情操作
window.queryInfo=function(id){
	alert(id);
}
 


}); 



</script>
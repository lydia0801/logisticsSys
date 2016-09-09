package com.icss.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.icss.po.UserInfoPO;
import com.icss.service.UserInfoService;

public class LoginServlet extends HttpServlet {

	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		 
	}

	 
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 //设置字符编码
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=u8tf-8");
		//从页面获取参数
		String userName=request.getParameter("userName");
		String userPwd=request.getParameter("userPwd");
		UserInfoService service=new UserInfoService();
		UserInfoPO po=new UserInfoPO();
		po.setUserName(userName);
		po.setUserPwd(userPwd);
		UserInfoPO  user=null;
		try {
			user=service.login(po);
			
			if(user!=null){
				//获取session会话
				HttpSession session=request.getSession();
				//将登陆用户信息存储在session
				session.setAttribute("user", user);
				request.getRequestDispatcher("main.jsp").forward(request, response);
			}else{
				 response.sendRedirect("login.jsp");
			}
		} catch (Exception e) {
			 response.sendRedirect("login.jsp");
		}
		 
	}

}

package home;
import com.jh.Crpto.*;

import com.jh.config.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.first_dao;


/**
 * Servlet implementation class url_request
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException {
     //   System.out.println("init called");
        super.init();
    }

    public void destroy() {
     //   System.out.println("destroy called");
        super.destroy();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Login Chekc service called");
        
        

		//String id = request.getParameter("beans_id");
		//String pw = request.getParameter("beans_pwd");
		String id = (String) request.getSession().getAttribute("id");
		String pw = (String) request.getSession().getAttribute("pwd");
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmm");	

		System.out.println(id);
		System.out.println(pw);
		

		hyunCrypto ac=new hyunCrypto();
		trim trim=new trim();
    	String privatekey;
    	String unpwd;
    	getProperties au=new getProperties();

    	privatekey=trim.trim_request(2);
    	unpwd=ac.decode(pw,privatekey);       
		
    	System.out.println(unpwd);
		System.out.println("ssssssssssssssssssssssssssss");	

		first_dao LoginDao=new first_dao();
		int ResultValue=LoginDao.login(id,unpwd);
		switch(ResultValue){
		case 1 :
			System.out.println("Login Check access");
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			session.setMaxInactiveInterval(100);  // session 나이설정
			response.sendRedirect("LoginSuccess.jsp");
			break;
		case 2:
			System.out.println("nopwd");
			response.sendRedirect("LoginPage.jsp");
			break;
		case 3:
			System.out.println("noid");
			response.sendRedirect("LoginPage.jsp");
			break;				
		default:
			response.sendRedirect("LoginPage.jsp");
			break;
		}
        super.service(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //  System.out.println("doGet called");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //   System.out.println("doPost called");
    }

}

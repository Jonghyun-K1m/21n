package home;
import com.jh.Crpto.*;
import com.jh.config.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.first_dao;

/**
 * Servlet implementation class dbout
 */
@WebServlet("/db_insert")
public class db_insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public db_insert() {
        super();
        // TODO Auto-generated constructor stub
    }
    /*
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("service called");
		String a = request.getParameter("stock_a");
		String b = request.getParameter("stock_b");
		System.out.println(a);
		System.out.println(b);
		
		first_dao StockDao=new first_dao();
		int ResultValue=StockDao.db_insert(a,b);
		System.out.println(ResultValue);
        super.service(request, response);
        
    }
    
    */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("db insert service called");
	
		String sk_str = (String) request.getSession().getAttribute("sk_str");		
		String a = (String) request.getSession().getAttribute("stock_a");
		String b = (String) request.getSession().getAttribute("stock_b");	
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(sk_str);
		
		first_dao StockDao=new first_dao();
		int ResultValue=StockDao.db_insert(a,b);
		System.out.println(ResultValue);
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head></head><body>");
		out.println("<br><a href='LoginSuccess.jsp'>return</a>");
		out.println("</body></html>");
		out.close();

        super.service(request, response);
        
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}

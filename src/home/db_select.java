package home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import dao.first_dao;
import dto.stock;
/**
 * Servlet implementation class dbout
 */
@WebServlet("/db_select")
public class db_select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public db_select() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("service called");
        
		 ArrayList<stock> list=new ArrayList<>();
		 
		first_dao StockDao=new first_dao();
		list=StockDao.db_select();
		
		for(int i=0;i<list.size();i++) {
			response.getWriter().append(list.get(i).getName());
			response.getWriter().print(list.get(i).getCount());

			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getCount());
		}
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

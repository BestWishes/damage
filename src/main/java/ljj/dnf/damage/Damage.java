package ljj.dnf.damage;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Damage
 */
@WebServlet("/Damage")
public class Damage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Damage() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Enumeration<String> parameters=request.getParameterNames();
		response.setContentType("application/json;charset=UTF-8");
//		response.getWriter().write("1");
		String zhiye=request.getParameter("zhiye");
		Double oldpower=Double.valueOf(request.getParameter("oldpower"));
		Double oldshuxin=Double.valueOf(request.getParameter("oldshuxin"));
		Double oldfujia=Double.valueOf(request.getParameter("oldfujia"));
		Double oldzengjia=Double.valueOf(request.getParameter("oldzengjia"));
		Double oldbaoji=Double.valueOf(request.getParameter("oldbaoji"));
		Double oldbaojilv=Double.valueOf(request.getParameter("oldbaojilv"));
		
		Double power=Double.valueOf(request.getParameter("power"));
		Double shuxin=Double.valueOf(request.getParameter("shuxin"));
		Double fujia=Double.valueOf(request.getParameter("fujia"));
		Double zengjia=Double.valueOf(request.getParameter("zengjia"));
		Double baoji=Double.valueOf(request.getParameter("baoji"));
		Double baojilv=Double.valueOf(request.getParameter("baojilv"));
		if(zhiye.equals("dulizhiye")){
			Double oldduli=Double.valueOf(request.getParameter("oldduli"));
			Double duli=Double.valueOf(request.getParameter("duli"));

		}else{
			Double oldduli=Double.valueOf(request.getParameter("oldgongji"));
			Double duli=Double.valueOf(request.getParameter("gongji"));
			Double oldwushi=Double.valueOf(request.getParameter("oldwushi"));
			Double wushi=Double.valueOf(request.getParameter("wushi"));
		}

		
	}
	
}

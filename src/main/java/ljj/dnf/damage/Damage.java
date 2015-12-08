package ljj.dnf.damage;

import java.io.IOException;
import java.text.NumberFormat;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

		Double result=1.0d;
		Double oldresult=1.0d;
		//职业（百分比、固伤）
		String zhiye=request.getParameter("zhiye");
		
		//属性强化
		Double oldshuxin=Double.valueOf(request.getParameter("oldshuxin"));
		//附加伤害
		Double oldfujia=Double.valueOf(request.getParameter("oldfujia"))/100.0;
		//增加伤害
		Double oldzengjia=Double.valueOf(request.getParameter("oldzengjia"))/100.0;
		//增加暴击伤害
		Double oldbaoji=Double.valueOf(request.getParameter("oldbaoji"))/100.0;
		//暴击率
		Double oldbaojilv=Double.valueOf(request.getParameter("oldbaojilv"))/100.0;
		//怪物属性抗性
		Double oldkangxing=Double.valueOf(request.getParameter("oldkangxing"));
		//怪物减伤
		Double oldjianshang=Double.valueOf(request.getParameter("oldjianshang"))/100.0;
		
		
		Double shuxin=Double.valueOf(request.getParameter("shuxin"));
		Double fujia=Double.valueOf(request.getParameter("fujia"))/100.0;
		Double zengjia=Double.valueOf(request.getParameter("zengjia"))/100.0;
		Double baoji=Double.valueOf(request.getParameter("baoji"))/100.0;
		Double baojilv=Double.valueOf(request.getParameter("baojilv"))/100.0;
		Double kangxing=Double.valueOf(request.getParameter("kangxing"));
		Double jianshang=Double.valueOf(request.getParameter("jianshang"))/100.0;
		
		if(zhiye.equals("dulizhiye")){
			//力量
			Double oldpower=Double.valueOf(request.getParameter("oldpower"));
			Double power=Double.valueOf(request.getParameter("power"));
			//独立
			Double oldduli=Double.valueOf(request.getParameter("oldduli"));
			Double duli=Double.valueOf(request.getParameter("duli"));
			
			oldresult= (1+oldduli/1000)*(1+oldpower/2500)*(1+(oldshuxin-oldkangxing)/220)*(oldbaojilv*(1.5+oldbaoji)+(1-oldbaojilv))*(1-oldjianshang)*(1+oldzengjia)*(1+oldfujia*(oldbaojilv*(1.5+oldbaoji)+(1-oldbaojilv)));
			result=(1+duli/1000)*(1+power/2500)*(1+(shuxin-kangxing)/220)*(baojilv*(1.5+baoji)+(1-baojilv))*(1-jianshang)*(1+zengjia)*(1+fujia*(baojilv*(1.5+baoji)+(1-baojilv)));

			
		}else{
			//面板基础攻击
			Double oldgongji=Double.valueOf(request.getParameter("oldgongji"));
			Double gongji=Double.valueOf(request.getParameter("gongji"));
			//无视攻击
			Double oldwushi=Double.valueOf(request.getParameter("oldwushi"));
			Double wushi=Double.valueOf(request.getParameter("wushi"));
			
			oldresult= ((oldgongji*(1+(oldshuxin-oldkangxing)/220.0)*(1-oldjianshang))+oldwushi)*(oldbaojilv*(1.5+oldbaoji)+(1-oldbaojilv))*(1+oldzengjia)*(1+oldfujia*(oldbaojilv*(1.5+oldbaoji)+(1-oldbaojilv)));
			result=((gongji*(1+(shuxin-kangxing)/220.0)*(1-jianshang))+wushi)*(baojilv*(1.5+baoji)+(1-baojilv))*(1+zengjia)*(1+fujia*(baojilv*(1.5+baoji)+(1-baojilv)));
		}
		NumberFormat numberFormat=NumberFormat.getPercentInstance();
		numberFormat.setMinimumFractionDigits(2);
		System.out.println(numberFormat.format(result/oldresult-1));
		response.getWriter().write(String.valueOf(numberFormat.format(result/oldresult-1)));
	}

}

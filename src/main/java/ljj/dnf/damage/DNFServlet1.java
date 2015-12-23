package ljj.dnf.damage;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import ljj.dnf.damage.util.DateUtil;

public class DNFServlet1 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println(DateUtil.getDateString()+":销毁servlet \n");
		super.destroy();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(DateUtil.getDateString()+":post\n");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(DateUtil.getDateString()+":get\n");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(DateUtil.getDateString()+": getRemoteAddr: "+req.getRemoteAddr());
		System.out.println(DateUtil.getDateString()+": getRemotePort: "+req.getRemotePort());
		System.out.println(DateUtil.getDateString()+": getRequestURI: "+req.getRequestURI());
		System.out.println(DateUtil.getDateString()+": getRequestURL: "+req.getRequestURL());
		System.out.println(DateUtil.getDateString()+": getRequestedSessionId: "+req.getRequestedSessionId());
		System.out.println(DateUtil.getDateString()+": getContentType: "+req.getContentType());
		System.out.println(DateUtil.getDateString()+": getCharacterEncoding: "+req.getCharacterEncoding());
		System.out.println(DateUtil.getDateString()+": getAuthType: "+req.getAuthType());
		System.out.println(DateUtil.getDateString()+": getContentLength: "+req.getContentLength());
		System.out.println(DateUtil.getDateString()+": getContextPath: "+req.getContextPath());
		System.out.println(DateUtil.getDateString()+": getDateHeader: "+req.getDateHeader(""));
		System.out.println(DateUtil.getDateString()+": getHeader: "+req.getHeader(""));
		System.out.println(DateUtil.getDateString()+": getIntHeader: "+req.getIntHeader(""));
		System.out.println(DateUtil.getDateString()+": getLocalAddr: "+req.getLocalAddr());
		System.out.println(DateUtil.getDateString()+": getLocalName: "+req.getLocalName());
		System.out.println(DateUtil.getDateString()+": getLocalPort: "+req.getLocalPort());
		System.out.println(DateUtil.getDateString()+": getMethod: "+req.getMethod());
		System.out.println(DateUtil.getDateString()+": getPathInfo: "+req.getPathInfo());
		System.out.println(DateUtil.getDateString()+": getPathTranslated: "+req.getPathTranslated());
		System.out.println(DateUtil.getDateString()+": getProtocol: "+req.getProtocol());
		System.out.println(DateUtil.getDateString()+": getQueryString: "+req.getQueryString());
		System.out.println(DateUtil.getDateString()+": getScheme: "+req.getScheme());
		System.out.println(DateUtil.getDateString()+": getServerName: "+req.getServerName());
		System.out.println(DateUtil.getDateString()+": getServerPort: "+req.getServerPort());
		System.out.println(DateUtil.getDateString()+": getServletPath: "+req.getServletPath());
		System.out.println(DateUtil.getDateString()+": getAsyncContext: "+req.getAsyncContext());
		System.out.println(DateUtil.getDateString()+": getAttributeNames: "+req.getAttributeNames());
		System.out.println(DateUtil.getDateString()+": getClass: "+req.getClass());
		System.out.println(DateUtil.getDateString()+": getCookies: "+req.getCookies());
		System.out.println(DateUtil.getDateString()+": getDispatcherType: "+req.getDispatcherType());
		System.out.println(DateUtil.getDateString()+": getHeaderNames: "+req.getHeaderNames());
		System.out.println(DateUtil.getDateString()+": getLocale: "+req.getLocale());
		System.out.println(DateUtil.getDateString()+": getLocales: "+req.getLocales());
		System.out.println(DateUtil.getDateString()+": getParameterMap: "+req.getParameterMap());
		System.out.println(DateUtil.getDateString()+": getParameterNames: "+req.getParameterNames());
		System.out.println(DateUtil.getDateString()+": getParts: "+req.getParts());
		System.out.println(DateUtil.getDateString()+": getSession: "+req.getSession());
		System.out.println(DateUtil.getDateString()+": getLocalAddr: "+req.getLocalAddr());

		System.out.println(DateUtil.getDateString()+"\n");
		System.err.println(this.getServletContext().getRealPath("/"));

		super.service(req, resp);
	}
}

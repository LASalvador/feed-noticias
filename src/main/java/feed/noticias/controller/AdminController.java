package feed.noticias.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/admin"})
public class AdminController extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = -991105780241624387L;

    @Override
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		try{
			req.getRequestDispatcher("/WEB-INF/admin.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}	
}

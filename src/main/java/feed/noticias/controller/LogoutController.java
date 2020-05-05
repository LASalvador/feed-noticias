package feed.noticias.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/sair"})
public class LogoutController extends HttpServlet {
   
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try{
            HttpSession session= req.getSession(false);
            if (session != null) {
                session.invalidate();
            }

            res.sendRedirect(req.getContextPath() + "/feed");
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}
}
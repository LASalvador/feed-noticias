/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package feed.noticias.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import feed.noticias.model.NoticiaDAO;
import feed.noticias.model.Noticia;

import java.util.List;

@WebServlet(urlPatterns={"/feed"})
public class FeedController extends HttpServlet {	
	/**
	 *
	 */
	private static final long serialVersionUID = 8818607052067640463L;

	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		
		List<Noticia> noticias = NoticiaDAO.getInstance().findAll();
		req.setAttribute("noticias", noticias);
		
		try{
			req.getRequestDispatcher("/WEB-INF/feed.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}	
}
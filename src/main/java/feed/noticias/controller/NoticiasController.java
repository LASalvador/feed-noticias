/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package feed.noticias.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import java.util.List;

import feed.noticias.model.NoticiaDAO;
import feed.noticias.model.Noticia;

@WebServlet(urlPatterns={"/noticias"})
public class NoticiasController extends HttpServlet {	
	/**
	 *
	 */
	private static final long serialVersionUID = 8818607052067640463L;

	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		List<Noticia> noticias = NoticiaDAO.getInstance().findAll();
		
		req.setAttribute("noticias", noticias);
		
		try{
			req.getRequestDispatcher("/WEB-INF/noticias.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}	
}

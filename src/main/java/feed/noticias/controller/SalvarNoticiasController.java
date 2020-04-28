/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package feed.noticias.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import feed.noticias.resources.NoticiaBuilder;
import feed.noticias.model.Noticia;
import feed.noticias.model.NoticiaDAO;

@WebServlet(urlPatterns = { "/salvar" })
public class SalvarNoticiasController extends HttpServlet {
	/**
	 *
	 */
	private static final long serialVersionUID = 8818607052062640463L;

	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
	
		try{
			String id = req.getParameter("id");
			if(id != null) {
				Long LongId  = Long.parseLong(id);
				Noticia noticia = NoticiaDAO.getInstance().find(LongId);

				req.setAttribute("noticia", noticia);
			}

			req.getRequestDispatcher("/WEB-INF/salvar.jsp").forward(req, res);
		} catch (Exception e){
			e.printStackTrace();
		}
	}	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Map<String, String> messages = new HashMap<String, String>();
		req.setAttribute("messages", messages);

		String titulo = req.getParameter("titulo");
		String corpo = req.getParameter("corpo");

		NoticiaBuilder nBuilder = new NoticiaBuilder().iniciar().comTitulo(titulo).comCorpo(corpo);
		Noticia noticia = nBuilder.criarNoticia();

		NoticiaDAO.getInstance().persist(noticia);
	
		messages.put("success", String.format("Noticia salva com sucesso"));				
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Map<String, String> messages = new HashMap<String, String>();
		req.setAttribute("messages", messages);

		Long id = Long.parseLong(req.getParameter("id"));
		String titulo = req.getParameter("titulo");
		String corpo = req.getParameter("corpo");

		NoticiaBuilder nBuilder = new NoticiaBuilder().iniciar().comId(id).comTitulo(titulo).comCorpo(corpo);
		Noticia noticia = nBuilder.criarNoticia();

		NoticiaDAO.getInstance().merge(noticia);
	
		messages.put("success", String.format("Noticia salva com sucesso"));				
	}
}

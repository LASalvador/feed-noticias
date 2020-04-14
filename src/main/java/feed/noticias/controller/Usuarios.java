/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package feed.noticias.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/usuarios"})
public class Usuarios extends HttpServlet {	
	/**
	 *
	 */
	private static final long serialVersionUID = 8818607051067640463L;

	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try{
			req.getRequestDispatcher("/WEB-INF/usuarios.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}	
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package feed.noticias.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import feed.noticias.model.UsuarioDAO;
import feed.noticias.model.Usuario;


@WebServlet(urlPatterns={"/login"})
public class LoginController extends HttpServlet {	
	/**
	 *
	 */
	private static final long serialVersionUID = 8818607052067640463L;

	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try{
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			String email = req.getParameter("email");
			String senha = req.getParameter("senha");
		
			if (UsuarioDAO.getInstance().validate(email, senha)) {
				Usuario usuario = UsuarioDAO.getInstance().findByEmail(email);

				HttpSession session= req.getSession();  
				session.setAttribute("uname",usuario.getNome());
				if (usuario.getAdmin()) {
					session.setAttribute("ux", usuario.getAdmin());
					resp.sendRedirect(req.getContextPath() + "/admin");
				} else {
					resp.sendRedirect(req.getContextPath() + "/feed");
				}


			} else {
				req.setAttribute("message", "Erro ao realizar logar. Verifique email e senha e tente novamente");
				req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
			}

		} catch (Exception e) {
			System.out.println("Erro em IO ou no Servlet");
		}
	}
}

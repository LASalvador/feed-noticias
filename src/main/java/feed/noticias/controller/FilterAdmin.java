package feed.noticias.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter(urlPatterns = { "/noticias", "/salvar", "usuarios" })
// @WebFilter(servletNames = {"NoticiasController" , "UsuariosController","SalvarNoticiasController"})
public class FilterAdmin implements Filter {

    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {
        final HttpServletRequest req = (HttpServletRequest) request;
        final HttpSession session = req.getSession();
        final Boolean isAdmin = (Boolean) session.getAttribute("ux");
        System.out.println("isAdmin -=====" + isAdmin);
        if (isAdmin) {
            chain.doFilter(request, response);
        } else {
            HttpServletResponse res = (HttpServletResponse) response;
            res.sendRedirect(req.getContextPath() + "/feed");
        }
        
    }

    @Override
    public void destroy() {
    }
        
}
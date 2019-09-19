package br.com.fiap.avenger.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.avenger.dao.UsuarioDAO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UsuarioDAO dao_usu = null;
		try {
			dao_usu = new UsuarioDAO();
			
			if (dao_usu.getUser(req.getParameter("email"), req.getParameter("senha")) == 0) {
				System.out.println("Usuario não encontrado");
			} else {
				System.out.println("Usuario encontrado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dao_usu.encerrar();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}	
}

package br.com.fiap.avenger.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.avenger.dao.UsuarioDAO;
import br.com.fiap.avenger.model.Usuario;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UsuarioDAO dao_usu = null;
		try {
			dao_usu = new UsuarioDAO();			
			Usuario u = new Usuario(); 

			u.setNome_usuario(req.getParameter("nome")); 
			u.setEmail_usuario(req.getParameter("email"));  
			u.setSenha_usuario(req.getParameter("senha")); 
			if(dao_usu.addUser(u) == 0) {
				System.out.println("Usuario não cadastrado");
			} else {
				System.out.println("Usuario cadastrado com sucesso");
			}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					dao_usu.encerrar();
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
}

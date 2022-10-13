package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlterarEmpresa;
import br.com.alura.gerenciador.acao.ListarEmpresas;
import br.com.alura.gerenciador.acao.MostrarEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoverEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		String parametroAcao = request.getParameter("acao");
		
		if (parametroAcao.equals("ListarEmpresas")) {
			ListarEmpresas acao = new ListarEmpresas();
			acao.executar(request, response);
		} else if (parametroAcao.equals("RemoverEmpresa")) {
			RemoverEmpresa acao = new RemoverEmpresa();
			acao.executar(request, response);
		} else if (parametroAcao.equals("MostrarEmpresa")) {
			MostrarEmpresa acao = new MostrarEmpresa();
			acao.executar(request, response);
		} else if (parametroAcao.equals("AlterarEmpresa")) {
			AlterarEmpresa acao = new AlterarEmpresa();
			acao.executar(request, response);
		} else if (parametroAcao.equals("NovaEmpresa")) {
			NovaEmpresa acao = new NovaEmpresa();
			acao.executar(request, response);
		}
	}
}

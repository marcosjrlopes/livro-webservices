/**
 * 
 */
package br.com.livro.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.livro.domain.Carro;
import br.com.livro.domain.CarroService;

/**
 * @author M12
 *
 */
@WebServlet("/carros-serv/*")
public class CarroServlet extends HttpServlet {

	private static final long serialVersionUID = 2027652962859907592L;
	private CarroService carroService = new CarroService();	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		/// CONSULTAR TODOS OS CARROS:
		List<Carro> carros = carroService.getCarros();
		
		///GERAR UMA STRING COM TODOS OS CARROS:
		String carroString = carros.toString();
		
		/// ESCREVER A RESPOSTA DO SERVLET.
		resp.getWriter().write(carroString);
		
		
	}
	
}

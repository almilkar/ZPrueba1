// https://support.smartbear.com/testcomplete/docs/tutorials/samples/common/web-service-testing.html


package app1;


import java.io.BufferedReader;
// -----------------------------------------
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
// ------------------------------------------
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// -------------------------------------------


/**
 * Servlet implementation class Prueba1
 */
@WebServlet("/Prueba1")
public class Prueba1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prueba1() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Ruta de servicio: ").append(request.getContextPath());
		String s="";
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>Hola Samarkanda</h1>");
		
		String fichero = request.getParameter("fichero");
		
		ServletContext contexto = getServletContext();
		System.out.println(contexto.getContextPath());
	
		InputStream input = contexto.getResourceAsStream(fichero);
	
		if (input != null) {
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
		while ((s = br.readLine()) != null)
				out.println("<p>" + s + "</p>");
		br.close();
		}
		
		DBConexion conn = new DBConexion();
		try {
			conn.conectarDB();
			conn.leerPhysicians();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}


	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}
	
	
	
	

}

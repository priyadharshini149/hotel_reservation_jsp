

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class room
 */
@WebServlet("/room")
public class room extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public room() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		int amount=0;
		PrintWriter out=response.getWriter();
		String name=request.getParameter("textF");
		String namel=request.getParameter("textl");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String check_in=request.getParameter("ci");
		String check_out=request.getParameter("co");
		String guest=request.getParameter("guest");
		String address=request.getParameter("addr");
		String roomtype=request.getParameter("rt");
		if(roomtype.equals("duplex"))
		{
			amount=1500;
		}
		else if(roomtype.equals("standard"))
		{
			amount=2000;
		}
		else if(roomtype.equals("suit"))
		{
			amount=3000;
		}
	out.print("<!DocType html>\r\n"
			+ "<html>\r\n"
			+ "<head>\r\n"
			+ "<title>Login page</title>\r\n"
			+ "\r\n"
			+"<link href=\"https://fonts.googleapis.com/css2?family=Ceviche+One&family=Merienda&display=swap\" rel=\"stylesheet\">"
			+ "  <style> \r\n"
			+ "     *{\r\n"
			+ "       margin:0;\r\n"
			+ "       padding:0;\r\n"
			+ "     }\r\n"
			+ "    \r\n"
			+ "     \r\n"
			+ "     .d2{\r\n"
			+ "       width:550px;\r\n"
			+ "       height:715px;\r\n"
			+ "       position:relative;\r\n"
			+ "       margin:1% auto ;\r\n"
			+ "       background:#fff;\r\n"
			+ "       padding:10px;\r\n"
			+ "       border:2px solid black;\r\n"
			+ "     }\r\n"
			+ "     \r\n"
			+ "     .d3{\r\n"
			+ "       width:275px;\r\n"
			+ "       margin:1px auto;\r\n"
			+ "       position:relative;\r\n"
			+ "       border-radius:60px;\r\n"
			+ "       }\r\n"
			+ "       \r\n"
			+ "     \r\n"
			+ "     \r\n"
			+ "      .title{\r\n"
			+ "       top:400px;\r\n"
			+ "       position:absolute;\r\n"
			+ "       right:3px;\r\n"
			+ "       margin:2% auto ;\r\n"
			+ "       width:305px;\r\n"
			+ "       \r\n"
			+ "       }\r\n"
			+ "      \r\n"
			+ "      p{\r\n"
			+ "       color:black;\r\n"
			+ "       text-align:center;\r\n"
			+ "       }\r\n"
			+ "       \r\n"
			+ "      .d1{\r\n"
			+ "       height:100%;\r\n"
			+ "       width:100%;\r\n"
			+ "       background:linear-gradient(#8700CA,#000000);\r\n"
			+ "       background-size:cover;\r\n"
			+ "       position:absolute;\r\n"
			+ "       }\r\n"
			+ "       \r\n"
			+ "       .b{\r\n"
			+ "       position:absolute;\r\n"
			+ "       top:55%;\r\n"
			+ "       left:55%;\r\n"
			+ "       }\r\n"
			+ "       a:hover{font-size:30pt }\r\n"
			+ "         \r\n"
			+ "   .p1{\r\n"
			+ "  width:80%;\r\n"
			+ "  padding:10px 30px;\r\n"
			+ "  margin:auto;\r\n"
			+ "  background:#8700CA;\r\n"
			+ "\r\n"
			+ "  border:2px solid black;\r\n"
			+ "  outline:black;\r\n"
			+ "  border-radius:30px;\r\n"
			+ "  }\r\n"
			+ "   .f1{\r\n"
			+ "       top:180px;\r\n"
			+ "       position:absolute;\r\n"
			+ "       font-family: Times New Roman;\r\n"
			+ "       font-size:57px;\r\n"
			+ "       left:190px;\r\n"
			+ "       width:1025px;\r\n"
			+ "       }\r\n"
			+ "h3{\r\n color:#8700CA;font-family: 'Merienda', cursive; \r\n}"
			+ "h1{\r\n font-family: 'Merienda', cursive; \r\n}"
			+ "hr{\r\n  border-color: #000000;border:none;border-bottom:1px solid black;margin-bottom:10px \r\n}"
			+ "     \r\n"
			+ "</style>\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "\r\n"
			+ "   \r\n"
			+ "<div class=\"d1\">\r\n"
			+ "<div class=\"d2\">\r\n"
			+ "<div class=\"d3\">");
	out.print("<center><h1 >User details</h1></center><br><br>");
	out.print("<h3><div style='color:black;'> Name:</div>  "+ name+" "+namel+"</h3><hr>");
	out.print("<h3> <div style='color:black;'>Phone:</div>  "+phone+"</h3><hr>");
	out.print("<h3><div style='color:black;'> Email:</div> "+email+" </h3><hr>");
	out.print("<h3><div style='color:black;'> Check in:</div> "+check_in+" </h3><hr>");
	out.print("<h3><div style='color:black;'> Check out:</div>  "+check_out+" </h3><hr>");
	out.print("<h3><div style='color:black;'> no.of Guest:</div>  "+guest+"</h3><hr>");
	out.print("<h3> <div style='color:black;'>room type:</div>  "+roomtype+"</h3><hr>");
	out.print("<h3><div style='color:black;'> address:</div>  "+address+" </h3><hr>");
	out.print("<center><h3 style='color:green;font-size:20px'> amount:  "+amount+" </h3></center>");
	out.print("<br><center><button type=\"button\" style=\"color:white;\"class=\"p1\"onclick=\"location.href='payment.html'\">proceed with payment</button></center>");
	out.print("</div>\r\n"
			+ "\r\n"
			+ "</div>\r\n"
			+ "</div>\r\n"
			+ "\r\n"
			+ "</body>\r\n"
			+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

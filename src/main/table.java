

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
@WebServlet("/table")
public class table extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public table() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
int amount=0;
int tablenumber=0;
String name=request.getParameter("textF");
		
		String fam_cou=request.getParameter("sel");
		String guest=request.getParameter("textg");
		String place=request.getParameter("Place");
		if(place.equals("In"))
		{
			 tablenumber=(int)(((Math.random())*50)+1);
		}
		else if(place.equals("Out"))
		{
			 tablenumber=(int)(((Math.random())*20)+1);
		}
		String datetime=request.getParameter("datetime");
		
		String dish[]=request.getParameterValues("dish");
		 for(String name1 : dish) {
			if(name1.equals("Briyani"))
			{
				amount+=200;
			}
			else if(name1.equals("Chicken Curry"))
			{
				amount+=1000;
			}
			else if(name1.equals("Chicken Leg"))
			{
				amount+=500;
			}
			else if(name1.equals("Dosa"))
			{
				amount+=800;
			}
			else if(name1.equals("Mutton Gravy"))
			{
				amount+=500;
			}
			else if(name1.equals("Chick Chilly"))
			{
				amount+=600;
			}
			else if(name1.equals("Kadai varuval"))
			{
				amount+=100;
			}
			else if(name1.equals("fish briyani"))
			{
				amount+=300;
			}
			else if(name1.equals("fish fry"))
			{
				amount+=800;
			}
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
			+ "       height:710px;\r\n"
			+ "       position:relative;\r\n"
			+ "       margin:2% auto ;\r\n"
			+ "       background:#fff;\r\n"
			+ "       padding:0px;\r\n"
			+ "       border:2px solid black;\r\n"
			+ "     }\r\n"
			+ "     \r\n"
			+ "     .d3{\r\n"
			+ "       width:275px;\r\n"
			+ "       margin:35px auto;\r\n"
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
			+ "  width:85%;\r\n"
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
out.print("<h3> <div style='color:black;'>Name:</div> "+name +" </h3><hr>");
	
	out.print("<h3><div style='color:black;'> Famil/Couple:</div>  "+fam_cou+" </h3><hr>");
	out.print("<h3><div style='color:black;'> Guest: </div>"+guest+" </h3><hr>");
	out.print("<h3><div style='color:black;'> Place: </div>"+place+" </h3><hr>");
	out.print("<h3><div style='color:black;'> Date and Time:</div> "+datetime+" </h3><hr>");
	 out.print("<h3><div style='color:black;'> Dish:</div> ");
	 for(String name1 : dish) {
		out.print(name1+",  ");
	 }
	 
	out.print("</h3><hr>");
	out.print("<div style='padding:10px;text-align:center;'><h3 style='color:green;font-size:20px'> table number: "+tablenumber +" </h3><br>");
	out.print("<h3 style='color:green;font-size:20px'> amount:  "+amount+" </h3></div>");

	
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

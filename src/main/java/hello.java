

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hello
 */
@WebServlet("/hello")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getMethod().equals("HEAD"))
		{
			return;
		}
		else {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
String name=request.getParameter("textF");
		
		
		
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<title>home</title>\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "<style>\r\n"
				+ "body {\r\n"
				+ "  font-family: Arial, Helvetica, sans-serif;\r\n"
				+ "  margin: 0;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "html {\r\n"
				+ "  box-sizing: border-box;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "*, *:before, *:after {\r\n"
				+ "  box-sizing: inherit;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".column {\r\n"
				+ "  float: left;\r\n"
				+ "  width: 30.3%;\r\n"
				+ "  margin-bottom: 16px;\r\n"
				+ "  padding: 0 8px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".card {\r\n"
				+ "  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);\r\n"
				+ "  margin: 8px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".header {\r\n"
				+ "  padding: 50px;\r\n"
				+ "  text-align: center;\r\n"
				+ "  background:black;\r\n"
				+ "  color: white;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".container {\r\n"
				+ "  padding: 0 16px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".container::after, .row::after {\r\n"
				+ "  content: \"\";\r\n"
				+ "  clear: both;\r\n"
				+ "  display: table;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".title {\r\n"
				+ "  color: grey;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "\r\n"
				+ " {\r\n"
				+ "  .column {\r\n"
				+ "    width: 100%;\r\n"
				+ "    display: block;\r\n"
				+ "  }\r\n"
				+ "}\r\n"
				+ "body {\r\n"
				+ "  background:linear-gradient(#8700CA,#000000);\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".content {\r\n"
				+ "  max-width: 80%;\r\n"
				+ "  margin: auto;\r\n"
				+ "  background: white;\r\n"
				+ "  padding: 10px;\r\n"
				+ "}\r\n"
				+ ".sidenav {\r\n"
				+ "  height: 100%;\r\n"
				+ "  width: 105px;\r\n"
				+ "  position: fixed;\r\n"
				+ "  z-index: 1;\r\n"
				+ "  top: 0;\r\n"
				+ "  left: 0;\r\n"
				+ "  background-color: #111;\r\n"
				+ " \r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "\r\n"
				+ ".sidenav a {\r\n"
				+ "  color: white;\r\n"
				+ "  padding: 20px;\r\n"
				+ "  text-decoration: none;\r\n"
				+ "  display: block;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".sidenav a:hover {\r\n"
				+ "  background-color: #ddd;\r\n"
				+ "  color: black;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".content {\r\n"
				+ "  margin-left: 200px;\r\n"
				+ "  padding-left: 20px;\r\n"
				+ "}\r\n"
				+ "img {\r\n"
				+ "  border-radius: 8px;\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<div class=\"header\">\r\n"
				
			);
		out.println("<h2> Welcome "+name+"</h2>");
		out.println(" <h1>Hotel management</h1>\r\n"
				+ "  <p>\"Courteous treatment will make a customer a walking advertisement”</p>\r\n"
				+ "</div>\r\n"
				+ "<br><br><br><br><br><br><br>\r\n"
				+ "<div class=\"header\">\r\n"
				+ "<center><br>\r\n"
				+ "  <img src=\"https://images.unsplash.com/photo-1566073771259-6a8506099945?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8aG90ZWx8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80\" alt=\"P1\" width=\"1000\" height=\"400\"><br><br>\r\n"
				+ "  <pre style=\"font-size:20px\">\"Simple exchanges can break walls down between us, for when people come together and speak\r\n"
				+ "  to one another and share a common experience, then their common humanity is revealed.”</pre>\r\n"
				+ "  </center><br>\r\n"
				+ "</div>\r\n"
				+ "<div class=\"sidenav\">\r\n"
				+ "  \r\n"
				+ "  <a href=\"#places\">BRANCH</a>\r\n"
				+ "  <a href=\"home.html\">HOME</a>\r\n"
				
				
				+ "   <a href=\"room.html\">ROOM BOOKING</a>\r\n"
				+ "    <a href=\"table.html\">TABLE BOOKING</a>\r\n"
				+ "</div>\r\n"
				+ "<br><br><br><br><br><br>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "<div class=\"header\" id=\"places\">\r\n"
				+ "  <h1>BRANCH</h1>\r\n"
				+ "  <p><p>\"Change your language and you change your thoughts”</p>\r\n"
				+ "  </div>\r\n"
				+ "<div class=\"content\" >\r\n"
				+ "<div class=\"row\">\r\n"
				+ "  <div class=\"column\">\r\n"
				+ "    <div class=\"card\">\r\n"
				+ "      <img src=\"https://images.hdqwalls.com/download/france-paris-city-4k-im-2560x1440.jpg\" alt=\"M6\" style=\"width:100%\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "        <h2>Paris</h2>\r\n"
				+ "        <p class=\"title\">City of light</p>\r\n"
				+ "        <p>“To study in Paris is to be born in Paris!”</p>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "\r\n"
				+ "<div class=\"column\">\r\n"
				+ "    <div class=\"card\">\r\n"
				+ "      <img src=\"https://wallpaperaccess.com/full/52907.jpg\" alt=\"M2\" style=\"width:100%\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "        <h2>Unites States</h2>\r\n"
				+ "        <p class=\"title\">the land of the free</p>\r\n"
				+ "        <p>“America is a vast conspiracy to make you happy.”</p>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "  <div class=\"column\">\r\n"
				+ "    <div class=\"card\">\r\n"
				+ "      <img src=\"https://images.unsplash.com/photo-1533929736458-ca588d08c8be?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8dG93ZXIlMjBicmlkZ2UlMjBsb25kb258ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80\" alt=\"M5\" style=\"width:100%\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "        <h2>London</h2>\r\n"
				+ "        <p class=\"title\">the city of London</p>\r\n"
				+ "        <p>\"London is a modern Babylon\"</p>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "  <center><br><br><br><br>\r\n"
				+ "  <img src=\"https://ntbrand-wp.s3.amazonaws.com/worldoftravel/wp-content/uploads/2021/03/31102028/My_World_Paris_59079f6834a4f50d46219cca.jpeg\" alt=\"P2\" width=\"800\" height=\"300\">\r\n"
				+ "  </center><br><br><br><br>\r\n"
				+ "  <div class=\"column\">\r\n"
				+ "    <div class=\"card\">\r\n"
				+ "      <img src=\"https://wallpaperaccess.com/full/123346.jpg\" alt=\"M2\" style=\"width:100%\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "        <h2>New York</h2>\r\n"
				+ "        <p class=\"title\">I Love NY</p>\r\n"
				+ "        <p>One can’t paint New York as it is, but rather as it is felt. </p>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ " \r\n"
				+ "  <div class=\"column\">\r\n"
				+ "    <div class=\"card\">\r\n"
				+ "      <img src=\"https://images.unsplash.com/photo-1519832979-6fa011b87667?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8Y2FuYWRhfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80\" alt=\"M3\" style=\"width:100%\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "        <h2>Canada</h2>\r\n"
				+ "        <p class=\"title\">Canadian</p>\r\n"
				+ "        <p>“Canada is free and freedom is its nationality.”</p>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "\r\n"
				+ "  <div class=\"column\">\r\n"
				+ "    <div class=\"card\">\r\n"
				+ "      <img src=\"https://i5.walmartimages.com/asr/5a7ab827-b300-4891-9601-1eb33558273d_1.f79613b48105b6edd7a6ca71ac9e7a17.jpeg\" alt=\"M4\" style=\"width:100%\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "        <h2>South Korea</h2>\r\n"
				+ "        <p class=\"title\">land of kimchi, K-pop, K-dramas</p>\r\n"
				+ "        <p>\"Whatever the mind of man can conceive and believe, it can achieve.\"</p>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "  <center><br><br><br><br>\r\n"
				+ "  <img src=\"https://free4kwallpapers.com/uploads/originals/2015/10/25/boston-at-dusk-wallpaper.jpg\" alt=\"P3\" width=\"800\" height=\"300\">\r\n"
				+ "  </center><br><br><br><br>\r\n"
				+ " \r\n"
				+ "  <div class=\"column\">\r\n"
				+ "    <div class=\"card\">\r\n"
				+ "      <img src=\"https://wallup.net/wp-content/uploads/2017/11/17/286894-Japan-city-748x468.jpg\" alt=\"M1\" style=\"width:100%\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "        <h2>Japan</h2>\r\n"
				+ "        <p class=\"title\">Land of the Rising sun</p>\r\n"
				+ "        <p>“Fall seven times, get up eight.” </p>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "  <div class=\"column\">\r\n"
				+ "    <div class=\"card\">\r\n"
				+ "      <img src=\"https://c4.wallpaperflare.com/wallpaper/358/204/54/amazing-city-view-of-melbourne-australia-hd-photos-wallpaper-preview.jpg\" alt=\"M2\" style=\"width:100%\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "        <h2>Australia</h2>\r\n"
				+ "        <p class=\"title\">Its natural wonders</p>\r\n"
				+ "        <p>“Australia is just so full of surprises.”</p>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ " \r\n"
				+ "   <div class=\"column\">\r\n"
				+ "    <div class=\"card\">\r\n"
				+ "      <img src=\"https://wallup.net/wp-content/uploads/2017/11/23/423382-architecture-building-Germany-water-bridge-Dresden-748x421.jpg\" alt=\"M2\" style=\"width:100%\">\r\n"
				+ "      <div class=\"container\">\r\n"
				+ "        <h2>Germany</h2>\r\n"
				+ "        <p class=\"title\">heart of Western Europe</p>\r\n"
				+ "        <p>“German is only romantic if you have a past in it.”</p>\r\n"
				+ "      </div>\r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "  </div>\r\n"
				+ " \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "</div>\r\n"
				+ "</div>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "");
	
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

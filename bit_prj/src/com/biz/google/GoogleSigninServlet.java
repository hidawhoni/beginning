package com.biz.google;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GoogleSigninServlet
 */
@WebServlet("/google_auth")
public class GoogleSigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GoogleSigninServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.직접 소켓 통신(JAVA jdk)
		//2.google API Client Libraries(google_client_api.jar)
		
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

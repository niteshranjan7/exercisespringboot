package com.webapplication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //redirect request to jsp
        request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);

        //Pass a request parameter(what we have passed between the browser and the web application server)
        String name = request.getParameter("name");

        //Pass this name(as an attribute) to the JSP
        request.setAttribute("name", name);


        //Simple printing purpose
        /*PrintWriter writer = response.getWriter();
        writer.println("Dummy Stuff");
        writer.println("Dummy Stuff2");*/

    }

}

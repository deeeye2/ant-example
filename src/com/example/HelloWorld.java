package com.example;

import java.io.IOException;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {
    public String getMessage() {
        return "Hello, TestNG!";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}


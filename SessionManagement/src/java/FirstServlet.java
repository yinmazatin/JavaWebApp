/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sambo visal
 */
public class FirstServlet extends HttpServlet {

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        
        if(name.equals("pisal")&&pass.equals("123")){
            RequestDispatcher d = request.getRequestDispatcher("SecondServlet");
            //d.forward(request, response);
            d.include(request, response);
        }else{
            RequestDispatcher dd = request.getRequestDispatcher("index.html");
            PrintWriter w = response.getWriter();
            w.println("Wrong pass or Username");
            dd.forward(request, response);
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

 



}

package app.component;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Intrest")
public class intrestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int p =  Integer.parseInt(req.getParameter("principle"));
        int r =  Integer.parseInt(req.getParameter("rate"));
        int t =  Integer.parseInt(req.getParameter("period"));
        int I = (p * r * t)/100;
        resp.setContentType("text/html");
        resp.getWriter().printf("""
            <html>
            <head>
                <title>Intrest</title>
            </head>
            <h1>Intrest</h1>
            <b>Principle is:%d</b><br/>
            <b>Rate is:%d</b><br/>
            <b>Period is:%d</b><br/>
            <b>Intrest is :%d </b><br/>
        </html>
                """,p,r,t,I);
    }


    
    
}

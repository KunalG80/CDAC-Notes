package main.java.app.components;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class hitcounterServlet extends HttpServlet {
    private AtomicInteger greetings = new AtomicInteger();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String visitor = request.getParameter("user");
        if(visitor.length() == 0)
            visitor = "Guest";
        var session = request.getSession(true);
        var count = (Integer)session.getAttribute(visitor);
        if(count == null)
            count = 0;
        response.setContentType("text/html");
        response.getWriter().printf("""
            <html>
                <head>
                    <title>HitCounter</title>
                </head>
                <h1>Hello %s</h1>
                <b>Number of hit: </b>%d/%d
            </html>
            """, visitor, ++count, greetings.incrementAndGet());
            session.setAttribute(visitor, count);
    }
}

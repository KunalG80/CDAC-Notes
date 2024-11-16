package app.components;

import java.io.IOException;

import com.google.gson.Gson;

import app.tourism.models.SiteModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/site")
public class EmployeeManagerservlet extends HttpServlet {
    
    static class input
    {
        int Empno;
        String Ename;
        String Job;
        int deptno;
    }

    SiteModel model = new SiteModel();

    Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        var candidates = model.getCandidate();
        response.setContentType("application/json");
        gson.toJson(candidates, response.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var candidate = gson.fromJson(request.getReader(), input.class);
        if(!model.acceptCandidate(candidate.Empno, candidate.Ename, candidate.Job, candidate.deptno))
            response.sendError(400, "Invalid input");
    }
}

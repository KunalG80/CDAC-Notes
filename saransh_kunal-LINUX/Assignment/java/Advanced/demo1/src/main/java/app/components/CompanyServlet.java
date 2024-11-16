package app.components;

import java.io.IOException;

import com.google.gson.Gson;

import app.company.data.DepartmentEntity;
import app.company.models.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import app.company.models.companymodel;

@WebServlet("/api/company")
public class CompanyServlet extends HttpServlet {
     static class CandidateInput {
        int Empno;
        String Ename;
        String Job;
        DepartmentEntity Deptno;
    }

    companymodel model = new companymodel();

    Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var candidates = model.getCandidates();
        response.setContentType("application/json");
        gson.toJson(candidates, response.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        var candidate = gson.fromJson(request.getReader(), CandidateInput.class);
        if (!model.acceptCandidate(candidate.Empno, candidate.Ename, candidate.Job, candidate.Deptno))
            response.sendError(400, "Invalid input");
    }
}

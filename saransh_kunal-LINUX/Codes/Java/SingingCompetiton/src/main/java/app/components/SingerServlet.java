package app.components;

import java.io.IOException;

import com.google.gson.Gson;

import app.song.models.SiteModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/site")
public class SingerServlet extends HttpServlet{

    static class input{
        int id;
        String name;
        int age;
        int salary;
    }
    SiteModel model = new SiteModel();
    Gson gson = new Gson();



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      var Candidates = model.getContestant();
      // response.setContentType("application/json");
      response.setContentType("application/json");
      gson.toJson(Candidates,response.getWriter());
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            var candidate = gson.fromJson(request.getReader(), input.class);
    }

    

}
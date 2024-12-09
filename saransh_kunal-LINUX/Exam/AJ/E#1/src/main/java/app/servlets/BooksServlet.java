package app.servlets;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import app.entities.Books;
import app.model.BooksModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/books")
public class BooksServlet extends  HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         List<Books> books = BooksModel.getAllBooks();
         req.setAttribute("books", Books);
         req.getRequestDispatcher("books.jsp").forward(req, resp);

    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String action = request.getParameter("action");

        if("insert".equals(action)){
            String name = request.getParameter("name");
        int isbn = Integer.parseInt(request.getParameter("isbn"));
        double price = Double.parseDouble(request.getParameter("price"));
        string author = request.getParameter("author");
        Books books = new Books();
        books.setName(name);
        books.setIsbn(isbn);
        books.setPrice(price);
        books.setAuthor(author);

        EmployeeModel.saveEmployee(books);
            response.sendRedirect("books");
        }

        // if("delete".equals(action)){
        //     double empno= Double.parseDouble(request.getParameter("empno"));
        //     EmployeeModel.deleteEmployee(empno);
        //     response.sendRedirect("emp");
        // }
    }
}

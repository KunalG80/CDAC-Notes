package app.servlets;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import app.entities.Department;
import app.entities.Employee;
import app.model.DepartmentModel;
import app.model.EmployeeModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/emp")
public class EmployeeServlet extends  HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         List<Employee> employees = EmployeeModel.getAllEmployees();
         req.setAttribute("employees", employees);
         req.getRequestDispatcher("employees.jsp").forward(req, resp);

    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String action = request.getParameter("action");

        if("insert".equals(action)){
            String ename = request.getParameter("ename");
        String job = request.getParameter("job");
        int mgr = Integer.parseInt(request.getParameter("mgr"));
        double sal = Double.parseDouble(request.getParameter("sal"));
        double comm = Double.parseDouble(request.getParameter("comm"));
        int deptno = Integer.parseInt(request.getParameter("deptno"));
        Employee employee = new Employee();
        employee.setEname(ename);
        employee.setJob(job);
        employee.setMgr(mgr);
        employee.setHiredate(new Date());
        employee.setComm(comm);
        employee.setSal(sal);

        EmployeeModel.saveEmployee(employee,deptno);
            response.sendRedirect("emp");
        }

        if("delete".equals(action)){
            double empno= Double.parseDouble(request.getParameter("empno"));
            EmployeeModel.deleteEmployee(empno);
            response.sendRedirect("emp");
        }
    }
}

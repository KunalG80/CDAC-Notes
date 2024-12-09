<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<jsp:useBean id="empmodel" class="app.model.EmployeeModel" scope="request" />
<jsp:setProperty name="empmodel" property="deptno" param="deptno" />

<!-- <%
    String deptno = request.getParameter("deptno");
    request.setAttribute("emp",empmodel.getEmployeesByDeptId(Double.parseDouble(deptno)));
%> -->

<html>
    <head>
        <title>Employees</title>
    </head>
    <body>
        <h1>Employees in Department ${param.deptno}</h1>
        <table border="1">
            <tr>
                <th>EmpNo</th>
                <th>Name</th>
                <th>Job</th>
                <th>Salary</th>
            </tr>
            <c:forEach var="emp" items="${empmodel.employees}">
                <tr>
                    <td>${emp.empno}</td>
                    <td>${emp.ename}</td>
                    <td>${emp.job}</td>
                    <td>${emp.sal}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="departments.jsp">Back to Departments</a>
    </body>
</html>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<jsp:useBean id="deptmodel" class="app.model.DepartmentModel" scope="application"/>

<html>
    <head>

    </head>
    <body>
        <h1>Welcome user</h1>
        <table border="1">
            <tr>
                <td>Deptno</td>
                <td>dname</td>
                <td>loc</td>
                <td>Show</td>
            </tr>
            <c:forEach var="dept" items="${deptmodel.departments}">
                <tr>
                    <td>${dept.deptno}</td>
                    <td>${dept.dname}</td>
                    <td>${dept.loc}</td>
                    <td>
                        <form action="demployees.jsp" method="get">
                            <input type="hidden" name="deptno" value="${dept.deptno}"/>
                            <input type="submit" value="Show"/>
                        </form>
                    </td>
                </tr>
            </c:forEach>    
        </table>
    </body>
</html>
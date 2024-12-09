<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
	<head>
		<title>simple-web-app</title>
	</head>
	<body>

		<form action="/emp" method="post">
			<h3>Enter employee details to insert</h3>
			<div>
				<label for="ename">Employee Name:</label>
				<input type="text" id="ename" name="ename" required>
			</div>
			<div>
				<label for="job">Employee Job:</label>
				<input type="text" id="job" name="job" required>
			</div>
			<div>
				<label for="mgr">Employee mgr:</label>
				<input type="number" id="mgr" name="mgr" required>
			</div>
			<div>
				<label for="sal">sal:</label>
				<input type="number" id="sal" name="sal" required>
			</div>
			<div>
				<label for="comm">comm:</label>
				<input type="number" id="comm" name="comm" required>
			</div>
			<div>
				<label for="deptno">deptno:</label>
				<input type="number" id="deptno" name="deptno" required>
			</div>
			<div id="center-btn-div">
				<button type="submit" name="action" value="insert">Save</button>
			</div>
			</form>


		<h1 style="margin-top: 5rem;">All Employees</h1>
        <table border="1px">
            <thead>
                <tr>
                    <td>EMPNO</td>
                    <td>ENAME</td>
                    <td>JOB</td>
                    <td>MGR</td>
                    <td>HIREDATE</td>
                    <td>SALARY</td>
                    <td>COMM</td>
                    <td>DEPTNO</td>
					<td>Option</td>
                </tr>
            </thead>
			<tbody>
                <c:forEach var="employee" items="${employees}">
                    <tr>
                        <td>${employee.empno}</td>
                        <td>${employee.ename}</td>
                        <td>${employee.job}</td>
                        <td>${employee.mgr}</td>
                        <td>${employee.hiredate}</td>
                        <td>${employee.sal}</td>
                        <td>${employee.comm}</td>
                        <td>${employee.department.deptno}</td>
                        <td>
							<form action="emp" method="post">
								<input type="hidden" name="empno" value="${employee.empno}">
								<button type="submit" name="action" value="delete">Delete</button>
							</form>
						</td>
                    </tr>
                </c:forEach>
            </tbody>
		</table>	
	</body>
</html>


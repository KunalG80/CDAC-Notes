<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<jsp:useBean id="bookmodel" class="app.model.BooksModel" scope="request" />
<jsp:setProperty name="bookmodel" property="isbn" param="isbn" />

<html>
    <head>
        <title>Book-Information_Management_Systems</title>
    </head>
    <body>
        <h1>Books by Name ${param.name}</h1>
        <table border="1">
            <tr>
				<th>id</th>
                <th>name</th>
                <th>isbn</th>
                <th>price</th>
                <th>author</th>
            </tr>
            <c:forEach var="bk" items="${BooksModel.Books}">
                <tr>
					<td>${bk.id}</td>
                    <td>${bk.name}</td>
                    <td>${bk.isbn}</td>
                    <td>${bk.price}</td>
                    <td>${bk.author}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="welcome.jsp">Back to HomePage</a>
    </body>
</html>

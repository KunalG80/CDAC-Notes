<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
	<head>
		<title>Insert_book_details</title>
	</head>
	<body>

		<form action="/books" method="post">
			<h3>Enter Books details to insert</h3>
            <div>
				<label for="id">Book id:</label>
				<input type="number" id="id" name="id" required>
			</div>
			<div>
				<label for="name">Book Name:</label>
				<input type="text" id="name" name="name" required>
			</div>
			<div>
				<label for="isbn">Book ISBN:</label>
				<input type="number" id="isbn" name="isbn" required>
			</div>
			<div>
				<label for="price">Book Price:</label>
				<input type="number" id="price" name="price" required>
			</div>
			<div>
				<label for="author">Book author:</label>
				<input type="text" id="author" name="author" required>
			</div>
			<div id="center-btn-div">
				<button type="submit" name="action" value="insert">Save</button>
			</div>
			</form>


		<h1 style="margin-top: 5rem;">All BOOKS</h1>
        <table border="1px">
            <thead>
                <tr>
                    <td>ID</td>
                    <td>NAME</td>
                    <td>ISBN</td>
                    <td>PRICE</td>
                    <td>Author</td>
                </tr>
            </thead>
			<tbody>
                <c:forEach var="books" items="${books}">
                    <tr>
                        <td>${books.id.}</td>
                        <td>${books.name}</td>
                        <td>${books.isbn}</td>
                        <td>${books.price}</td>
                        <td>${books.author}</td>
                        <td>
							<form action="/books" method="post">
								<input type="hidden" name="name" value="${books.name}">
								<button type="submit" name="action" value="search">search</button>
							</form>
						</td>
                    </tr>
                </c:forEach>
            </tbody>
		</table>	
	</body>
</html>
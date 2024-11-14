<jsp:useBean id="CalInterest" class="app.components.CalInterestBean" scope="page"/>
<jsp:setProperty name="CalInterest" property="principle"/>
<jsp:setProperty name="CalInterest" property="rate"/>
<jsp:setProperty name="CalInterest" property="period"/>
<html>
	<head>
		<title>Interest-Calculator</title>
	</head>
	<body>
		<h1>Welcome Visitor</h1>
        <form method="post">
            <p>
                <b>principle:</b>
                <input name="principle"/>
            </p>
            <p>
                <b>rate:</b>
                <input name="rate"/>
            </p>
			<p>
                <b>period:</b>
                <input name="period"/>
            </p>
            <input type="submit" placeholder="Calculate"/>
        </form>
        <h3>Calculated Interest:</h3>${CalInterest.intrest}
	</body>
</html>


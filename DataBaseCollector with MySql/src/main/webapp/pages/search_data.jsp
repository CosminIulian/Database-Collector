<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>Search your data</title>
    <link rel="stylesheet" type="text/css" href="css/theme.css">
</head>

<body>
<h1>
    Search your data by family name:
</h1>

<form action="searchData">
    <input type="text" name="familyName" minlength="3" maxlength="20" placeholder="Family name..." required><br>
    <input type="submit" value="Search">
</form>
</body>
</html>
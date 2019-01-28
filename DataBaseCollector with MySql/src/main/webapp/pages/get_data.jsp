<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="css/theme.css">
</head>

<body>
<h1>
    Register here:
</h1>

<form action="getData">
    <input type="text" name="familyName" minlength="3" maxlength="20" placeholder="Family name..." required><br>
    <input type="text" name="lastName"  minlength="3" maxlength="50" placeholder="Last name..." required><br>
    <input type="email" name="email"  minlength="3" maxlength="50" placeholder="Email adress..." required><br>
    <input type="number" name="telephone"  minlength="3" maxlength="50" placeholder="Telephone number..." required><br>
    <input type="text" name="adress"  minlength="3" maxlength="50" placeholder="Your adress..." required><br>
    <input type="date" name="birthDate" required><br>
    <input type="radio" name="gender" value="male" checked><p>Male</p><br>
    <input type="radio" name="gender" value="female"><p>Female</p><br>
    <input type="submit" value="Register">
</form>
</body>
</html>
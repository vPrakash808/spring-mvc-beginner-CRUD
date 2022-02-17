<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<h1>Add Product</h1>
<form action="saveProduct" method= "post">
<p>Product Name: <input type="text" name="name"/></p>
<p>Product Description: <input type="text" name="description"/></p>
<p>Product Price: <input type="text" name="price"/></p>
<input type="submit" value = "Add Product">
</form>
</body>
</html>
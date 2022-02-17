<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>
<form action="updateProduct" method= "post">
<p>Product Id: <input type="text" name="pid" value = "${product.pid}"></p>
<p>Product Name: <input type="text" name="name" value = "${product.name}"></p>
<p>Product Description: <input type="text" name="description" value = "${product.description}"></p>
<p>Product Price: <input type="text" name="price" value = "${product.price}" ></p>
<input type="submit" value = "Save">
</form>
</body>
</html>
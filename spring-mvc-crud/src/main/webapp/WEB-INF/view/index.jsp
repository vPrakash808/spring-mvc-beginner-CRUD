<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<%@ page isELIgnored="false" %>
</head>
<body>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}

.btn{
	
	position: absolute;
	margin-top: 5rem;
	background-color: green;
	color:white;
	padding:1px;
	text-align: center;
	display: inline-block;
	font-size:16px;
</style>
</head>
<body>

<h2>List of Products</h2>

<table>
  <tr>
    <th>Product Id</th>
    <th>Name</th>
    <th>Description</th>
    <th>Price</th>
    <th>Action</th>
    
  </tr>
  <c:forEach items="${products}" var="p">
  <tr>
    <td>${p.pid}</td>
    <td>${p.name}</td>
    <td>${p.description}</td>
    <td>${p.price}</td>
    <td><a href="deleteProduct/${p.pid}">Delete</a>
    <td><a href="editProduct/${p.pid}">Edit</a>
  </tr>
  </c:forEach>
</table>
<div class="btn">
<a href="addProduct">	
	<button>Add Product</button>
</a>
</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<style>
  body {
            display: flex;
            justify-content: center;
            /* align-items: center; */
            height: 100%;
            margin-top: 80px;
            font-family: Arial, sans-serif;
            background-color: #666699;
        }
  .center-form {
    	background-color: #c2c2d6;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
  }
</style>
</head>
<body>
<div class="center-form">
<form action="/SpringMVCEmployeeManagement/updateEmp" method="post">
	<input type="hidden" name="eid" value="2">
  <div class="mb-3">
    <label for="name" class="form-label">Name</label>
    <input name="name" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value=${emp.name }>
    <div id="emailHelp" class="form-text"></div>
  </div>
  <div class="mb-3">
    <label for="salary" class="form-label">Salary</label>
    <input name="salary" type="text" class="form-control" id="exampleInputPassword1" value=${emp.salary }>
  </div>
    <div class="mb-3">
    <label for="designation" class="form-label">Designation</label>
    <input name="designation" type="text" class="form-control" id="exampleInputPassword1" value=${emp.designation }>
  </div>
    <div class="mb-3">
    <label for="dob" class="form-label">Date of Birth</label>
    <input name="dob" type="text" class="form-control" id="exampleInputPassword1" placeholder="dd/mm/yyyy" value=${emp.dob }>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
<a href="/SpringMVCEmployeeManagement/home" class="btn ">Home</a>
</div>
</body>
</html>
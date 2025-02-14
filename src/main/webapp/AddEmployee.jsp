<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Add Employee</h1>
       <form action="AddServlet" method="post">
		    <input type="hidden" name="action" value="add">
		    <div class="mb-3">
		        <label class="form-label">Nom:</label>
		        <input type="text" name="nom" class="form-control" required>
		    </div>
		    <div class="mb-3">
		        <label class="form-label">Prenom:</label>
		        <input type="text" name="prenom" class="form-control" required>
		    </div>
		    <div class="mb-3">
		        <label class="form-label">Email:</label>
		        <input type="email" name="email" class="form-control" required>
		    </div>
		    <div class="mb-3">
		        <label class="form-label">Post:</label>
		        <input type="text" name="post" class="form-control" required>
		    </div>
		    <div class="mb-3">
		        <label class="form-label">Salaire:</label>
		        <input type="number" name="salaire" class="form-control" required>
		    </div>
		    <button type="submit" class="btn btn-primary">Add Employee</button>
</form>
    </div>
</body>
</html>

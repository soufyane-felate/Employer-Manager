<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Employees</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Employees List</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nom</th>
                    <th>Prenom</th>
                    <th>Email</th>
                    <th>Post</th>
                    <th>Salaire</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="employee" items="${employees}">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.nom}</td>
                        <td>${employee.prenom}</td>
                        <td>${employee.email}</td>
                        <td>${employee.post}</td>
                        <td>${employee.salaire}</td>
                        <td>
                            <a href="editEmployee.jsp?id=${employee.id}" class="btn btn-warning">Edit</a>
                            <form action="EmployeeServlet" method="post" style="display:inline;">
                                <input type="hidden" name="action" value="delete">
                                <input type="hidden" name="id" value="${employee.id}">
                                <button type="submit" class="btn btn-danger">Delete</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
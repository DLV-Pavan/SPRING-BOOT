<%@ page language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
    <title>Employee List</title>
</head>

<body>

    <h2>Employee Details</h2>

    <a href="addEmp">Add Employee</a>

    <table border="1">

        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Salary</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

        <c:forEach var="e" items="${employees}">

            <tr>
                <td>${e.eid}</td>
                <td>${e.ename}</td>
                <td>${e.sal}</td>

                <td>
                    <a href="editEmp?eid=${e.eid}">Edit</a>
                </td>

                <td>
                    <a href="deleteEmp?eid=${e.eid}">Delete</a>
                </td>
            </tr>

        </c:forEach>

    </table>

</body>
</html>

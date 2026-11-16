
<%@ page language="java" %>

<html>
<head>
    <title>Edit Employee</title>
</head>

<body>

    <h2>Update Employee</h2>

    <form action="updateEmp" method="post">

        ID:
        <input type="text" name="eid"
               value="${employee.eid}" readonly>
        <br><br>

        Name:
        <input type="text" name="ename"
               value="${employee.ename}">
        <br><br>

        Salary:
        <input type="text" name="sal"
               value="${employee.sal}">
        <br><br>

        <input type="submit" value="Update">

    </form>

    <br>

    <a href="getEmp">Back</a>

</body>
</html>

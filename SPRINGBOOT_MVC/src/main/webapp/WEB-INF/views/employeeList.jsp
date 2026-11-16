
<%@ page language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Dashboard</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>

    <!-- Navigation Bar -->
    <div class="navbar">

        <h2>Employee Management System</h2>

        <div>
            <a href="${pageContext.request.contextPath}/employees/getEmp">
                Employees
            </a>

            <a href="${pageContext.request.contextPath}/employees/addEmp">
                Add Employee
            </a>
        </div>

    </div>

    <!-- Main Container -->
    <div class="container">

        <h2>Employee Details</h2>

        <a class="btn btn-primary"
           href="${pageContext.request.contextPath}/employees/addEmp">
            + Add New Employee
        </a>

        <!-- Employee Table -->
        <table>

            <thead>
                <tr>
                    <th>Employee ID</th>
                    <th>Employee Name</th>
                    <th>Salary</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>

            <tbody>

                <c:forEach var="e" items="${employees}">

                    <tr>

                        <td>${e.eid}</td>

                        <td>${e.ename}</td>

                        <td>₹ ${e.sal}</td>

                        <td>
							<a class="btn btn-edit"
							   href="${pageContext.request.contextPath}/employees/editEmp?eid=${e.eid}">
							    Edit
							</a>
                        </td>

                        <td>
                            <a class="btn btn-delete"
                               href="${pageContext.request.contextPath}/employees/deleteEmp?eid=${e.eid}"
                               onclick="return confirm('Are you sure you want to delete this employee?')">
                                Delete
                            </a>
                        </td>

                    </tr>

                </c:forEach>

                <c:if test="${empty employees}">
                    <tr>
                        <td colspan="5" style="text-align:center;">
                            No Employees Found
                        </td>
                    </tr>
                </c:if>

            </tbody>

        </table>

    </div>

</body>
</html>

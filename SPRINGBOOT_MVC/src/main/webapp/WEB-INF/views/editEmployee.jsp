
<%@ page language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update Employee</title>

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

    <!-- Update Form -->
    <div class="container">

        <h2>Update Employee Details</h2>

        <form action="${pageContext.request.contextPath}/employees/updateEmp"
              method="post">

            <div class="form-group">

                <label>Employee ID</label>

                <input type="number"
                       name="eid"
                       value="${employee.eid}"
                       readonly>

            </div>

            <div class="form-group">

                <label>Employee Name</label>

                <input type="text"
                       name="ename"
                       value="${employee.ename}"
                       pattern="(?i)Pavan"
                       title="Only Pavan is allowed"
                       required>

                <c:forEach var="err" items="${errors}">
                    <c:if test="${err.field == 'ename'}">
                        <p class="error">${err.defaultMessage}</p>
                    </c:if>
                </c:forEach>

            </div>

            <div class="form-group">

                <label>Salary</label>

                <input type="number"
                       name="sal"
                       value="${employee.sal}"
                       min="5000"
                       max="75000"
                       step="0.01"
                       required>

                <c:forEach var="err" items="${errors}">
                    <c:if test="${err.field == 'sal'}">
                        <p class="error">${err.defaultMessage}</p>
                    </c:if>
                </c:forEach>

            </div>

            <button type="submit" class="btn btn-primary">
                Update Employee
            </button>

        </form>

        <a href="${pageContext.request.contextPath}/employees/getEmp">
            Back to Employee List
        </a>

    </div>

</body>
</html>

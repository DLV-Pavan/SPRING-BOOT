
<%@ page language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Registration</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>

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

    <div class="container">

        <h2>Employee Registration</h2>

        <form action="${pageContext.request.contextPath}/employees/saveEmp"
              method="post">

            <div class="form-group">
                <label>Employee Name</label>

                <input type="text"
                       name="ename"
                       placeholder="Enter employee name"
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
                       placeholder="Enter salary"
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
                Register Employee
            </button>

        </form>

        <a href="${pageContext.request.contextPath}/employees/getEmp">
            View Employees
        </a>

    </div>

</body>
</html>

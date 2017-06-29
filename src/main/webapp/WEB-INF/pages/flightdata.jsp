<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Flight Data Page</title>

    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
</head>
<body>
<a href="../../index.jsp">Back to main menu</a>

<br/>
<br/>

<h1>Flight Data List</h1>

<c:if test="${!empty listFlightDepartmentData}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Incoming number</th>
            <th width="120">Flight number</th>
            <th width="120">Tail number</th>
        </tr>
        <c:forEach items="${listFlightDepartmentData}" var="data">
            <tr>
                <td>${data.id}</td>
                <td><a href="/fdinfo/${data.id}" target="_blank">${data.incomingNumber}</a></td>
                <td>${data.flightNumber}</td>
                <td>${data.tailNumber}</td>
                <td><a href="<c:url value='/editevent/${data.id}'/>">Edit</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>


<h1>Add a Book</h1>

<c:url var="addAction" value="/flightdata/add"/>

<form:form action="${addAction}" commandName="flightDepartmentData">
    <table>
        <c:if test="${!empty flightDepartmentData.incomingNumber}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8" disabled="true"/>
                    <form:hidden path="id"/>
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="incomingNumber">
                    <spring:message text="Incoming Number"/>
                </form:label>
            </td>
            <td>
                <form:input path="incomingNumber"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="flightNumber">
                    <spring:message text="Flight Number"/>
                </form:label>
            </td>
            <td>
                <form:input path="flightNumber"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="tailNumber">
                    <spring:message text="Tail Number"/>
                </form:label>
            </td>
            <td>
                <form:input path="tailNumber"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty flightDepartmentData.incomingNumber}">
                    <input type="submit"
                           value="<spring:message text="Save Flight Data"/>"/>
                </c:if>
                <c:if test="${empty flightDepartmentData.incomingNumber}">
                    <input type="submit"
                           value="<spring:message text="Add Flight Data"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>

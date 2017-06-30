<h1>Add or Edit Flight Data</h1>

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
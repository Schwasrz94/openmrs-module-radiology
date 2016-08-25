<%@ include file="/WEB-INF/template/include.jsp"%>

<table>
  <tr>
    <td><spring:message code="radiology.user.options.preferredDashboardTab" /></td>
    <td><select id="preferredDashboardTabSelect" name="preferredDashboardTab">
        <c:forEach var="dashboardTab" items="${model.dashboardTabs}">
          <option value="${dashboardTab.value}"><spring:message code="radiology.user.options.preferredDashboardTab.select.${dashboardTab.key}"
              text="${dashboardTab.key}" /></option>
        </c:forEach>
    </select></td>
  </tr>
</table>
<br />
<br />
<br />
<br />
<br />
<br />
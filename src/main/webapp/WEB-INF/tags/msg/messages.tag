<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<div class="row">
	<c:forEach items="${inbox.messages}" var="msg">
		<div class="alert alert-${msg.type} alert-dismissable systemAlert">
			<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
			<strong> 
				<c:if test="${empty msg.title}"><fmt:message key="msg.title.${msg.type}" />!</c:if>
				<c:if test="${!empty msg.title}"><fmt:message key="${msg.title}" />!</c:if>
			</strong>
			<fmt:message key="${msg.key}">
				<c:forEach items="${msg.params}" var="p">
					<fmt:param>${p}</fmt:param>
				</c:forEach>
			</fmt:message>
		</div>
	</c:forEach>
</div>

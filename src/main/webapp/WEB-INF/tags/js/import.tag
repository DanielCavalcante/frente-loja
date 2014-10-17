<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib tagdir="/WEB-INF/tags/js" prefix="js" %>
<fmt:setLocale value="pt_BR" scope="session" />

<%@tag import="java.util.List"%>
<%@tag import="br.com.utils.JsImportTag" %>
<%@attribute name="javascript" type="java.lang.String"%>
<%
		List<String> jsImports = (List) request.getAttribute("jsImports");
		if (jsImports == null) {
			jsImports = new java.util.ArrayList<String>();
		}
		request.setAttribute("jsImports", jsImports);
		jsImports.add(javascript);
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link href="resource/css/css.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery/jquery-1.8.2.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table>
		<tr>
			<td>
			电影名称
			</td>
			<td>
			导演
			</td>
			<td>
			<a href="javascript:query('price')">价格</a>
			</td>
			<td>
			<a href="javascript:query('uptime')">上映时间</a>
			</td>
			<td>
			时长
			</td>
			<td>
			类型
			</td>
			<td>
			地域
			</td>
			<td>
			状态
			</td>
			<td>
			年份
			</td>
		</tr>
		<c:forEach items="${pg.list}" var="m">
			<tr>
			<td>
			${m.name}
			</td>
			<td>
			${m.actor}
			</td>
			<td>
			${m.price}
			</td>
			<td>
			<fmt:formatDate value="${m.uptime}" timeStyle="yyyy-HH-mm"/>
			</td>
			<td>
			${m.longtime}
			</td>
			<td>
			${m.mtype}
			</td>
			<td>
			${m.areas}
			</td>
			<td>
			${m.status}
			</td>
			<td>
			${m.years}
			</td>
		</tr>
		</c:forEach>
	</table>
	${page}
	
	
	
	<script type="text/javascript">
	var ord="${movieAll.ord=='asc'?'desc':'asc'}";
		function query(mType) {		
			location="list?ord="+ord+"&mType="+mType;
		}
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title></title>
<link rel="stylesheet" href="/resource/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="/resource/css/cms.css?v=1.1" />
<style type="text/css">
</style>
</head>
<body>
	<form action="add" method="post">
		<table class="table table-hover table-dark">
			<tr>
				<td>名称</td>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<td>地址</td>
				<td><select name="address">
						<c:forEach items="${addresses}" var="item">
							<option value="${item}">${item}</option>
						</c:forEach>
				</select></td>
			</tr>

			<tr>
				<td>类别</td>
				<td><select name="category">
						<c:forEach items="${categories}" var="item">
							<option value="${item}">${item}</option>
						</c:forEach>
				</select></td>
			</tr>

			<tr>
				<td>时间</td>
				<td><input type="date" name="createDate"></td>
			</tr>

			<tr>
				<td>商家</td>
				<td><c:forEach items="${shops}" var="shop">
				&nbsp;&nbsp; &nbsp; <input type="checkbox" name="shopIdArr"
							value="${shop.id}">
					${shop.name}
			</c:forEach></td>
			</tr>
			<tr>
				<td><button>提交</button></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>
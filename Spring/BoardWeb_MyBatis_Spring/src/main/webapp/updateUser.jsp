<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 정보 수정</title>
</head>
<body>
<center>
	<h2>회원 정보 수정</h2>
	<hr>
	
	<form action="updateUser.do" method="post">
		아이디 : <input type="text" name="id" value="${userVO.id }" readonly >
		<p> 패스워드 : <input type="password" name="password" value="${userVO.password }">
		<p> 이름 : <input type="text" name="name" value="${userVO.name }">
		<p> 역할 : <input type="text" name="role" value="${userVO.role }">
		
		<p> <input type="submit" value="회원 정보 수정">
		
	</form>

</center>

</body>
</html>
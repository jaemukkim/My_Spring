<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ�� ���� ����</title>
</head>
<body>
<center>
	<h2>ȸ�� ���� ����</h2>
	<hr>
	
	<form action="updateUser.do" method="post">
		���̵� : <input type="text" name="id" value="${userVO.id }" readonly >
		<p> �н����� : <input type="password" name="password" value="${userVO.password }">
		<p> �̸� : <input type="text" name="name" value="${userVO.name }">
		<p> ���� : <input type="text" name="role" value="${userVO.role }">
		
		<p> <input type="submit" value="ȸ�� ���� ����">
		
	</form>

</center>

</body>
</html>
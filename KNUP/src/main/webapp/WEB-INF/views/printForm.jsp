<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<title>SONGPRINTER</title>

<body>
	
	<form action ="/KNUP/result" method="get">
		<h2>����Ʈ ������ �������ּ���.</h2>
		<select name="item">
			<option value="����">����</option>
			<option value="����">����</option>
		</select>
		<br><br>
		
		<h2>�������� �����̵� ��</h2>
		�������� �����̵� �� <input type="text" name="slideNum" size="5">
		<br><br>
		
		<h2>������ ����</h2>
		<input type="radio" name="pageRange" value="���" checked> ���
		<br>
		<input type="radio" name="pageRange" value="����������"> ���������� <input type="text" name="firstPage" size="15" value="���� ������"> �� ������ <input type="text" name="lastPage" size="15" value="���� ������">
		<br>
		<input type="radio" name="pageRange" value="������ �����̵�"> ������ �����̵�
		<br>
		<input type="radio" name="pageRange" value="���� ����"> ���� ���� <input type="text" name="RangeChoice" size="15" value="1-3,5-10">
		<br><br>
		
		<h2>����Ʈ �ż�</h2>
		<input type="text" name="printNum" value="1" size="10">
		<br><br>
		
		<h2>�����͸� �������ּ���.</h2>
		<select name="item">
			<option value="printer1">printer1</option>
			<option value="printer2">printer2</option>
		</select>
		<br><br>
		
		<h2>�̸�����</h2>
		<!-- <script type="text/javascript">
    	window.print();
		</script> -->
		<br><br>
		
		<button>���� ����</button>
		
		
		
	</form>

</body>

</html>
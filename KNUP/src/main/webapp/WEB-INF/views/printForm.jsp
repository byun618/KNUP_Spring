<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<title>SONGPRINTER</title>

<body>
		<script>
		function checkIt()
		{
		
		var form = document.write_form;     
		if (form.attach_file.value=="")
		{
		alert ("������ �����ϼ���.");
		form.attach_file.focus();
		return false;
		}
		
		
		return true;
		}
		</script>
	<form action ="/KNUP/printSubmit" method="post" enctype="multipart/form-data" 
					name="write_form" onsubmit="return checkIt()">
	
		<h2>����Ʈ�� ������ �����ϼ��� </h2>
		<input type="file" name="attach_file">
		<br><br>
			
		<h2>����Ʈ ������ �������ּ���.</h2>
		<select name="direction">
			<option value="hor">����</option>
			<option value="ver">����</option>
		</select>
		<br><br>
		
		<h2>�������� �����̵� ��</h2>
		�������� �����̵� �� <input type="text" name="slideQty" size="5" 
				     onKeyup="this.value=this.value.replace(/[^0-9]/g,'');"
				    >
		<br><br>
		
		<h2>������ ����</h2>
		<input type="radio" name="pageRange" value="all" checked> ���
		<br>
		<input type="radio" name="pageRange" value="first_p"> ���������� <input type="text" name="firstpage" size="15" value="ex)1,2,3" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');"> �� ������ <input type="text" name="lastPage" size="15" value="ex)3,5,6" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');">
		<br>
		<input type="radio" name="pageRange" value="select_s"> ������ �����̵�
		<br>
		<input type="radio" name="pageRange" value="range_d"> ���� ���� <input type="text" name="RangeChoice" size="15" value="ex)1-3,5-10" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');">
		<br><br>
		
		<h2>����Ʈ �ż�</h2>
		<input type="text" name="printQty" value="1" size="10" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');">
		<br><br>
		
		<h2>�����͸� �������ּ���.</h2>
		<select name="printerName">
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
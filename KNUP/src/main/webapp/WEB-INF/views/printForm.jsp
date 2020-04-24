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
		alert ("파일을 선택하세요.");
		form.attach_file.focus();
		return false;
		}
		
		
		return true;
		}
		</script>
	<form action ="/KNUP/printSubmit" method="post" enctype="multipart/form-data" 
					name="write_form" onsubmit="return checkIt()">
	
		<h2>프린트할 파일을 선택하세용 </h2>
		<input type="file" name="attach_file">
		<br><br>
			
		<h2>프린트 방향을 선택해주세요.</h2>
		<select name="direction">
			<option value="hor">가로</option>
			<option value="ver">세로</option>
		</select>
		<br><br>
		
		<h2>페이지당 슬라이드 수</h2>
		페이지당 슬라이드 수 <input type="text" name="slideQty" size="5" 
				     onKeyup="this.value=this.value.replace(/[^0-9]/g,'');"
				    >
		<br><br>
		
		<h2>페이지 범위</h2>
		<input type="radio" name="pageRange" value="all" checked> 모두
		<br>
		<input type="radio" name="pageRange" value="first_p"> 시작페이지 <input type="text" name="firstpage" size="15" value="ex)1,2,3" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');"> 끝 페이지 <input type="text" name="lastPage" size="15" value="ex)3,5,6" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');">
		<br>
		<input type="radio" name="pageRange" value="select_s"> 선택한 슬라이드
		<br>
		<input type="radio" name="pageRange" value="range_d"> 범위 지정 <input type="text" name="RangeChoice" size="15" value="ex)1-3,5-10" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');">
		<br><br>
		
		<h2>프린트 매수</h2>
		<input type="text" name="printQty" value="1" size="10" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');">
		<br><br>
		
		<h2>프린터를 선택해주세요.</h2>
		<select name="printerName">
			<option value="printer1">printer1</option>
			<option value="printer2">printer2</option>
		</select>
		<br><br>
		
		<h2>미리보기</h2>
		<!-- <script type="text/javascript">
    	window.print();
		</script> -->
		<br><br>
		
		<button>정보 저장</button>
		
		
		
	</form>

</body>

</html>
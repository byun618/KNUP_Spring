<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<title>SONGPRINTER</title>

<body>
	
	<form action ="/KNUP/result" method="get">
		<h2>프린트 방향을 선택해주세요.</h2>
		<select name="item">
			<option value="가로">가로</option>
			<option value="세로">세로</option>
		</select>
		<br><br>
		
		<h2>페이지당 슬라이드 수</h2>
		페이지당 슬라이드 수 <input type="text" name="slideNum" size="5">
		<br><br>
		
		<h2>페이지 범위</h2>
		<input type="radio" name="pageRange" value="모두" checked> 모두
		<br>
		<input type="radio" name="pageRange" value="시작페이지"> 시작페이지 <input type="text" name="firstPage" size="15" value="숫자 넣으삼"> 끝 페이지 <input type="text" name="lastPage" size="15" value="숫자 넣으셈">
		<br>
		<input type="radio" name="pageRange" value="선택한 슬라이드"> 선택한 슬라이드
		<br>
		<input type="radio" name="pageRange" value="범위 지정"> 범위 지정 <input type="text" name="RangeChoice" size="15" value="1-3,5-10">
		<br><br>
		
		<h2>프린트 매수</h2>
		<input type="text" name="printNum" value="1" size="10">
		<br><br>
		
		<h2>프린터를 선택해주세요.</h2>
		<select name="item">
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
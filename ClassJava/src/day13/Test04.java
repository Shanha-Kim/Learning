package day13;
/*
	Quiz 1]
		
		<input type="text" id="id" name="id">
		<input type="password" id="pw" name="pw">
		
		<div class="d1" id="d1"><p>  </p></div>
		<script> 
			
			
		
		</script>
		=============================================
		위 코드에서 입력되는 아이디를 읽어서 p 태그에 출력하려고 한다.
			a) 자바스크립트로 처리
				==> 자바스크립트에서는 모든 것들이 대부분 property에 저장이 된다.
					따라서 property에 접근해서 가져와야 한다.
					
					function displayId{
						var id = document.getElementById("id").value;
						
						document.getElementById('d1').innerHTML = '<p>' + id + '</p>';
						document.querySelector('#d1.p').innerHTML = id;
					}
					
			b) Jqeury로 처리
				==> 대부분의 것들이 함수로 처리가 되어 있어서
					함수를 실행하고 반환되는 객체를 받아서 처리해야 한다.
					
					$(document).ready(function(){
						var id = $('#id').val();
						$('#d1 < p').text(id);
					}
	
	Quiz 2]
		innerHTML, textContent innerText 차이점 = > 태그의 기능을 살려두느냐 마느냐
		
 */
public class Test04 {
/*
	ChoiceFormat
		==> switch ~ case 문 등을 이용해야 하는 경우에 그것을 간소화 해놓은 클래스
		
		생성방법]
			ChoiceFormat
 */
	public Test04() {
		
		
	}

	public static void main(String[] args) {

	}

}

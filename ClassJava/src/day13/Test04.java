package day13;
/*
	Quiz 1]
		
		<input type="text" id="id" name="id">
		<input type="password" id="pw" name="pw">
		
		<div class="d1" id="d1"><p>  </p></div>
		<script> 
			
			
		
		</script>
		=============================================
		�� �ڵ忡�� �ԷµǴ� ���̵� �о p �±׿� ����Ϸ��� �Ѵ�.
			a) �ڹٽ�ũ��Ʈ�� ó��
				==> �ڹٽ�ũ��Ʈ������ ��� �͵��� ��κ� property�� ������ �ȴ�.
					���� property�� �����ؼ� �����;� �Ѵ�.
					
					function displayId{
						var id = document.getElementById("id").value;
						
						document.getElementById('d1').innerHTML = '<p>' + id + '</p>';
						document.querySelector('#d1.p').innerHTML = id;
					}
					
			b) Jqeury�� ó��
				==> ��κ��� �͵��� �Լ��� ó���� �Ǿ� �־
					�Լ��� �����ϰ� ��ȯ�Ǵ� ��ü�� �޾Ƽ� ó���ؾ� �Ѵ�.
					
					$(document).ready(function(){
						var id = $('#id').val();
						$('#d1 < p').text(id);
					}
	
	Quiz 2]
		innerHTML, textContent innerText ������ = > �±��� ����� ����δ��� ������
		
 */
public class Test04 {
/*
	ChoiceFormat
		==> switch ~ case �� ���� �̿��ؾ� �ϴ� ��쿡 �װ��� ����ȭ �س��� Ŭ����
		
		�������]
			ChoiceFormat
 */
	public Test04() {
		
		
	}

	public static void main(String[] args) {

	}

}

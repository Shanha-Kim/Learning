package day01;

class CharTest03 {
/*
	��Ƽ���� �ּ�
*/
//	���϶��� �ּ�
    public static void main(String[] args){
        char ch1 = 'A'; //����ɶ� �ƽ�Ű�ڵ尪���� �����
	System.out.println("ch1: "+ch1);

	char ch2 = 65+1; 
	System.out.println("ch2: "+ch2);

	int tmp = 'A'+1;
	char ch3 = (char)(tmp+1); 
	System.out.println("ch3: "+ch3);
    }
}
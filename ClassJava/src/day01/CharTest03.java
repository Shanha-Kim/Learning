package day01;

class CharTest03 {
/*
	멀티라인 주석
*/
//	단일라인 주석
    public static void main(String[] args){
        char ch1 = 'A'; //저장될때 아스키코드값으로 저장됨
	System.out.println("ch1: "+ch1);

	char ch2 = 65+1; 
	System.out.println("ch2: "+ch2);

	int tmp = 'A'+1;
	char ch3 = (char)(tmp+1); 
	System.out.println("ch3: "+ch3);
    }
}
package day01;
/*
	형변환(casting)
		-리터럴 형변환
		-강제 형변환
		-자동 형변환
	참고)
		데이터의 크기
		정수 < 실수 < 문자열
		long(8byte) < float(4byte) < String
 */
class Test04 {
    public static void main(String[] args){
        int no1=10;
        int no2=3;
        //float fl1=3.14; 실수형의 기본은 double이므로 에러가 난다.
        float fl1=3.14f; //리터럴 형변환
        float fl2=(float)3.14; //강제 형변환 
        //불러온 double타입의 3.14를 float타입을 바꿔서 대입
        
        double db1 = fl1; //작은놈을 큰그릇에 담는건 된다.
        double db2 = no1;
        double db3 = 3d; //리터럴 형변환
    }
}
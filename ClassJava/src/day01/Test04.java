package day01;
/*
	����ȯ(casting)
		-���ͷ� ����ȯ
		-���� ����ȯ
		-�ڵ� ����ȯ
	����)
		�������� ũ��
		���� < �Ǽ� < ���ڿ�
		long(8byte) < float(4byte) < String
 */
class Test04 {
    public static void main(String[] args){
        int no1=10;
        int no2=3;
        //float fl1=3.14; �Ǽ����� �⺻�� double�̹Ƿ� ������ ����.
        float fl1=3.14f; //���ͷ� ����ȯ
        float fl2=(float)3.14; //���� ����ȯ 
        //�ҷ��� doubleŸ���� 3.14�� floatŸ���� �ٲ㼭 ����
        
        double db1 = fl1; //�������� ū�׸��� ��°� �ȴ�.
        double db2 = no1;
        double db3 = 3d; //���ͷ� ����ȯ
    }
}
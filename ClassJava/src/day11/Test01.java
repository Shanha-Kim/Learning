package day11;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
	����Ŭ����(Inner Class)
		==> Ŭ���� ���ο� �ٽ� Ŭ������ ���� �� �ִ�.
		
		����]
			1. Top Level Class
				==> ��� ������ ���� Ŭ����������
					���������� Ȱ���ϴ� Ŭ����
				
				����]					
					static class Ŭ�����̸�{}
				��, ����Ŭ���� �� static �Ӽ��� ������ Top Level Inner Ŭ������ �ȴ�.
				
				ȣ������]
					�ٱ�Ŭ����.����Ŭ����.��� �� �������� �����ؾ� �Ѵ�.
			
			2. ���� Inner Class
				==> �Ϲ� Ŭ������ ����Ŭ������ ���� ��
					(�Ϲ������� �� Ŭ������ ����Ŭ������ �ҷ�����. 90%)
				����]
					class Ŭ�����̸� {}
				Ư¡]
					1. �ٱ�Ŭ������ ��� ����� ������ �ڱ���ó�� ����� �� �ִ�.
					2. �ݵ�� �ٱ�Ŭ������ new �� ���Ŀ� ����Ŭ������ ������ �� �ִ�.
					3. �ٱ�Ŭ������ ����Ŭ������ ����� ����� �� ����
					   ����ϱ� ���ؼ��� �ݵ�� new ���Ѽ� ����ؾ��Ѵ�.
					   (��ü�� ���� �Ŀ� ����� �� �ִ�.)
					4. �ַ� �ٱ� Ŭ������ ������ ����� ���� Ŭ������ ����� ������ 
					   ����ϴ� ���					
				ȣ������]
					�ٱ�Ŭ�����ּ�.new ����Ŭ�����̸�();
			
			3. ���� Inner class
				==> ���� Ŭ������ ����� ��ġ�� �ٱ� Ŭ������ �Լ� �ȿ��� ��������� ��.
				class Test{
					int a;
					class Inner{} ==> ���� Inner Class
					void abc(){
						int b;
						class Inner2 {} ==> ���� Inner Class
					}
				}
				Ư¡]
					1. ���� Inner Class�� �����ϰ� �ٱ� Ŭ������ ����� ����� �� �ִ�.
					2. �� Ŭ������ �ٸ��������� new ��ų �� ����.
					   ���� �ش��Լ� �������� new ��ų �� �ִ�.
			
			4. ���� Inner Class(�ͺ�����Ŭ����)
			==> �� �״�� �̸��� ���� Ŭ������ �̾߱� �Ѵ�.
			
				�츮�� ���α׷��� ����� ����
				Ŭ������ ��� ������ ���ؼ� �������̵��� �ؾ� �ϴ� ��찡 �߻��Ѵ�.
				(��¿ �� ���� �������̵� �ؾ� �ϴ� ��쵵 �ְ�,
				�������̽��� �߻�Ŭ������ ����ؾ� �� ���...)
				
				�� �� ��Ģ���� ��Ģ�� ���ؼ� 
				�ٸ� Ŭ������ �����
				�� Ŭ������ �ʿ��� Ŭ������ ����� �� ��
				�������̵带 �ؾ� �Ѵ�. 
				
				�� �� �ʿ��� ��� �ϳ������� ����� �޾� Ŭ������ �����
				�������̵带 �ؾ� �Ѵٸ� ū �����̴�.
				
				==> �̷���� ����� �޾� Ŭ������ ����� 
				�������̵��ؼ� ������� �ʰ� �ذ��� �� �ִ� ������� 
				�͸� ���� Ŭ������ ����Ѵ�.
				
				����]
					new Ŭ�����̸�(){}
					
 */ 
public class Test01 {
	JFrame fr;
	JPanel pan;
	JPanel bpan;
	public Test01() {
		fr = new JFrame("Test");
		fr.setLayout(new BorderLayout());
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("����");
		JButton cbtn = new JButton("���󺯰�");
		//btn.addActionListener(new BtnEvent());
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			} 
		});
		cbtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//Į�� ���� �����
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				
				//Į�� ��ü�� �����
				Color bg = new Color(red, green, blue);
				
				//�гο� ĥ�ϰ�
				pan.setBackground(bg);
				bpan.setBackground(bg);
			}
		});
		pan = new JPanel();
		//pan ���󺯰�
		pan.setBackground(Color.BLUE);
		bpan = new JPanel();
		bpan.setBackground(Color.BLUE);
		
		bpan.add(cbtn);
		bpan.add(btn);
		
		fr.add(pan, "Center");
		fr.add(bpan, "South");
				
		fr.setSize(500, 500);
		fr.setBackground(Color.orange);
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		Test01 a =new Test01();
	}

}

class BtnEvent implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
}

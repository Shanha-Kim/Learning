package day11;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
	내부클래스(Inner Class)
		==> 클래스 내부에 다시 클래스를 만들 수 있다.
		
		종류]
			1. Top Level Class
				==> 비록 형식은 내부 클래스이지만
					독집적으로 활동하는 클래스
				
				형식]					
					static class 클래스이름{}
				즉, 내부클래스 중 static 속성이 붙으면 Top Level Inner 클래스가 된다.
				
				호출형식]
					바깥클래스.내부클래스.멤버 의 형식으로 접근해야 한다.
			
			2. 전역 Inner Class
				==> 일반 클래스를 내부클래스로 만든 것
					(일반적으로 이 클래스가 내부클래스로 불려진다. 90%)
				형식]
					class 클래스이름 {}
				특징]
					1. 바깥클래스의 모든 멤버는 저절로 자기멤버처럼 사용할 수 있다.
					2. 반드시 바깥클래스가 new 된 이후에 안쪽클래스를 생성할 수 있다.
					3. 바깥클래스는 내부클래스의 멤버를 사용할 수 없고
					   사용하기 위해서는 반드시 new 시켜서 사용해야한다.
					   (객체를 만든 후에 사용할 수 있다.)
					4. 주로 바깥 클래스와 연관된 기능을 가진 클래스를 만들고 싶을때 
					   사용하는 방법					
				호출형식]
					바깥클래스주소.new 안쪽클래스이름();
			
			3. 지역 Inner class
				==> 내부 클래스를 만드는 위치가 바깥 클래스의 함수 안에서 만들어지는 것.
				class Test{
					int a;
					class Inner{} ==> 전역 Inner Class
					void abc(){
						int b;
						class Inner2 {} ==> 지역 Inner Class
					}
				}
				특징]
					1. 전역 Inner Class와 유사하게 바깥 클래스의 멤버를 사용할 수 있다.
					2. 이 클래스는 다른곳에서는 new 시킬 수 없다.
					   오직 해당함수 내에서만 new 시킬 수 있다.
			
			4. 무명 Inner Class(익병내부클래스)
			==> 말 그대로 이름이 없는 클래스를 이야기 한다.
			
				우리가 프로그램을 만들다 보면
				클래스의 기능 수정을 위해서 오버라이딩을 해야 하는 경우가 발생한다.
				(어쩔 수 없이 오버라이드 해야 하는 경우도 있고,
				인터페이스나 추상클래스를 사용해야 할 경우...)
				
				이 때 원칙적인 규칙에 의해서 
				다른 클래스를 만들고
				그 클래스에 필요한 클래스를 상속을 한 후
				오버라이드를 해야 한다. 
				
				이 때 필요한 기능 하나때문에 상속을 받어 클래스를 만들고
				오버라이드를 해야 한다면 큰 손해이다.
				
				==> 이런경우 상속을 받아 클래스를 만들고 
				오버라이드해서 사용하지 않고 해결할 수 있는 방법으로 
				익명 내부 클래스를 사용한다.
				
				형식]
					new 클래스이름(){}
					
 */ 
public class Test01 {
	JFrame fr;
	JPanel pan;
	JPanel bpan;
	public Test01() {
		fr = new JFrame("Test");
		fr.setLayout(new BorderLayout());
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("종료");
		JButton cbtn = new JButton("색상변경");
		//btn.addActionListener(new BtnEvent());
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			} 
		});
		cbtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//칼라 값을 만들고
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				
				//칼라 객체를 만들고
				Color bg = new Color(red, green, blue);
				
				//패널에 칠하고
				pan.setBackground(bg);
				bpan.setBackground(bg);
			}
		});
		pan = new JPanel();
		//pan 색상변경
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

package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame; // JFrame lib 

public class DynamicBeat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	
	// 생성자 
	public DynamicBeat() {
		setTitle("Dynamic Beat"); // 게임 창 제목
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		// 게임 창의 크기
		setResizable(false); 
		// 게임창이 한번 설정되면 사용자는 줄일 수 없음
		setLocationRelativeTo(null);
		// 게임창이 정 중앙에 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 게임창을 종료했을 때 프로그램을 종료할 수 있게 함
		setVisible(true); 
		// 화면이 출력되도록 해줌
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground(Title).jpg")).getImage();
		// 인트로 배경 이미지를 가져옴
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic); // screenDraw 함수 호출
		g.drawImage(screenImage, 0, 0, null);
				
	} 
	
	public void screenDraw(Graphics g)
	{
		g.drawImage(introBackground,0, 0, null); // 0,0의 위치에서 이미지를 그려줌
		this.repaint(); // repaint => paint 함수를 다시 불러와 반복적으로 그려줌
	}
}

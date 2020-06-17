package dynamic_beat_1;

import javax.swing.JFrame; // JFrame lib 

public class DynamicBeat extends JFrame{
	
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
	}
}

package dynamic_beat_1;

import javax.swing.JFrame; // JFrame lib 

public class DynamicBeat extends JFrame{
	
	// ������ 
	public DynamicBeat() {
		setTitle("Dynamic Beat"); // ���� â ����
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		// ���� â�� ũ��
		setResizable(false); 
		// ����â�� �ѹ� �����Ǹ� ����ڴ� ���� �� ����
		setLocationRelativeTo(null);
		// ����â�� �� �߾ӿ� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ����â�� �������� �� ���α׷��� ������ �� �ְ� ��
		setVisible(true); 
		// ȭ���� ��µǵ��� ����
	}
}

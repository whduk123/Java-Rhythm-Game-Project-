package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame; // JFrame lib 

public class DynamicBeat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	
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
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground(Title).jpg")).getImage();
		// ��Ʈ�� ��� �̹����� ������
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic); // screenDraw �Լ� ȣ��
		g.drawImage(screenImage, 0, 0, null);
				
	} 
	
	public void screenDraw(Graphics g)
	{
		g.drawImage(introBackground,0, 0, null); // 0,0�� ��ġ���� �̹����� �׷���
		this.repaint(); // repaint => paint �Լ��� �ٽ� �ҷ��� �ݺ������� �׷���
	}
}

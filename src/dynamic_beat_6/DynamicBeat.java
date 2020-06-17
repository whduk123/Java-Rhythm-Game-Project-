package dynamic_beat_6;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame; // JFrame lib 
import javax.swing.JLabel;

public class DynamicBeat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
	private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
	private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
	private ImageIcon leftButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/leftButtonEntered.png"));
	private ImageIcon leftButtonBasicImage = new ImageIcon(Main.class.getResource("../images/leftButtonBasic.png"));
	private ImageIcon rightButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/rightButtonEntered.png"));
	private ImageIcon rightButtonBasicImage = new ImageIcon(Main.class.getResource("../images/rightButtonBasic.png"));
	
	private int mouseX, mouseY;
	private boolean isMainScreen = false;
	// ó������ Mainȭ���� �ƴ� ��
	
	private Image titleImage = new ImageIcon(Main.class.getResource("../images/Mighty Love Title Image.png")).getImage();
	private Image selectedImage = new ImageIcon(Main.class.getResource("../images/Mighty Love Start Image.png")).getImage();
	private Image background = new ImageIcon(Main.class.getResource("../images/introBackground(Title).jpg")).getImage();
	// ��Ʈ�� ��� �̹����� ������
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	private JButton exitButton = new JButton(new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png")));
	private JButton startButton = new JButton(new ImageIcon(Main.class.getResource("../images/startButtonBasic.png")));
	private JButton quitButton = new JButton(new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png")));
	private JButton leftButton = new JButton(new ImageIcon(Main.class.getResource("../images/leftButtonBasic.png")));
	private JButton rightButton = new JButton(new ImageIcon(Main.class.getResource("../images/rightButtonBasic.png")));
	
	// ������ 
	public DynamicBeat() {
		setUndecorated(true);
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
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();
		
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3",false);
				buttonEnteredMusic.start();
				try {
					Thread.sleep(1000);
				} catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		add(exitButton);
		
		
		startButton.setBounds(40, 200, 400, 100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3",false);
				buttonEnteredMusic.start();
				introMusic.close();
				Music selectedMusic = new Music("Mighty Love Selected.mp3", true);
				selectedMusic.start();
				// ���� ���� �̺�Ʈ
				startButton.setVisible(false);
				quitButton.setVisible(false);
				leftButton.setVisible(true);
				rightButton.setVisible(true);
				background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();
				isMainScreen = true;
			}
		});
		
		add(startButton);
		
		quitButton.setBounds(40, 330, 400, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3",false);
				buttonEnteredMusic.start();
				try {
					Thread.sleep(1000);
				} catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		add(quitButton);
		
		leftButton.setVisible(false);
		leftButton.setBounds(140, 310, 60, 60);
		leftButton.setBorderPainted(false);
		leftButton.setContentAreaFilled(false);
		leftButton.setFocusPainted(false);
		leftButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				leftButton.setIcon(leftButtonEnteredImage);
				leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				leftButton.setIcon(leftButtonBasicImage);
				leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3",false);
				buttonEnteredMusic.start();
				//���� ��ư �̺�Ʈ
			}
		});
		
		add(leftButton);
		
		rightButton.setVisible(false);
		rightButton.setBounds(1080, 310, 60, 60);
		rightButton.setBorderPainted(false);
		rightButton.setContentAreaFilled(false);
		rightButton.setFocusPainted(false);
		rightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rightButton.setIcon(rightButtonEnteredImage);
				rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
				buttonEnteredMusic.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rightButton.setIcon(rightButtonBasicImage);
				rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e)
			{
				Music buttonEnteredMusic = new Music("buttonPressedMusic.mp3",false);
				buttonEnteredMusic.start();
				//���� ��ư �̺�Ʈ
			}
		});
		
		add(rightButton);
		
		menuBar.setBounds(0, 0, 1280, 30); // ��ġ + ũ�� ����
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();	
			}
		});
		
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
		add(menuBar);
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic); // screenDraw �Լ� ȣ��
		g.drawImage(screenImage, 0, 0, null);
				
	} 
	
	public void screenDraw(Graphics g)
	{
		g.drawImage(background,0, 0, null); // 0,0�� ��ġ���� �̹����� �׷���
		if(isMainScreen)
		{
			g.drawImage(selectedImage, 340, 100, null);
			g.drawImage(titleImage, 340, 70, null);
		}
		paintComponents(g); // menuBar�� �׻� �����Ǿ� ����
		this.repaint(); // repaint => paint �Լ��� �ٽ� �ҷ��� �ݺ������� �׷���
	}
}

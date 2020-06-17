package dynamic_beat_5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	//Thread ? ���α׷� ���� ���� ���α׷�
	
	private Player player; // javazoom ����Ʈ�� library
	private boolean isLoop; // ���� ���� �ݺ�? �ѹ��� ����Ǵ���? ����
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	// ������
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() { // ��Ʈ�� ����߸� �� �ð��� ���߱� ���� �Լ�
		if (player == null)
			return 0;
		return player.getPosition();
	}
	
	public void close() { // �ش� ���� ���������� ����� �� �ְ� ��
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() { // Thread ���� ������������ ����ؾ� �ϴ� �Լ�
		try {
			do {
				player.play(); // ���� ���� ��Ų ����
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			}while (isLoop); // isLoop == true�� ��, �ش� ���� ���� �ݺ����� ����
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}

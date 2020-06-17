package dynamic_beat_5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	//Thread ? 프로그램 안의 작은 프로그램
	
	private Player player; // javazoom 사이트의 library
	private boolean isLoop; // 곡이 무한 반복? 한번만 재생되는지? 설정
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	// 생성자
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
	
	public int getTime() { // 노트를 떨어뜨릴 때 시간을 맞추기 위한 함수
		if (player == null)
			return 0;
		return player.getPosition();
	}
	
	public void close() { // 해당 곡이 안정적으로 종료될 수 있게 함
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() { // Thread 사용시 무조건적으로 사용해야 하는 함수
		try {
			do {
				player.play(); // 곡을 실행 시킨 다음
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			}while (isLoop); // isLoop == true일 시, 해당 곡은 무한 반복으로 실행
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}

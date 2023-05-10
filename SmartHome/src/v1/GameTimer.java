package v1;

public class GameTimer extends Thread {
	private int seconds;
	private Boolean pause=false;
	private String secondsString = String.format("%02d", seconds);
	UI ui;
	VisibilityManager vm;
	int day;
	boolean lose = false;
	
	GameTimer(UI userInt, VisibilityManager vManager){
		ui = userInt;
		vm = vManager;
		seconds = 0;
		day = 1;
	}
	@Override
	public void run() {
		while(day < 6 && lose == false) {
			synchronized(this) {
				seconds = seconds + 1;
				secondsString = String.format("%02d", seconds);
				System.out.println("Game Time:" + secondsString);
				ui.clockLabel.setText(secondsString);
				ui.dayNumberLabel.setText(String.valueOf(day));
				if (seconds % 20 == 0) {
					day++;
				}
				
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(pause) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		if(lose) {
			vm.loseScreen();
		}
		else 
		{
			vm.winScreen();
		}
	}
	
	public int getSecond() {
		return this.seconds;
	}
	
	public String getSecondString() {
		return this.secondsString;
	}
	
	public void pause() {
		pause = true;
	}
	
	public void play() {
		pause = false;
		synchronized(this) {
			this.notify();
		}
	}
	
	
		
	
}

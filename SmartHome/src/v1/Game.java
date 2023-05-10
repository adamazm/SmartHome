package v1;
import package02.*;

public class Game {
	
	UI ui = new UI();
	VisibilityManager vm = new VisibilityManager(ui);
	GameHandler gHandler = new GameHandler(this, ui, vm);
	ButtonHandler bHandler = new ButtonHandler(this);
	boolean start = false;
	int activityDay=1,moneyDay =2 ,tmp=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game();
		
	}
	public Game() {
		
		ui.createUI(bHandler);
		vm.showTitleScreen();
		this.gHandler.defaultSetup();
		
		// CHANGE TEMPERATURE AND HUMIDITY BASE ON WEATHER EACH 5 SECONDS
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(start) {
				System.out.println(gHandler.gTimer.getSecond()); // DEBUG
				
				System.out.println(gHandler.gTimer.day); // DEBUG
				
				
				gHandler.checkTemperature();
				gHandler.checkHumidity();
				
				if(!gHandler.house.haveRegulator) {
					this.weatherChange();
				}
				
				if(gHandler.house.haveSolarPanel && gHandler.weather.weatherName == "Sunny") {
					if(gHandler.gTimer.getSecond() % 3 == 0) {
						gHandler.house.changeEnergy(10);
						ui.energyNumberLabel.setText(String.valueOf(gHandler.house.getEnergy()));
					}
				}
				
				// DAY 1
				if (gHandler.gTimer.day == 1 && activityDay == 1) {
					gHandler.activity = new Cook();
					this.activityAlert();
					//if player do not do activity within 5 seconds = lose
					if(gHandler.gTimer.getSecond()-tmp==5)
					{
						gHandler.gTimer.lose=true;
					}
				}
				
				// DAY 2
				if(gHandler.gTimer.day == 2) {
					gHandler.weather = new Weather_Rainy();
					ui.weatherNameLabel.setText(gHandler.weather.weatherName);
					if (activityDay == 2) {
						gHandler.activity = new Hobby();
						this.activityAlert();
						//if player do not do activity within 5 seconds = lose
						if(gHandler.gTimer.getSecond()-tmp==5)
						{
							gHandler.gTimer.lose=true;
						}
					}
					if(moneyDay == 2) {
						gHandler.player.addMoney();
						ui.moneyNumberLabel.setText(String.valueOf(gHandler.player.getMoney()));
						moneyDay++;
					}
				}
				
				
				// DAY 3
				if(gHandler.gTimer.day == 3) {
					gHandler.weather = new Weather_Snowy();
					ui.weatherNameLabel.setText(gHandler.weather.weatherName);
					if (activityDay == 3) {
						gHandler.activity = new Laundry();
						this.activityAlert();
						//if player do not do activity within 5 seconds = lose
						if(gHandler.gTimer.getSecond()-tmp==5)
						{
							gHandler.gTimer.lose=true;
						}
					}
					if(moneyDay == 3) {
						gHandler.player.addMoney();
						ui.moneyNumberLabel.setText(String.valueOf(gHandler.player.getMoney()));
						moneyDay++;
					}
				}
				
				// DAY 4
				if(gHandler.gTimer.day == 4) {
					gHandler.weather = new Weather_Sunny();
					ui.weatherNameLabel.setText(gHandler.weather.weatherName);
					if (activityDay == 4) {
						gHandler.activity = new Toilet();
						this.activityAlert();
						//if player do not do activity within 5 seconds = lose
						if(gHandler.gTimer.getSecond()-tmp==5)
						{
							gHandler.gTimer.lose=true;
						}
					}
					if(moneyDay == 4) {
						gHandler.player.addMoney();
						ui.moneyNumberLabel.setText(String.valueOf(gHandler.player.getMoney()));
						moneyDay++;
					}
				}
				
				//DAY 5
				if(gHandler.gTimer.day == 5) {
					gHandler.weather = new Weather_Snowy();
					ui.weatherNameLabel.setText(gHandler.weather.weatherName);
					if (activityDay == 5) {
						gHandler.activity = new Cook();
						this.activityAlert();
						//if player do not do activity within 5 seconds = lose
						if(gHandler.gTimer.getSecond()-tmp==5)
						{
							gHandler.gTimer.lose=true;
						}
					}
					if(moneyDay == 5) {
						gHandler.player.addMoney();
						ui.moneyNumberLabel.setText(String.valueOf(gHandler.player.getMoney()));
						moneyDay++;
					}
				}
				
				
				System.out.println("number of activityDay :" + activityDay); // DEBUG
				
				
					
			}
			
		}
		
		
	
	
		
	}
	
	public void weatherChange() {
		if (gHandler.gTimer.getSecond() % 5 == 0) {
			gHandler.house.changeTemperature(gHandler.weather.tempChangeRate);
			gHandler.house.changeHumidity(gHandler.weather.humChangeRate);
			ui.tempNumberLabel.setText(String.valueOf(gHandler.house.getTemperature()));
			ui.humNumberLabel.setText(String.valueOf(gHandler.house.getHumidity()));
		}
	}
	
	public void activityAlert() {
		ui.activityButton.setText(gHandler.activity.sendAlert() + " - " + gHandler.activity.changeEnergy());
		if (gHandler.gTimer.getSecond() % 7 == 0) {
			tmp=gHandler.gTimer.getSecond();
			vm.showActivityButton();
		}
		
	}
	
	public void activityDone() {
		gHandler.house.decreaseEnergy(gHandler.activity.changeEnergy());
		ui.energyNumberLabel.setText(String.valueOf(gHandler.house.getEnergy()));
		vm.hideActivityButton();
		
	}
	
	public void gameRestart() {
		activityDay = 1;
		moneyDay = 2;
		gHandler.gTimer.lose=false;
		gHandler.defaultSetup();
	}
	
	
}

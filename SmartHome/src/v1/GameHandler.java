package v1;

import package02.*;
import package02.Item;
import package02.Item_EnergyPack;
import package02.Weather;
import package02.Weather_Rainy;
import package02.Weather_Snowy;
import package02.Weather_Sunny;

public class GameHandler {
	Game game;
	UI ui;
	VisibilityManager vm;
	Weather weather;
	GameTimer gTimer;
	Item energyPack, solarPanel, regulator;
	Player player;
	House house;
	Activity activity;
	
	public GameHandler(Game g, UI userInt, VisibilityManager vManager) {
		game = g;
		ui = userInt;
		vm = vManager;
	}
	
	public void defaultSetup() {
		// WEATHER SET UP
		weather = new Weather_Sunny();
		ui.weatherNameLabel.setText(weather.weatherName);
		
		// PLAYER SET UP
		player = new Player();
		ui.moneyNumberLabel.setText(String.valueOf(player.getMoney())); // 10000
		
		// HOUSE SET UP
		house = new House();
		ui.energyNumberLabel.setText(String.valueOf(house.getEnergy()));
		ui.tempNumberLabel.setText(String.valueOf(house.getTemperature()));
		ui.humNumberLabel.setText(String.valueOf(house.getHumidity()));
		
		// ITEM IN HOUSE SET UP
		ui.haveRegulatorLabel.setText("Unavailable");
		ui.haveSolarLabel.setText("Unavailable");
		
		// SHOP SET UP
		energyPack = new Item_EnergyPack();
		ui.item1Button.setText(energyPack.getName() + " - " + energyPack.getPrice());
		solarPanel = new Item_SolarPanel();
		ui.item2Button.setText(solarPanel.getName() + " - " + solarPanel.getPrice());
		regulator = new Item_Regulator();
		ui.item3Button.setText(regulator.getName() + " - " + regulator.getPrice());
		
			
	}
	
	public void gameStart() {
		gTimer = new GameTimer(ui, vm);
		gTimer.start();
	}
	
	public void incTemp() {
		if(house.getEnergy() > 0) {
			house.changeTemperature(1);
			house.decreaseEnergy(10);
			ui.energyNumberLabel.setText(String.valueOf(house.getEnergy()));
			ui.tempNumberLabel.setText(String.valueOf(house.getTemperature()));
		}
		
	}
	
	public void decTemp() {
		if(house.getEnergy() > 0) {
			house.changeTemperature(-1);
			house.decreaseEnergy(10);
			ui.energyNumberLabel.setText(String.valueOf(house.getEnergy()));
			ui.tempNumberLabel.setText(String.valueOf(house.getTemperature()));
		}
		
	}
	
	public void incHum() {
		if(house.getEnergy() > 0) {
			house.changeHumidity(1);
			house.decreaseEnergy(10);
			ui.energyNumberLabel.setText(String.valueOf(house.getEnergy()));
			ui.humNumberLabel.setText(String.valueOf(house.getHumidity()));
		}
		
	}
	
	public void decHum() {
		if(house.getEnergy() > 0) {
			house.changeHumidity(-1);
			house.decreaseEnergy(10);
			ui.energyNumberLabel.setText(String.valueOf(house.getEnergy()));
			ui.humNumberLabel.setText(String.valueOf(house.getHumidity()));
		}
		
	}
	
	public void buyEnergy() {
		if (player.getMoney() >= energyPack.getPrice()) {
			player.decreaseMoney(energyPack.getPrice());
			house.changeEnergy(20);
			ui.moneyNumberLabel.setText(String.valueOf(player.getMoney()));
			ui.energyNumberLabel.setText(String.valueOf(house.getEnergy()));
		}
		this.checkMoney();
		
	}
	
	public void buyRegulator() {
		if (player.getMoney() >= regulator.getPrice() && regulator.getStock()) {
			player.decreaseMoney(regulator.getPrice());
			ui.moneyNumberLabel.setText(String.valueOf(player.getMoney()));
			regulator.removeStock();
			ui.item3Button.setText("SOLD OUT");
			house.haveRegulator = true;
			if (house.haveRegulator) {
				ui.haveRegulatorLabel.setText("In Use");
			}
		}
		this.checkMoney();
	}
	
	public void buySolarPanel() {
		if(player.getMoney() >= solarPanel.getPrice() && solarPanel.getStock()) {
			player.decreaseMoney(solarPanel.getPrice());
			ui.moneyNumberLabel.setText(String.valueOf(player.getMoney()));
			solarPanel.removeStock();
			ui.item2Button.setText("SOLD OUT");
			house.haveSolarPanel = true;
			if (house.haveSolarPanel) {
				ui.haveSolarLabel.setText("In Use");
			}
		}
		this.checkMoney();
	}
	
	public void checkMoney() {
		if (player.getMoney() == 0) {
			vm.loseScreen();
		}
	}
	
	public void checkTemperature()
	{
		if (house.getTemperature()<17 || house.getTemperature()>30) {
			gTimer.lose=true;
			vm.loseScreen();
		}
	}
	
	public void checkHumidity()
	{
		if (house.getHumidity()<40 || house.getHumidity()>60) {
			gTimer.lose=true;
			vm.loseScreen();
		}
	}
	
	
	
	
	
	
}

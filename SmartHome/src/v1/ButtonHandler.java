package v1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener{
	
	Game game;
	GameHandler gHandler;
	public ButtonHandler(Game g) {
		game = g;
	}
	
	public void actionPerformed(ActionEvent event) {
		
		String buttonClicked = event.getActionCommand();
		
		switch(buttonClicked) {
		case "start":
			game.start = true;
			
			game.vm.gameScreen();
			game.gHandler.defaultSetup();
			game.gHandler.gameStart();
			
			break;
		case "open shop":
			game.gHandler.gTimer.pause();
			game.vm.hideActivityButton();
			game.vm.shopScreen();
			break;
		case "pause":
			// TIMER PAUSE
			game.gHandler.gTimer.pause();
			game.vm.pauseScreen();
			break;
		case "resume":
			game.gHandler.gTimer.play();
			if(game.activityDay <= game.gHandler.gTimer.day) {
				game.vm.showActivityButton();
			}
			game.vm.gameScreen();
			break;
		case "title":
			game.vm.showTitleScreen();
			game.gameRestart();
			break;
		case "activity":
			// DO ACTIVITY -> DECREASE ENERGY
			game.activityDay++;
			game.activityDone();
			game.vm.hideActivityButton();
			break;
		case "increase T":
			game.gHandler.incTemp();
			break;
		case "decrease T":
			game.gHandler.decTemp();
			break;
		case "increase H":
			game.gHandler.incHum();
			break;
		case "decrease H":
			game.gHandler.decHum();
			break;
		case "item1":
			game.gHandler.buyEnergy();
			break;
		case "item2":
			game.gHandler.buySolarPanel();
			break;
		case "item3":
			game.gHandler.buyRegulator();
			break;
			
			
		}
		
	}
}

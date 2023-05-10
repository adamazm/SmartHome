package v1;

public class VisibilityManager {
	
	UI ui;
	
	
	public VisibilityManager(UI userInt) {
		ui = userInt;
	}
	
	public void showTitleScreen() {
		
		// SHOW TITLE SCREEN
		ui.titleNamePanel.setVisible(true);
		ui.titleNameLabel.setText("Smart Home");
		ui.startButtonPanel.setVisible(true);
		ui.startButton.setText("START");
		ui.startButton.setActionCommand("start");
		
		// HIDE GAME SCREEN
		ui.currencyPanel.setVisible(false);
		ui.shopButtonPanel.setVisible(false);
		ui.housePanel.setVisible(false);
		ui.weatherPanel.setVisible(false);
		ui.pauseButtonPanel.setVisible(false);
		ui.house.setVisible(false);
		ui.dayPanel.setVisible(false);
		ui.itemPanel.setVisible(false);
		ui.activityButtonPanel.setVisible(false);
		ui.changePanel.setVisible(false);
		ui.clockPanel.setVisible(false);
		
		// HIDE SHOP SCREEN
		ui.shopPanel.setVisible(false);
		
		ui.window.setVisible(true);
		
	}
	
	public void gameScreen() {
		// HIDE TITLE SCREEN
		ui.titleNamePanel.setVisible(false);
		ui.startButtonPanel.setVisible(false);
				
		// SHOW GAME SCREEN
		ui.currencyPanel.setVisible(true);
		ui.shopButton.setText("SHOP");
		ui.shopButton.setActionCommand("open shop");
		ui.shopButtonPanel.setVisible(true);
		ui.housePanel.setVisible(true);
		ui.house.setVisible(true);
		ui.weatherPanel.setVisible(true);
		ui.pauseButtonPanel.setVisible(true);
		ui.pauseButton.setText("II");
		ui.pauseButton.setActionCommand("pause");
		ui.dayPanel.setVisible(true);
		ui.itemPanel.setVisible(true);
		ui.changePanel.setVisible(true);
		ui.clockPanel.setVisible(true);
		
		// HIDE SHOP SCREEN
		ui.shopPanel.setVisible(false);

		ui.window.setVisible(true);
	}
	
	public void pauseScreen() {
		// HIDE GAME SCREEN
		ui.currencyPanel.setVisible(false);
		ui.shopButtonPanel.setVisible(false);
		ui.housePanel.setVisible(false);
		ui.weatherPanel.setVisible(false);
		ui.pauseButtonPanel.setVisible(false);
		ui.house.setVisible(false);
		ui.dayPanel.setVisible(false);
		ui.itemPanel.setVisible(false);
		ui.activityButtonPanel.setVisible(false);
		ui.changePanel.setVisible(false);
		ui.clockPanel.setVisible(false);
		
		// HIDE SHOP SCREEN
		ui.shopPanel.setVisible(false);
		
		// SHOW PAUSE SCREEN
		ui.pauseButtonPanel.setVisible(true);
		ui.pauseButton.setText("►");
		ui.pauseButton.setActionCommand("resume");
		ui.titleNamePanel.setVisible(true);
		ui.titleNameLabel.setText("Pause");
		ui.startButtonPanel.setVisible(true);
		ui.startButton.setText("Quit Game");
		ui.startButton.setActionCommand("title");
	}
	
	public void showActivityButton() {
		ui.activityButtonPanel.setVisible(true);
	}
	
	public void hideActivityButton() {
		ui.activityButtonPanel.setVisible(false);
	}
	
	public void loseScreen() {
		// HIDE GAME SCREEN
		ui.currencyPanel.setVisible(false);
		ui.shopButtonPanel.setVisible(false);
		ui.housePanel.setVisible(false);
		ui.weatherPanel.setVisible(false);
		ui.pauseButtonPanel.setVisible(false);
		ui.house.setVisible(false);
		ui.dayPanel.setVisible(false);
		ui.itemPanel.setVisible(false);
		ui.activityButtonPanel.setVisible(false);
		ui.changePanel.setVisible(false);
		ui.clockPanel.setVisible(false);
		
		// HIDE SHOP SCREEN
		ui.shopPanel.setVisible(false);
		
		// SHOW LOSE SCREEN
		ui.titleNameLabel.setText("YOU LOSE");
		ui.titleNamePanel.setVisible(true);
		ui.startButton.setText("Return to Title");
		ui.startButton.setActionCommand("title");
		ui.startButtonPanel.setVisible(true);
	}
	
	public void winScreen() {
		// HIDE GAME SCREEN
		ui.currencyPanel.setVisible(false);
		ui.shopButtonPanel.setVisible(false);
		ui.housePanel.setVisible(false);
		ui.weatherPanel.setVisible(false);
		ui.pauseButtonPanel.setVisible(false);
		ui.house.setVisible(false);
		ui.dayPanel.setVisible(false);
		ui.itemPanel.setVisible(false);
		ui.activityButtonPanel.setVisible(false);
		ui.changePanel.setVisible(false);
		ui.clockPanel.setVisible(false);
		
		// HIDE SHOP SCREEN
		ui.shopPanel.setVisible(false);
		
		// SHOW LOSE SCREEN
		ui.titleNameLabel.setText("YOU WIN");
		ui.titleNamePanel.setVisible(true);
		ui.startButton.setText("Return to Title");
		ui.startButton.setActionCommand("title");
		ui.startButtonPanel.setVisible(true);
	}
	
	public void shopScreen() {
		// SHOW SHOP SCREEN
		ui.shopPanel.setVisible(true);
		ui.shopButton.setText("CLOSE SHOP");
		ui.shopButton.setActionCommand("resume");
		ui.shopButtonPanel.setVisible(true);
		ui.currencyPanel.setVisible(true);
		
		// HIDE GAME SCREEN
		ui.housePanel.setVisible(false);
		ui.weatherPanel.setVisible(false);
		ui.pauseButtonPanel.setVisible(false);
		ui.house.setVisible(false);
		ui.dayPanel.setVisible(false);
		ui.itemPanel.setVisible(false);
		ui.activityButtonPanel.setVisible(false);
		ui.changePanel.setVisible(false);
		ui.clockPanel.setVisible(false);
	}
}

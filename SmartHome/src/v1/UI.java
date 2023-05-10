package v1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UI {
	
	JFrame window;
	JPanel titleNamePanel, startButtonPanel, currencyPanel, housePanel, shopPanel, shopButtonPanel,
	weatherPanel, pauseButtonPanel, dayPanel, itemPanel, activityButtonPanel, changePanel, clockPanel;
	JLabel titleNameLabel, moneyLabel, moneyNumberLabel, energyLabel, energyNumberLabel,
	tempLabel, tempNumberLabel, humLabel, humNumberLabel, weatherLabel, weatherNameLabel,
	dayLabel, dayNumberLabel, regulatorLabel, haveRegulatorLabel, solarLabel, haveSolarLabel, clockLabel;
	HouseShape house;
	JButton startButton, shopButton, pauseButton, activityButton, incTempButton, decTempButton, incHumButton, decHumButton,
	item1Button, item2Button, item3Button;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 23);
	Font smallFont = new Font("Times New Roman", Font.PLAIN, 12);
	
	public void createUI(ButtonHandler bHandler) {
		
		// WINDOW
		window = new JFrame("Smart Home");
		window.setSize(1000, 800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setLayout(null);
		
		
		// TITLE SCREEN
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(200, 100, 600, 500);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("Smart Home");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(400, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.setFocusPainted(false);
		startButton.addActionListener(bHandler);
		startButton.setActionCommand("start");
		startButtonPanel.add(startButton);
		
		window.add(titleNamePanel);
		window.add(startButtonPanel);				
		
		// GAME SCREEN
		// SHOP BUTTON
		shopButtonPanel = new JPanel();
		shopButtonPanel.setBounds(20, 650, 200, 100);
		shopButtonPanel.setBackground(Color.black);
		shopButton = new JButton("SHOP");
		shopButton.setBackground(Color.black);
		shopButton.setForeground(Color.white);
		shopButton.setFont(normalFont);
		shopButton.setFocusPainted(false);
		shopButton.addActionListener(bHandler);
		shopButton.setActionCommand("open shop");
		shopButtonPanel.add(shopButton);
		window.add(shopButtonPanel);
		
		// PAUSE BUTTON
		pauseButtonPanel = new JPanel();
		pauseButtonPanel.setBounds(20, 20, 100, 100);
		pauseButtonPanel.setBackground(Color.black);
		pauseButton = new JButton("II");
		pauseButton.setBackground(Color.black);
		pauseButton.setForeground(Color.white);
		pauseButton.setFont(normalFont);
		pauseButton.setFocusPainted(false);
		pauseButton.addActionListener(bHandler);
		pauseButton.setActionCommand("pause");
		pauseButtonPanel.add(pauseButton);
		window.add(pauseButtonPanel);
		
		// ACTIVITY BUTTON
		activityButtonPanel = new JPanel();
		activityButtonPanel.setBounds(250, 330, 200, 100);
		activityButtonPanel.setBackground(Color.black);
		activityButton = new JButton("Test Activity");
		activityButton.setBackground(Color.black);
		activityButton.setForeground(Color.white);
		activityButton.setFont(smallFont);
		activityButton.setFocusPainted(false);
		activityButton.addActionListener(bHandler);
		activityButton.setActionCommand("activity");
		activityButtonPanel.add(activityButton);
		window.add(activityButtonPanel);
		
		// BUY ITEM BUTTON (3 BUTTON)
		shopPanel = new JPanel();
		shopPanel.setBounds(250, 200, 500, 300);
		shopPanel.setBackground(Color.black);
		shopPanel.setLayout(new GridLayout(3, 1));
		window.add(shopPanel);
		
		item1Button = new JButton("Item 1");
		item1Button.setBackground(Color.black);
		item1Button.setForeground(Color.white);
		item1Button.setFont(normalFont);
		item1Button.setFocusPainted(false);
		item1Button.addActionListener(bHandler);
		item1Button.setActionCommand("item1");
		shopPanel.add(item1Button);
		
		item2Button = new JButton("Item 2");
		item2Button.setBackground(Color.black);
		item2Button.setForeground(Color.white);
		item2Button.setFont(normalFont);
		item2Button.setFocusPainted(false);
		item2Button.addActionListener(bHandler);
		item2Button.setActionCommand("item2");
		shopPanel.add(item2Button);
		
		item3Button = new JButton("Item 3");
		item3Button.setBackground(Color.black);
		item3Button.setForeground(Color.white);
		item3Button.setFont(normalFont);
		item3Button.setFocusPainted(false);
		item3Button.addActionListener(bHandler);
		item3Button.setActionCommand("item3");
		shopPanel.add(item3Button);
		
		
		// CHANGE TEMPERATURE AND HUMIDITY BUTTONS
		changePanel = new JPanel();
		changePanel.setBounds(650, 200, 70, 300);
		changePanel.setLayout(new GridLayout(4, 1));
		changePanel.setBackground(Color.black);
		
		incTempButton = new JButton("↑"); // Increase Temperature Button
		incTempButton.setBackground(Color.black);
		incTempButton.setForeground(Color.white);
		incTempButton.setFont(normalFont);
		incTempButton.setFocusPainted(false);
		incTempButton.addActionListener(bHandler);
		incTempButton.setActionCommand("increase T");
		changePanel.add(incTempButton);
		
		decTempButton = new JButton("↓"); // Decrease Temperature Button
		decTempButton.setBackground(Color.black);
		decTempButton.setForeground(Color.white);
		decTempButton.setFont(normalFont);
		decTempButton.setFocusPainted(false);
		decTempButton.addActionListener(bHandler);
		decTempButton.setActionCommand("decrease T");
		changePanel.add(decTempButton);
		
		incHumButton = new JButton("↑"); // Increase Humidity Button
		incHumButton.setBackground(Color.black);
		incHumButton.setForeground(Color.white);
		incHumButton.setFont(normalFont);
		incHumButton.setFocusPainted(false);
		incHumButton.addActionListener(bHandler);
		incHumButton.setActionCommand("increase H");
		changePanel.add(incHumButton);
		
		decHumButton = new JButton("↓"); // Decrease Humidity Button
		decHumButton.setBackground(Color.black);
		decHumButton.setForeground(Color.white);
		decHumButton.setFont(normalFont);
		decHumButton.setFocusPainted(false);
		decHumButton.addActionListener(bHandler);
		decHumButton.setActionCommand("decrease H");
		changePanel.add(decHumButton);
		
		window.add(changePanel);
		
		// CURRENCY (Money and Energy)
		currencyPanel = new JPanel();
		currencyPanel.setBounds(150, 20, 550, 50);
		currencyPanel.setBackground(Color.black);
		currencyPanel.setLayout(new GridLayout(1, 4));
		window.add(currencyPanel);
		
		moneyLabel = new JLabel("Money : ");
		moneyLabel.setForeground(Color.white);
		moneyLabel.setFont(normalFont);
		currencyPanel.add(moneyLabel);
		
		moneyNumberLabel = new JLabel();
		moneyNumberLabel.setForeground(Color.white);
		moneyNumberLabel.setFont(normalFont);
		currencyPanel.add(moneyNumberLabel);
		
		energyLabel = new JLabel("Energy : ");
		energyLabel.setForeground(Color.white);
		energyLabel.setFont(normalFont);
		currencyPanel.add(energyLabel);
		
		energyNumberLabel = new JLabel();
		energyNumberLabel.setForeground(Color.white);
		energyNumberLabel.setFont(normalFont);
		currencyPanel.add(energyNumberLabel);
		
		// HOUSE'S TEMPERATURE AND HUMIDITY
		housePanel = new JPanel();
		housePanel.setBounds(800, 200, 200, 300);
		housePanel.setBackground(Color.black);
		housePanel.setForeground(Color.white);
		housePanel.setLayout(new GridLayout(2, 2));
		window.add(housePanel);
		
		tempLabel = new JLabel("T : ");
		tempLabel.setForeground(Color.white);
		tempLabel.setFont(normalFont);
		housePanel.add(tempLabel);
		
		tempNumberLabel = new JLabel();
		tempNumberLabel.setForeground(Color.white);
		tempNumberLabel.setFont(normalFont);
		housePanel.add(tempNumberLabel);
		
		humLabel = new JLabel("H : ");
		humLabel.setForeground(Color.white);
		humLabel.setFont(normalFont);
		housePanel.add(humLabel);
		
		humNumberLabel = new JLabel();
		humNumberLabel.setForeground(Color.white);
		humNumberLabel.setFont(normalFont);
		housePanel.add(humNumberLabel);
		
		// WEATHER PANEL
		weatherPanel = new JPanel();
		weatherPanel.setBounds(650, 600, 300, 50);
		weatherPanel.setBackground(Color.black);
		weatherPanel.setForeground(Color.white);
		weatherPanel.setLayout(new GridLayout(1,2));
		window.add(weatherPanel);
		
		weatherLabel = new JLabel("Weather : ");
		weatherLabel.setForeground(Color.white);
		weatherLabel.setFont(normalFont);
		weatherPanel.add(weatherLabel);
		
		weatherNameLabel = new JLabel();
		weatherNameLabel.setForeground(Color.white);
		weatherNameLabel.setFont(normalFont);
		weatherPanel.add(weatherNameLabel);
		
		// HOUSE (A SIMPLE RECTANGLE)
		house = new HouseShape();
		window.add(house);
		
		// DAY PANEL
		dayPanel = new JPanel();
		dayPanel.setBounds(750, 20, 300, 50);
		dayPanel.setBackground(Color.black);
		dayPanel.setLayout(new GridLayout(1,2));
		window.add(dayPanel);
		
		dayLabel = new JLabel("Day ");
		dayLabel.setForeground(Color.white);
		dayLabel.setFont(normalFont);
		dayPanel.add(dayLabel);
		
		dayNumberLabel = new JLabel();
		dayNumberLabel.setForeground(Color.white);
		dayNumberLabel.setFont(normalFont);
		dayPanel.add(dayNumberLabel);
		
		// ITEM PANEL
		itemPanel = new JPanel();
		itemPanel.setBounds(300, 600, 300, 100);
		itemPanel.setBackground(Color.black);
		itemPanel.setLayout(new GridLayout(2, 2));
		window.add(itemPanel);
		
		regulatorLabel = new JLabel("Regulator : ");
		regulatorLabel.setForeground(Color.white);
		regulatorLabel.setFont(normalFont);
		itemPanel.add(regulatorLabel);
		
		haveRegulatorLabel = new JLabel();
		haveRegulatorLabel.setForeground(Color.white);
		haveRegulatorLabel.setFont(normalFont);
		itemPanel.add(haveRegulatorLabel);
		
		solarLabel = new JLabel("Solar Panel : ");
		solarLabel.setForeground(Color.white);
		solarLabel.setFont(normalFont);
		itemPanel.add(solarLabel);
		
		haveSolarLabel = new JLabel();
		haveSolarLabel.setForeground(Color.white);
		haveSolarLabel.setFont(normalFont);
		itemPanel.add(haveSolarLabel);
		
		// CLOCK (FOR DEV)
		clockPanel = new JPanel();
		clockPanel.setBackground(Color.black);
		clockPanel.setBounds(650, 700, 100, 50);
		window.add(clockPanel);
		
		clockLabel = new JLabel();
		clockLabel.setForeground(Color.white);
		clockLabel.setFont(normalFont);
		clockPanel.add(clockLabel);
		
		//window.setVisible(true);
		
		
		
		
	}
}

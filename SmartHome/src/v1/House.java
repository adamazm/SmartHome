package v1;

public class House {

	//The attributes of House 
	private int energy,humidity, temperature; 
	public boolean haveSolarPanel, haveRegulator ;  
	
	
	//Constructor which automatically initialize all the value of the house parameter at the beginning of the game
	public House() {
		this.temperature = 20 ; 
		this.humidity = 50;
		this.energy = 500 ; 
		
		this.haveSolarPanel = false ; 
		this.haveRegulator = false ;		
	}
	
	
	//All the get methods to access the value
	public int getTemperature() {
		return this.temperature ; 
	}
	
	public int getHumidity() {
		return this.humidity; 
	}
	
	public int getEnergy() {
		return this.energy ; 
	}
	
	public void decreaseEnergy(int diff) {
		this.energy = this.energy - diff;
	}
	
	
	//To change all the parameters of the house.Value "diff" can be negative or positive depending whether it is the decrease or increase of parameter
	//Other class which may cause changes of the house parameter can change it directly using these methods so setiap class takyah define, just guna this method je
	public void changeTemperature(int diff) {
		this.temperature = this.temperature + diff ;
	}
	
	public void changeHumidity(int diff) {
		this.humidity = this.humidity + diff ;
	}
	
	public void changeEnergy(int diff) {
		this.energy = this.energy + diff ; 
	}
	
	
	//To activate or deactivate the item once it is bought 
//	public void setPanelUse(boolean b) {
//		this.PanelUse=b;
//		
//	}
//	
//	public void setAutoTempUse(boolean b) {
//		this.AutoTempUse=b ;
//	}
}

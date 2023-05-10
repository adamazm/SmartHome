# SmartHome
A mini game about conserving a smart home written in java

Note :
1. The packages name is not making any sense as it was the 1st time we learned how to used packages and didn't want to risk the program by changing the name of the package
2. We ran the program using Eclipse IDE, thats why there is no executable
3. The goal of the project is to understand OOP(Object-oriented programming) in general and MVC(Model-View-Controller)

This is a document to explain the functionality of the game.  
The player should know these rules before playing.

--------HOW TO PLAY--------

1. Player has to survive for 5 days, to win the game. It is also required for the player to do activities in the house. 

2. During these 5 days, the player must make sure that the temperature and humidity of the house is in the ideal range.
   In order to do that, the player can adjust it manually or by using the items in the shop. 
   The player must also keep in mind that there are different weathers during those 5 days. Therefore, the player should manage the money and parameters of the house wisely.

3. To use the items , the player needs to buy it from the shop in the game using the money allocated.
   The item mentioned are as below : 

   Regulator : To regulate the temperature and humidity automatically 
   Solar Panel : To increase the energy especially when it is sunny 
   Energy pack : To increase energy immediately when the player is running out of energy to do activity
 


--------GAME OVER--------

The player is considered lost if at least one of these conditions is fulfilled : 

1. The temperature of the hose is lesser than 17 or more than 30.
2. The humidity of the house is lesser than 40 or more than 60.
3. The money is 0.
4. Activity is not done in the required time (which is 5s in this game). 

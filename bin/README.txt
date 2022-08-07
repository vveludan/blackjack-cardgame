JDK Version: 11.0.15

Instructions to Run App:
1. Down load the project.
2. Import as Java Project
3. Run BlackJackApp from any IDE.

NOTE1: number of players is set right with in BlackJackApp. Change numberOfPlayers variable to vary player number.

Used Strategy pattern for:
1. implementing game strategy
2. message formatting for game status.

NOTE2: Game is polluted with game strategy in Game.processDealerActions(). 
This logic could have been extracted into BlackJackStrategy as a contract.
Due to time constraint could not refactor

Game.processPlayerAction() handles player interaction
Game.processDealerActions() handles dealer actions

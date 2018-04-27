import java.util.Scanner;
public class GameStore {

	Game[] games;
	int numGames;
    static final int MAX_SIZE=50;
    
    public GameStore() {
    	games=new Game[MAX_SIZE];
    	numGames=0;
    }
	
    public int findGameById(int id) {
    	for(int i=0 ; i<numGames ; i++)
    		if(games[i].getId()==id)
    			return i;
    	return -1;
    }
    
    public int findGameByName(String name) {
    	for(int i=0 ; i<numGames ; i++)
    		if(games[i].getName().equalsIgnoreCase(name))
    			return i;
    	return -1;
    }
    
    public boolean addGame(Game g) {
    	if(numGames<MAX_SIZE) {
    		if(findGameById(g.getId())==-1) {
    		games[numGames]=g; numGames++;
    		return true;}}
    	return false;
    }
    
    public boolean deleteGame(Game g) {
    	if(findGameByName(g.getName())!=-1) {
    		games[findGameByName(g.getName())]=games[--numGames];
    	    games[numGames]=null; return true;}
    	return false;
    }
    
    public void display(int i) {
    System.out.println("id: "+games[i].getId()+"\nName: "+games[i].getName()+"\nPrice: "+games[i].getPrice());	
    }
	
    public int getNumGames() {
		return numGames;
	}
}

import java.util.Scanner;

public class TestGameStore {
	public static void main(String[] args) {
	     GameStore gs=new GameStore(); Game g;
	     int option; Scanner s=new Scanner(System.in);
	     System.out.println("=----Welcome");
	     do {
	    	 System.out.println("\n1-Add to invenory.\n2-Sell to customer.\n3-Find game by id.\n4-Find game by name."); option=s.nextInt();
	     
	     switch(option) {
	     case 1: System.out.println("Enter id, name, and price of the game.");
	             g=new Game(s.nextInt(), s.next(), s.nextDouble());
	             if(gs.addGame(g))
	            	 System.out.println("Add complete.");
	             else
	            	 System.out.println("There has been an error...");
	             break;
	     
	     case 2: 
	    	 double total=0;
	    	 if(gs.getNumGames()!=0) {
	    	     System.out.println("Enter id(-1 to stop).");
	             int temp=s.nextInt();  double temp2;
	             while(temp!=-1) {
	             temp2=gs.games[gs.findGameById(temp)].getPrice();
	             if(gs.deleteGame(gs.games[gs.findGameById(temp)])) 
	             total+=temp2;
	             
	             if(gs.getNumGames()!=0) {
	             System.out.println("Enter id(-1 to stop).");
	             temp=s.nextInt();} else  {System.out.println("You don't have any game in store..."); break;}
	             }}
	             else 
	            	 System.out.println("You don't have any game in store...");
	             System.out.println("The total price is: "+total); //Fix this.........
	             break;
	             
	     
	     case 3: System.out.println("Enter id of the game.");
	             int temp=gs.findGameById(s.nextInt());
	             System.out.println("The game index is: "+temp);
	             gs.display(temp);
	             break;
	             
	     case 4: System.out.println("Enter the name of the game");
	             temp=gs.findGameByName(s.next());
	             System.out.println("The index of the game is: "+temp);
	             gs.display(temp);
	             break;
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     }while(option!=0);
		}
		

}

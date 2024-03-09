 import board.Board;
import game.Game;
import player.Player;
//import java.util.Scanner;

 
 //importing Board class from board package
 public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First project-> Tic Tac Toe"); 
        Board b=new Board(3,'-');
        //b.printBoardConf();
       // Scanner sc=new Scanner(System.in);
        //System.out.print("Enter the name of the player:");
        //String name=sc.nextLine();
        //System.out.print("Enter the symbol of the player:");
        //char defsymbol=sc.nextLine().charAt(0);
        Player p1=new Player();
       p1.setplayerNameSym("Ravi",'x');     
       p1.getPlayerNameSym();
       Player p2=new Player();
       p2.setplayerNameSym("Arpitha",'o');
       p2.getPlayerNameSym();
       Game game  = new Game(new Player[] {p1, p2}, b);
      game.play();

    }
}
   

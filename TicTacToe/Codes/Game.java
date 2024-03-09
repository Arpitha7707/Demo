package game;
import player.Player;
import board.Board;
import java.util.Scanner;
public class Game {
 Player[] players;
 Board board;
 int turn;
 int noOfMoves;
 boolean gameOver;
 String zero;
 String cross;

 public Game( Player[] players,Board board){
    this.players=players;
    this.board=board;
    this.turn=0;
    this.noOfMoves=0;
    this.gameOver=false;
    StringBuilder z=new StringBuilder();
    StringBuilder c=new StringBuilder();
    for(int i=0;i<board.size;i++){
        z.append('o');
        c.append('x');
    }
    this.zero=z.toString();
    this.cross=c.toString();


 }
 public void printBoardConf(){
    int si=this.board.size;
    for(int i=0;i<si;i++){
        for(int j=0;j<si;j++){
            System.out.print(board.matrix[i][j] + " ");
        }
        System.out.println();
    }

 }
 public void play(){
    printBoardConf();
    int si=board.size;
    while(!gameOver){
       noOfMoves++;
       int index=getIndex(); 
       int row=index/si;
       int col=index%si;
       
       board.matrix[row][col]=players[turn].getPlayerSym();
       if(noOfMoves>=si*si){
        System.out.println("Game draw");
        return;
       }
       if(noOfMoves>=2*si-1 && checkCombination()==true){
        gameOver=true;
         printBoardConf();
         System.out.println("Winner is:" + players[turn].getPlayerName());
         return;
       }
       turn=(turn+1)%2;
       printBoardConf();

    }

 }
 public int getIndex(){
    while(true){
        System.out.println("Player: " + players[turn].getPlayerName() + " give one position") ;
        Scanner sc=new Scanner(System.in);
        int pos=sc.nextInt()-1;
        int si=board.size; 
        int row=pos/si;
        int col=pos%si;
        if(row<0 || row>=si ||col<0 || col>=si ){
            System.out.println("Inavlid position");
            continue;
        }
        if(board.matrix[row][col] != '-'){
            System.out.println("Position is already occupied");
            continue;
        }
        return pos;

    }

  }
  public boolean checkCombination(){
    int si=board.size;
    for(int i=0;i<si;i++){
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<si;j++){
          sb.append(board.matrix[j][i]);
        }
        String pattern=sb.toString();
        if (pattern.equals(zero) || pattern.equals(cross)){
          return true;
        }
    }
    //Diagonal
    int i=0,j=0;
    StringBuilder sb=new StringBuilder();
    while(i<si){
        sb.append(board.matrix[i][j]);
        i++;
        j++;
    }
    String pattern  =sb.toString();
    if(pattern.equals(zero)||pattern.equals(cross)){
        return true;
    }
    //antidiagonal
     i=0;j=si-1;
    sb=new StringBuilder();
    while(i<si){
        sb.append(board.matrix[i][j]);
        i++;
        j--;
    }
    pattern  =sb.toString();
    if(pattern.equals(zero)||pattern.equals(cross)){
        return true;
    }

    return false;
  }
}

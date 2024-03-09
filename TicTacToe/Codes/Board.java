package board;

public class Board {
   public int size;
   public char matrix[][];
   public Board(int size,char defsymbol){
     this.size=size;
     matrix=new char[size][size];
     for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            matrix[i][j]=defsymbol ;  
        }
     }
   }
   public void setDefaultSymbol(char defsymbol){
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
          matrix[i][j]= defsymbol; 
      }
   }
   }
  public void printBoardConf()
  {
    int si =this.size;
     for(int i=0;i<si;i++){
      for(int j=0;j<si;j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
     }
  }
}

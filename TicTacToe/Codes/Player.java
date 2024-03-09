package player;

public class Player {
    private String name;
    private char defsymbol;
    private String address;
    private String contactnum;
    private String emailID;
    private int age;
    public void setPlayerDetails(String name , char defsymbol,String address,String contactnum,String emailID,int age){
        this.name=name;
        this.defsymbol=defsymbol;
        this.address=address;
        this.contactnum=contactnum;
        this.emailID=emailID;
        this.age=age;
    }
    public void setPlayerNameAge(String name,int age){
        this.name=name;
        this.age=age;
        
    }
    public void setPlayerNameSymEmailAge(String name,char defsymbol,String emailID,int age) {
        this.name=name;
        this.defsymbol=defsymbol;
        this.emailID=emailID;
        this.age=age;
    }
    public void changeSym(char defsymbol){
        this.defsymbol=defsymbol;
    }
    public void setplayerNameSym(String name,char defsymbol){
        this.name=name;
        this.defsymbol=defsymbol;
    }
    public String getPlayerName(){
        return this.name;
    }
    public char getPlayerSym(){
        return this.defsymbol;
    }
    public void getPlayerNameSym(){
        System.out.println("Player name: " + this.name);
        System.out.println("Player symbol:  " + this.defsymbol);
    }
    public void getNameAge(){
        System.out.println("Player name: " + this.name);
        System.out.println("Player age: " + this.age);
    }
    public void getPlayerDetails(){
        System.out.println("Player name: " + this.name);
        System.out.println("Player symbol: " + this.defsymbol);
        System.out.println("Player address:" + this.address);
        System.out.println("Player contactNumber: " + this.contactnum);
        System.out.println("Player emailID: " + this.emailID);
        System.out.println("Player age: " + this.age);
    }
    }


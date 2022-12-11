import java.util.Scanner;
import java.util.Random;


public class PisMain {
    public static void main(String[] args) { 

String[][] demodeck = new String[4][13];
String[] realdeck = new String[52];

for(int i=0; i<4 ; i++){
for(int j=0; j<13 ; j++){
demodeck[i][j] = "";
}
}

    demodeck = cardassign(demodeck);  //i used this func because its easy way to assign strings.. 


int t = 0;
for(int i=0; i<4 ; i++){
for(int j=0; j<13 ; j++){
        
   realdeck[t] = demodeck[i][j];     //a one dimensional array easy for shuffle. 
t++;
}
}


PistiShuffle shuf = new PistiShuffle(realdeck);
PistiCut cutter = new PistiCut(realdeck);

//realdeck = shuf.Shufunc();    //realdeck shuffled !
//realdeck = cutter.ComputerCuts();  it should assign in game... 





/*-------------testing---------------------------

for(int i=0; i<52; i++){

   System.out.println(realdeck[i]);
}
//----------------------------------------------- 

System.out.println("--------------------------------------------cutted------------------------------------");

realdeck = cutter.ComputerCuts();


//-------------testing---------------------------

for(int i=0; i<52; i++){

   System.out.println(realdeck[i]);
}
//-----------------------------------------------*/ 

    }


public static String[][] cardassign(String[][] deck){


 String spade = Character.toString((char)6);
 String club = Character.toString((char)5);
 String diamond = Character.toString((char)4);
 String heart = Character.toString((char)3);


//-------------------------------Setting Strings-----------------------------------------
//--------------------------------set spade-------------------------------------
for(int i=1; i<10; i++){
    String c = Integer.toString(i+1);     //setted Spades [0][whatever] 
    deck[0][i] = spade + c;
}

deck[0][0] = spade + "A";
deck[0][10] = spade + "J";
deck[0][11] = spade + "Q";
deck[0][12] = spade + "K";

//----------------------Set Club-----------------------------------
for(int i=1; i<10; i++){
    String c = Integer.toString(i+1);     //setted clubs [0][whatever] 
    deck[1][i] = club + c;
}

deck[1][0]  = club + "A";
deck[1][10] = club + "J";
deck[1][11] = club + "Q";
deck[1][12] = club + "K";

//----------------------set diamond------------------------------------
for(int i=1; i<10; i++){
    String c = Integer.toString(i+1);     //setted Spades [0][whatever] 
    deck[2][i] = diamond + c;
}

deck[2][0]  = diamond + "A";
deck[2][10] = diamond + "J";
deck[2][11] = diamond + "Q";
deck[2][12] = diamond + "K";

//----------------------set heart-----------------------------------------------------
for(int i=1; i<10; i++){
    String c = Integer.toString(i+1);     //setted Spades [0][whatever] 
    deck[3][i] = heart + c;
}

deck[3][0]  = heart + "A";
deck[3][10] = heart + "J";
deck[3][11] = heart + "Q";
deck[3][12] = heart + "K";

return deck;

}


//--------------VARİABLES, ARRAYS FOR GAME---------------------------------------------

int score = 0; 
int decksonboard = 0;
String[] playerdeck = new String[4];  //0 to 3
String[] comptrdeck = new String[4];  //0 to 3
String[] board = new String[52];
String[] playershas = new String[52];
String[] comptrshas = new String[52];




public static void game(String[] deck) {

Random rd = new Random();
Scanner scn = new Scanner(System.in);

int k = rd.nextInt(2);

PistiShuffle shuf = new PistiShuffle(deck);
PistiCut cutter = new PistiCut(deck);

System.out.println("Shuffling...");
deck = shuf.Shufunc();

System.out.println("Cutting...");
if(k == 0){
deck = cutter.PlayerCuts();
}
if(k == 1){
deck = cutter.ComputerCuts();
}








}



}




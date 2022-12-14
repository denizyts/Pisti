import java.util.Scanner;
import java.util.Random;


public class PisMain {
    public static void main(String[] args) { 


String[] realdeck = new String[52];



PistiShuffle shuf = new PistiShuffle(realdeck);
PistiCut cutter = new PistiCut(realdeck);
PistiDeck assign = new PistiDeck(realdeck);

realdeck = assign.DeckStr();


//realdeck = shuf.Shufunc();    //realdeck shuffled !
//realdeck = cutter.ComputerCuts();  it should assign in game... 





//-------------testing---------------------------

for(int i=0; i<52; i++){

   System.out.println(realdeck[i]);

    }
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

Scanner scn = new Scanner(System.in);


PistiShuffle shuf = new PistiShuffle(deck);
PistiCut cutter = new PistiCut(deck);

System.out.println("Shuffling...");
deck = shuf.Shufunc();

System.out.println("Cutting...");
deck = cutter.ComputerCuts();









    }
    

}







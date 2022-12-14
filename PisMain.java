import java.util.Scanner;
import java.util.Random;


public class PisMain {
    public static void main(String[] args) { 


String[] realdeck = new String[52];

PistiDeck assign = new PistiDeck(realdeck);

realdeck = assign.DeckStr();    //deck assigned in here. 

game(realdeck);   //game starts here !!




    }







public static void game(String[] deck) {




//--------------VARİABLES, ARRAYS FOR GAME---------------------------------------------

int score = 0; 
int decksonboard = 0;
String[] playerdeck = new String[4];    //0 to 3
String[] comptrdeck = new String[4];    //0 to 3
String[] board = new String[52];
String[] playershas = new String[52];
String[] comptrshas = new String[52];
int quantity = 0;    //computer and player throw card 24 times on the board !!!!!!!
int deckdist = 0;   //where we are when distributing ??

//---------------------------------------------------------------------------------------


Scanner scn = new Scanner(System.in);

System.out.println("WELCOME TO PISTI !!!");

PistiShuffle shuf = new PistiShuffle(deck);
PistiCut cutter = new PistiCut(deck);

int t = 4;   //have a mission in for loop.


deck = shuf.Shufunc();                           //firstly shuffling
deck = cutter.ComputerCuts();                    //secondly cutting of course. 


while(quantity < 6){

    //Playershand PlayerHand = new Playershand();

    for(int i=t ; i<t+4 ; i++){
      

    }







}


}





}







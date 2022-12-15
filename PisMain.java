import java.util.Scanner;
import java.util.Random;


public class PisMain {
    public static void main(String[] args) { 


        String spade = Character.toString((char)6);
        String club = Character.toString((char)5);
        String diamond = Character.toString((char)4);
        String heart = Character.toString((char)3);
        String ace = "A";
        String jack = "J";
        String queen = "Q";
        String king = "K";
       
//--------------------------------Setting Cards---------------------------------------------------
       
             Card[] deck;
             deck = new Card[52];      //an object array created ....
             int m = 2;               //this integer helps to setting card array.
     
//------------------spade cards---------------------------------------------------------------

             deck[0] = new Card(spade, ace);
             deck[10] = new Card(spade, jack);
             deck[11] = new Card(spade, queen);
             deck[12] = new Card(spade, king);
             for(int i=1; i<10; i++){
             deck[i] = new Card(spade, Integer.toString(m));  //1 to 10 setted.
             m++;
             }
             m = 2;
//---------------------club cards-----------------------------------------------------------------

             deck[13] = new Card(club, ace);
             deck[23] = new Card(club, jack);
             deck[24] = new Card(club, queen);
             deck[25] = new Card(club, king);
             for(int i=14; i<23; i++){
             deck[i] = new Card(club, Integer.toString(m));  //1 to 10 setted.
             m++;
             }
             m = 2;
 //------------------diamond cards---------------------------------------------------------------

             deck[26] = new Card(diamond, ace);
             deck[36] = new Card(diamond, jack);
             deck[37] = new Card(diamond, queen);
             deck[38] = new Card(diamond, king);
             for(int i=27; i<36; i++){
             deck[i] = new Card(diamond, Integer.toString(m));  //1 to 10 setted.
             m++;
             }
             m = 2;
//---------------------heart cards-----------------------------------------------------------------

             deck[39] = new Card(heart, ace);
             deck[49] = new Card(heart, jack);
             deck[50] = new Card(heart, queen);
             deck[51] = new Card(heart, king);
             for(int i=40; i<49; i++){
             deck[i] = new Card(heart, Integer.toString(m));  //1 to 10 setted.
             m++;
             }
             m = 2;
//-------------------------------------------------------------------------------------------



//-------------a little test--------------------------------------------------


for(int i = 0; i<52; i++){
System.out.println(deck[i].value() + deck[i].suit());
}



    }








public static void game(Card[] deck) {


/*--------------VARİABLES, ARRAYS FOR GAME---------------------------------------------

int score = 0; 
int decksonboard = 0;
String[] playerdeck = new String[4];    //0 to 3
String[] comptrdeck = new String[4];    //0 to 3
String[] board = new String[52];
String[] playershas = new String[52];
String[] comptrshas = new String[52];
int quantity = 0;    //computer and player throw card 24 times on the board !!!!!!!
int deckdist = 0;    //where we are when distributing ??

---------------------------------------------------------------------------------------*/


Scanner scn = new Scanner(System.in);

System.out.println("WELCOME TO PISTI !!!");

//PistiShuffle shuf = new PistiShuffle(deck);
//PistiCut cutter = new PistiCut(deck);

int t = 4;   //have a mission in for loop.


//deck = shuf.Shufunc();                           //firstly shuffling
//deck = cutter.ComputerCuts();                    //secondly cutting of course. 




}





}







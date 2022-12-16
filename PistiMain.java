import java.util.Scanner;
import java.util.Random;

public class PistiMain {
    public static void main(String[] args) { 


    Card[] deck = new Card[52];
    deck = deckcreate();  

    game(deck);
    
}
        

public static Card[] deckcreate(){      //A function creates a array of card objects...

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
             int m = 2;                //this integer helps to setting card array.
     
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
            for(int i = 0; i<52 ; i++){
                deck[i].assignLocation(0);         //all cards location 0... 0 represents deck as location !!
            }

           return deck;


    }

public static void view(Card[] deck){


System.out.println("____________________________________________________________");
System.out.println("                     ^_^ Computer                 ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
for(int i=0; i<52; i++){
    if(deck[i].location == 2004){
System.out.println("                  Top Card is: " + deck[i].value() + deck[i].suit() + "               ");
}
}
System.out.println(" ");
System.out.println(" ");
System.out.println("             Other Cards on board :                            ");
System.out.println("                     ");
for(int i=0; i<52; i++){
    if(deck[i].location == 1){
System.out.print("         " + deck[i].value() + deck[i].suit());
}
}
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println("     Your Cards :      ");
for(int i=0; i<52; i++){
    if(deck[i].location == 2){
System.out.print("           " + deck[i].value() + deck[i].suit() + "  ");
}
}
System.out.println("");

System.out.println("____________________________________________________________");


}


public static void game(Card[] deck) {      

      //--------------VARİABLES, ARRAYS FOR GAME---------------------------------------------
 
      int score = 0;          
      int decksonboard = 0;   //how many cards on board
      int deckindex = 0;   //where we are when distributing ?? , if one card out of the deck during game it cannot return.
  
      //---------------------------------------------------------------------------------------

Scanner scn = new Scanner(System.in);
Random rd = new Random();

System.out.println("WELCOME TO PISTI !!!");

PistiShuffle shuf = new PistiShuffle(deck);
PistiCut cutter = new PistiCut(deck);

deck = shuf.Shufunc();                                //firstly shuffling
deck = cutter.ComputerCuts();                         //secondly cutting of course. 

for(int i = 0; i<3 ; i++){
    deck[deckindex].assignLocation(1);                     //3 card on board now. 
    deckindex++;
    decksonboard++;
}
 deck[deckindex].assignLocation(2004);                 //one card on top !!
 decksonboard++;
 deckindex++;

for(int i = 0; i<4 ; i++){
    deck[deckindex].assignLocation(2);                     //4 card on players hand.
    deckindex++;
}

for(int i = 0; i<4 ; i++){
    deck[deckindex].assignLocation(3);                     //4 card on computers hand.
    deckindex++;
}






view(deck);














































}


}







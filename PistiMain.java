import java.util.Scanner;
import java.util.Random;

public class PistiMain { 

public static void main(String[] args){

String[][] deck = new String[4][13];

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

//---------------------------------------------------------------------------------------------




//---------------------checking for a print--------------------------------------
for(int j = 0; j<4 ; j++){
System.out.println(" ");
for(int i=0; i<13; i++){ 
    System.out.print(deck [j][i] + " ");
}
}

//PistiShuffle shuf = new PistiShuffle(arr);
}
}

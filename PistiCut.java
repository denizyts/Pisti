import java.util.Random;
import java.util.Scanner;

public class PistiCut { 

private Card[] deck;           //it is private !!!!
Random rd = new Random();
Scanner scn = new Scanner(System.in);


PistiCut(Card[] c){
deck = new Card[52];
deck = c;
}

public void setArr(Card[] k){deck = k;}
public Card[] getArr() { return deck;}


public Card[] ComputerCuts() {      //top to the bottom or bottom to the top doesnt matter.

int a = rd.nextInt(52);                 
Card[] bowldeck = new Card[52];
Card[] bowldeck2 = new Card[52];
Card[] sumbowls = new Card[52];
            
System.out.println("Cutting Process has begun !!!");

int t = 0;
int z = 0;

for(int i = 0; i<a+1; i++){

bowldeck[i] = deck[i];              //bowldeck[0] == deck[0] ..... it goes until a. so first a+1 card coppied to bowl.

}
for(int i = a+1; i<52 ; i++){       

    bowldeck2[t] = deck[i];         //bowldeck2[0] == deck[a+1] ...... it goes until 51. so last 51-a card coppied to bowl2.

    t++;
}

for(int i =0; i < 51-a ; i++){

sumbowls[i] = bowldeck2[i];
}
for(int i = 51-a; i<52 ; i++){

sumbowls[i] = bowldeck[z];
z++;
}

for(int i = 0; i<52; i++){
    bowldeck[i] = null;                       //bowls become null,
    bowldeck2[i] = null;
}

System.out.println("Shuffling process end!");
return sumbowls;

}


public Card[] PlayerCuts() {     //this method doesnt required but it could be necessary for advanced versions...

   System.out.println("You will cut the deck, enter a value between 0-51 ");
    
    int a = scn.nextInt();                 
    Card[] bowldeck = new Card[52];
    Card[] bowldeck2 = new Card[52];
    Card[] sumbowls = new Card[52];
                
    System.out.println("Cutting Process has begun !!!");
    
      int t = 0;        //index of bowldeck
      int z = 0;        //index of bowldeck
    
    for(int i = 0; i<a+1; i++){
    
    bowldeck[i] = deck[i];              //bowldeck[0] == deck[0] ..... it goes until a. so first a+1 card coppied to bowl.
    
    }
    for(int i = a+1; i<52 ; i++){
    
        bowldeck2[t] = deck[i];      //bowldeck2[0] == deck[a+1] ...... it goes until 51. so last 51-a card coppied to bowl2.
    
        t++;
    }
    
    for(int i =0; i < 51-a ; i++){
    
    sumbowls[i] = bowldeck2[i];
    }
    for(int i = 51-a; i<52 ; i++){
    
    sumbowls[i] = bowldeck[z];
    z++;
    }

    for(int i = 0; i<52; i++){
        bowldeck[i] = null;                       //bowls become null,
        bowldeck2[i] = null;
    }
    
    return sumbowls;
}


}
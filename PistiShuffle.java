import java.util.Random;

public class PistiShuffle { 

    private Card[] deck;              //it is private !!!!!!!!
    Random rd = new Random();

PistiShuffle(Card[] c){

deck = new Card[52];
deck = c;

}

public void setArr(Card[] k){deck = k;}
public Card[] getArr() {return deck;}


public Card[] Shufunc() { 

    System.out.println("Shuffling process has begun !");
  
    Card[] bowldeck = new Card[1000];
    int yet = 0;
    int bowlindex = 0;             //helps to fill the bowldeck...
    while(yet < 1000) {

        int y = rd.nextInt(52);  
        int x = rd.nextInt(52);
       
      bowldeck[bowlindex] = deck[y];                       
      deck[y] = deck[x];                            //if you need to swap 2 variables, you need one more variable...
      deck[x] = bowldeck[bowlindex];

bowlindex++;     //increase it for set bowldeck object array.  
yet++;           //increase because represents a finish value of while loop...
    }

    for(int i = 0; i<1000 ; i++){
        bowldeck[i] = null;                     //discharge bowldeck, after while loop of course !!!
    }

    System.out.println("Shuffling process end !");
return deck;
    } 
    }
    

        


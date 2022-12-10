import java.util.Random;

public class PistiShuffle { 

    private String[] deck;              //it is private !!!!!!!!
    Random rd = new Random();

PistiShuffle(String[] c){

deck = new String[52];
deck = c;

}

public void setArr(String[] k){deck = k;}
public String[] getArr() {return deck;}


public String[] Shufunc() { 
  
    String bowl = "";
    int yet = 0;
    while(yet < 1000) {

    

        int y = rd.nextInt(52);  
        int x = rd.nextInt(52);
       
      bowl = deck[y];
      deck[y] = deck[x];
      deck[x] = bowl;

yet++;
    }
return deck;
    } 
    }
    

        


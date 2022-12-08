import java.util.Random;

public class PistiShuffle { 

    private int[][] deck;              //it is private !!!!!!!!
    Random rd = new Random();

PistiShuffle(int[][] c){

deck = new int[4][13];
deck = c;

}

public void setArr(int[][] k){deck = k;}
public int[][] getArr() {return deck;}


public int[][] Shufunc() { 
  
    int yet = 0;
    while(yet < 1000) {

        int bowl = 0;

        int y = rd.nextInt(4);  
        int x = rd.nextInt(13);
        int yy = rd.nextInt(4);  
        int xx = rd.nextInt(13);

      bowl = deck[y][x];
      deck[y][x] = deck[yy][xx];
      deck[yy][xx] = bowl;


yet++;
    }
return deck;
    } 
    }
    

        


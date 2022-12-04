import java.util.Random;

public class PistiShuffle { 

    public int m;
    public int x;
    private int[][] deck;              //it is private !!!!!!!!
    Random rd = new Random();

PistiShuffle(int[][] c){

deck = new int[4][13];
deck = c;
//x = 52;
m = 0;

}

//public void setA(int k){a=k;}
public void setArr(int[][] k){deck = k;}
//public int getA(){ return a;}
public int[][] getArr() {return deck;}


public int[][] Shufunc() { 
  

 

    return deck;

}

}
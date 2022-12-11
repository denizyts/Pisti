import java.util.Random;
import java.util.Scanner;

public class PistiCut { 

private String[] deck;
Random rd = new Random();
Scanner scn = new Scanner(System.in);


PistiCut(String[] c){

deck = new String[52];
deck = c;

}


public void setArr(String[] k){deck = k;}
public String[] getArr() { return deck;}


public String[] ComputerCuts() {      //top to the bottom or bottom to the top doesnt matter.

int a = rd.nextInt(52);                 
String[] bowldeck = new String[52];
String[] bowldeck2 = new String[52];
String[] sumbowls = new String[52];
            
int t = 0;
int z = 0;

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




return sumbowls;


}


}
import java.util.Scanner;
import java.util.Random;

public class PistiMain { 

public static void main(String[] args){

int[][] arr = new int[4][13];
int c = -1;


for(int i = 0; i <4; i++){
for(int j = 0; j <13; j++){
c++;
    arr[i][j] = c;
}
}


PistiShuffle shuf = new PistiShuffle(arr);



    
}

}
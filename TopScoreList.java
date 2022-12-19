import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Formatter;

public class TopScoreList {

     private int score;

TopScoreList(int scoreinpt){
    score = scoreinpt;
}

public void setScore(int k){ score = k;}
public int getScore(){return score;}

public void ListMaker()throws IOException{

Scanner scn = new Scanner(System.in);

String[][] arr = new String[10][2];         //Example of idea : arr[3][0] = third top scorers name. [3][1] represents his score.
String test = "";
int th = 1;                               //indicates players rank from end. increasing in while loop.
String[] transfer = new String[2];          //just bowl.
int scroolhelp = 9;

Scanner reader = new Scanner(Paths.get("C:/Users/deniz/OneDrive/Masaüstü/deneme.txt"));

try{


while(reader.hasNextLine()){


    for(int i = 0; i<10 ; i++){

        test = reader.nextLine();                   //reader.nextLine() is single String.
        transfer = test.split(" ");               //when we split it with space, an array becomes.

        for(int j = 0; j<2 ; j++){
         
        arr[i][j] = transfer[j];                    //now datas coppied to 2dimensional array.

        }
        }
        }
    
    if(score > Integer.parseInt(arr[9][1])){            //if score bigger than 10th score this clausement runs.

        System.out.println("WELL DONE , YOU DESERVE TO BE IN TOP SCORE LIST");
        System.out.println("Would you mind to give me your respective name    :)");

        String name = scn.nextLine();
        
        for(int i=8 ; -1<i ; i--){

          if(score > Integer.parseInt(arr[i][1])){     

              th++;                                        //scores value becomes "th" by end, from begining (11-th)  !!

        }
        }
        

        th = (11-th);                                //now th represents rank from beggining. 

    
 //--------------------changing list values---------------------------------------
       if(th == 10){                              //player 10th in list

        arr[scroolhelp][0] = name;
        arr[scroolhelp][1] = String.valueOf(score);


       }
       else if( th >= 1 && th <= 9){
        for(int i = 9; i > th-1 ; i--){                         //th-1 because values in array are 0-1-2-....-9

            arr[scroolhelp][0] = arr[scroolhelp-1][0];
            arr[scroolhelp][1] = arr[scroolhelp-1][1];

            scroolhelp--;
        }
         
            arr[th-1][0] = name;
            arr[th-1][1] = String.valueOf(score);
       }
//----------------------------------------------------------------------------------  

    }
    else{

        System.out.println("Good Game :)");

    }

     for(int i = 0; i<10 ; i++){
        System.out.println(arr[i][0] + arr[i][1]);
     }

//--------------------------WRITING PROCESS------------------------------------------------

while(reader.hasNextLine()){

FileWriter fw = new FileWriter("C:/Users/deniz/OneDrive/Masaüstü/deneme.txt", true);
Formatter f = new Formatter(fw);



for(int i = 0; i<10 ; i++){
f.format("%s, %s", arr[i][0] + arr[i][1] );
}

fw.close();

}




}
catch(Exception e){

System.out.println("Something went wrong ");

}
finally{
scn.close();
reader.close();
}

}

}

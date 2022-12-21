import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Formatter;

public class PistiMain {

    static int scorehelp = 0;
    public static void main(String[] args) throws IOException{ 
                             
    Card[] deck = new Card[52];
    deck = deckcreate();                        //new deck...

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

public static void view(Card[] deck){           //shows current board :)


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

public static Card[] choise(Card[] deck){        //a func allows you choose your card for throw :)

Scanner scn = new Scanner(System.in);

int chs = 1;                       //chs can be 4 maximum. represents players option.
int indicate = 0;                  //helps throwing card.
String jack = "J";
String top = "";
boolean upisti = false;        //util for pisti 
int qcob = 0;                  //quantity of cards on board, helps pisti stuff.
int jackhelp = 0;                //helps for when we used jack, jack should not be on top !!

System.out.println("Choose a card for throw");

for(int i=0; i<52; i++){
if( deck[i].location == 2){

    System.out.println("Enter " + chs + " for throw " + deck[i].value() + deck[i].suit());
chs++;
}
}
chs--;

try{
    int rc = scn.nextInt();                                    //getting choise from user.   

    if(rc < 1){ 
        System.out.println("ARE YOU KIDDING ME ?");
        return choise(deck);
    }

    if(chs < 2 && rc > 1){
        System.out.println("ARE YOU KIDDING ME ?");
        return choise(deck);
    }
    if(chs < 3 && rc > 2){
        System.out.println("ARE YOU KIDDING ME ?");
        return choise(deck);
    }
    if(chs < 4 && rc > 3){
        System.out.println("ARE YOU KIDDING ME ?");
        return choise(deck);
    }
    if(chs < 5 && rc > 4){
        System.out.println("ARE YOU KIDDING ME ?");
        return choise(deck);
    }
    else{
    for(int i=0; i<52; i++){
        if( deck[i].location == 2){                          
            indicate++;
         if(rc == indicate){                               //here picks the card players chosed.

            for(int j = 0; j<52 ; j++){
                if(deck[j].location == 2004){          //top represents top cards value.
                    top = deck[j].value();
                }
            }

            for(int j = 0; j<52 ; j++){
                if(deck[j].location == 1) { 
                   qcob++;
                }
            }


           if(deck[i].value().equals(jack)){         //takes all cards !!!

            System.out.println("jack takes all :)");
            jackhelp++;
                 deck[i].assignLocation(4);

            for(int j = 0; j<52 ; j++){

                if(deck[j].location == 2004){
                    deck[j].assignLocation(4);
                }
            
                if(deck[j].location == 1){
                     deck[j].assignLocation(4);
                }
            }
           }


            if(deck[i].value().equals(top) && qcob == 0){          //pisti thing.
                System.out.println("PISTI !!!!!!! ");

                deck[i].assignLocation(4);

                for(int j = 0; j<52 ; j++){

                    if(deck[j].location() == 1){
                        deck[j].assignLocation(4);
                    }
                
                    if(deck[j].location == 2004){
                        deck[j].assignLocation(4);
                    }
            }
            scorehelp += 10;                        //score increased 10... this action required for score calculation ...
            upisti = true;
        }


            else if(deck[i].value().equals(top) && upisti == false){

                System.out.println("you got it");

                deck[i].assignLocation(4);

                for(int j = 0; j<52 ; j++){

                    if(deck[j].location == 2004){
                        deck[j].assignLocation(4);
                    }
                
                    if(deck[j].location == 1){
                         deck[j].assignLocation(4);
                    }
    
                }
            }

            else if(deck[i].value() != top && jackhelp == 0){

                for(int j=0; j<52 ; j++){
                    if(deck[j].location == 2004){
                        deck[j].assignLocation(1);
                    }
                }
                deck[i].assignLocation(2004);
            }

        }
        }
        }
       upisti = false;
        }
        
indicate = 0;
top = "";
}
catch(InputMismatchException e){
    System.out.println("ENTER A INTEGER !!!!!!");             //one of the common exceptions.
    return choise(deck);
}
catch(NoSuchElementException e){
    System.out.println("ENTER A INTEGER !!!!!!");              //not necessary i know. one of the common exceptions.
    return choise(deck);
}
catch(Exception e){
    System.out.println("ENTER A INTEGER !!!!!");               //covers from all exceptions   <3 <3 <3 <3
    return choise(deck);
}
finally{

}

return deck;

}

public static Card[] ComputerTurn(Card[] deck){     //this func contains, computers moves !!! 

    String top = "";
    int x = 0;       //this int variable helps while loop, if computer moves a card, of course cannot move another card.
    String jack = "J";

    for(int i=0; i<52; i++){  
      if (deck[i].location == 2004){                  //top cards value is in top string now.
        top = deck[i].value();
      }
    }

    if(x == 0){                               //if the top card value equals any card of on computers hand computer gots all.
    for(int i=0; i<52; i++){  
        if(deck[i].location == 3){                
           if(deck[i].value().equals(top)){                     //sets the card the comp throwed 
            deck[i].assignLocation(5);


             for(int j = 0; j<52 ; j++){
                if(deck[j].location() == 2004){                 //sets top card location
                    deck[j].assignLocation(5);
                 }
                else if(deck[j].location() == 1){               //sets other cards on board location
                deck[j].assignLocation(5);
               }
            }

            System.out.println("computer moved " + deck[i].value() + deck[i].suit() + " and taked cards on board");
            x++;             //computer moves only one card !
           }     
        }
      }
    }
   
      
        for(int i=0; i<52 ; i++){
         if(deck[i].location == 3){
          if(deck[i].value().equals(jack) && top != ""){
            if(x == 0){
            deck[i].assignLocation(5);

            for(int j = 0; j<52 ; j++){
                if(deck[j].location() == 2004){                 //sets top card location
                    deck[j].assignLocation(5);
                 }
                else if(deck[j].location() == 1){               //sets other cards on board location
                deck[j].assignLocation(5);
               }
            }
            System.out.println("Computer moves jack and taked all");
          x = 1;
        }
        }
        }
        }

           
            for(int i=0; i<52 ; i++){
             if(deck[i].location() == 3){
              while(x == 0){

                for(int j=0; j<52 ; j++){
                    if(deck[j].location() ==  2004){
                       deck[j].assignLocation(1);        //previous top card becomes one of the cards on board.
                    }
                }
              
               deck[i].assignLocation(2004);            //choosed card becomes top.
    
                System.out.println("Computer moved " + deck[i].value() + deck[i].suit());
              x++;
            }
            }
            }
            
    x = 0;
    top = "";
    return deck;
}

public static int ScoreCalculator(Card[] deck){                  //its a score calculator method designed for pisti.

 int score = scorehelp;                     //data taked from scorehelp if pisti thing happened score changes.

 for(int i=0; i<52; i++){

 if(deck[i].location == 4){                         //if card in players earned location ..
  
   if(deck[i].value().equals("10") && deck[i].suit().equals(String.valueOf((char)4))){      //diamond 10
    score = score + 3;
   }
   else if(deck[i].value().equals("2") && deck[i].suit().equals(String.valueOf((char)5))){       //club 2
    score = score + 2;
   }
   else { 
    score++;                                           //without dia10 and club2 each card 1 point.
   }

 }
 }

    return score;
}

public static void ScoreListRW(int score){                     //ScoreList Reader and Writer

    Scanner scn = new Scanner(System.in);          //scanner for get players name.

    String[][] arr = new String[10][2];         //Example of idea : arr[3][0] = third top scorers name. [3][1] represents his score.
    String test = "";
    int th = 1;                               //indicates players rank from end. increasing in while loop.
    String[] transfer = new String[2];          //just bowl.
    int scroolhelp = 9;

      Scanner reader = null;
    try {

        int indicator = 0;
         reader = new Scanner(Paths.get("TopScoreList.txt" ));
         while(reader.hasNextLine ()) {

            
                test = reader.nextLine();                     //reader.nextLine() is single String.
                transfer = test.split(" ");               //when we split it with space, an array becomes.
        
                for(int j = 0; j<2 ; j++){
                 
                arr[indicator][j] = transfer[j];                    //now datas coppied to 2dimensional array.
        
                }
                
                indicator++;

         }
        } catch (IOException e) {
         e.printStackTrace ();
         } finally {
         if (reader != null) {
         reader.close();
         }
        }

         for(int i = 0; i<10 ; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
            System.out.println("-----------------------------------");
         }

        try{
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
                arr[th-1][1] = String.valueOf(score);                    //arr[][] is now represent values.
           }
      
    
        //--------------------------WRITING PROCESS------------------------------------------------
            
            FileWriter fw = new FileWriter("TopScoreList.txt", true);
            Formatter f = new Formatter(fw);
            Formatter delf = new Formatter("TopScoreList.txt");      //no add end of text, rewrites


                                                          
                delf.format("%s", "   ");                //deletes lines.
               


    
               for(int i = 0; i<10 ; i++){
                f.format("%s\n", arr[i][0] + " " + arr[i][1] );       //rewrite new list.
               }
    
                 f.close();
    
        }
        else{
            System.out.println("Good Game :)");              //if player doesnt in top list
        }
    }
    catch(IOException e){
        System.out.println("Something went wrong");
    }
   finally{
    scn.close();
   }

}

public static void game(Card[] deck) {      

      //--------------VARİABLES FOR GAME---------------------------------------------
 
      int deckindex = 0;   //where we are when distributing ?? , if one card out of the deck during game it cannot return.
      int score = 0;      //helps when calling top score list methods.
      //---------------------------------------------------------------------------------------

System.out.println("WELCOME TO PISTI !!!");

PistiShuffle shuf = new PistiShuffle(deck);
PistiCut cutter = new PistiCut(deck);

deck = shuf.Shufunc();                                //firstly shuffling
deck = cutter.PlayerCuts();                         //secondly cutting of course. 

for(int i = 0; i<3 ; i++){
    deck[deckindex].assignLocation(1);                     //3 card on board now. 
    deckindex++;
   
}
 deck[deckindex].assignLocation(2004);                      //one card on top !!
 deckindex++;

for(int j = 0; j<6 ; j++){            //CRITICAL POINT (cards are distrubiting 6 times !!!) THIS LOOP CONTAINS ALL GAME .

for(int i = 0; i<4 ; i++){
    deck[deckindex].assignLocation(2);                     //4 card on players hand.
    deckindex++;
}

for(int i = 0; i<4 ; i++){
    deck[deckindex].assignLocation(3);                     //4 card on computers hand.
    deckindex++;
}

view(deck);
deck = choise(deck);
view(deck);
deck = ComputerTurn(deck);
view(deck);
deck = choise(deck);
view(deck);
deck = ComputerTurn(deck);
view(deck);
deck = choise(deck);
view(deck);
deck = ComputerTurn(deck);
view(deck);
deck = choise(deck);
view(deck);
deck = ComputerTurn(deck);

}

for(int i = 0; i<52 ; i++){
 if(deck[i].location == 1){
   deck[i].assignLocation(4);             //after the game finished the cards on board added to cards of player have location.
}
 if(deck[i].location == 2004){
    deck[i].assignLocation(4);
 }
}

System.out.println("GAME FINISHED !!!");
System.out.println("Your Cards : ");

for(int i = 0; i<52 ; i++){
    if(deck[i].location == 4){
        System.out.print(" " + deck[i].value() + deck[i].suit());
   }
}

System.out.println("  ");
System.out.println("Your Score " + ScoreCalculator(deck));

score = ScoreCalculator(deck);                         //ScoreCalc returns integer. 

ScoreListRW(score);                                   //ScoreList


}

}







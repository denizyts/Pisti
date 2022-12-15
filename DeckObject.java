public class DeckObject {

    private String[] deck; 
    
    DeckObject(String[] c) { 
    
    deck = new String[c.length];
    deck = c;
    
    }

    public void setDeck(String[] k) { deck = k;}
    public String[] getDeck() {return deck;}


   //-----------------------------------------------------------------------------------
        
   String spade = Character.toString((char)6);
   String club = Character.toString((char)5);
   String diamond = Character.toString((char)4);
   String heart = Character.toString((char)3);
   String ace = "A";
   String jack = "J";
   String queen = "Q";
   String king = "K";
  
    //-----------------------------------------------------------------------------------
  
    public Card[] Deckutil() {     //it is deck of card objects !!
        
       
        Card[] deck;
        deck = new Card[52];

        
        deck[0] = new Card(spade, ace);
        
   
        
   
   
   
   
   
        return deck;
}

}
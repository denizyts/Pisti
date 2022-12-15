
public class Card { 

    private String suit;
    private String value;
    private int location;        //where is the card 0 means in deck, 1 means on board,....
  
    public Card(String suit, String value) {
      this.suit = suit;
      this.value = value;
    }
  
    public int getWhere() {return this.location;}
    public String getSuit() { return this.suit;}
    public String getValue() {return this.value;}
    public void setValue(String k){value = k;}
    public void setSuit(String k){suit = k;}
    public void setWhere(int k){ location = k;}


    public void assignLocation(int a){
        location = a;
    }
    public int location(){
      return location;
    }
    public String value() {
      return value;
    }
    public String suit() {
      return suit;
    }
  
  }
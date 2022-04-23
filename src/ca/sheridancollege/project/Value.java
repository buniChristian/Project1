/*
 * @author Christian Buni and Al Justin Pinto
 * Tuesday, April 19, 20222
 */

public enum Value {
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 11),
    QUEEN("Queen", 12),
    KING("King", 13),
    ACE("Ace",14);

   public String rankValue;
   public int rankPoint;

    Value (String rankValue, int rankPoint) {
        this.rankPoint =rankPoint;
        this.rankValue = rankValue;
    }

    public String getRankValue() {
        return this.rankValue;
    }
    
    public int getRankPoint() {
        return this.rankPoint;
    }

    @Override
    public String toString() {
        if(this.getRankPoint() > 10){
            return this.getRankValue().substring(0,1);
        } else {
        }
        return String.valueOf(this.getRankPoint());
    }

}

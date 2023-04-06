package homework_0405;

public class Card {
    String cardName; int validYear;

    public Card(String cardName, int validYear) {
        this.cardName = cardName;
        this.validYear = validYear;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getValidYear() {
        return validYear;
    }

    public void setValidYear(int validYear) {
        this.validYear = validYear;
    }
    public void validEnlong(int add, CardVali cv){
        //this.validYear +=add;
        cv.enlong(add);

    }
    Card(){}
}

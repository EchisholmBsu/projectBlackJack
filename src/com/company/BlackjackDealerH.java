package com.company;

class BlackjackDealerHand extends BlackjackHand {
    private boolean dealerTurn;

    public void setDealerTurn(boolean dealerTurn) {
        this.dealerTurn = dealerTurn;
    }
    // Overriding the toString methods so the first can be replaced by "XX"
    @Override
    public String toString() {
        if (dealerTurn){
            String str = "";

            for (int i = 0; i < getNumCards(); i++){
                str = str + (getCard(i)); // Want to Concatnate the I to the str
                if (i < getNumCards()){ // IF i is less then getnumcards
                                        //  it prints the value.
                    str +=" ";
                }
            }
            str = str + "  (value = " + getValue() + ")";
            return str;
        }
        else  return "xx " + getCard(1); // ELSE it replaces the 1st card with XX
                                            // Also doesnt show the value of both Cards
    }
}

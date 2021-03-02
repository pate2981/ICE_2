/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

/**
 *
 * @author Sanket
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int handsize = 60;
        Card [] cards = new Card [handsize];
        
        int countCards = 0;
	for(Card.Suit s: Card.Suit.values())
        {
            for(Card.Value v: Card.Value.values())
            {
                cards[countCards] = (new Card(s,v));
                countCards++;
            }
        }
        

        for(Card c: cards)
        {
            System.out.println(c.getValue() + " of " + c.getSuit());
        }

        
        
    }
    
}

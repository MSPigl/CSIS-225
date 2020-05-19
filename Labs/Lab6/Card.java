
/**
 * This is a card class, which governs card objects from a standard 52-card deck.
 * 
 * @author Darren Lim
 * @version 1.0
 */
public class Card
{
    // instance variables - replace the example below with your own
    protected char value; // A, K, Q, J, T, 9, 8, 7, 6, 5, 4, 3, 2
    protected char suit;  // S, H, D, C

    /**
     * Constructor for objects of class Card
     */
    public Card()
    {
        // initialises the card as the Ace of Spades
        value = 'A';
        suit = 'S';
    }
    
    /**
     * Constructor for a given card
     *
     * @param   suit    suit of the card
     * @param   value   value of the card
     */
    public Card(char suit, char value)
    {
        this.suit = suit;
        this.value = value;
    }


    
}

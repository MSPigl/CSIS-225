/**
 * This is a card class, which governs card objects from a standard 52-card deck.
 * 
 * @author Darren Lim
 * @version 1.0
 */
public class Card implements Comparable<Card>  
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

    public int compareTo(Card test)
    {
        int returnVal = 0;
        
        if (test.value < this.value)
        {
            if (test.value == 'A' || test.value == 'K')
            {
                returnVal = 1;
            }
            else
            {
                returnVal = -1;
            }           
        }
        else if (test.value > this.value)
        {
            returnVal = 1;
        }
        else if (test.value == this.value)
        {
            if (test.suit < this.suit)
            {
                returnVal = -1;
            }
            else if (test.suit > this.suit)
            {
                returnVal = 1;
            }
        }
        else
        {
            returnVal = 0;
        }

        return returnVal;
    }

    public boolean equals(Card test)
    {
        if ((test.value == this.value) && (test.suit == this.suit))
        {
            if (this.hashCode() == test.hashCode())
            {
                return true;
            }
        }
        return false;
    }
}
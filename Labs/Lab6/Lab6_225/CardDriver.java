import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class CardDriver here.
 * 
 * @author Matt, Javier
 * @version Spring 2017
 */
public class CardDriver
{
    public static void main(String[] args)
    {
        ArrayList<Card> list = new ArrayList<>();
        
        Card ace = new Card();
        Card kingClub = new Card('C', 'K');
        Card tenDiamond = new Card('D', 'T');
        Card twoDiamond = new Card('D', '2');
        Card sevSpades = new Card('S','7');
        Card sevClubs = new Card('C','7');
        Card sevHearts = new Card('H', '7');
        // search values
        Card sevDiamond = new Card('D', '7');
        list.add(ace);
        list.add(kingClub);
        list.add(tenDiamond);
        list.add(twoDiamond);
        list.add(sevSpades);
        list.add(sevClubs);
        list.add(sevHearts);
        
        
        for(Card t : list){
            System.out.println("Value: " + t.value + " Suit: " + t.suit);
        }
        Collections.sort(list);
        System.out.println("Sorted Cards\n\n");
        for(Card t : list){
            System.out.println("Value: " + t.value + " Suit: " + t.suit);
        }
        
        System.out.println("\nList contains the Seven of Diamonds: " + list.contains(sevDiamond));
        System.out.println("List contains the Seven of Hearts: " + list.contains(sevHearts));
        System.out.println("List contains the Ace of Spades: " + list.contains(ace));
    }
}

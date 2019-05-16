package staticpile;

public class MainClass {

    public static void main(String[] args) {
        StaticPile<String> pile = new StaticPile(4);
        pile.add("a");
        pile.add("b");
        pile.add("c");
        pile.add("d");
        System.out.println(pile);
        pile.remove();
        System.out.println(pile);
        
    }
    
}

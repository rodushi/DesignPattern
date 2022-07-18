
package templatePattern;


public class main {
    public static void main(String[] args) {
        game game = new Cricket();
        game.play();
        System.out.println();
        game = new football();
        game.play();
        
    }
}


package templatePattern;


public class Cricket extends game {

    @Override
    void initialize() {
        System.out.println("cricket is initialized");
       
    }

    @Override
    void startPlay() {
        System.out.println("cricket has started");
        
    }

    @Override
    void endPlay() {
        System.out.println("cricket has ended");
       
    }
    
}

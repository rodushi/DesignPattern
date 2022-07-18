
package templatePattern;


public abstract class game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    
    public void play(){
        initialize();
        startPlay();
        endPlay();
        
    }
    
}

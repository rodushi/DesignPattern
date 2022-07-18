
package StatePattern;

interface MobileAlertState{
    public void alert(Context context);

}

class Vibration implements MobileAlertState{

    @Override
    public void alert(Context context) {
        System.out.println("Vibration");
    }
    
}

class Silent implements MobileAlertState{

    @Override
    public void alert(Context context) {
        System.out.println("Silent");
    }
    
}

class Context{
    private MobileAlertState currentState;
    public Context(){
        this.currentState = new Silent();
    }
    
    public MobileAlertState  getCurrentSate(){
        return currentState;
        }
    
    public void setCurrentState(MobileAlertState currentState){
        this.currentState=currentState;
    }
    
    public void atert(){
        this.currentState.alert(this);
    }
    
        
 }


public class State_Pattern {
    public static void main(String[] args) {
        Context context = new Context();
        context.atert();
        context.setCurrentState(new Vibration());
        context.atert();
        context.setCurrentState(new Silent());
        context.atert();
    }
    
}

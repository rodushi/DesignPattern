
package ObserverPattern;


public class Subscriber {
    private String name;
    private Channel channel = new Channel();
    
    public Subscriber(String name){
        super();
        this.name = name;
    }

    public void update(){
        System.out.println("Hey "+name+ ", Video Uploaded");
    }
    
   public void SubscribeChannel(Channel ch){
       Channel Channel = ch;
  }
    
}

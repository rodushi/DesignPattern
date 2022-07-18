
package ObserverPattern;


public class youtube {
    public static void main(String[] args) {
        Channel Rodushious = new Channel();
        
        Subscriber S1 = new Subscriber("Rhythm");
        Subscriber S2 = new Subscriber("Ripa");
        Subscriber S3 = new Subscriber("Kaiyum");
        Subscriber S4 = new Subscriber("Rodushi");
        Subscriber S5 = new Subscriber("Kausik");
        
        Rodushious.Subscribe(S1);
        Rodushious.Subscribe(S2);
        Rodushious.Subscribe(S3);
        Rodushious.Subscribe(S4);
        Rodushious.Subscribe(S5);
        
        
        
       S1.SubscribeChannel(Rodushious);
       S2.SubscribeChannel(Rodushious);
       S3.SubscribeChannel(Rodushious);
       S4.SubscribeChannel(Rodushious);
       S5.SubscribeChannel(Rodushious);
        
        Rodushious.upload("How to learn about a Matchine");
    }
}


package ObserverPattern;

import java.util.ArrayList;
import java.util.List;


class Channel {
   private List<Subscriber> subs = new ArrayList<>();
   String title;
   
   public void Subscribe(Subscriber sub){
       subs.add(sub);
   }
   
   public void unsubscribe(Subscriber sub){
       subs.remove(sub);
   }
   
   public void notifySubscriber(){
       for (Subscriber sub : subs) {
           sub.update();
       }
   }
   
   public void upload(String title){
       this.title = title;
       notifySubscriber();
   }

   
    

    

   
   
    
}


package SingleTonPattern;

class singleObj{
   private static  singleObj obj = new singleObj();
   
   private singleObj(){
       
   }
   public static singleObj getObj(){
       return obj;
   }
   public void showMsg(){
       System.out.println("Hello");
   }
}
public class main {
    public static void main(String[] args) {
        singleObj object = singleObj.getObj();
        object.showMsg();
        
    }
}

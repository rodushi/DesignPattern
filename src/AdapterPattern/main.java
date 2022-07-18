
package AdapterPattern;


public class main {
    public static void main(String[] args) {
        NokiaAsha Ashaphone = new NokiaAsha() ;
        System.out.println("nokia charger connected:");
        Ashaphone.ChargeNokiaPlug();
        System.out.println();
        
        System.out.println("Samsung Charger connected with s3");
        SamsungCharger charger = (SamsungCharger) new SamsungS3();
        charger.ChargeSamsungPlug();
        System.out.println();
        
        System.out.println("Nokia charger connected via adapter...");
        SamsungCharger adapter = new ChargeAdapter(Ashaphone);
        adapter.ChargeSamsungPlug();
    }

    

    
}

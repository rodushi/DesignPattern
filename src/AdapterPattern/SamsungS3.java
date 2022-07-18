
package AdapterPattern;


public class SamsungS3 implements SamsungCharger{

    @Override
    public void ChargeSamsungPlug() {
        System.out.println("SamsungS3 is charging....");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

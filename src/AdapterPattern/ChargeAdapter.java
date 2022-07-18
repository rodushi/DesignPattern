
package AdapterPattern;


public class ChargeAdapter implements SamsungCharger {
    NokiaCharger charger;
    public ChargeAdapter(NokiaCharger charger){
        this.charger = charger;
    }

    @Override
    public void ChargeSamsungPlug() {
        charger.ChargeNokiaPlug();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

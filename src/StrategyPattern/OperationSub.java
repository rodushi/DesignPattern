
package StrategyPattern;


public class OperationSub implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

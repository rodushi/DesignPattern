/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatePattern;

/**
 *
 * @author User
 */
public class football extends game{

    @Override
    void initialize() {
        System.out.println("football is initialized");
        
    }

    @Override
    void startPlay() {
        System.out.println("football has started");
        
    }

    @Override
    void endPlay() {
        System.out.println("football has ended");
        
    }
}

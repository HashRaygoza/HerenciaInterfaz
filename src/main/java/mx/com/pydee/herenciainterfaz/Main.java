/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.pydee.herenciainterfaz;

/**
 *
 * @author David
 */
public class Main {
    static public void main(String[] args) {
        InterA claseA = new ClaseA();
        InterA claseB = new ClaseB();
        
        claseA.genera();
        System.out.println("\n");
        claseB.genera();        
    }
}

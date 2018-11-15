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
public class ClaseA implements InterA {
    
    public void generaXML() {
        System.out.println("Generando XML");
    }
    
    public void generaPDF() {
        System.out.println("Generando PDF");
    }

    @Override
    public void genera() {
        generaXML();
        generaPDF();
    }
    
}

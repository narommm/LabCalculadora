/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetico;

import conversor.Conversor;
import factories.AbstractFactory;

/**
 *
 * @author María Lourdes
 */
public class AritmeticoFactory extends AbstractFactory {

    @Override
    public Aritmetico getAritmetico(String tipo) {

        switch (tipo) {
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "division":
                return new Division();
            case "multiplicacion":
                return new Multiplicacion();
                       
        }

        return null;
    }

    @Override
    public Conversor getConversor(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}

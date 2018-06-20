/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import aritmetico.Aritmetico;
import factories.AbstractFactory;

/**
 *
 * @author María Lourdes
 */
public class ConversorFactory extends AbstractFactory {

    

    @Override
    public Conversor getConversor(String tipo) {
        switch (tipo) {
            case "conversor":
                return new Binario();
        }
        return null;
    }

    @Override
    public Aritmetico getAritmetico(String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 *Elige mediante el switch cualquiera de las opciones para poder jugar
 */
package factories;

import aritmetico.AritmeticoFactory;
import conversor.ConversorFactory;

/**
 *
 * @author María Lourdes
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String tipo) {
        switch (tipo) {
            case "aritmetico":
                return new AritmeticoFactory();
            case "conversor":
                return new ConversorFactory();
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import aritmetico.Aritmetico;
import conversor.Conversor;

/**
 *
 * @author María Lourdes
 */
public abstract class AbstractFactory {
    public abstract Aritmetico getAritmetico(String tipo);
    public abstract Conversor getConversor (String tipo);
}

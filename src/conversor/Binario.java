/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author María Lourdes
 */
public class Binario implements Conversor {

    @Override
    public int operacion(int numero) {
        int exp = 0;
        int binario = 0;
        while (numero != 0) {
            int digito = numero % 2;
            binario = (int) (binario + digito * Math.pow(10, exp));
            exp++;
            numero = numero / 2;
        }
        return binario;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinebat_proy1;

/**
 *
 * @author sfmnl
 */
//Simplemente permite guardar y actualizar el valor del tiempo actual dentro de la animacion
public class LongValue {
    private long value;
    
    public LongValue(long time){this.value = time;}
    public long value(){return value;}
    public void newValue(long nValor){value = nValor;}
}

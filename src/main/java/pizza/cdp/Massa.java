/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp;

import pizza.util.Fabrica.FabricaPizza;

/**
 *
 * @author IzabelyFurtado
 */
public abstract class Massa extends Ingrediente{

    public Massa(String nome, FabricaPizza pizza, float preco) {
        super(nome, pizza, preco);
    }
    
    
    
}

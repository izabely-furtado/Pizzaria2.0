/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.cdp;

import pizza.util.Fabrica.FabricaPizza;

/**
 *
 * @author 20121bsi0040
 */
public abstract class PizzaDecorator extends FabricaPizza{
    FabricaPizza umaPizza;
    
    PizzaDecorator(FabricaPizza pizza, float preco){
        super(preco);
        this.umaPizza = pizza;
        this.preco = preco + pizza.getPreco();
    }
    
    
    
}

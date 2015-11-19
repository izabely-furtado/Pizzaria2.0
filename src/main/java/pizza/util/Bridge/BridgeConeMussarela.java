/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.util.Bridge;

import pizza.util.Builder.ConeMussarelaBuilder;

/**
 *
 * @author 20121bsi0040
 */
public class BridgeConeMussarela extends BridgePizza{
    public BridgeConeMussarela(){
        super();
    }
    
    public BridgeConeMussarela(int quantRecheio, int quantPizza){
        super(quantRecheio, quantPizza);
    }
    
    @Override
    public final void maisRecheio() {
        this.pizza.buildRecheio();
    }

    @Override
    public final void fazerPizza(){
        this.pizza = ConeMussarelaBuilder.getInstance();
    }
}

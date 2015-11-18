/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.util.Bridge;

import pizza.util.Builder.TradMussarelaBuilder;

/**
 *
 * @author 20121bsi0040
 */
public class BridgeTradMussarela extends BridgePizza{
    public BridgeTradMussarela(){
        super();
    }
    
    public BridgeTradMussarela(int quantRecheio){
       super(quantRecheio);
    }
    
    @Override
    public final void maisRecheio() {
        this.pizza.buildRecheio();
    }

    @Override
    public final void fazerPizza(){
        this.pizza = TradMussarelaBuilder.getInstance();
    }
}

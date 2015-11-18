/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.util.Bridge;

import pizza.util.Builder.Trad4QueijosBuilder;

/**
 *
 * @author 20121bsi0040
 */
public class BridgeTrad4Queijos extends BridgePizza{
    public BridgeTrad4Queijos(){
        super();
    }
    
    public BridgeTrad4Queijos(int quantRecheio){
        super(quantRecheio);
    }
    
    @Override
    public final void maisRecheio() {
        this.pizza.buildRecheio();
    }

    @Override
    public final void fazerPizza(){
        this.pizza = Trad4QueijosBuilder.getInstance();
    }
}

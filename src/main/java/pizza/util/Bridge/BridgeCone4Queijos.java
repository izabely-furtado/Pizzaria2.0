/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.util.Bridge;

import pizza.util.Builder.Cone4QueijosBuilder;

/**
 *
 * @author 20121bsi0040
 */
public class BridgeCone4Queijos extends BridgePizza{
    
    public BridgeCone4Queijos(){
        super();
    }
    
    public BridgeCone4Queijos(int quantRecheio){
        super(quantRecheio);
    }
    
    @Override
    public final void maisRecheio() {
        this.pizza.buildRecheio();
    }

    @Override
    public final void fazerPizza(){
        this.pizza = Cone4QueijosBuilder.getInstance();
    }
    
}

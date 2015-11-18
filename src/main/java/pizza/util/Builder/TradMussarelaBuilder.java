/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Builder;

import pizza.cdp.Massa;
import pizza.cdp.massa.Tradicional;
import pizza.util.Fabrica.FabricaPizzaMussarela;

/**
 *
 * @author IzabelyFurtado
 */
public class TradMussarelaBuilder extends PizzaBuilder {

    private TradMussarelaBuilder() {
        super();
        this.buildRecheio();
        this.buildMassa();
    }
    
    public synchronized static PizzaBuilder getInstance() {
        if(pizzaBuilder == null) {
            pizzaBuilder = new TradMussarelaBuilder();
        }
        return pizzaBuilder;
    }
    
    @Override
    public final void buildMassa() {
        this.pizza.massaEscolhida = new Tradicional(this.pizza.recheio);
    }

    @Override
    public final void buildRecheio() {
        this.pizza.recheio = FabricaPizzaMussarela.getInstance();
    }
    
}

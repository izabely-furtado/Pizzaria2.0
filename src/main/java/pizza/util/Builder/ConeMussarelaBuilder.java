/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Builder;

import pizza.cdp.decorator.Massa;
import pizza.cdp.decorator.massa.Cone;
import pizza.util.Fabrica.FabricaPizzaMussarela;

/**
 *
 * @author IzabelyFurtado
 */
public class ConeMussarelaBuilder extends PizzaBuilder {

    private ConeMussarelaBuilder() {
        super();
        this.buildRecheio();
        this.buildMassa();
    }
    
    public synchronized static PizzaBuilder getInstance() {
        if(pizzaBuilder == null) {
            pizzaBuilder = new ConeMussarelaBuilder();
        }
        return pizzaBuilder;
    }
    
    @Override
    public final void buildMassa() {
        this.pizza.massaEscolhida = new Cone(this.pizza.recheio);
    }

    @Override
    public final void buildRecheio() {
        this.pizza.recheio = FabricaPizzaMussarela.getInstance();
    }
    
}

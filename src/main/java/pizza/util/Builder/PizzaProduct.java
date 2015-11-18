/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.util.Builder;

import pizza.util.Fabrica.FabricaPizza;
import pizza.cdp.decorator.Massa;

/**
 *
 * @author IzabelyFurtado
 */
public class PizzaProduct {

    Massa massaEscolhida;
    FabricaPizza recheio;

    public FabricaPizza getPizzaComMassa() {
        return this.massaEscolhida;
    }

    public FabricaPizza getPizzaRecheio() {
        return this.recheio;
    }

    @Override
    public String toString() {
        return this.getPizzaComMassa().toString() + "\n";
    }
}

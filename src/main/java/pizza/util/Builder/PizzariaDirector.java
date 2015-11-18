/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Builder;

/**
 *
 * @author IzabelyFurtado
 */
public class PizzariaDirector {
    protected PizzaBuilder montadora;
    
    public PizzariaDirector(PizzaBuilder montadora){
        this.montadora = montadora;
    }
    
    public void construirPizza(){
        this.montadora.buildRecheio();
        this.montadora.buildMassa();
    }
    
    public PizzaProduct getPizza(){
        return this.montadora.getPizza();
    }
    
}

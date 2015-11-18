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
public abstract class PizzaBuilder implements IPizzaBuilder{
    protected PizzaProduct pizza;
    protected static PizzaBuilder pizzaBuilder;
    protected int codCone4Queijos;
    protected int codTrad4Queijos;
    protected int codConeMussarela;
    protected int codTradMussarela;
    
    protected PizzaBuilder(){
        pizza = new PizzaProduct();
    }
    
    public synchronized int getCodConeMussarela() {
        codConeMussarela = codConeMussarela+1;
        return codConeMussarela;
    }
    
    public synchronized int getCodTradMussarela() {
        codTradMussarela = codTradMussarela+1;
        return codTradMussarela;
    }
    
    public synchronized int getCodCone4Queijos() {
        codCone4Queijos = codCone4Queijos+1;
        return codCone4Queijos;
    }
    
    public synchronized int getCodTrad4Queijos() {
        codTrad4Queijos = codTrad4Queijos+1;
        return codTrad4Queijos;
    }
    
    @Override
    public abstract void buildMassa();
    
    @Override
    public abstract void buildRecheio();
    
    public PizzaProduct getPizza(){
        return this.pizza;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.util.Bridge;

import pizza.util.Builder.PizzaBuilder;

/**
 *
 * @author 20121bsi0040
 */
public abstract class BridgePizza {
    protected PizzaBuilder pizza;
    protected float precoFinal;
    
    public BridgePizza(){
        this.fazerPizza();
        this.precoFinal = this.pizza.getPizza().getPizzaComMassa().getPreco();
    }
    
    public BridgePizza(int quantRecheio){
        if (quantRecheio > 0 && quantRecheio < 13){
            this.fazerPizza();
            for(int i = 0; i < quantRecheio; i++){
                this.maisRecheio();
            }
            float precoMassa = this.pizza.getPizza().getPizzaComMassa().getPreco() - this.pizza.getPizza().getPizzaRecheio().getPreco();
            this.precoFinal = precoMassa + this.pizza.getPizza().getPizzaRecheio().getPreco() * quantRecheio;
        }
        else{
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(.-. já pensou em procurar um médico?)");
        }
    }
    
    public float getPrecoFinal(){
        return this.precoFinal;
    }
    
    public abstract void maisRecheio();
    public abstract void fazerPizza();
    
    @Override
    public String toString(){
        return pizza.getPizza().toString() + "Preço Final = R$ " + this.precoFinal + "\n"; 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.cdp.decorator;

import pizza.util.Fabrica.FabricaPizza;

/**
 *
 * @author IzabelyFurtado
 */
public abstract class Ingrediente extends PizzaDecorator{
    private final String nome;
    
    Ingrediente(String nome, FabricaPizza pizza, float preco){
        super(pizza, preco);
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    @Override
    public String toString(){
        return this.umaPizza.toString() + this.nome + " por R$ " + this.getPreco() + "\n";
    }

}

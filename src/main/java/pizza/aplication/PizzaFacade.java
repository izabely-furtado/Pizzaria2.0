/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.aplication;

import pizza.util.Bridge.*;
import pizza.util.Builder.*;

/**
 *
 * @author IzabelyFurtado
 */
public class PizzaFacade {
    
    public static void criando(PizzaBuilder pizzaEscolhida){
        PizzariaDirector pizzaria = new PizzariaDirector(pizzaEscolhida);
        pizzaria.construirPizza();
        PizzaProduct pizza = pizzaria.getPizza();
        System.out.println(pizza);
    }

    public static BridgePizza escolhaPizzaCone(int opcaoRecheio, int quantRecheio) {
        if (opcaoRecheio == 1){
            return new BridgeConeMussarela(quantRecheio);
        }
        else if (opcaoRecheio == 2){
            return new BridgeCone4Queijos(quantRecheio);
        }
        else {
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(Escolha coisas possíveis)");
        }
    }

    public static BridgePizza escolhaPizzaTradicional(int opcaoRecheio, int quantRecheio) {
        if (opcaoRecheio == 1){
            return new BridgeTradMussarela(quantRecheio);
        }
        else if (opcaoRecheio == 2){
            return new BridgeTrad4Queijos(quantRecheio);
        }
        else {
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(Escolha coisas possíveis)");
        }
    }

    public static BridgePizza escolhaMassaRecheioQuant(int opcaoMassa, int opcaoRecheio, int quantRecheio) {
        if (opcaoMassa == 1){
            return PizzaFacade.escolhaPizzaCone(opcaoRecheio, quantRecheio);
        }
        else if (opcaoMassa == 2){
            return PizzaFacade.escolhaPizzaTradicional(opcaoRecheio, quantRecheio);
        }
        else{
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(Escolha coisas possíveis)");
        }
    }

}

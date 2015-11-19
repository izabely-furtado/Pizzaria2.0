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

    public static BridgePizza escolhaPizzaCone(int opcaoRecheio, int quantRecheio, int quantPizza) {
        PizzaFlyweightFactory factory = new PizzaFlyweightFactory();
        if (opcaoRecheio == 1){
            return factory.getStandardConeMussarela(quantPizza, quantRecheio);
        }
        else if (opcaoRecheio == 2){
            return factory.getStandardCone4Queijos(quantPizza, quantRecheio);
        }
        else {
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(Escolha coisas possíveis)");
        }
    }

    public static BridgePizza escolhaPizzaTradicional(int opcaoRecheio, int quantRecheio, int quantPizza) {
        PizzaFlyweightFactory factory = new PizzaFlyweightFactory();
        if (opcaoRecheio == 1){
            return factory.getStandardTradMussarela(quantPizza, quantRecheio);
        }
        else if (opcaoRecheio == 2){
            return factory.getStandardTrad4Queijos(quantPizza, quantRecheio);
        }
        else {
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(Escolha coisas possíveis)");
        }
    }

    public static BridgePizza escolhaMassaQuantRecheio(int opcaoMassa, int opcaoRecheio, int quantRecheio) {
        if (opcaoMassa == 1){
            return PizzaFacade.escolhaPizzaCone(opcaoRecheio, quantRecheio, 1);
        }
        else if (opcaoMassa == 2){
            return PizzaFacade.escolhaPizzaTradicional(opcaoRecheio, quantRecheio, 1);
        }
        else{
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(Escolha coisas possíveis)");
        }
    }
    
    public static BridgePizza escolhaMassaRecheioQuant(int opcaoMassa, int opcaoRecheio, int quantRecheio, int quantPizza) {
        if (opcaoMassa == 1){
            return PizzaFacade.escolhaPizzaCone(opcaoRecheio, quantRecheio, quantPizza);
        }
        else if (opcaoMassa == 2){
            return PizzaFacade.escolhaPizzaTradicional(opcaoRecheio, quantRecheio, quantPizza);
        }
        else{
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(Escolha coisas possíveis)");
        }
    }

}

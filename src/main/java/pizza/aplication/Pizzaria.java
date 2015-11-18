/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.aplication;

import pizza.util.Builder.Cone4QueijosBuilder;
import pizza.util.Builder.PizzaBuilder;
import pizza.util.Builder.TradMussarelaBuilder;
import pizza.util.Builder.ConeMussarelaBuilder;
import pizza.util.Builder.PizzaProduct;
import pizza.util.Builder.PizzariaDirector;
import pizza.util.Builder.Trad4QueijosBuilder;
import java.util.Scanner;

/**
 *
 * @author IzabelyFurtado
 */
public class Pizzaria {
    
    public static void escolha() {
        Scanner lerOpcao = new Scanner(System.in);
        //Receitas ou sair
        System.out.println("Digite a massa desejada:    \n"
                         + "1 - Cone                    \n"
                         + "2 - Tradicional             \n"
                         + "3 - Sair                      ");
        int opcaoMassa = lerOpcao.nextInt();
        while (opcaoMassa == 1 || opcaoMassa == 2) {
            System.out.println("Digite a pizza desejada:\n"
                             + "1 - Massarela           \n"
                             + "2 - 4 Queijos             ");
            int opcaoRecheio = lerOpcao.nextInt();
            if (opcaoMassa == 1){
                criando(Pizzaria.escolhaPizzaCone(opcaoRecheio));
            }
            else {
                criando(Pizzaria.escolhaPizzaTradicional(opcaoRecheio));
            }
            System.out.println("Digite a massa desejada:\n"
                             + "1 - Cone                \n"
                             + "2 - Tradicional         \n"
                             + "3 - Sair                  ");
            opcaoMassa = lerOpcao.nextInt();
            
        }
        //se escolher sair o programa para
        System.out.println(" Arrivederci (º3º) ");    
    }
    
    public static void criando(PizzaBuilder pizzaEscolhida){
        PizzariaDirector pizzaria = new PizzariaDirector(pizzaEscolhida);
        pizzaria.construirPizza();
        PizzaProduct pizza = pizzaria.getPizza();
        System.out.println(pizza);
    }

    public static PizzaBuilder escolhaPizzaCone(int opcaoRecheio) {
        if (opcaoRecheio == 1){
            return ConeMussarelaBuilder.getInstance();
        }
        else if (opcaoRecheio == 2){
            return Cone4QueijosBuilder.getInstance();
        }
        else {
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(Escolha coisas possíveis)");
        }
    }

    public static PizzaBuilder escolhaPizzaTradicional(int opcaoRecheio) {
        if (opcaoRecheio == 1){
            return TradMussarelaBuilder.getInstance();
        }
        else if (opcaoRecheio == 2){
            return Trad4QueijosBuilder.getInstance();
        }
        else {
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(Escolha coisas possíveis)");
        }
    }
    
}

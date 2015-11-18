/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.aplication;

import java.util.Scanner;
import pizza.util.Bridge.BridgeCone4Queijos;
import pizza.util.Bridge.BridgeConeMussarela;
import pizza.util.Bridge.BridgePizza;
import pizza.util.Bridge.BridgeTrad4Queijos;
import pizza.util.Bridge.BridgeTradMussarela;
import pizza.util.Builder.PizzaBuilder;
import pizza.util.Builder.PizzaProduct;
import pizza.util.Builder.PizzariaDirector;

/**
 *
 * @author IzabelyFurtado
 */
public class Pizzaria {
    
    public static void escolha() {
        Scanner lerOpcao = new Scanner(System.in);
        //Receitas ou sair
        int opcaoMassa = Pizzaria.leOpcoesMassa();
        while (opcaoMassa == 1 || opcaoMassa == 2) {
            //escolhe recheio
            int opcaoRecheio = Pizzaria.leOpcoesRecheio();
            //pergunta se quer mais recheio
            int maisRecheio = Pizzaria.leMaisRecheio();
            if (maisRecheio == 1){
                int quantRecheio = Pizzaria.leQuantRecheio();
                System.out.println(Pizzaria.escolhaMassaRecheioQuant(opcaoMassa, opcaoRecheio, quantRecheio));
            }
            else{
                System.out.println(Pizzaria.escolhaPizzaCone(opcaoRecheio, 1));
            }
            opcaoMassa = Pizzaria.leOpcoesMassa();
        }
        //se escolher sair o programa para
        System.out.println(" Arrivederci (º3º) ");    
    }
    
    public static int leOpcoesMassa(){
        System.out.println("Digite a massa desejada:\n"
                             + "1 - Cone                \n"
                             + "2 - Tradicional         \n"
                             + "3 - Sair                  ");
        Scanner lerOpcao = new Scanner(System.in);
        int opcaoMassa = lerOpcao.nextInt();
        return opcaoMassa;
    }
    
    public static int leOpcoesRecheio(){
        System.out.println("Digite a pizza desejada:\n"
                             + "1 - Massarela           \n"
                             + "2 - 4 Queijos             ");
        Scanner lerOpcao = new Scanner(System.in);
        int opcaoMassa = lerOpcao.nextInt();
        return opcaoMassa;
    }
    
    public static int leMaisRecheio(){
        System.out.println("Quer mais Recheio?  :\n"
                             + "1 - Sim           \n"
                             + "2 - Não           \n");
        Scanner lerOpcao = new Scanner(System.in);
        int opcao = lerOpcao.nextInt();
        return opcao;
    }
    
    public static int leQuantRecheio(){
        System.out.println("Quer quanto mais de Recheio? ");
        Scanner lerOpcao = new Scanner(System.in);
        int opcao = lerOpcao.nextInt();
        return opcao;
    }
    
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

    private static BridgePizza escolhaMassaRecheioQuant(int opcaoMassa, int opcaoRecheio, int quantRecheio) {
        if (opcaoMassa == 1){
            return Pizzaria.escolhaPizzaCone(opcaoRecheio, quantRecheio);
        }
        else if (opcaoMassa == 2){
            return Pizzaria.escolhaPizzaTradicional(opcaoRecheio, quantRecheio);
        }
        else{
            throw new RuntimeException("Só um palpite: dando tudo errado, grite.\n"
                                     + "Ulisses Tavares \n"
                                     + "(Escolha coisas possíveis)");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.aplication;

import java.util.Scanner;

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
                System.out.println(PizzaFacade.escolhaMassaRecheioQuant(opcaoMassa, opcaoRecheio, quantRecheio, 12));
            }
            else{
                System.out.println(PizzaFacade.escolhaMassaRecheioQuant(opcaoMassa, opcaoRecheio, 1, 12));
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
    
        public static int leQuantasPizzas(){
        System.out.println("Digite quantas pizzas desse tipo deseja:\n");
        Scanner lerOpcao = new Scanner(System.in);
        int opcaoQuant = lerOpcao.nextInt();
        return opcaoQuant;
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
    
}

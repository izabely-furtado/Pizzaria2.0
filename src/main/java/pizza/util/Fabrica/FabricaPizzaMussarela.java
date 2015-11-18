/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Fabrica;

import pizza.cdp.recheio.Gorgonzola;
import pizza.cdp.recheio.Mussarela;
import pizza.cdp.recheio.Cebola;
import pizza.cdp.recheio.MolhoTomate;
import pizza.cdp.recheio.Parmesao;
import pizza.cdp.recheio.Presunto;
import pizza.cdp.recheio.Provolone;
/**
 *
 * @author IzabelyFurtado
 */

/*Mussarela:
    Ingredientes: 
        massa, 
        molho de tomate, 
        queijo mussarela, 
        queijo gongorzola,
        cebola e 
        presunto;
*/
public class FabricaPizzaMussarela extends FabricaPizza{
    
    private FabricaPizzaMussarela(){
        super(0F);
    }
        
    private static FabricaPizza cria(FabricaPizza pizza){
        FabricaPizza p = new MolhoTomate(pizza);
        p = new Mussarela(p);
        p = new Gorgonzola(p);
        p = new Cebola(p);
        p = new Presunto(p);
        return p;
    }
    
    public synchronized static FabricaPizza getInstance() {
        if(fabPizza == null) {
            fabPizza = new FabricaPizzaMussarela();
            fabPizza = FabricaPizzaMussarela.cria(fabPizza);
        }
        return fabPizza;
    }
    
    @Override
    public String toString(){
        return "Pizza Mussarela: \n"
                + "Ingredientes: \n"; //+ 
                //super.toString();
    }
    
    
}

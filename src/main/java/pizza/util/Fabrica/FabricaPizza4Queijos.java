/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Fabrica;

import pizza.cdp.recheio.MolhoTomate;
import pizza.cdp.recheio.Gorgonzola;
import pizza.cdp.recheio.Margherita;
import pizza.cdp.recheio.Mussarela;
import pizza.cdp.recheio.Parmesao;
import pizza.cdp.recheio.Provolone;

/**
 *
 * @author IzabelyFurtado
 */
/*
. Quatro queijos:
    Ingredientes: 
        massa, 
        molho de tomate, 
        queijo parmesão, 
        queijo mussarela,
        queijo provolone,
        queijo margherita e
        queijo gorgonzola
*/
public class FabricaPizza4Queijos extends FabricaPizza{
    
    private FabricaPizza4Queijos(){
        super(0F);
    }
        
    private static FabricaPizza cria(FabricaPizza pizza){
        FabricaPizza p = new MolhoTomate(pizza);
        p = new Mussarela(p);
        p = new Gorgonzola(p);
        p = new Parmesao(p);
        p = new Provolone(p);
        return p;
    }
    public synchronized static FabricaPizza getInstance() {
        if(fabPizza == null) {
            fabPizza = new FabricaPizza4Queijos();
            fabPizza = FabricaPizza4Queijos.cria(fabPizza);
        }
        return fabPizza;
    }
    
    @Override
    public String toString(){
        return "Pizza 4 Queijos: \n"
                + "Ingredientes: \n";// +
                //fabPizza.toString();
    }
    
}

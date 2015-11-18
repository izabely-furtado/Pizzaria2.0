/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Fabrica;

import pizza.cdp.decorator.massa.Tradicional;
import pizza.cdp.decorator.massa.Cone;
import pizza.cdp.decorator.recheio.Presunto;
import pizza.cdp.decorator.recheio.Cebola;
import pizza.cdp.decorator.recheio.MolhoTomate;
import pizza.cdp.decorator.recheio.Margherita;
import pizza.cdp.decorator.recheio.Provolone;
import pizza.cdp.decorator.recheio.Gorgonzola;
import pizza.cdp.decorator.recheio.Mussarela;
import pizza.cdp.decorator.recheio.Parmesao;

/**
 *
 * @author IzabelyFurtado
 */
public interface FabricaIngredientes {
    public Cebola criaCebola(FabricaPizza pizza);
    
    //public Massa criaMassa();
    public Cone criaMassaCone(FabricaPizza pizza);
    public Tradicional criaMassaTrad(FabricaPizza pizza);
    
    public MolhoTomate criaMolhoTomate(FabricaPizza pizza);
    public Presunto criaPresunto(FabricaPizza pizza);
    
    //public Queijo criaQueijo();
    public Gorgonzola criaQueijoGorg(FabricaPizza pizza);
    public Margherita criaQueijoMarg(FabricaPizza pizza);
    public Mussarela criaQueijoMuss(FabricaPizza pizza);
    public Parmesao criaQueijoParm(FabricaPizza pizza);
    public Provolone criaQueijoProv(FabricaPizza pizza);
    
}

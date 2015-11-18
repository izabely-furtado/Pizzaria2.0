/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.util.Fabrica;

import pizza.cdp.recheio.Presunto;
import pizza.cdp.recheio.Cebola;
import pizza.cdp.recheio.MolhoTomate;
import pizza.cdp.recheio.Margherita;
import pizza.cdp.recheio.Provolone;
import pizza.cdp.recheio.Gorgonzola;
import pizza.cdp.recheio.Mussarela;
import pizza.cdp.recheio.Parmesao;
import pizza.cdp.massa.*;

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

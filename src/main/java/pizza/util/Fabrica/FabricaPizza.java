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
import pizza.cdp.decorator.recheio.Parmesao;
import pizza.cdp.decorator.recheio.Mussarela;

/**
 *
 * @author IzabelyFurtado
 */
public class FabricaPizza implements FabricaIngredientes {

    protected static FabricaPizza fabPizza;
    protected int codMussarela;
    protected int cod4Queijos;
    protected float preco;
    
    public FabricaPizza(float preco){
        this.preco = preco;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public void setPreco(float preco){
        if (preco > 0){
            this.preco = preco;
        }
    }
    
    public synchronized int getCodMussarela() {
        codMussarela = codMussarela+1;
        return codMussarela;
    }
    
    public synchronized int getCod4Queijos() {
        cod4Queijos = cod4Queijos+1;
        return cod4Queijos;
    }
    
    @Override
    public Cebola criaCebola(FabricaPizza pizza) {
        return new Cebola(pizza);
    }

    @Override
    public Cone criaMassaCone(FabricaPizza pizza) {
        return new Cone(pizza);
    }

    @Override
    public Tradicional criaMassaTrad(FabricaPizza pizza) {
        return new Tradicional(pizza);
    }

    @Override
    public MolhoTomate criaMolhoTomate(FabricaPizza pizza) {
        return new MolhoTomate(pizza);
    }

    @Override
    public Presunto criaPresunto(FabricaPizza pizza) {
        return new Presunto(pizza);
    }

    @Override
    public Gorgonzola criaQueijoGorg(FabricaPizza pizza) {
        return new Gorgonzola(pizza);
    }

    @Override
    public Margherita criaQueijoMarg(FabricaPizza pizza) {
        return new Margherita(pizza);
    }

    @Override
    public Parmesao criaQueijoParm(FabricaPizza pizza) {
        return new Parmesao(pizza);
    }

    @Override
    public Provolone criaQueijoProv(FabricaPizza pizza) {
        return new Provolone(pizza);
    }

    @Override
    public Mussarela criaQueijoMuss(FabricaPizza pizza) {
        return new Mussarela(pizza);
    }
    
}

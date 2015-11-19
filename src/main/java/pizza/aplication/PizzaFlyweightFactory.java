/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza.aplication;

import java.util.HashMap;
import java.util.Map;
import pizza.util.Bridge.BridgeCone4Queijos;
import pizza.util.Bridge.BridgeConeMussarela;
import pizza.util.Bridge.BridgePizza;
import pizza.util.Bridge.BridgeTrad4Queijos;
import pizza.util.Bridge.BridgeTradMussarela;

/**
 *
 * @author IzabelyFurtado
 */
public class PizzaFlyweightFactory {
    private Map<Integer, BridgePizza> standardConeMussarela;
    private Map<Integer, BridgePizza> standartCone4Queijos;
    private Map<Integer, BridgePizza> standardTradMussarela;
    private Map<Integer, BridgePizza> standartTrad4Queijos;
    
    public PizzaFlyweightFactory(){
        this.standardConeMussarela = new HashMap<>();
        this.standardTradMussarela = new HashMap<>();
        this.standartCone4Queijos = new HashMap<>();
        this.standartTrad4Queijos = new HashMap<>();
    }
    
    public BridgePizza getStandardConeMussarela(int quantRecheio, int quantPizza){
        BridgePizza e = this.standardConeMussarela.get(quantPizza);
        if (e == null){
            e = new BridgeConeMussarela(quantRecheio, quantPizza);
            this.standardConeMussarela.put(quantPizza, e);
        }
        return e;
        
    }
    
    public BridgePizza getStandardCone4Queijos(int quantPizza, int quantRecheio){
        BridgePizza e = this.standartCone4Queijos.get(quantPizza);
        if (e == null){
            e = new BridgeCone4Queijos(quantPizza, quantRecheio);
            this.standartCone4Queijos.put(quantPizza, e);
        }
        
        return e;
        
    }
    
    public BridgePizza getStandardTradMussarela(int quant, int quantRecheio){
        BridgePizza e = this.standardTradMussarela.get(quant);
        if (e == null){
            e = new BridgeTradMussarela(quant, quantRecheio);
            this.standardTradMussarela.put(quant, e);
        }
        
        return e;
        
    }

    public BridgePizza getStandardTrad4Queijos(int quant, int quantRecheio){
        BridgePizza e = this.standartTrad4Queijos.get(quant);
        if (e == null){
            e = new BridgeTrad4Queijos(quant, quantRecheio);
            this.standartTrad4Queijos.put(quant, e);
        }
        
        return e;
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testes;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pizza.aplication.PizzaFacade;
import pizza.aplication.Pizzaria;
import pizza.util.Bridge.BridgeCone4Queijos;
import pizza.util.Bridge.BridgeConeMussarela;
import pizza.util.Bridge.BridgePizza;
import pizza.util.Bridge.BridgeTrad4Queijos;
import pizza.util.Bridge.BridgeTradMussarela;

/**
 *
 * @author IzabelyFurtado
 */
public class PizzaTestApp {
    
    public PizzaTestApp() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Test
    public void escolhaPizzaConeMussarela(){
        int val = 1;
        BridgePizza resultado = new BridgeConeMussarela();
        assertEquals(resultado.getPrecoFinal(), PizzaFacade.escolhaPizzaCone(val, 1).getPrecoFinal(), 0.1F);
    }
    
    @Test
    public void escolhaPizzaCone4Queijos(){
        int val = 2;
        BridgePizza resultado = new BridgeCone4Queijos();
        assertEquals(resultado.getPrecoFinal(), PizzaFacade.escolhaPizzaCone(val, 1).getPrecoFinal(), 0.1F);
    }
        
    @Test
    public void escolhaPizzaTradMussarela(){
        int val = 1;
        BridgePizza resultado = new BridgeTradMussarela();
        assertEquals(resultado.getPrecoFinal(), PizzaFacade.escolhaPizzaTradicional(val, 1).getPrecoFinal(), 0.1F);
    }
    
    @Test
    public void escolhaPizzaTrad4Queijos(){
        int val = 2;
        BridgePizza resultado = new BridgeTrad4Queijos();
        assertEquals(resultado.getPrecoFinal(), PizzaFacade.escolhaPizzaTradicional(val, 1).getPrecoFinal(), 0.1F);
    }
     
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

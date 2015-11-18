/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testes;

import pizza.cdp.recheio.Cebola;
import pizza.cdp.recheio.MolhoTomate;
import pizza.cdp.recheio.Presunto;
import pizza.cdp.recheio.Margherita;
import pizza.cdp.recheio.Parmesao;
import pizza.cdp.recheio.Gorgonzola;
import pizza.cdp.recheio.Provolone;
import pizza.cdp.recheio.Mussarela;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pizza.cdp.*;
import pizza.cdp.massa.*;
import pizza.util.Fabrica.FabricaPizza;

/**
 *
 * @author IzabelyFurtado
 */
public class PizzaTestUtil {
    
    public PizzaTestUtil() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Test
    public void criaCebola() {
        FabricaPizza val = new FabricaPizza();
        Cebola resultado = new Cebola();
        assertEquals(resultado.getNome(), val.criaCebola().getNome());
    }
    
    @Test
    public void criaMassaCone() {
        FabricaPizza val = new FabricaPizza();
        Cone resultado = new Cone();
        assertEquals(resultado.getNome(), val.criaMassaCone().getNome());
    }
        
    @Test
    public void criaMassaTrad() {
        FabricaPizza val = new FabricaPizza();
        Tradicional resultado = new Tradicional();
        assertEquals(resultado.getNome(), val.criaMassaTrad().getNome());
    }
    
    @Test
    public void criaMolhoTomate() {
        FabricaPizza val = new FabricaPizza();
        MolhoTomate resultado = new MolhoTomate();
        assertEquals(resultado.getNome(), val.criaMolhoTomate().getNome());
    }
    
    @Test
    public void criaPresunto() {
        FabricaPizza val = new FabricaPizza();
        Presunto resultado = new Presunto();
        assertEquals(resultado.getNome(), val.criaPresunto().getNome());
    }
    
    @Test
    public void criaQueijoGorg() {
        FabricaPizza val = new FabricaPizza();
        Gorgonzola resultado = new Gorgonzola();
        assertEquals(resultado.getNome(), val.criaQueijoGorg().getNome());
    }

    @Test
    public void criaQueijoMarg() {
        FabricaPizza val = new FabricaPizza();
        Margherita resultado = new Margherita();
        assertEquals(resultado.getNome(), val.criaQueijoMarg().getNome());
    }
    
    @Test
    public void criaQueijoParm() {
        FabricaPizza val = new FabricaPizza();
        Parmesao resultado = new Parmesao();
        assertEquals(resultado.getNome(), val.criaQueijoParm().getNome());
    }
    
    @Test
    public void criaQueijoProv() {
        FabricaPizza val = new FabricaPizza();
        Provolone resultado = new Provolone();
        assertEquals(resultado.getNome(), val.criaQueijoProv().getNome());
    }

    @Test
    public void criaQueijoMuss() {
        FabricaPizza val = new FabricaPizza();
        Mussarela resultado = new Mussarela();
        assertEquals(resultado.getNome(), val.criaQueijoMuss().getNome());
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

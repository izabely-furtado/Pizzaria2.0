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
        FabricaPizza val = new FabricaPizza(0F);
        Cebola resultado = new Cebola(val);
        assertSame(resultado.getNome(), val.criaCebola(val).getNome());
    }
    
    @Test
    public void criaMassaCone() {
        FabricaPizza val = new FabricaPizza(0F);
        Cone resultado = new Cone(val);
        assertEquals(resultado.getNome(), val.criaMassaCone(val).getNome());
    }
        
    @Test
    public void criaMassaTrad() {
        FabricaPizza val = new FabricaPizza(0F);
        Tradicional resultado = new Tradicional(val);
        assertEquals(resultado.getNome(), val.criaMassaTrad(val).getNome());
    }
    
    @Test
    public void criaMolhoTomate() {
        FabricaPizza val = new FabricaPizza(0F);
        MolhoTomate resultado = new MolhoTomate(val);
        assertEquals(resultado.getNome(), val.criaMolhoTomate(val).getNome());
    }
    
    @Test
    public void criaPresunto() {
        FabricaPizza val = new FabricaPizza(0F);
        Presunto resultado = new Presunto(val);
        assertEquals(resultado.getNome(), val.criaPresunto(val).getNome());
    }
    
    @Test
    public void criaQueijoGorg() {
        FabricaPizza val = new FabricaPizza(0F);
        Gorgonzola resultado = new Gorgonzola(val);
        assertEquals(resultado.getNome(), val.criaQueijoGorg(val).getNome());
    }

    @Test
    public void criaQueijoMarg() {
        FabricaPizza val = new FabricaPizza(0F);
        Margherita resultado = new Margherita(val);
        assertEquals(resultado.getNome(), val.criaQueijoMarg(val).getNome());
    }
    
    @Test
    public void criaQueijoParm() {
        FabricaPizza val = new FabricaPizza(0F);
        Parmesao resultado = new Parmesao(val);
        assertEquals(resultado.getNome(), val.criaQueijoParm(val).getNome());
    }
    
    @Test
    public void criaQueijoProv() {
        FabricaPizza val = new FabricaPizza(0F);
        Provolone resultado = new Provolone(val);
        assertEquals(resultado.getNome(), val.criaQueijoProv(val).getNome());
    }

    @Test
    public void criaQueijoMuss() {
        FabricaPizza val = new FabricaPizza(0F);
        Mussarela resultado = new Mussarela(val);
        assertEquals(resultado.getNome(), val.criaQueijoMuss(val).getNome());
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

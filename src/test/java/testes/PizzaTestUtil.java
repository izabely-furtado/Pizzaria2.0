/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testes;

import pizza.cdp.decorator.massa.Cone;
import pizza.cdp.decorator.massa.Tradicional;
import pizza.cdp.decorator.recheio.Cebola;
import pizza.cdp.decorator.recheio.MolhoTomate;
import pizza.cdp.decorator.recheio.Presunto;
import pizza.cdp.decorator.recheio.Margherita;
import pizza.cdp.decorator.recheio.Parmesao;
import pizza.cdp.decorator.recheio.Gorgonzola;
import pizza.cdp.decorator.recheio.Provolone;
import pizza.cdp.decorator.recheio.Mussarela;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
        assertEquals(resultado.getPreco(), val.criaCebola(val).getPreco(), 0.1F);
    }
    
    @Test
    public void criaMassaCone() {
        FabricaPizza val = new FabricaPizza(0F);
        Cone resultado = new Cone(val);
        assertEquals(resultado.getPreco(), val.criaMassaCone(val).getPreco(), 0.1F);
    }
        
    @Test
    public void criaMassaTrad() {
        FabricaPizza val = new FabricaPizza(0F);
        Tradicional resultado = new Tradicional(val);
        assertEquals(resultado.getPreco(), val.criaMassaTrad(val).getPreco(), 0.1F);
    }
    
    @Test
    public void criaMolhoTomate() {
        FabricaPizza val = new FabricaPizza(0F);
        MolhoTomate resultado = new MolhoTomate(val);
        assertEquals(resultado.getPreco(), val.criaMolhoTomate(val).getPreco(), 0.1F);
    }
    
    @Test
    public void criaPresunto() {
        FabricaPizza val = new FabricaPizza(0F);
        Presunto resultado = new Presunto(val);
        assertEquals(resultado.getPreco(), val.criaPresunto(val).getPreco(), 0.1F);
    }
    
    @Test
    public void criaQueijoGorg() {
        FabricaPizza val = new FabricaPizza(0F);
        Gorgonzola resultado = new Gorgonzola(val);
        assertEquals(resultado.getPreco(), val.criaQueijoGorg(val).getPreco(), 0.1F);
    }

    @Test
    public void criaQueijoMarg() {
        FabricaPizza val = new FabricaPizza(0F);
        Margherita resultado = new Margherita(val);
        assertEquals(resultado.getPreco(), val.criaQueijoMarg(val).getPreco(), 0.1F);
    }
    
    @Test
    public void criaQueijoParm() {
        FabricaPizza val = new FabricaPizza(0F);
        Parmesao resultado = new Parmesao(val);
        assertEquals(resultado.getPreco(), val.criaQueijoParm(val).getPreco(), 0.1F);
    }
    
    @Test
    public void criaQueijoProv() {
        FabricaPizza val = new FabricaPizza(0F);
        Provolone resultado = new Provolone(val);
        assertEquals(resultado.getPreco(), val.criaQueijoProv(val).getPreco(), 0.1F);
    }

    @Test
    public void criaQueijoMuss() {
        FabricaPizza val = new FabricaPizza(0F);
        Mussarela resultado = new Mussarela(val);
        assertEquals(resultado.getPreco(), val.criaQueijoMuss(val).getPreco(), 0.1F);
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

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
import pizza.aplication.Pizzaria;
import pizza.util.Builder.Cone4QueijosBuilder;
import pizza.util.Builder.ConeMussarelaBuilder;
import pizza.util.Builder.PizzaBuilder;
import pizza.util.Builder.Trad4QueijosBuilder;
import pizza.util.Builder.TradMussarelaBuilder;

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
    public void escolhaPizzaCone1(){
        int val = 1;
        PizzaBuilder resultado = ConeMussarelaBuilder.getInstance();
        assertEquals(resultado, Pizzaria.escolhaPizzaCone(val));
    }
    
    @Test
    public void escolhaPizzaCone2(){
        int val = 2;
        PizzaBuilder resultado = Cone4QueijosBuilder.getInstance();
        assertEquals(resultado, Pizzaria.escolhaPizzaCone(val));
    }
        
    @Test
    public void escolhaPizzaTrad1(){
        int val = 1;
        PizzaBuilder resultado = TradMussarelaBuilder.getInstance();
        assertEquals(resultado, Pizzaria.escolhaPizzaTradicional(val));
    }
    
    @Test
    public void escolhaPizzaTrad2(){
        int val = 2;
        PizzaBuilder resultado = Trad4QueijosBuilder.getInstance();
        assertEquals(resultado, Pizzaria.escolhaPizzaTradicional(val));
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

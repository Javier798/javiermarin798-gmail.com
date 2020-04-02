/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author javie
 */
public class PruebaTest {
    
    public PruebaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of aProbar method, of class Prueba.
     */
    @Test
    public void testAProbar() {
        System.out.println("aProbar");
        int q = -1;
        int expResult = 0;
        int result = Prueba.aProbar(q);
        assertEquals(expResult, result);

    }
        @Test
    public void testAProbar1() {
        System.out.println("aProbar");
        int q = 1;
        int expResult = 1;
        int result = Prueba.aProbar(q);
        assertEquals(expResult, result);

    }
    
}

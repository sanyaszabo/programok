package alaposztalyok;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import alaposztalyok.Hitelkartya;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Sandor
 */
public class HitelkartyaTeszt {
    
    @Test
    public void testHitelkartya() {
        Bankkartya.setLIMIT(10000);
        Hitelkartya h = new Hitelkartya("test", 1, 1234, 500);
        assertEquals(0, h.egyenleg);
        assertEquals(0, h.hiteltartozas);
        
        h.feltolt(1000);
        assertEquals(1000, h.egyenleg);
        assertEquals(0, h.hiteltartozas);
        
        assertTrue(h.vasarol(1499));
        assertEquals(0, h.egyenleg);
        assertEquals(499, h.hiteltartozas);
        
        h.feltolt(200);
        assertEquals(0, h.egyenleg);
        assertEquals(299, h.hiteltartozas);

        h.feltolt(299);
        assertEquals(0, h.egyenleg);
        assertEquals(0, h.hiteltartozas);
        
        h.feltolt(100);
        assertEquals(100, h.egyenleg);
        assertEquals(0, h.hiteltartozas);
        
        assertFalse(h.vasarol(601));
        assertEquals(100, h.egyenleg);
        assertEquals(0, h.hiteltartozas);
        
    }
    
    
    
}

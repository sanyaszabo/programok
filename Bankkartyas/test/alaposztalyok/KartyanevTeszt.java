/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Sandor
 */
public class KartyanevTeszt {
    @Test
    public void testBankkartyaNev() {
        assertEquals("bankkártya", new Bankkartya(null, 0, 0).getKartyatipus());
    }
    @Test
    public void testHitelkartyaNev() {
        assertEquals("hitelkártya", new Hitelkartya(null, 0, 0,0).getKartyatipus());
    }
}

package raphaelTest;

import org.ifpe.model.Deslogar;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestDeslogar {

    @Test
    public void DeslogarOK(){
        Deslogar deslogar = new Deslogar();
        boolean deslogarok = deslogar.deslogar("12345678911", "P@ssw0rd!","S");
        assertTrue(deslogarok);
    }

    @Test
    public void DeslogarNOK(){
        Deslogar deslogar = new Deslogar();
        boolean deslogarnok = deslogar.deslogar("12345678911", "P@ssw0rd!","N");
        assertFalse(deslogarnok);
    }
}

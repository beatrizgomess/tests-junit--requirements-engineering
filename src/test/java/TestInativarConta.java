import org.ifpe.InativarConta;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestInativarConta {

    @Test
    public void InativarContaOK(){
        InativarConta inativarConta = new InativarConta();
        boolean inativar = inativarConta.inativarConta("12345678911", "P@ssw0rd!","1111");
        assertTrue(inativar);
    }

    @Test
    public void InativarContaNOK(){
        InativarConta inativarConta = new InativarConta();
        boolean inativar = inativarConta.inativarConta("12345678911", "P@ssw0rd!","1234");
        assertFalse(inativar);
    }

    @Test
    public void InativarContaVazio(){
        InativarConta inativarConta = new InativarConta();
        boolean inativar = inativarConta.inativarConta("", "","");
        assertFalse(inativar);
    }
}

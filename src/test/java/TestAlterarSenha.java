import org.ifpe.MudarSenha;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAlterarSenha {

    @Test
    public void AlterarSenhaOK(){
        MudarSenha mudarSenha =new MudarSenha();
        boolean resultado = mudarSenha.changePassword("12345678911", "P@ssw0rd!", "NovoP@ssw0rd!");
        assertTrue(resultado);
    }

    @Test
    public void AlterarSenhaVazio(){
        MudarSenha mudarSenha =new MudarSenha();
        boolean resultado = mudarSenha.changePassword("", "", "");
        assertFalse(resultado);
    }

    @Test
    public void AlterarSenhaNOK(){
        MudarSenha mudarSenha =new MudarSenha();
        boolean resultado = mudarSenha.changePassword("12345678911", "Pass", "Password");
        assertFalse(resultado);
    }


}

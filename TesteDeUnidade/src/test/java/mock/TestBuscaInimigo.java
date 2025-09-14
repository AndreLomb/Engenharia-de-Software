package mock;

import c14.model.Inimigo;
import c14.service.InimigoService;
import c14.search.BuscaInimigo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBuscaInimigo {

    @Test
    public void testBuscaInimigoSkeleton(){
        InimigoService service = new MockInimigoService();
        BuscaInimigo buscaInimigo = new BuscaInimigo(service);

        Inimigo skeleton = buscaInimigo.buscaInimigo(10);

        assertEquals("Skeleton", skeleton.getNome());
        assertEquals(200, skeleton.getQtdVida(), 0.1);
        assertEquals("Espada do Skeleton", skeleton.getArma());

    }
}

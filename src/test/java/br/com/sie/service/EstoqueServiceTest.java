
package br.com.sie.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EstoqueServiceTest {
    
     @Test
    public void deveCalcularEntradaDeEstoque() {

        EstoqueService estoque = new EstoqueService();

        int resultado = estoque.calcularEntrada(100, 30);

        assertEquals(130, resultado);
    }
    
    @Test
    public void deveCalcularSaidaDeEstoque() {

        EstoqueService estoque = new EstoqueService();

        int resultado = estoque.calcularSaida(100, 20);

        assertEquals(80, resultado);
    }

    @Test
    public void naoDevePermitirSaidaMaiorQueEstoque() {

        EstoqueService estoque = new EstoqueService();

        assertThrows(
                IllegalArgumentException.class,
                () -> estoque.calcularSaida(100, 150)
        );
    }

    @Test
    public void naoDevePermitirQuantidadeDeEntradaInvalida() {

        EstoqueService estoque = new EstoqueService();

        assertThrows(
                IllegalArgumentException.class,
                () -> estoque.calcularEntrada(100, 0)
        );
    }
    
}

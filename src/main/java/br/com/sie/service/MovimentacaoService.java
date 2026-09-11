package br.com.sie.service;

import br.com.sie.model.Material;
import br.com.sie.model.Movimentacao;
import br.com.sie.model.TipoMovimentacao;

public class MovimentacaoService {

    public boolean validarMovimentacao(Movimentacao movimentacao) {

        if (movimentacao == null) {
            return false;
        }

        if (movimentacao.getMaterial() == null) {
            return false;
        }

        if (movimentacao.getQuantidade() <= 0) {
            return false;
        }

        if (movimentacao.getTipo() == null) {
            return false;
        }

        return true;
    }

    public boolean realizarEntrada(Material material, int quantidade) {

        if (material == null || quantidade <= 0) {
            return false;
        }

        int novoEstoque = material.getQuantidade() + quantidade;

        material.setQuantidade(novoEstoque);

        return true;
    }

    public boolean realizarSaida(Material material, int quantidade) {

        if (material == null || quantidade <= 0) {
            return false;
        }

        if (quantidade > material.getQuantidade()) {
            return false;
        }

        int novoEstoque = material.getQuantidade() - quantidade;

        material.setQuantidade(novoEstoque);

        return true;
    }

    public Movimentacao registrarEntrada(
            int id,
            Material material,
            int quantidade) {

        if (!realizarEntrada(material, quantidade)) {
            return null;
        }

        return new Movimentacao(
                id,
                material,
                TipoMovimentacao.ENTRADA,
                quantidade,
                java.time.LocalDateTime.now()
        );
    }

    public Movimentacao registrarSaida(
            int id,
            Material material,
            int quantidade) {

        if (!realizarSaida(material, quantidade)) {
            return null;
        }

        return new Movimentacao(
                id,
                material,
                TipoMovimentacao.SAIDA,
                quantidade,
                java.time.LocalDateTime.now()
        );
    }
}
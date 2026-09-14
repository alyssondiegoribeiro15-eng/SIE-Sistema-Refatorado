
package br.com.sie.service;


public class EstoqueService {
    
    public int calcularEntrada(int saldoAtual, int quantidadeEntrada) {

        if (quantidadeEntrada <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade de entrada deve ser maior que zero."
            );
        }

        return saldoAtual + quantidadeEntrada;
    }

    public int calcularSaida(int saldoAtual, int quantidadeSaida) {

        if (quantidadeSaida <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade de saída deve ser maior que zero."
            );
        }

        if (quantidadeSaida > saldoAtual) {
            throw new IllegalArgumentException(
                    "Estoque insuficiente para realizar a saída."
            );
        }

        return saldoAtual - quantidadeSaida;
    }
    
}


package br.com.sie.model;

import java.time.LocalDateTime;


public class Movimentacao {
    
    private int id;
    private Material material;
    private TipoMovimentacao tipo;
    private int quantidade;
    private LocalDateTime dataHora;

    public Movimentacao() {
    }

    public Movimentacao(int id, Material material, TipoMovimentacao tipo,
                        int quantidade, LocalDateTime dataHora) {
        this.id = id;
        this.material = material;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.dataHora = dataHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public TipoMovimentacao getTipo() {
    return tipo;
    }

    public void setTipo(TipoMovimentacao tipo) {
    this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Movimentacao{" +
                "id=" + id +
                ", material=" + material.getDescricao() +
                ", tipo='" + tipo + '\'' +
                ", quantidade=" + quantidade +
                ", dataHora=" + dataHora +
                '}';
    }
    
}

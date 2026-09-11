
package br.com.sie.model;


public class Material {
    
    private int id;
    private String descricao;
    private int quantidade;
    private int estoqueMinimo;

    public Material() {
    }

    public Material(int id, String descricao, int quantidade, int estoqueMinimo) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", estoqueMinimo=" + estoqueMinimo +
                '}';
    }
    
}

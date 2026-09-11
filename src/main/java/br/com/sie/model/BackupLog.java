
package br.com.sie.model;

import java.time.LocalDateTime;

public class BackupLog {
    
   private int id;
    private LocalDateTime dataHora;
    private String descricao;
    private String status;

    public BackupLog() {
    }

    public BackupLog(int id, LocalDateTime dataHora,
                     String descricao, String status) {
        this.id = id;
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BackupLog{" +
                "id=" + id +
                ", dataHora=" + dataHora +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                '}';
    }  
    
}

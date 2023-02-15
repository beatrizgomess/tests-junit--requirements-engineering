package org.ifpe.model;

public class Medico {

    private Long id;
    private String nome;
    private String especialidade;
    private String crm;

    public Medico() {}

    public Medico(String nome, String especialidade, String crm) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public boolean validate() {
        if((this.nome == null || this.nome.trim().isEmpty())
        ||(this.especialidade == null || this.especialidade.trim().isEmpty())
        ||(this.crm == null || this.crm.trim() == "")) {
            return false;
        }
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}

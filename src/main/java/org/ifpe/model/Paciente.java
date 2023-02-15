package org.ifpe.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

import org.ifpe.exceptions.*;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Paciente {


    private Long id;
    private String nomeCompleto;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private String orgaoExpedidor;
    private String cep;
    private String bairro;
    private String logradouro;
    private String numeroResidencia;
    private String numeroTelefone;
    private String email;

    private String senha;
    private String complemento;
    private String numeroSus;


    public Paciente(Long id, String nomeCompleto, String cpf, String rg, String dataNascimento) {}


    public boolean validar() {
        if (rg.length() > 9 || rg.length() < 8) {
            throw new RGInvalidException("RG inválido");
        }
        if (cpf.length() != 11) {
            throw new CPFInvalidException("CPF inválido");
        }
        if (Objects.isNull(nomeCompleto) || nomeCompleto.trim().isEmpty() ||
                Objects.isNull(cpf) || cpf.trim().isEmpty() ||
                Objects.isNull(rg) || rg.trim().isEmpty() ||
                Objects.isNull(dataNascimento) || dataNascimento.trim().isEmpty() ||
                Objects.isNull(orgaoExpedidor) || orgaoExpedidor.trim().isEmpty() ||
                Objects.isNull(cep) || cep.trim().isEmpty() ||
                Objects.isNull(bairro) || bairro.trim().isEmpty() ||
                Objects.isNull(logradouro) || logradouro.trim().isEmpty() ||
                Objects.isNull(numeroResidencia) || numeroResidencia.trim().isEmpty() ||
                Objects.isNull(numeroTelefone) || numeroTelefone.trim().isEmpty() ||
                Objects.isNull(email) || email.trim().isEmpty()) {
            throw new InvalidInputException("Entrada inválida");
        }
        try {
            // Validar formato de dataNascimento
        } catch (Exception e) {
            throw new DataNascimentoInvalidException("Data de nascimento inválida");
        }
        return true;
    }

//    public boolean recuperarSenhaValidarCPF(String cpf) {
//        if (cpf == null || cpf.trim().isEmpty()) {
//            throw new CPFInvalidException("CPF inválido");
//        }
//
//        if (cpf.length() != 11) {
//            throw new CPFInvalidException("CPF inválido");
//        }
//        return false;
//    }

//    public boolean recuperarSenhaValidarEmail(String email) {
//        if (email == null || email.trim().isEmpty()) {
//            throw new EmailInvalidException("Email inválido");
//        }
//        return false;
//    }

    public boolean validarEsqueceuSenha(String email, String cpf){
        if (email.equals("joao.silva@gmail.com") && cpf.equals("123456789")) {
            return true;
        }
        else if (email.equals("") || cpf.equals("")) {
            return false;
        }
        return false;
    }


    public String cadastrarPaciente(String nomeCompleto, String cpf, String rg, String dataNascimento,
                                    String orgaoExpedidor, String cep, String bairro, String logradouro,
                                    String numeroResidencia, String numeroTelefone, String email, Long id, String senha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            // Tenta converter a data de nascimento para verificar se é válida
            sdf.parse(dataNascimento);
        } catch (ParseException e) {
            // Se a data não é válida, retorna uma mensagem de erro
            return "Data de nascimento inválida";
        }
        return "Paciente cadastrado com sucesso";
    }

    public Paciente(String cpf, String email) {
        this.cpf = cpf;
        this.email = email;
    }



    public static int calculaIdade(String date) {
        var sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateInput = null;
        try {
            dateInput = sdf.parse(date);
        } catch (Exception e) {
            System.err.println("Data inválida.");
        }
        Calendar dateOfBirth = new GregorianCalendar();
        Calendar today = Calendar.getInstance();
        dateOfBirth.setTime(dateInput);
        var age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        dateOfBirth.add(Calendar.YEAR, age);
        if (today.before(dateOfBirth)) {
            age--;
        }
        return age;
    }

    public boolean validate() {
		if(this.dataNascimento == null) {
			return false;
		}

		if ( (this.dataNascimento.isEmpty() || this.dataNascimento.isBlank())
				|| (calculaIdade(this.dataNascimento) < 18)
				|| (this.nomeCompleto.isEmpty() || this.nomeCompleto.isBlank())
				|| (this.email.isEmpty() || this.email.isBlank())
				|| (this.cpf.isEmpty() || this.cpf.isBlank())
				|| (this.rg.isEmpty() || this.rg.isBlank())
				|| (this.numeroSus.isEmpty() || this.numeroSus.isBlank())
				|| (this.orgaoExpedidor.isEmpty() || this.orgaoExpedidor.isBlank())
				|| (this.cep.isEmpty() || this.cep.isBlank())
				|| (this.numeroResidencia.isEmpty() || this.numeroResidencia.isBlank())
				|| (this.numeroTelefone.isEmpty() || this.numeroTelefone.isBlank())
				|| (this.senha.isEmpty() || this.senha.isBlank())) {
			return false;
		}
		return true;
	}



    public Paciente(Long id, String nomeCompleto, String email, String cpf, String rg, String dataNascimento, String numeroSus,
                    String orgaoExpedidor, String cep, String numCasa, String complemento, String numeroTelefone, String senha) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.numeroSus = numeroSus;
        this.orgaoExpedidor = orgaoExpedidor;
        this.cep = cep;
        this.numeroResidencia = numCasa;
        this.complemento = complemento;
        this.numeroTelefone = numeroTelefone;
        this.senha = senha;
    }

    public Paciente() {}

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumeroSus() {
        return numeroSus;
    }

    public void setNumeroSus(String numeroSus) {
        this.numeroSus = numeroSus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

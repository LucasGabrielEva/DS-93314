package Atividade3;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complimeto;
    private String cep;
    private String cidade;

    public Endereco(String logradouro, String numero, String complimeto, String cep, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complimeto = complimeto;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplimeto() {
        return complimeto;
    }

    public void setComplimeto(String complimeto) {
        this.complimeto = complimeto;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complimeto='" + complimeto + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

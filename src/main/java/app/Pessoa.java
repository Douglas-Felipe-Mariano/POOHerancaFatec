package app;
import java.time.LocalDate;

public abstract class Pessoa{
    private String nome;
    private String endereco;
    private LocalDate dataCricao;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

            public LocalDate getDataCriacao(){
        return this.dataCricao;
    }

    public void setDataCiracao( LocalDate dataCiacao){
        this.dataCricao = dataCiacao;
    }

    public abstract String exibirInformacoes(); 
}
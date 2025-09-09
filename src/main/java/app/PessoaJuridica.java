package app;
import java.time.LocalDate;

public class PessoaJuridica extends Pessoa{
    private String nomeFantasia;
    private String cnpj;

    public String getNomeFantasia(){
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public String exibirInformacoes(){
            return "\nNome: " + this.getNome() + 
                   "\nNome Fantasia: " + this.getNomeFantasia() + 
                   "\nCNPJ: " + this.getCnpj() +
                   "\nData da Criação: " + this.getDataCriacao();
    }


    public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
        this.setDataCiracao(LocalDate.now());
    }

}
package app;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PessoaFisica extends Pessoa{
    private LocalDate dataNascimento;
    private String cpf;


    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String exibirInformacoes(){
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return "\nNome: " + this.getNome() + 
                   "\nCPF: " + this.getCpf() +
                   "\nData da Criação: " + this.getDataCriacao() +
                   "\nData de Nascimento: " + this.getDataNascimento().format(formatador);
    }

    public PessoaFisica(String nome, String endereco, LocalDate dataNascimento, String cpf){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
        this.setDataCiracao(LocalDate.now());
    }

}
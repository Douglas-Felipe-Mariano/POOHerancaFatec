package app;

public class Compromisso extends Atividade{
    private String dataInicial;
    private String dataFinal;

    public String getDataInicial(){
        return this.dataInicial;
    }

    public String getDataFinal(){
        return this.dataFinal;
    }

    public void setDataInicial(String dataInicial){
        this.dataInicial = dataInicial;
    }

    public void setDataFinal(String dataFinal){
        this.dataFinal = dataFinal;
    }

    public Compromisso(long id,
                       String descricao,
                       String dataInicial,
                       String dataFinal) {

        setId(id);
        setDescricao(descricao);
        setDataInicial(dataInicial);
        setDataFinal(dataFinal);
    }

    @Override
    public String toString(){
        return ("\n ID: " + getId() +
                "\n Descricao: " + getDescricao() +
                "\n Data Inicial: " + this.dataInicial +
                "\n Data Final: " + this.dataFinal);
    }
}
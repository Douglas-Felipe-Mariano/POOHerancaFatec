package app;

public class Atividade{
    private long id;
    private String descricao;

    public long getId(){
        return this.id;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }   

}
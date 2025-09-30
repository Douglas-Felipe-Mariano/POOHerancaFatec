package application;

public abstract class Animal{
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public abstract String comunicar();

    public Animal (String nome){
        this.setNome(nome);
    }

    @Override
    public String toString(){
        return this.getNome() + " : " + this.comunicar();
    }
}
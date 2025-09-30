package application;

public class Gato extends Animal{

    @Override
    public String comunicar(){
        return "Miau";
    }

    public Gato (String nome){
        super(nome);
    }

    @Override
    public String getNome(){
        return "[Gato]" + this.nome;
    }

    public String comunicar(String prefixo){
        return prefixo + " : " + this.comunicar();
    }

}
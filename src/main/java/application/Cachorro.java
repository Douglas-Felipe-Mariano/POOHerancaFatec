package application;

public class Cachorro extends Animal{

    @Override
    public String comunicar(){
        return "Au, Au";
    }

    public Cachorro (String nome){
        super(nome);
    }
    
}
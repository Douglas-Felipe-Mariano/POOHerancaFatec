package application;

public class Main{
    public static void main(String[] args) {

        Gato gato = new Gato("Bichano");
        
        Animal[] animais = new Animal[4];
        animais[0] = gato;
        animais[1] = new Cachorro("Toto");
        animais[2] = new Cachorro("Snoopy");
        animais[3] = new Gato("Malhao");
 
        for (Animal a : animais){
            System.out.println(a);
        }
        
        System.out.println(gato.comunicar("Teste"));

    }
}   
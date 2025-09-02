package app;

public class Main{
    public static void main(String[] args) {
        Tarefa[] tarefas = new Tarefa[5];

        tarefas[0] = new Tarefa(0, "Teste", false);
        tarefas[4] = new Tarefa(3, "Novo Teste", false);


        System.out.println(tarefas[0].getDescricao());
        System.out.println(tarefas[4].getDescricao());
    }
}   
package dev.marksduarte.inner_class;

public class InnerClassExample {
    // Variável de instância da classe externa.
    private String greeting = "Hi";

    // Declaração da classe interna.
    protected class InnerClass {
        public int repeat = 3;
        public void enter() {
            for (int i = 0; i < repeat; i++) {
                greet(greeting);
            }
        }
        // No Java 17 é possível declarar métodos e variáveis estáticas em classe internas não-estáticas.
        private static void greet(String message) {
            System.out.println(message);
        }
    } // end Room

    // Método de instância da classe externa.
    public void enterRoom(){
        /*
        Cria a instância da classe interna.
        Como enterRoom é um método de instância da classe Home, não precisa explicitar
        a instância de Home.
         */
        var room = new InnerClass();
        /*
        Caso a classe interna não seja estática, uma instância da classe externa
        é obrigatória para criar uma instância da interna.
         */
        room.enter();
    }

    public static void main(String[] args) {
        // Cria a instância da classe externa.
        var home = new InnerClassExample();
        home.enterRoom();
    }
}

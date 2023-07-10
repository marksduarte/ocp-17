package dev.marksduarte.inner_class;

public class StaticInnerClassExample {
    // A classe interna estática, pode ser public, private ou protected.
    static class StaticInnerClass {
        private int price = 6;
    }

    public static void main(String[] args) {
        var sic = new StaticInnerClass();
        /*
        A classe externa pode acessar os campos e métodos privados da
        classe estática interna.
         */
        System.out.println(sic.price);
    }
}

package dev.marksduarte.inner_class;

public class AnonymousClassExample {
    abstract static class AbstractClass {
        abstract int discount();
    }

    public int amount(int basePrice){
        /*
        Classes anonimas devem herdar de uma classe ou implementar alguma interface.
         */
        var abstractClass = new AbstractClass() {
            @Override
            int discount() {
                return 10;
            }
        };
        return basePrice - abstractClass.discount();
    }

    public static void main(String[] args) {
        var ace = new AnonymousClassExample();
        System.out.println(ace.amount(100));
    }
}

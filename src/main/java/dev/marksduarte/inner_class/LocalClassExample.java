package dev.marksduarte.inner_class;

public class LocalClassExample {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        class Calculator {
            /*
          A classe local só existe no escopo do método, construtor ou inicializador.
          - Não pode ter modificador de acesso;
          - Pode ser declarada como final ou abstract;
          - Tem acesso a todos os campos e métodos da classe externa, caso declarada num método de instância);
          - Só pode acessar variáveis locais final ou efetivamente final, pois o compilador gera arquivos .class separados e
          passa uma cópia do valor ou da referência da variável para o construtor da classe local.
       */
            public void multiply() {
                System.out.print(length * width);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }

    public static void main(String[] args) {
        var printer = new LocalClassExample();
        printer.calculate();
    }
}

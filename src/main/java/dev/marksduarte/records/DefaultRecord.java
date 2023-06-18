package dev.marksduarte.records;

import dev.marksduarte.sealed_class.NonSealedInterface;

// O modificar 'final' é implícito.
// Assim como os enums, não é possível herdar um Record.
// Mas é possível implementar interfaces, sealed ou não.
public final record DefaultRecord(int id, String name) implements NonSealedInterface {
    // É possível declarar construtores, métodos e constantes, mas não suporta inicializadores de instância.
    private static final int type = 1;
    // O compilador insere: construtor, métodos de acesso, equals, hashcode e toString.
    // Como o Record é imutável, deve-se criar outro objeto caso queira alterar os valores.

    // Para evitar o boilerplate com Records que tenham muitos parâmetros, existe o construtor compacto:
    // Não precisa de parenteses.
    public DefaultRecord {
        if (id < 0)
            throw new IllegalArgumentException();
        // Refere-se aos parâmetros de entrada, não membros de instância. Não pode utilizar o 'this'.
        name = name.toUpperCase();
    } // O construtor longo é invocado ao final do compacto.
    // Resumindo: O construtor compacto serve para validar os valores dos parâmetros antes de chamar o construtor definitivo.

    // É possível fazer sobrecarga de construtores
    public DefaultRecord(String name, String lastName) {
        // Faz a chamada para o construtor longo padrão.
        this(0, name + lastName);
    }

    // É possível fazer sobrecarga de métodos.
    @Override public int id() {
        return id + 1;
    }
}

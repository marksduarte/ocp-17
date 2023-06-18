package dev.marksduarte.sealed_class;

public sealed class SealedClass permits FinalClass, NonSealedClass, SealedClassB {
    // Classes seladas devem definir quais classes podem herdá-la.
    // A classe sealed e as classes que devem implementa-lá, devem estar
    // no mesmo pacote.

    // As classes que herdarem devem ter alguns desse modificadores: final, sealed ou non-sealed.
}

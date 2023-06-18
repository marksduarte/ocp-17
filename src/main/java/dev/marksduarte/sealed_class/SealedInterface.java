package dev.marksduarte.sealed_class;

public sealed interface SealedInterface permits FinalClass, NonSealedInterface {
    // Uma sealed interface, pode permitir classes ou interfaces.
    // As interfaces só podem ser: sealed ou non-sealed.
}

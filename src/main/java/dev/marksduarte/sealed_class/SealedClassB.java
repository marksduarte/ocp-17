package dev.marksduarte.sealed_class;

public sealed class SealedClassB extends SealedClass permits AnotherClass {
        /*
    As classes que herdam uma classe selada, devem ser final, sealed ou non-sealed.
    Classes non-sealed podem ser herdadas por outras classes.
     */
}

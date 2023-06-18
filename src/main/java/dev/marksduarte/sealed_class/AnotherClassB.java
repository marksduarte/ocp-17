package dev.marksduarte.sealed_class;

public class AnotherClassB extends NonSealedChildA {
    // Essa classe não precisa ser final, sealed ou non-sealed, porquê herda de
    // uma classe non-sealed, que abriu a limitação de herança.
}

package dev.marksduarte.sealed_class;


public class SealedClassWithoutPermitsClause {}
// Quando a classe filha estiver declarada no mesmo arquivo, não é necessário
// adicionar a palavra-chave 'permits'.
// Caso a classe filha esteja declarada dentro do escopo da classe mãe,
// o 'permits' deve ser: permits SealedClassWithoutPermitsClause.SealedInnerClass
final class SealedInnerClass extends SealedClassWithoutPermitsClause {}

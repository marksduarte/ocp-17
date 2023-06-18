package dev.marksduarte.records;

public class RecordTest {
    public static void main(String[] args) {
        var dr = new DefaultRecord(1, "Default");
        // os métodos de acesso não contém o prefixo get ou is.
        System.out.println(dr.id()); // 1
        System.out.println(dr.name()); // Default
        System.out.println(dr); // DefaultRecord[id=1, name=Default]
    }
}

package pl.sa.orange2.lambda;

// to jest interfejs funkcyjny poniewaz ma jedna abstrakcyjna metode
@FunctionalInterface

public interface BoysDontCry {

    void silnoreki();

    default void cry() {
    }

    ;
}

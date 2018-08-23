package ooj18.sprint1.övningar.övning9;


public enum RomerskaSiffror {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
    public final Integer  digit;
        RomerskaSiffror (Integer digit)  {
            this.digit = digit;
        }
}

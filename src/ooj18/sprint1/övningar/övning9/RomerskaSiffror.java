package ooj18.sprint1.övningar.övning9;


public enum RomerskaSiffror {
    I(1, "ett"), V(5, "egdf"), X(10, "gfd"), L(50, "jgh"), C(100, "gdfg"), D(500, "tre"), M(1000, "jg");
    public final Integer  digit;
    public final String  aString;
        RomerskaSiffror (Integer digit, String s)  {
            this.digit = digit;
            this.aString = s;
        }
}

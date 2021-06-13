public class Encoder {

    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int r1;
    private int r2;
    private int r3;

    public Encoder(int m1, int m2, int m3, int m4) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }

    public void encode() {
        this.r1 = m1 ^ m2 ^ m3;
        this.r2 = m1 ^ m2 ^ m4;
        this.r3 = m2 ^ m3 ^ m4;
    }

    public void print() {
        System.out.printf("%d%d%d%d%d%d%d", m1, m2, m3, m4, r1, r2, r3);
    }
}

public class Decoder {

    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int r1;
    private int r2;
    private int r3;
    private boolean r1Check = false;
    private boolean r2Check = false;
    private boolean r3Check = false;

    public Decoder(int m1, int m2, int m3, int m4, int r1, int r2, int r3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    private void checkBits(){
       if(r1 == (m1^m2^m3)){
           this.r1Check = true;
       }
       if(r2 == (m1^m2^m4)){
           this.r2Check = true;
       }
       if(r3 == (m2^m3^m4)){
           this.r3Check = true;
       }
    }

    public void decode(){
        checkBits();
        if(r1Check && r2Check && r3Check){
            System.out.println("No Error");
            return;
        } else if(!r1Check && !r2Check && r3Check){
            if(m1 == 0){
                this.m1 = 1;
            } else {
                this.m1 = 0;
            }
        } else if(!r1Check && !r2Check && !r3Check){
            if(m2 == 0){
                this.m2 = 1;
            } else {
                this.m2 = 0;
            }
        }else if(!r1Check && r2Check && !r3Check){
            if(m3 == 0){
                this.m3 = 1;
            } else {
                this.m3 = 0;
            }
        } else if(r1Check && !r2Check && !r3Check){
            if(m4 == 0){
                this.m4 = 1;
            } else {
                this.m4 = 0;
            }
        }else if(!r1Check && r2Check && r3Check){
            if(r1 == 0){
                this.r1 = 1;
            } else {
                this.r1 = 0;
            }
        }else if(r1Check && !r2Check && r3Check){
            if(r2 == 0){
                this.r2 = 1;
            } else {
                this.r2 = 0;
            }
        }else if(r1Check && r2Check && !r3Check){
            if(r3 == 0){
                this.r3 = 1;
            } else {
                this.r3 = 0;
            }

        }
    }

    public void print(){
        System.out.printf("%d%d%d%d%d%d%d",m1 , m2 , m3 , m4 , r1 , r2 , r3);
    }


}

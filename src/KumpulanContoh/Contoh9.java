package KumpulanContoh;
public class Contoh9 {
    public static void main(String[] args) {
        int ut = 2, a = 15, bt = 3, b = 2, gt = 0;
        while(a<=16){
            int br = ut;
            while(br>=1){
                int t = 0, bt1 = bt, ck = a;
                do{
                    System.out.print(" "+ck+" ");
                    t = t + ck; ck = ck + 2; bt1 = bt1 - 1;
                }
                while(bt1>=1);
                int bt2 = bt;
                do{
                    System.out.print(" "+b+" ");
                    t = t + b; bt2 = bt2 - 1;
                }
                while(bt2>=1);
                System.out.print(" = "+t);
                gt = gt + t;
                System.out.println(" ");
                b = b + 1; br = br -1;
            }
            System.out.println("=========================== +");
            System.out.println("    TOTAL KESELURUHAN = "+gt);
            a = a + 1;
            ut = ut + 1;
        }
        System.out.println(" ");
        System.out.println("Naufal Daffa Shidiq 23.240.0102");
    }
}
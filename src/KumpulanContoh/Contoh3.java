package KumpulanContoh;

public class Contoh3 {
    
    public static void main(String[] args) {
        int bantu = 1, a = 15, b = 3, ut = 3;
        while(bantu<=2)
        {
            int t = 0, e = 0;
            while(ut>=1)
            {
                e = a * 3 + b;
                int r = 1;
                while(r<=3)
                {
                System.out.print(a+"\t + ");
                r = r + 1;
                }
                System.out.print(b);
                System.out.print("\t = "+e);
                System.out.println("");
                a = a + 1;
                b = b + 1;
                t = t + e;
                ut = ut - 1;
            }
            b = 4;
            ut = 4;
            System.out.println("------------------------------------- +");
            System.out.println("\t                 total = "+t);
            bantu = bantu + 1;
        }
    }
}

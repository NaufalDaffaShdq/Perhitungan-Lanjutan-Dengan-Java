package KumpulanContoh;

public class Contoh2 {
    
    public static void main(String[] args) {
//      Variabel utama
        int a = 14; int b = 2; 
        while(b<=4)
        {
//          Variabel riset
            int c, d = 5, e = 4, f, t = 0;
            while(d<=7)
            {
                c = a + b;
                f = c * d - e;
                System.out.println(a+"\t + "+b+"\t = "+c+"\t * "+d+"\t - "+e+"\t = "+f);
                t = t + f;
                e = e - 1;
                d = d + 1;
                a = a + 1;
            }
            System.out.println("--------------------------------------------- +");
            System.out.println("\t                         total = "+t);
            b = b +2;
        }
    }
}

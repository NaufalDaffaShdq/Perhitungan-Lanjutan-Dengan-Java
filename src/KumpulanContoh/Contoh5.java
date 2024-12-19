package KumpulanContoh;

public class Contoh5 {
    
    public static void main(String[] args) {
//      Variabel utama
        int ut = 2, bantu = 3;
        while(ut<=4)
        {
//          Variabel riset
            int a = 1, c, t = 0;
            while(a<=bantu)
            {
                c = a + ut;
                t = t + c;
                System.out.println(a+"\t + "+ut+"\t = "+c);
                a = a + 1;
            }
            System.out.println("--------------------- +");
            System.out.println("\t  total = "+t);
            ut = ut + 2;
            bantu = bantu + 1;
        }
    }
}

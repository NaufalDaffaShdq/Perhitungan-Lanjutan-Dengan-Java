package KumpulanContoh;

public class Contoh1 {
    
    public static void main(String[] args) {
//      Variabel utama
        int ut = 2; int ck=15;
        while(ut<=4)
        {
//          Variabel riset
            int br = 1; int t = 0;
            while(br<=4)
            {
                System.out.println(" "+ck);
                t = t + ck;
                ck = ck + 5;
                br = br + 1;
            }
            System.out.println("---------------- +");
            System.out.println("total = "+t);
            ut = ut + 2;
        }
    }
}

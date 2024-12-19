package KumpulanContoh;
public class Contoh8 { //    Tugas Lab 1 Pertemuan 4
    public static void main(String[] args) {
        int ut = 1; int a = 20; int sp = 11; int b = 9; int gt = 0; //var harga awal
        while(ut<=4) //perulangan
        {
            int ck = ut; //riset
            int sp1 = sp;
            int t = 0;
            while(sp1>=1) //cetak spasi
            {
                System.out.print(" ");
                sp1 = sp1 - 1;
            }
            while (ck>=1)
            {
            System.out.print(a+" ");
            t = a + t;
            a = a - 1;
            ck = ck - 1;
            }
            t = t + b;
            System.out.println("+ "+b+" = "+t);
            b = b - 1;
            gt = gt + t;
            sp = sp - 3;
            ut = ut + 1; //rumus perulangan
        }
        System.out.println("===========================+");
        System.out.println("total keseluruhan = "+gt);
    }
}
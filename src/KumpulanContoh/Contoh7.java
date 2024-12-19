package KumpulanContoh;

public class Contoh7 {
//    Tugas Kelas Pertemuan 4
    public static void main(String[] args) {
        int ut = 1; int ck = 15; int sp = 16; int gt = 0;//var harga awal
        while (ut <= 5) //perulangan
        {
            int br = ut; int t = 0; //riset
            while (br>=1)
            {
                System.out.print(ck+" ");
                t = t + ck;
                ck = ck + 1;
                br = br - 1;
            }
            int sp1 = sp; //riset
            while(sp1>=1) //cetak spasi
            {
                System.out.print(" ");
                sp1 = sp1 - 1;
            }
            System.out.println("\t="+t);
            gt = gt + t;
            sp = sp - 3;
            ut = ut + 1; //rumus perulangan
        }
        System.out.println("=============================+");
        System.out.println("     total keseluruhan ="+gt);
    }
}
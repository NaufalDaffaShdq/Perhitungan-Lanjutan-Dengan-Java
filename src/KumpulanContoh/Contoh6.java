package KumpulanContoh;

public class Contoh6 {
    public static void main(String[] args) {
        int bantu = 4,ut = 1, a = 7,c = 2;
        while(ut<=3)
        {
            int jumlah, total = 0,b = 5;
            do
            {
                jumlah = a + b - c;
                total = total + jumlah;
                System.out.println(a+"\t + "+b+"\t - "+c+"\t = "+jumlah);
                b = b - 1;
                a = a + 1;
                c = c + 1;
            }
            while(b>=bantu);
            System.out.println("----------------------------- +");
            System.out.println("\t           Total ="+total);
            System.out.println(" ");
            bantu = bantu - 1;
            ut = ut + 1;
        }
    }    
}

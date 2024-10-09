import java.util.Scanner;

public class KafeDoWhile07 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, kopi, teh, roti, totalHarga;
    String namaPelanggan;

    do { 
        System.out.print("Masukkan nama pelanggan (ketik 'batal jika ingin keluar'): ");
        namaPelanggan = sc.nextLine();
        if(namaPelanggan.equalsIgnoreCase("batal")){
            System.out.println("Transaksi dibatalkan");
            break;
        }
        System.out.print("Jumlah kopi: ");
        kopi = sc.nextInt();
        System.out.print("Jumlah Teh: ");
        teh = sc.nextInt();
        System.out.print("Jumlah Roti: ");
        roti = sc.nextInt();

        totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total yang harus dibayar: " + totalHarga);
        sc.nextLine();
    } while (true);

    System.out.println("Semua trasaksi selesai");
}    
}

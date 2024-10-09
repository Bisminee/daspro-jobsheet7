import java.util.Scanner;

public class Tugas1Jobsheet7 {
    public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);

        int tiket,totalTiket = 0, pelanggan, hargaTiket = 50000, totalPenjualan = 0;
        double totalBayar = 0;

        while(true){
            System.out.print("Masukkan jumlah tiket yang anda beli (Ketik 0 untuk selesai): ");
            tiket = sc07.nextInt();

            if (tiket < 0) {
                System.out.println("Input Tidak Valid, silahkan input lagi!");
                continue;
            }else if (tiket == 0){
                System.out.println("Penghitungan selesai");
                break;
            } else if(tiket > 10){
                totalBayar = tiket * hargaTiket - (tiket * hargaTiket * 0.15);
            }else if(tiket > 4){
                totalBayar = tiket * hargaTiket - (tiket * hargaTiket * 0.1);
            }else{
                totalBayar = tiket * hargaTiket;
            }

            totalTiket += tiket;
            totalPenjualan += totalBayar;

            System.out.println("Anda membeli " + tiket + " tiket" + "\nTotal pembayaran anda adalah Rp" + totalBayar);
        }

        System.out.println("Total tiket yang terjual hari ini berjumlah: " + totalTiket);
        System.out.println("Total pembelian tiket hari ini sebesar Rp" + totalPenjualan);
    }
}

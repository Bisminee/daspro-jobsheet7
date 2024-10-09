import java.util.Scanner;

public class SiakadFor07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nilai, tertinggi = 0, terendah = 100;
    int lulus=0, tidakLulus=0;

        for(int i = 1; i <= 10; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if(nilai >= 60){
                lulus++;
            }else{
                tidakLulus++;
            }
            if(nilai > tertinggi){
                tertinggi = nilai;
            }
            if(nilai < terendah){
                terendah = nilai;
            }
        }
    System.out.println("Nilai Tertingi: " + tertinggi);
    System.out.println("Nilai Terendah: "+ terendah);

    System.out.println("Siswa Lulus Berjumlah: " + lulus);
    System.out.println("Siswa Tidak Lulus Berjumlah: " + tidakLulus);
    }
    
}
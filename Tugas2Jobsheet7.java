import java.util.Scanner;
public class Tugas2Jobsheet7 {
    public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);
        int jenis, durasi, total = 0;

        while(true){
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc07.nextInt();

            if(jenis == 0){
                System.out.println("Program berhenti");
                break;
            }

            if(jenis == 1 || jenis == 2){
                System.out.print("Berapa lama anda parkir? ");
                durasi = sc07.nextInt();
                if(durasi > 5){
                    total += 12500;
                }else if(jenis == 1){
                    total += durasi * 3000;
                }else if(jenis == 2){
                    total += durasi * 2000;
                }else{
                    System.out.println("Hanya masukkan pilihan yang tersedia!!!");
                }
            }
        }
        System.out.println("Total pemnayaran parkir adalah: " + total);
    }
}

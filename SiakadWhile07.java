import java.util.Scanner;

public class SiakadWhile07 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int jml, i = 0;
    double nilai;

    System.out.print("Masukkan Jumlah Mashasiswa: ");
    jml = sc.nextInt();
    while(i < jml){
        System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + ": ");
        nilai = sc.nextDouble();

        if(nilai < 0 || nilai > 100){
            System.out.println("NILAI TIDAK VALID. MASUKKAN NILAI LAGI, NILAI YANG VALID!!!");
            continue;
        }

        if (nilai > 80 && nilai <= 100){
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah A");
            System.out.println("Bagus, pertahankan nilainya");
        }else if(nilai > 73 && nilai <= 80 ){
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah B+");
        }else if(nilai > 65 && nilai <= 73){
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah B");
        }else if(nilai > 60 && nilai <= 65){
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah C+");
        }else if (nilai > 50 && nilai <= 60){
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah C");
        }else if (nilai > 39 && nilai <= 50){
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah D");
        }else{
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah E");
        } 
        i++;
    }
}    
}

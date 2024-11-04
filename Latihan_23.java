import java.util.Scanner;

public class Latihan_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nama petugas
        System.out.print("Masukkan nama petugas: ");
        String namaPetugas = input.nextLine();

        // Input jumlah mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Deklarasi array untuk menyimpan nilai mahasiswa
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        // Input nilai mahasiswa dan mencari nilai terbesar dan terkecil
        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();

            // Menentukan nilai terbesar dan terkecil
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        // Output hasil
        System.out.println("\n===== Hasil Nilai Mahasiswa =====");
        System.out.println("Nama Petugas: " + namaPetugas);
        System.out.println("Nilai Terbesar: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil: " + nilaiTerkecil);
    }
}

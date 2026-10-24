import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualanHarian = 0;
        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        while (true) {
            System.out.println("\nMasukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            int jumlahTiket = sc.nextInt();
            if (jumlahTiket == 0 ) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid (tidak boleh negatif). silahkan masukkan kembali! ");
                continue;
            }
            double totalHarga = jumlahTiket *HARGA_TIKET;
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4){
                diskon = 0.10;
            }
            double totalBayar = totalHarga - (totalHarga * diskon);
            totalTiketTerjual += jumlahTiket;
            totalPenjualanHarian += totalBayar;
            System.out.println("Rincian Transaksi: ");
            System.out.println("- Diskon        : " + (int)(diskon * 100) + "%");
            System.out.printf("- Total Bayar    : Rp %,.0f\n", totalBayar);
        }
        System.out.println("\n=====================================");
        System.out.println("    LAPORAN PENJUALAN HARIAN    ");
        System.out.println("=======================================");
        System.out.println("Total Tiket Terjual : " + totalTiketTerjual + " tiket");
        System.out.printf("Total Pendapatan    : Rp %,.0f\n" , totalPenjualanHarian);
        System.out.println("========================================");

        sc.close();
    }
}

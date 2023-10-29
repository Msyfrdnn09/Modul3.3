public class Main {
    public static void main(String[] args) {

        /**
         * @param kecepatanAwal menunjukan angka awal
         * @param kecepatanAkhir menunjukan angka akhir
         * @param waktu menunjuksn angka waktu
         * @param perubahanKecepatan menghitung perubahan kecepatan
         * @param percepatan menghitung percepatan
         */
        // Kecepatan awal dalam m/s
        double kecepatanAwal = 10.0;

        // Kecepatan akhir dalam m/s
        double kecepatanAkhir = 30.0;

        // Waktu dalam detik
        double waktu = 5.0;

        // Menghitung percepatan
        double perubahanKecepatan = kecepatanAkhir - kecepatanAwal;
        double percepatan = perubahanKecepatan / waktu;



        // Menampilkan hasil
        System.out.println("Percepatan adalah: " + percepatan + " m/s^2");
    }
}

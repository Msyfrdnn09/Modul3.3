public class Main {
    public static void main(String[] args) {
        /**
         * @param kecepatanAwal menunjukan angka awal
         * @param kecepatanAkhir menunjukan angka akhir
         * @param waktu menunjuksn angka waktu
         * @param perubahanKecepatan menghitung perubahan kecepatan
         * @param percepatan menghitung percepatan
         */
        double kecepatanAwal = 10.0;
        double kecepatanAkhir = 30.0;
        double waktu = 5.0;
        double perubahanKecepatan = kecepatanAkhir - kecepatanAwal;
        double percepatan = perubahanKecepatan / waktu;
        System.out.println("Percepatan adalah: " + percepatan + " m/s^2");
    }
}

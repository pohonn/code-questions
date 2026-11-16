public class Sqrt {

    public static void main(String[] args) {

        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;
        int ans = 0; // Penampung jawaban sementara

        while (left <= right) {
            int mid = left + (right - left) / 2; // Cari titik tengah

            // Cek apakah mid * mid <= x (dibalik jadi pembagian untuk cegah overflow)
            if (mid <= x / mid) {
                ans = mid; // Simpan mid sebagai kandidat jawaban
                left = mid + 1; // Coba cari apakah ada angka yang lebih besar di sebelah kanan
            } else {
                right = mid - 1; // Kalau terlalu besar, geser pencarian ke sebelah kiri
            }
        }

        return ans;
    }
}

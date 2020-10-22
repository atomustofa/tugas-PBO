public class Categories {

    public String Jenis;
    public String ukuran;
    public String jumlah;

    public Categories(String Jenis, String Ukuran, String jumlah) {
        this.Jenis = Jenis;
        this.Ukuran = Ukuran;
        this.Merk = jumlah;

    }
    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "Jenis='" + Jenis + '\'' +
                ",Ukuran='" + Ukuran + '\'' +
                ",jumlah='" + jumlah + '\'' +
                '}';
    }
    public static void main(String[] args) {

    }
}

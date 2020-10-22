public class Product {

    public String tas;
    public String merek;
    public String Harga;

    public Product(String tas, String merek, String Harga) {
        this.tas = tas;
        this.merek = merek;
        this.Harga = Harga;

    }
    public String getTas() {
        return tas;
    }

    public void tas(String tas) {
        this.tas = tas;
    }

    public String getmerek() {
        return merek;
    }

    public void setmerek(String merek) {
        this.merek = merek;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }

    @Override
    public String toString() {
        return "Product{" +
                "tas='" + tas + '\'' +
                ",merek='" + merek + '\'' +
                ",Harga='" + Harga + '\'' +
                '}';
    }

    public static void main(String[] args) {
	// write your code here
    }
}

public class ShallowCopy {
    public static void main(String args[]) {
        ShallowCopy main = new ShallowCopy();
        main.whenShallowCopying_thenObjectsShouldNotBeSame();
    }

    public void whenShallowCopying_thenObjectsShouldNotBeSame() {
        Product product = new Product("tas ransel, tas duffel", "addidas, sufrime", "100k-300k/1 pcs");
        Categories tas = new Categories("tas gendong, tas jinjing", "36-38-40-41-42", "100-200");
        Categories Saya = new Categories(tas.getJenis(),tas.getUkuran(),tas.gerharga());

        System.out.println(Saya);
        System.out.println(tas);
    }
}

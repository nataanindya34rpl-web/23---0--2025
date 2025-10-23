public class SoalArry3 {
    public static void main(String[] args ) {
        String[] namahewan = {
            "kucing", "ayam", "anjing", "ikan", "tikus", "kelinci"
        };
        System.out.println("Semua nama hewan:");
        for (int i = 0; i < namahewan.length; i++) {
            System.out.println((i + 1) + ". " + namahewan[i]);
        }
        System.out.println("Hewan dengan panjang nama > 4 karakter:");
        int count = 0;
        for (int i = 0; i < namahewan.length; i++) {
            if (namahewan[i].length() > 4) {
                count++;
                System.out.println(count + ". " + namahewan[i]);
            }
        }
        if (count == 0) {
            System.out.println("(Tidak ada nama hewan dengan panjang lebih dari 4 karakter)");
        }
    }
}

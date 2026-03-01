
    public class BannerUC4 {

    public static void main(String[] args) {

        // Creating banner lines using String.join()
        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "W", "E", "L", "C", "O", "M", "E", " ", "*"),
                String.join("", "*", " ", "T", "O", " ", "U", "C", "4", " ", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Printing banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
    


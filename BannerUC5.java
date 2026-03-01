public class BannerUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization in single statement using String.join()
        String[] banner = {
                String.join("", "*","*","*","*","*","*","*","*","*","*","*","*"),
                String.join("", "*"," "," ","W","E","L","C","O","M","E"," "," ","*"),
                String.join("", "*"," "," ","T","O"," "," ","U","C","5"," "," ","*"),
                String.join("", "*"," "," ","B","A","N","N","E","R"," "," "," ","*"),
                String.join("", "*"," "," ","D","E","S","I","G","N"," "," "," ","*"),
                String.join("", "*"," "," "," "," "," "," "," "," "," "," "," ","*"),
                String.join("", "*","*","*","*","*","*","*","*","*","*","*","*")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
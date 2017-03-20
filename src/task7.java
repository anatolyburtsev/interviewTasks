import java.io.*;

/**
 * Что выведется в консоль?
 */
public class task7 {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("foo.in"));
            reader = new InputStreamReader(System.in);
            System.out.println("print1");
        } catch (Exception ex) {
            System.out.println("print2");
        } finally {
            System.out.println("print3");
            br.close();
            reader.close();
        }
    }
}

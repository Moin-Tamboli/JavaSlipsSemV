
import java.io.*;

class copy1filetoAnother {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");

        int ch;

        while ((ch = fr.read()) != -1) {
            fw.write(Character.toUpperCase((char) ch));
        }

        fr.close();
        fw.close();

        System.out.println("File copied in uppercase successfully.");
    }
}
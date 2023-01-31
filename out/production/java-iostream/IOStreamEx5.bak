import java.io.*;

public class IOStreamEx5 {
    public static void main(String[] args) {
        try {
            FileReader fis = new FileReader(".\\src\\IOStreamEx5.java");
            FileWriter fos = new FileWriter(".\\src\\IOStreamEx5.bak");

            int data = 0;
            while((data=fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();

        } catch (IOException e) {}
    }
}

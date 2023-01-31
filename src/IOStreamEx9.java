import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOStreamEx9 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("./src/IOStreamEx9.java");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for(int i=1; (line = br.readLine())!=null; i++) {
                if(line.contains(";")) {
                    System.out.println(i+" : "+line);
                }
            }
            br.close();
        } catch (IOException e) {}
    }
}

import java.io.FileInputStream;
import java.io.IOException;

class IOStreamEx4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(".\\src\\IOStreamEx4.java");

        int data = 0;

        while((data=fis.read())!=-1) {
            char c = (char)data;
            System.out.print(c);
        }
    }
}

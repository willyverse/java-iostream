import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOStreamEx3 {

    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        System.out.println("Input Source : " + Arrays.toString(inSrc));

        try {
            while(input.available() > 0) {
                int len = input.read(temp);     // read()는 읽어 온 byte 수를 정수로 반환함
                output.write(temp, 0 ,len); // temp[0]으로부터 len만큼 output에 넣음

                outSrc = output.toByteArray();
                printArrays(temp, outSrc);
            }
        } catch (IOException e) { }

    }

    static void printArrays(byte[] temp, byte[] outSrc) {
        System.out.println("temp Source : " + Arrays.toString(temp));
        System.out.println("Output Source : " + Arrays.toString(outSrc));
    }
}

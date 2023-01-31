import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamEx6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("123.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
            for(int i='1'; i<='9'; i++) {
                bos.write(i);
            }

            bos.close();
            // fos.close()는 flush()를 동반하지 않기 때문에 5칸이 채워지지 못한 buffer는
            // 마지막 사이클에 갖고 있는 원소를 모두 누락한 채 프로세스가 종료된다
            // bos.close()는 fos를 상속 받아 flush()까지 호출하기 때문에 전체 원소를 파일에 담고 종료된다
            // 즉, bos.close()를 쓰자
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

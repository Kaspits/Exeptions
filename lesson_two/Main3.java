import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Main3 {
    public static void main(String[] args) {
        ex4();
    }

    public static void ex4() {
        InputStream inputStream;
        try {
            String[] strings = { "asdf", "asdf" };
            String string1 = strings[1];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("asdasdas");
        } catch (StackOverflowError error) {
            System.out.println("sadsdadd");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("РЇ РІСЃРµ СЂР°РІРЅРѕ РІС‹РїРѕР»РЅРёР»СЃСЏ!");
        }
        System.out.println("РЇ Р¶РёРІ!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        readAndWrite();
    }

    private static void readAndWrite() {
        try {
            Map<String, String> map = readFile("test.txt");
            changeText(map);
            saveToFile("test1.txt", map);
        } catch (FileNotFoundException e) {
            System.out.println("РџСЂРѕС‡РёС‚Р°С‚СЊ С„Р°Р№Р» РЅРµ СѓРґР°Р»РѕСЃСЊ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Р—Р°РїРёСЃР°С‚СЊ РІ С„Р°Р№Р» РЅРµ СѓРґР°Р»РѕСЃСЊ");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void saveToFile(String file, Map<String, String> map) throws IOException {
        FileWriter writer = new FileWriter(file);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            writer.write(entry.toString());
            writer.write("\n");
            writer.flush();
        }
        writer.close();
    }

    private static Map<String, String> readFile(String filePath) throws FileNotFoundException {
        Map<String, String> map = new HashMap<>();
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String[] strings = sc.nextLine().split("=");
            map.put(strings[0], strings[1]);
        }
        return map;
    }

    private static void changeText(Map<String, String> map) throws IllegalArgumentException {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("?")) {
                map.put(entry.getKey(), String.valueOf(entry.getKey().length()));
            } else if (!entry.getValue().matches("[0-9]+")) {
                throw new IllegalArgumentException(
                        "РќРµРїРѕРґС…РѕРґСЏС‰РµРµ Р·РЅР°С‡РµРЅРёРµ РІ СЃС‚СЂРѕРєРµ: " + entry);
            }
        }
    }
}
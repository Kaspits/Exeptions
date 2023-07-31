package lesson_one;

public class Main2 {
    public static void main(String[] args) {
        int[][] array = new int[][] { { 0, 1, 0 }, { 1, 0, 0 }, { 0, 0, 0 } };
        try {
            System.out.println("РЎСѓРјРјР° СЌР»РµРјРµРЅС‚РѕРІ СЂР°РІРЅР°: " + sumArrayItems(array));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("РљРѕРЅРµС† СЂР°Р±РѕС‚С‹ РїСЂРёР»РѕР¶РµРЅРёСЏ");
    }

    private static int sumArrayItems(int[][] array) {
        if (array == null) {
            throw new RuntimeException("РњР°СЃСЃРёРІ РЅРµ РёРЅРёС†РёР°Р»РёР·РёСЂРѕРІР°РЅ");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                throw new RuntimeException("РњР°СЃСЃРёРІ РЅРµ РєРІР°РґСЂР°С‚РЅС‹Р№");
            }
            for (int j = 0; j < array[i].length; j++) {
                int item = array[i][j];
                if (item != 0 && item != 1) {
                    throw new RuntimeException("Р­Р»РµРјРµРЅС‚ СЃ РёРЅРґРµРєСЃРѕРј [" + i + ", " + j + "] " +
                            "СЂР°РІРµРЅ " + item + ". РћР¶РёРґР°РµС‚СЃСЏ Р·РЅР°С‡РµРЅРёРµ 0 РёР»Рё 1");
                }
                sum += item;
            }
        }
        return sum;
    }
    
}

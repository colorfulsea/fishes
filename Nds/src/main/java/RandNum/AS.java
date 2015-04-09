package RandNum;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by taofengbing on 2015/4/9.
 */
public class AS {
    public static String generateNumber2() {
        String no = "";
        int num[] = new int[8];
        int c = 0;
        for (int i = 0; i < 8; i++) {
            num[i] = new Random().nextInt(10);
            c = num[i];
            for (int j = 0; j < i; j++) {
                if (num[j] == c) {
                    i--;
                    break;
                }
            }
        }
        if (num.length > 0) {
            for (int i = 0; i < num.length; i++) {
                no += num[i];
            }
        }
        return no;
    }
    public static void main(String[] args) {


        try {
            File f = new File("E:\\ECSs\\1.txt");
            if (!f.exists()) {
                f.createNewFile();
            }
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            Random random = new Random();
            generateNumber2();
            for (int i = 0; i < 100; i++) {
                String as=""+random.nextInt(1000);
                System.out.println(as);
                pw.append(as+"   ");
            }

            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

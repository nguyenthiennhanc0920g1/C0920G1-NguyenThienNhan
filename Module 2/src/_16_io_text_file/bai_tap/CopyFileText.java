package _16_io_text_file.bai_tap;

import java.io.File;

public class CopyFileText {
    public static void readFile(String filePath) {
        try {
            File file = new File(filePath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

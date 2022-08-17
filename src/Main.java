import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static StringBuilder log;

    public static void main(String[] args) {

        log = new StringBuilder();

        File dir = null;
        File file = null;

        newDir(dir, "D://Games//temp");
        newDir(dir, "D://Games//src");
        newDir(dir, "D://Games//res");
        newDir(dir, "D://Games//savegames");
        newDir(dir, "D://Games//src//main");
        newDir(dir, "D://Games//src//test");
        newDir(dir, "D://Games//res//drawables");
        newDir(dir, "D://Games//res//vectors");
        newDir(dir, "D://Games//res//icons");

        newFile(file, "D://Games//src//main//Main.java");
        newFile(file, "D://Games//src//main//Utils.java");
        newFile(file, "D://Games//temp//temp.txt");

        try (FileWriter writer = new FileWriter("D://Games//temp//temp.txt")) {
            writer.write(String.valueOf(log));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void newDir (File x, String y) {
        x = new File(y);
        if (x.mkdir());
        System.out.println("Каталог " + x.getName() + " создан");
        log.append("Каталог " + x.getName() + " создан" + "\n");
    }

    public static void newFile(File x, String y) {
        x = new File(y);
        try {
            if (x.createNewFile())
                System.out.println("Файл " + x.getName() + " создан");
            log.append("Файл " + x.getName() + " создан" + "\n");
        } catch (IOException ex) {
            System.out.println("ex.getMessage");
        }
    }
}

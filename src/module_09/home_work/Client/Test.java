package module_09.home_work.Client;

import module_09.home_work.Facade.*;
import module_09.home_work.Composite.*;

public class Test{
    public static void main(String[] args) {
        System.out.println("=== Fcd ===");
        HomeTheaterFacade home = new HomeTheaterFacade();
        home.watchMovie();
        home.playGame("FIFA");
        home.listenMusic();
        home.setVolume(20);
        home.offAll();

        System.out.println("\n=== Comp ===");
        File f1 = new File("file1.txt", 100);
        File f2 = new File("file2.txt", 200);

        Directory dir1 = new Directory("Документы");
        dir1.add(f1);
        dir1.add(f2);

        Directory root = new Directory("Root");
        root.add(dir1);

        root.display("");
        System.out.println("Итоговый размер: " + root.getSize());
    }
}
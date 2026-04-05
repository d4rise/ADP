package module_09.home_work.Facade;

public class HomeTheaterFacade {
    private TV tv = new TV();
    private AudioSystem audio = new AudioSystem();
    private DVDPlayer dvd = new DVDPlayer();
    private GameConsole console = new GameConsole();

    public void watchMovie() {
        tv.on();
        audio.on();
        audio.setVolume(10);
        dvd.play();
    }

    public void playGame(String game) {
        tv.on();
        console.on();
        console.playGame(game);
    }

    public void listenMusic() {
        tv.on();
        audio.on();
        audio.setVolume(15);
    }

    public void setVolume(int v) {
        audio.setVolume(v);
    }

    public void offAll() {
        dvd.stop();
        audio.off();
        tv.off();
    }
}
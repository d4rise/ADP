package module_09.home_work.Facade;

public class AudioSystem {
    public void on() { System.out.println("Audio ON"); }
    public void off() { System.out.println("Audio OFF"); }
    public void setVolume(int v) { System.out.println("Volume: " + v); }
}
package module_09.home_work.Composite;

public class File extends FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "File: " + name + " (" + size + ")");
    }

    @Override
    public int getSize() {
        return size;
    }
}
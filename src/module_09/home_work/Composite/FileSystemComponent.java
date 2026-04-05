package module_09.home_work.Composite;

public abstract class FileSystemComponent {
    public void add(FileSystemComponent c) { throw new UnsupportedOperationException(); }
    public void remove(FileSystemComponent c) { throw new UnsupportedOperationException(); }
    public abstract void display(String indent);
    public abstract int getSize();
}
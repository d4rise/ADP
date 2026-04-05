package module_09.home_work.Composite;

import java.util.*;

public class Directory extends FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void add(FileSystemComponent c) {
        if (!children.contains(c)) {
            children.add(c);
        }
    }

    @Override
    public void remove(FileSystemComponent c) {
        children.remove(c);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Dir: " + name);
        for (FileSystemComponent c : children) {
            c.display(indent + "  ");
        }
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemComponent c : children) {
            total += c.getSize();
        }
        return total;
    }
}
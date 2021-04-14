package OOD.inMemoryFile;

public class File extends Entry{
    private String content;

    private int size;

    public File(String n, Directory d, int sz) {
        super(n, d);
        size = sz;
    }

    public int size() {
        return size;
    }

    public String getContent() {
        return content;
    }
}

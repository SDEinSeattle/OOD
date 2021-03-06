package OOD.inMemoryFile;

public abstract class Entry {
    protected Directory parent;

    protected long created;

    protected long lastUpdated;

    protected long lastAccessed;

    protected String name;

    public Entry(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
        created = System.currentTimeMillis();
        lastUpdated = System.currentTimeMillis();
        lastAccessed = System.currentTimeMillis();
    }

    //getter and setter

    public void changeName(String n) {
        this.name = n;
    }

    public boolean delete() {
        if (parent == null) {
            return false;
        }
        return parent.deleteEntry(this);
    }

    public abstract int size();

    public String getFullPath() {
        if (parent == null) {
            return name;
        } else {
            return parent.getFullPath() + "/" + name;
        }
    }
}

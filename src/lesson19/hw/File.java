package lesson19.hw;

import static java.lang.Character.isLetterOrDigit;

public class File {

    private long id;
    private String name;
    private String format;
    private long size;

    public File(long id, String name, String format, long size) {

        if (!testLong(name)) throw new RuntimeException(" incorrect name file ");

        this.id = id;
        this.name = name;
        this.format = format;
        this.size = size;
    }

    /*
    проверка длины имени файла
     */
    private boolean testLong(String name) {

        char[] chArr = name.toCharArray();
        if (chArr.length > 10) return false;

        for (char c : chArr) {
            if (!isLetterOrDigit(c)) return false;
        }
        return true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        if (id != file.id) return false;
//        if (size != file.size) return false;
//        if (!name.equals(file.name)) return false;
//        return format.equals(file.format);
        return name.equals(file.name);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
//        result = 31 * result + format.hashCode();
//        result = 31 * result + (int) (size ^ (size >>> 32));
        return result;
    }
}

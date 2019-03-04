package lesson29;

public class File implements Comparable<File> {
    private String fileName;
    private long sizeInBytes;


    //for lesson 30
    @Override
    public int compareTo(File o) {
        int res = 0;
        if (o.getSizeInBytes() > this.sizeInBytes)
            res = 1;
        else if (o.getSizeInBytes() < this.sizeInBytes)
            res = -1;
        return res;
    }

    public File(String fileName, long sizeInBytes) {
        this.fileName = fileName;
        this.sizeInBytes = sizeInBytes;
    }

    public String getFileName() {
        return fileName;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", sizeInBytes=" + sizeInBytes +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        File file = (File) o;
//
//        if (sizeInBytes != file.sizeInBytes) return false;
//        return fileName.equals(file.fileName);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = fileName.hashCode();
//        result = 31 * result + (int) (sizeInBytes ^ (sizeInBytes >>> 32));
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        return fileName.equals(file.fileName);
    }

    @Override
    public int hashCode() {
        return fileName.hashCode();
    }
}

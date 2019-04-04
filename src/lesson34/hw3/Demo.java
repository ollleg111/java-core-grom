package lesson34.hw3;

public class Demo {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.copyFileContent("/home/owner/Downloads/fileFrom.txt",
                "/home/owner/Downloads/fileTo.txt");
//        solution.copyFileContentApacheIO("/home/owner/Downloads/fileFrom.txt",
//                "/home/owner/Downloads/fileTo.txt");
    }
}

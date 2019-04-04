package lesson34.hw1;

public class Demo {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.transferFileContent("/home/owner/Downloads/fileFrom.txt",
                "/home/owner/Downloads/fileTo.txt");
    }
}

package lesson34.hw2;

import lesson34.Solution;

public class Demo {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.copyFileContent("/home/owner/Downloads/fileFrom.txt",
                "/home/owner/Downloads/fileTo.txt");
    }
}

import java.io.*;
import java.util.Scanner;

public class Users implements Wodefa {
    @Override
    public void kehuguli() {
    }

    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的姓名：");
        String searchText = scanner.nextLine();
        searchAndOutput("wer.txt", searchText);
        scanner.close();
    }

    private void searchAndOutput(String fileName, String searchText) {
        try {
            File file = new File(fileName);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            boolean found = false;
            System.out.println("您的信息为：");
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchText)) {
                    System.out.println(line);
                    found = true;
                }
            }
            reader.close();

            if (!found) {
                System.out.println("没有找到该用户");
            }
        } catch (IOException e) {
            System.out.println("无法读取文件或文件不存在");
            e.printStackTrace();
            System.exit(0);
        }
    }
}


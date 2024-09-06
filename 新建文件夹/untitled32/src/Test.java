import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {
    static List<User> users = new ArrayList<>();
    public static void main(String[] args) {

        String filePath = "wer.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                users.add(new User(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        users.add(new User("1", "1", "1", "1", "1", "1", "1", "1"));

        System.out.println("你的身份是");
        System.out.println("1：客户---2：员工---3：管理员");
        Scanner sc = new Scanner(System.in);
        Use u = new Use();
        int i = sc.nextInt();
        switch (i) {
            case 1:
                u.Use(new Users());
                break;
            case 2:
                u.Use1(new Staff());
                break;
            case 3:
                u.Use2(new administrators());
                break;
            default:
                System.out.println("输入错误,请重新输入");
                break;
        }
    }
        }





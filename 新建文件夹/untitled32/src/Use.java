import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Use {
    static Scanner sc = new Scanner(System.in);
   public static void Use(Wodefa w) {
        try {
            File file = new File("users.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            while (true) {
                System.out.println("------用户登录注册系统------");
                System.out.println("1：登录");
                System.out.println("2：注册");
                int id = sc.nextInt();

// 注册用户
                if (id == 2) {
                    System.out.println("输入用户名");
                    String username = sc.next();
                    System.out.println("输入密码");
                    String password = sc.next();
                    writer.write(username + " " + password);
                    writer.newLine();
                    writer.flush();
                    System.out.println("注册成功");
                } else if (id == 1) {
                    // 读取 txt 文件中的用户信息进行登录验证
                    System.out.println("输入用户名");
                    String username = sc.next();
                    System.out.println("输入密码");
                    String password = sc.next();

                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    boolean loginSuccess = false;
                    while ((line = reader.readLine()) != null) {
                        String[] userData = line.split(" ");
                        if (username.equals(userData[0]) && password.equals(userData[1])) {
                            System.out.println("登陆成功");
                            loginSuccess = true;
                            w.show();
                            break;
                        }
                    }
                    if (!loginSuccess) {
                        System.out.println("登录失败，请重试");
                    }
                    reader.close();
                }
            }
            } catch(IOException e){
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    Wodefa w = new Wodefa() {
            @Override
            public void kehuguli() {

            }

            @Override
            public void show() {

            }
        };
    public static void Use1(Wodefa w) {
        try {
            File file = new File("ufo.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            while (true) {
                System.out.println("------用户登录注册系统------");
                System.out.println("1：登录");
                System.out.println("2：注册");
                int id = sc.nextInt();

// 注册用户
                if (id == 2) {
                    System.out.println("输入用户名");
                    String username = sc.next();
                    System.out.println("输入密码");
                    String password = sc.next();
                    writer.write(username + " " + password);
                    writer.newLine();
                    writer.flush();
                    System.out.println("注册成功");
                } else if (id == 1) {
                    // 读取 txt 文件中的用户信息进行登录验证
                    System.out.println("输入用户名");
                    String username = sc.next();
                    System.out.println("输入密码");
                    String password = sc.next();

                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    boolean loginSuccess = false;
                    while ((line = reader.readLine()) != null) {
                        String[] userData = line.split(" ");
                        if (username.equals(userData[0]) && password.equals(userData[1])) {
                            System.out.println("登陆成功");
                            loginSuccess = true;
                            w.show();
                            break;
                        }
                    }
                    if (!loginSuccess) {
                        System.out.println("登录失败，请重试");
                    }
                    reader.close();
                }
            }
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void Use2(Wodefa w) {
        try {
            File file = new File("fbi.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            while (true) {
                System.out.println("------用户登录注册系统------");
                System.out.println("1：登录");
                System.out.println("2：注册");
                int id = sc.nextInt();

// 注册用户
                if (id == 2) {
                    System.out.println("输入用户名");
                    String username = sc.next();
                    System.out.println("输入密码");
                    String password = sc.next();
                    writer.write(username + " " + password);
                    writer.newLine();
                    writer.flush();
                    System.out.println("注册成功");
                } else if (id == 1) {
                    // 读取 txt 文件中的用户信息进行登录验证
                    System.out.println("输入用户名");
                    String username = sc.next();
                    System.out.println("输入密码");
                    String password = sc.next();

                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    boolean loginSuccess = false;
                    while ((line = reader.readLine()) != null) {
                        String[] userData = line.split(" ");
                        if (username.equals(userData[0]) && password.equals(userData[1])) {
                            System.out.println("登陆成功");
                            loginSuccess = true;
                            w.show();
                            break;
                        }
                    }
                    if (!loginSuccess) {
                        System.out.println("登录失败，请重试");
                    }
                    reader.close();
                }
            }
        } catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    };


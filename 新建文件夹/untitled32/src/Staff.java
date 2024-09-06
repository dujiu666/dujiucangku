import java.io.*;
import java.util.Scanner;

public class Staff implements Wodefa {
    @Override
    public void kehuguli() {
    }

    @Override
    public void show() {
        while (true) {
            System.out.println("1:业绩");
            System.out.println("2:查看客户消费");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            switch (id) {
                case 1:
                    cv();
                    break;
                case 2:
                    System.out.println("客户消费");
                    zc();
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    public void cv()
    {
        Scanner sc = new Scanner(System.in);

        while (true) {
                System.out.println("1.添加业绩");
                System.out.println("2.查询业绩");
                System.out.println("3.退出");
            int z = sc.nextInt();
                switch (z) {
                    case 1:
                        addy();
                        showy();
                        break;
                    case 2:
                        showy();
                        break;
                    case 3:
                        System.out.println("已退出");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("输入有误");

            }
        }
    }
    private void showy() {
        System.out.println("目前有");
        String filePath = "yeji.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void addy() {
        try {
            FileWriter fileWriter = new FileWriter("yeji.txt", true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            Scanner sc = new Scanner(System.in);
            System.out.print("请输入姓名：");
            String name = sc.nextLine();
            System.out.print("请输入购买商品：");
            String item = sc.nextLine();
            System.out.print("请输入时间：");
            String time = sc.nextLine();

            writer.write("姓名：" + name + ", 商品：" + item + ", 时间：" + time);
            writer.newLine();

            writer.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("无法写入文件");
            e.printStackTrace();
        }
    }
    private void zc() {
        System.out.println("目前有");
        String filePath = "yeji.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
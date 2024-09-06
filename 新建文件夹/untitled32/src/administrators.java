import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class administrators implements Wodefa {
    static Scanner sc=new Scanner(System.in);
    @Override
    public void kehuguli() {
    }
    Users users=new Users();
    public void show() {
        while (true){
            System.out.println("1.添加客户");
            System.out.println("2.删除客户");
            System.out.println("3.查询客户信息");
            System.out.println("4.修改客户信息");
            System.out.println("5.统计员工业绩信息");
            System.out.println("6.退出系统");
            int x=sc.nextInt();
            switch (x){
                case 1:
                    add();
                    shoy();
                    break;
                case 2:
                    delete();
                    shoy();
                    break;
                case 3:
                    shoy();
                    break;
                case 4:
                    jkl();
                    shoy();
                    break;
                case 5:
                    showy();
                    break;
                case 6:
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
        String filePath = "yeji.txt"; // 替换为你的文件路径
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void jkl() {
        System.out.println("请输入要修改的客户编号");
        String id=sc.next();
        for (int i = 0; i < Test.users.size(); i++) {
            User users = Test.users.get(i);
            if (users.getCustomernumber().equals(id)) {
                while (true) {
                    System.out.println("请输入想要修改的代号");
                    System.out.println("1：姓名");
                    System.out.println("2：联系方式");
                    System.out.println("3：联系地址");
                    System.out.println("4：信用度");
                    System.out.println("5：时间");
                    System.out.println("6：所购产品");
                    System.out.println("7：联系人编号");
                    System.out.println("8：退出程序");
                    int y = sc.nextInt();
                    switch (y) {
                        case 1:
                            shoy();
                            System.out.println("将姓名修改为");
                            String r = sc.next();
                            users.setName(r);
                            System.out.println("修改成功");
                            shoy();
                            break;
                        case 2:
                            shoy();
                            System.out.println("将联系方式修改为");
                            String q = sc.next();
                            users.setContactinformation(q);
                            System.out.println("修改成功");
                            shoy();
                            break;
                        case 3:
                            shoy();
                            System.out.println("将联系地址修改为");
                            String b = sc.next();
                            users.setContactaddress(b);
                            System.out.println("修改成功");
                            shoy();
                            break;
                        case 4:
                            shoy();
                            System.out.println("将信用度修改为");
                            String p = sc.next();
                            users.setCreditrating(p);
                            System.out.println("修改成功");
                            shoy();
                            break;
                        case 5:
                            shoy();
                            System.out.println("将时间修改为");
                            String l = sc.next();
                            users.setTime(l);
                            System.out.println("修改成功");
                            shoy();
                            break;
                        case 6:
                            shoy();
                            System.out.println("将所购产品修改为");
                            String n = sc.next();
                            users.setPurchasedgoods(n);
                            System.out.println("修改成功");
                            shoy();
                            break;
                        case 7:
                            shoy();
                            System.out.println("将联系人编号修改为");
                            String h = sc.next();
                            users.setCustomernumber(h);
                            System.out.println("修改成功");
                            shoy();
                            break;
                        case 8:
                            System.out.println("已退出");
                            System.exit(0);
                    }}
            }else{
                System.out.println("无此用户");
            }
        }
    }
    private static void shoy () {
        if (Test.users.size()==0) {
            System.out.println("目前没有客户可查看");
        } else {
            System.out.println("目前有");
            for (User users : Test.users) {
                System.out.println(users);

                String filePath="wer.txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    for (User user : Test.users) {
                        writer.write(user.getCustomernumber()+","+user.getName()+","+user.getContactinformation()+","+user.getContactaddress()+","+user.getCreditrating()+","+user.getTime()+","+user.getCustomernumber()+","+user.getPurchasedgoods()+"," );
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void delete () {
        System.out.println("请输入删除第几个");
        int i = sc.nextInt();
        Test.users.remove(i - 1);
        System.out.println("删除成功");
    }
    private static void add () {
        System.out.println("确认录入数据吗(请输入yes or no)");
        String choice = sc.next();
        if ("yes".equals(choice)) {
            System.out.println("请输入客户编号");
            String customernumber = sc.next();
            System.out.println("请输入客户姓名");
            String name = sc.next();
            System.out.println("请输入联系方式");
            String contactinformation = sc.next();
            System.out.println("请输入联系地址");
            String contactadddress = sc.next();
            System.out.println("请输入消费时间");
            String time = sc.next();
            System.out.println("请输入信用度");
            String creditrating = sc.next();
            System.out.println("请输入所购产品");
            String contactnumber = sc.next();
            System.out.println("请输入联系人编号");
            String purchasedgoods = sc.next();
            User p = new User(customernumber, name, contactinformation, contactadddress, creditrating, time, contactnumber, purchasedgoods);
            Test.users.add(p);
            System.out.println("添加成功");

        } else {
            System.out.println("已退出");
            System.exit(0);
        }
    }
}
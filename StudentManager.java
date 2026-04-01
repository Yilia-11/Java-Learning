import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    // 存储学生数据
    static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.添加 2.查看 3.删除 4.退出");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    deleteStudent(sc);
                    break;
                case 4:
                    System.out.println("退出成功");
                    return;
                default:
                    System.out.println("输入错误");
            }
        }
    }

    // 添加学生
    public static void addStudent(Scanner sc) {
        System.out.println("输入id:");
        int id = sc.nextInt();

        System.out.println("输入姓名:");
        String name = sc.next();

        System.out.println("输入年龄:");
        int age = sc.nextInt();

        list.add(new Student(id, name, age));
        System.out.println("添加成功");
    }

    // 显示学生
    public static void showStudents() {
        if (list.isEmpty()) {
            System.out.println("暂无学生");
            return;
        }

        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }

    // 删除学生
    public static void deleteStudent(Scanner sc) {
        System.out.println("输入要删除的id:");
        int id = sc.nextInt();

        boolean removed = list.removeIf(s -> s.id == id);

        if (removed) {
            System.out.println("删除成功");
        } else {
            System.out.println("未找到该学生");
        }
    }
}

// 学生类（不能写 public）
class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

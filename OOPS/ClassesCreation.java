import java.util.Scanner;
public class ClassesCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen();
        p1.setColor("blue");
        p1.setTip(5);
        System.out.println("Color of Pen is "+p1.color+" and tip is "+p1.tip+"mm");
        System.out.println("if you want to modify give new color");
        p1.color=sc.next();
        System.out.println("new color of pen is :"+p1.color);
        Student s1=new Student();
        System.out.println("Enter name of student: ");
        s1.name=sc.next();
        System.out.println("Enter Marks in Physics");
        int p=sc.nextInt();
        System.out.println("Enter Marks in Chemistry");
        int c=sc.nextInt();
        System.out.println("Enter Marks in Maths");
        int m=sc.nextInt();
        System.out.println("Percentage is : "+s1.calculatePercentage(p,c,m));
        sc.close();
    }
}
class Pen {
    String color;
    int tip;
    void setColor(String newcolor){
        color=newcolor;
    }
    void setTip(int newtip) {
        tip=newtip;
    }
}
class Student {
    String name;
    int rollno;
    int age;
    float percentage;
    float calculatePercentage(int physics,int chemistry,int math){
        percentage=(physics+chemistry+math)/3;
        return percentage;
    }
}

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        ArrayList<Person> list = new ArrayList<>();
        int N = sc.nextInt();
        sc.nextLine();
        for (int n = 0; n < N; n++) {
            String[] items = sc.nextLine().split("\t");
            Person p = null;
            if (items[4].equals("Student")) {
                Student p1 = new Student();
                if (items[5].equals("FRESHMAN")) p1.status = Student.FRESHMAN;
                else if (items[5].equals("SOPHOMORE")) p1.status = Student.SOPHOMORE;
                else if (items[5].equals("JUNIOR")) p1.status = Student.JUNIOR;
                else if (items[5].equals("SENIOR")) p1.status = Student.SENIOR;
                p = p1;
            } else if (items[4].equals("Employee")) {
                Faculty p1 = new Faculty();
                if (items[5].equals("LECTURER")) p1.rank = Faculty.LECTURER;
                else if (items[5].equals("ASSISTANT_PROFESSOR")) p1.rank = Faculty.ASSISTANT_PROFESSOR;
                else if (items[5].equals("ASSOCIATE_PROFESSOR")) p1.rank = Faculty.ASSOCIATE_PROFESSOR;
                else if (items[5].equals("PROFESSOR")) p1.rank = Faculty.PROFESSOR;
                p = p1;
            } else if (items[4].equals("Staff")) {
                Staff p1 = new Staff();
                p1.title = items[5];
                p = p1;
            }
            p.name = items[0];
            p.address = items[1];
            p.phoneNumber = items[2];
            p.email = items[3];
            list.add(p);
        }
        for (Person p : list) System.out.println(p);
    }
}
 
class Person{
    String name;
    String phoneNumber;
    String address;
    String email;
    int job;
 
    public String toString(){
        return name +"is"+ job;
    }
}
 
class Student extends Person{
    static String FRESHMAN ="Student";
    static String SOPHOMORE ="Student";
    static String JUNIOR = "Student";
    static String SENIOR = "Student";
 
    String status;
    public String toString(){
        return name +" is "+status;
    }
}
 
class Employee extends Person{
    String workp;
    String pay;
    String date;
}
 
class Faculty extends Employee{
    static String LECTURER = "Faculty";
    static String ASSISTANT_PROFESSOR ="Faculty";
    static String ASSOCIATE_PROFESSOR ="Faculty";
    static String PROFESSOR ="Faculty";
    String workh;
 
    String rank;
    public String toString(){
        return name +" is "+rank;
    }
}
 
class Staff extends Employee{
    String title = "Staff";
    public String toString(){
        return name +" is Staff";
    }
}
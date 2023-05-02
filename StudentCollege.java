class Student {
int id;
String course, name;
float fee;
Student(int id, String course, String name) {
this.id = id;
this.course = course;
this.name = name;
}
Student(int id, String course, String name, float fee) {
this(id, course, name);
this.fee = fee;
}
void display() {
System.out.println(id+""+course+""+name+""+fee);
}
}
public class StudentCollege {
public static void main(String args[]) {
Student s1 = new Student(10001, "BE.CSE", "Perumal", 45000);
Student s2 = new Student(10002, "BE.CSE", "Palani", 55000);
s1.display();
s2.display();
}
}
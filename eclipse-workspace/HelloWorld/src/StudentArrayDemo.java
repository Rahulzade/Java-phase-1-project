
class Student{
private int rollNo;
private String name;
private int age;
public Student(int rollNo, String name, int age) {
this.rollNo = rollNo;
this.name = name;
this.age = age;
}
public int getRollNo() {
return rollNo;
}
public void setRollNo(int rollNo) {
this.rollNo = rollNo;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String toString() {
return "[ Name: "+name+", Roll No: "+rollNo+", Age: "+age+"]";
}
}
public class StudentArrayDemo {
public static void main(String[] args) {
Student[] studentArr = new Student[10];
studentArr[0] = new Student(1, "sid", 23);
studentArr[1] = new Student(2, "neyoo", 23);
studentArr[2] = new Student(3, "deepan", 23);
studentArr[3] = new Student(4, "kavita", 23);
studentArr[4] = new Student(5, "sabin", 23);
}
}
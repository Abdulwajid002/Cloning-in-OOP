public class Student implements Cloneable{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    // Getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

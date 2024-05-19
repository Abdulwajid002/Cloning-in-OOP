public class Main {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(111, "Ali");
            Student s2 = (Student) s1.clone();
            System.out.println(s1.getRollno() + " " + s1.getName());
            System.out.println(s2.getRollno() + " " + s2.getName());

            s2.setRollno(90);
            s2.setName("Waji");


            System.out.println(s2.getRollno() + " " + s2.getName());
        }
        catch (CloneNotSupportedException C)
        // Handle the exception appropriately
        {

        }
    }
}

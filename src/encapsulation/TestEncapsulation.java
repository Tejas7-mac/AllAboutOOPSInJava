package encapsulation;

public class TestEncapsulation {

    public static void main (String []args) {
        Student student = new Student();

        student.setStudentId(1);
        student.setStudentName("Tejas");
        student.setAge(24);

        System.out.println(student.toString());
    }
}

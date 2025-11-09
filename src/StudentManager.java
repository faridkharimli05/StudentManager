import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    // Tələbə əlavə edən metod
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " əlavə edildi ✅");
    }

    // Tələbə silən metod
    public void removeStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println(s.getName() + " silindi ❌");
                return;
            }
        }
        System.out.println("Bu ID ilə tələbə tapılmadı!");
    }

    // Bütün tələbələri göstərən metod
    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Heç bir tələbə yoxdur.");
        } else {
            System.out.println("\nTələbə siyahısı:");
            for (Student s : students) {
                s.showInfo();
            }
        }
    }
}

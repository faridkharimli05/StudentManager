
public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student("Farid Karimli", "23", 21);
        Student s2 = new Student("Asif Huseynzade" , "21", 32);
        Student s3 = new Student("Asif Huseynzadaaa" , "21", 31);



        manager.addStudent(s1);
        manager.removeStudent(21);
        manager.showAllStudents();



        }
    }

public class Student {

    private String name;
    private String age;
    private int id;

    public Student(String name, String age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    public void showInfo() {
        System.out.println("ID: " + id + ", Ad: " + name + ", Yaş: " + age);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }









}

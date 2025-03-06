import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;
    private Set<String> courses;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.courses = new HashSet<>();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public Set<String> getCourses() { return courses; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public void addCourse(String course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Courses: " + courses;
    }
}

class StudentManager {
    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(int id) {
        students.remove(id);
    }

    public void updateStudent(int id, String name, int age, Set<String> courses) {
        Student student = students.get(id);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
            student.getCourses().clear();
            student.getCourses().addAll(courses);
        }
    }

    public void displayAllStudents() {
        students.values().stream()
                .sorted(Comparator.comparingInt(Student::getId))
                .forEach(System.out::println);
    }

    public void findStudentById(int id) {
        Student student = students.get(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found");
        }
    }

    public void findStudentsByCourse(String course) {
        students.values().stream()
                .filter(s -> s.getCourses().contains(course))
                .forEach(System.out::println);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student(1, "Aktan", 18);
        s1.addCourse("Java Programming");
        manager.addStudent(s1);

        Student s2 = new Student(2, "Zhumabek", 18);
        s2.addCourse("Python");
        manager.addStudent(s2);

        manager.displayAllStudents();

        System.out.println("Finding student with ID 1:");
        manager.findStudentById(1);

        System.out.println("Students enrolled in Java Programming:");
        manager.findStudentsByCourse("Java Programming");
    }
}

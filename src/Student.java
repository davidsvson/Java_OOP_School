public class Student extends Person {
    private Course course;
    public Student(String name) {
        super(name);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }




}

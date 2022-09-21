public class Main {
    public static void main(String[] args) {

        Student p1 = new Student("david");

        Course c1 = new Course("java");

        Course course = p1.getCourse();

        if (course != null) {
            System.out.println(course.getName());
        }

        p1.setCourse(c1);

        course = p1.getCourse();

        if (course != null) {
            System.out.println(course.getName());
        }
    }
}

// 1. Titta på video - skriva koden samtidgt
// 2. Skriva samma kod igen men utan att se videon
// 3. Gör övning 1-5
// 4. Hej bilist









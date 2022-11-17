package sesi4;

public class Main {
    public static void main(String[] args) {
        // Main Student class
        Student s1 = new Student("denon", "Cibadak");
        s1.addCourseGrade("PBO", 97);
        s1.addCourseGrade("RPL", 68);
        s1.printGrades();
        System.out.println("Rata-rata nilai : " + s1.getAverageGrade());

        // Main Teacher class
        Teacher t1 = new Teacher("Nugraha", "Cisaat");
        System.out.println(t1);
        String[] courses = { "PBO", "RPL", "PP" };
        for (String course : courses) {
            if (t1.addCourse(course)) {
                System.out.println(course + " added.");
                // simpan ditambahkan array 
            } else {
                System.out.println(course + " cannot be added.");
                // gagal ditambahkan ke array
            }
        }
        System.out.println("====================\n");
        for (String course : courses) {
            if (t1.removeCourse(course)) {
                System.out.println(course + " removed.");
            } else {
                System.out.println(course + " cannot be removed.");
            }
        }
    }

}

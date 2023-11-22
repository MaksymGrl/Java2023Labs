import java.util.Arrays;

public class Lab4 {
	static class Student {
	    private String firstname;
	    private String lastname;
	    private int age;
	    private int course;
	    private String group;

	    Student(String firstname, String lastname, int age, int course, String group) {
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.age = age;
	        this.course = course;
	        this.group = group;
	    }

	    public String getFirstname() {
	        return firstname;
	    }

	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }

	    public String getLastname() {
	        return lastname;
	    }

	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public int getCourse() {
	        return course;
	    }

	    public void setCourse(int course) {
	        this.course = course;
	    }

	    public String getGroup() {
	        return group;
	    }

	    public void setGroup(String group) {
	        this.group = group;
	    }
	}

    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("Alex", "Albro", 18, 1, "IO-20");
        students[1] = new Student("Oleg", "Brov", 19, 2, "IС-10");
        students[2] = new Student("Max", "Kvan", 18, 1, "АЛ-5");
        students[3] = new Student("Petro", "Melnyk", 22, 3, "ІН-4");

        Arrays.sort(students, (s1, s2) -> {
            int ret = s1.getFirstname().compareToIgnoreCase(s2.getFirstname());
            if (ret == 0) {
                return s1.getLastname().compareToIgnoreCase(s2.getLastname());
            }
            return ret;
        });
        System.out.println("Sort by name:");
        System.out.printf("%-10s%-10s%-4s%-8s%-5s\n", "Firstname", "Lastname", "Age", "Course", "Group");
        for (Student i: students) {
            System.out.printf("%-10s%-10s%-4d%-8d%-5s\n", i.getFirstname(), i.getLastname(), i.getAge(), i.getCourse(), i.getGroup());
        }
        
        Arrays.sort(students, (s1, s2) -> s2.getAge() - s1.getAge());
        
        System.out.println("\nSort by age:");
        System.out.printf("%-10s%-10s%-4s%-8s%-5s\n", "Firstname", "Lastname", "Age", "Course", "Group");
        for (Student i: students) {
            System.out.printf("%-10s%-10s%-4d%-8d%-5s\n", i.getFirstname(), i.getLastname(), i.getAge(), i.getCourse(), i.getGroup());
        }

    }
}
public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private boolean isElder;
    private double averageMark;


    public Student(String firstName, String lastName, int group, boolean isElder, double everageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.isElder = isElder;
        this.averageMark = everageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public boolean isElder() {
        return isElder;
    }

    public void setElder(boolean elder) {
        isElder = elder;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double everageMark) {
        this.averageMark = everageMark;
    }

    public void getScholarship(Student student){
        if (this.getAverageMark() == 5){
            System.out.println(this.getFirstName() + " сумму стипендии 1000 сом.");
        } else {
            System.out.println(this.getFirstName() + " сумму стипендии 800 сом.");
        }
    }

    public static void getScholarship(Student[] students){
        for (int i=0;i<students.length; i++) {
            if (students[i].getAverageMark() == 5){
                System.out.println(students[i].getFirstName() + " сумму стипендии 1000 сом.");
            } else {
                System.out.println(students[i].getFirstName() + " сумму стипендии 800 сом.");
            }
        }
    }

    public static void findStudentByName(Student[] students, String name){
        for (int i=0;i<students.length; i++) {
            if (students[i].getFirstName().equals(name)) {
                System.out.println("Студент с именем " + students[i].getFirstName() + " найден.");
            }
        }
    }





}

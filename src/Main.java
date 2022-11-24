public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        Student student1 = new Aspirant("Иван", "soloviev", 1, true, 5.0, "Научная работа имееться");
        Student student2 = new Student("Павел", "Аскаров", 2, false, 4.9);
        Student student3 = new Student("Настя", "Кайратова", 1, true, 5.0);


        student2.getScholarship(student1);
        System.out.println();
        Aspirant aspirant1 = new Aspirant("Бакыт","Исмаилов",1,false,4.6,"Научной работы не имееться.");
        Aspirant aspirant2 = new Aspirant("Асель","Мамытова",2,false,4.7,"Научная работа имееться");
        aspirant1.getScholarship(aspirant1);


        students[0] = student1;
        students[1] = student2;
        students[2] = aspirant1;
        students[3] = student3;
        students[4] = aspirant2;

        Student.getScholarship(students);
        System.out.println();
        Student.findStudentByName(students,"Асель");
    }
}

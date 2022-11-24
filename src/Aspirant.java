public class Aspirant extends Student{
    private String sciWork;

    public Aspirant(String firstName, String lastName, int group, boolean isElder, double everageMark, String sciWork) {
        super(firstName, lastName, group, isElder, everageMark);
        this.sciWork = sciWork;
    }

    public String getSciWork() {
        return sciWork;
    }

    public void setSciWork(String sciWork) {
        this.sciWork = sciWork;
    }

    public void getScholarship(Aspirant aspirant){
        if (this.getAverageMark() == 5){
            System.out.println(this.getFirstName() + " сумму стипендии 1000 сом.");
        } else {
            System.out.println(this.getFirstName() + " сумму стипендии 800 сом.");
        }
    }
}

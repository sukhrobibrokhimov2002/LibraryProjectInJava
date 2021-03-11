package uz.pdp.model;

public class Student extends User{
    private String univerName;
    private String course;
  public   Student(){

    }


    public Student(String fullName, String passportNumber, String birthDate, String phone, String email, String expireDate, String univerName, String course) {
        super(fullName, passportNumber, birthDate, phone, email, expireDate);
        this.univerName = univerName;
        this.course = course;
    }

    public String getUniverName() {
        return univerName;
    }

    public void setUniverName(String univerName) {
        this.univerName = univerName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

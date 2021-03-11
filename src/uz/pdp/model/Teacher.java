package uz.pdp.model;

public class Teacher extends User {
    private String speciality;
    private int activeYears;

    public Teacher(String fullName, String passportNumber, String birthDate, String phone, String email, String expireDate, String speciality, int activeYears) {
        super(fullName, passportNumber, birthDate, phone, email, expireDate);
        this.speciality = speciality;
        this.activeYears = activeYears;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getActiveYears() {
        return activeYears;
    }

    public void setActiveYears(int activeYears) {
        this.activeYears = activeYears;
    }
}

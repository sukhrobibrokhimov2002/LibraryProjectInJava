package uz.pdp.model;

public class Other extends User {
    private String job;

    public Other(String fullName, String passportNumber, String birthDate, String phone, String email, String expireDate, String job) {
        super(fullName, passportNumber, birthDate, phone, email, expireDate);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

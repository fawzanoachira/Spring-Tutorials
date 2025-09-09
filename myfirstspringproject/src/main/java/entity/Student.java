package entity;

public class Student {
    private int stdId;
    private String stdName;
    private int stdAge;

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }

    public Student(int stdId, String stdName, int stdAge) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdAge = stdAge;
    }

    public Student() {
        System.out.println("Constructor Executed");
    }

    @Override
    public String toString() {
        return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAge=" + stdAge + "]";
    }

}

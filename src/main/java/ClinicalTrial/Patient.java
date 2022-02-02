package ClinicalTrial;

public class Patient {
    private char gender;
    private int cLevel;

    public Patient(char gender, int cLevel) {
        this.gender = gender;
        this.cLevel = cLevel;
    }


    public int getCLevel() {
        return cLevel;
    }

    public void setCLevel(int cLevel) {
        this.cLevel = cLevel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

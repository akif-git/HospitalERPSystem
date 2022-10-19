package objects;

import java.util.Calendar;

/**
 *
 * @author Connor
 */
public class Patient extends User {
    // determine what attributes should be unique to patients
    int patient_id;
    String healthCard;
    Calendar birthdate;
    String gender;
    int height_cm;
    int weight_lbs;

    // Setter Classes
    public void setHealthCard(String healthCard) {
        this.healthCard = healthCard;
    }

    public void setBirthdate(Calendar birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(int height_cm) {
        this.height_cm = height_cm;
    }

    public void setWeight(int weight_lbs) {
        this.weight_lbs = weight_lbs;
    }

    // Getter Classes

    public int getPatientId() {
        return patient_id;
    }

    public String getHealthCard() {
        return healthCard;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }

    public int getAge() {

        Calendar currentDate = Calendar.getInstance();
        int age = currentDate.get(Calendar.YEAR) - birthdate.get(Calendar.YEAR);
        if ((birthdate.get(Calendar.MONTH) > currentDate.get(Calendar.MONTH))
                || (birthdate.get(Calendar.MONTH) == currentDate.get(Calendar.MONTH)
                        && birthdate.get(Calendar.DAY_OF_MONTH) > currentDate.get(Calendar.DAY_OF_MONTH))) {
            // decrements age by 1 if birthday has not passed this year
            age--;
        }

        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getHeight() {
        return height_cm;
    }

    public int getWeight() {
        return weight_lbs;
    }

    // Constructor
    // For read, update, delete patient+user
    public Patient(int patient_id, int user_id, String first_name, String last_name, String healthCard, String address,
            String telephone, Calendar birthdate, String gender, int height_cm,
            int weight_lbs, int role, int status) {
        super(user_id, first_name, last_name, address, telephone, role, status);

        this.patient_id = patient_id;
        this.healthCard = healthCard;
        this.birthdate = birthdate;
        this.gender = gender;
        this.height_cm = height_cm;
        this.weight_lbs = weight_lbs;

    }

    // For INSERT new patient+user
    public Patient(String first_name, String last_name, String healthCard, String address,
            String telephone, Calendar birthdate, String gender, int height_cm,
            int weight_lbs, int role, int status) {
        this(0, 0, first_name, last_name, healthCard, address,
                telephone, birthdate, gender, height_cm,
                weight_lbs, role, status);

    }

    // Default Constructor
    public Patient() {

    }
}
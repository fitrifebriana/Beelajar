package id.or.codelabs.beelajar.model;

/**
 * Created by FitriFebriana on 7/4/2016.
 */
public class ListTutor {
    private String tutorName;
    private String tutorAddress;
    private String tutorClassPrice;
    private int imgTutorResId;

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getTutorAddress() {
        return tutorAddress;
    }

    public void setTutorAddress(String tutorAddress) {
        this.tutorAddress = tutorAddress;
    }

    public String getTutorClassPrice() {
        return tutorClassPrice;
    }

    public void setTutorClassPrice(String tutorClassPrice) {
        this.tutorClassPrice = tutorClassPrice;
    }

    public int getImgTutorResId() {
        return imgTutorResId;
    }

    public void setImgTutorResId(int imgTutorResId) {
        this.imgTutorResId = imgTutorResId;
    }
}

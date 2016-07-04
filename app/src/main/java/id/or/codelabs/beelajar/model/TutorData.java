package id.or.codelabs.beelajar.model;

import java.util.ArrayList;
import java.util.List;

import id.or.codelabs.beelajar.R;

/**
 * Created by FitriFebriana on 7/4/2016.
 */
public class TutorData {
    private static final String[] tutorNames =
            {"Dewi Lestari", "J.K.Rowling", "Draco Malfoy", "Harry Potter",
                    "Rakhmat Alva Edison", "Azka Kiwir", "Adam Mukharil B"};
    private static final int[] tutorImages = {R.drawable.tutor1, R.drawable.tutor2, R.drawable.tutor3, R.drawable.tutor4, R.drawable.tutor5,
            R.drawable.tutor6, R.drawable.tutor7};
    private static final String[] tutorAddresses = {"Jl. Sekeloa", "Jl. Tubagus Ismail", "Jl.Suci", "Jl.Kenangan",
     "Jl. Ganesha","Jl. Dipatiukur", "Jl.Ir. Hj. Djuanda"};
    private static final String[] tutorClassPrices = {"Rp. 100.000", "Rp. 200.000", "Rp. 20.000", "Rp.50.000",
    "Rp. 2000.000", "Rp. 500.000", "Rp. 1000.000"};

    public static List<ListTutor> getListTutors(){
        List<ListTutor> listTutors = new ArrayList<>();

        for (int x = 0; x < 3; x++) {
            for (int i = 0; i < tutorNames.length; i++) {
                ListTutor tutor = new ListTutor();
                tutor.setImgTutorResId(tutorImages[i]);
                tutor.setTutorName(tutorNames[i]);
                tutor.setTutorAddress(tutorAddresses[i]);
                tutor.setTutorClassPrice(tutorClassPrices[i]);
                listTutors.add(tutor);
            }
        }

        return listTutors;
    }
}

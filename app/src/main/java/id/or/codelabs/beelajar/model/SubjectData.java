package id.or.codelabs.beelajar.model;

import java.util.ArrayList;
import java.util.List;

import id.or.codelabs.beelajar.R;

/**
 * Created by Rizal Y on 7/17/2016.
 */
public class SubjectData {
    private static final String[] subject = {"Android","iOS","Web Service","Java","UI Design","Musik"};
    private static final int[] img = {R.drawable.android_logo,R.drawable.ios,R.drawable.web,R.drawable.javalogo,R.drawable.ui,R.drawable.music_logo};


    public static List<SubjectModel> getListSubject(){
        List<SubjectModel> listSubject = new ArrayList<>();
        for (int x = 0; x < 4; x++) {
            for (int i = 0; i < subject.length; i++) {
                SubjectModel sb = new SubjectModel();
                sb.setImgId(img[i]);
                sb.setSubject(subject[i]);
                listSubject.add(sb);
            }
        }
        return listSubject;
    }
 }

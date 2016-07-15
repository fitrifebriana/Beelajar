package id.or.codelabs.beelajar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfileInfoFragment extends Fragment {

    private static String resId = "RES_ID";

    public ProfileInfoFragment() {
        // Required empty public constructor
    }

    public static ProfileInfoFragment newInstance(int id) {
        Bundle args = new Bundle();
        args.putInt(resId, id);
        ProfileInfoFragment fragment = new ProfileInfoFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_profile_info,null);

        return view;
    }
}

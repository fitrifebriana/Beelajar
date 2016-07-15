package id.or.codelabs.beelajar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfileHistoryFragment extends Fragment {

    private static String resId = "RES_ID";

    public ProfileHistoryFragment() {
        // Required empty public constructor
    }

    public static ProfileHistoryFragment newInstance(int id) {
        Bundle args = new Bundle();
        args.putInt(resId, id);
        ProfileHistoryFragment fragment = new ProfileHistoryFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_profile_history,null);

        return view;
    }
}

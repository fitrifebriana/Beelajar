package id.or.codelabs.beelajar;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.or.codelabs.beelajar.R;
import id.or.codelabs.beelajar.adapter.ScheduleAdapter;
import id.or.codelabs.beelajar.adapter.SubjectAdapter;
import id.or.codelabs.beelajar.model.ModelJadwal;
import id.or.codelabs.beelajar.model.SubjectData;
import id.or.codelabs.beelajar.model.SubjectModel;

public class SubjectFragment extends Fragment {
    private View parentview;
    RecyclerView recyclerView;
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subject, null);

        parentview = view;
        recyclerView = (RecyclerView)parentview.findViewById(R.id.subject_list);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        SubjectAdapter aj = new SubjectAdapter(SubjectData.getListSubject(),context);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(aj);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }



}

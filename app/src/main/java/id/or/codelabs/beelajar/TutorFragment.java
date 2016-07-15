package id.or.codelabs.beelajar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.or.codelabs.beelajar.adapter.TutorAdapter;
import id.or.codelabs.beelajar.model.TutorData;

public class TutorFragment extends Fragment {

    private RecyclerView recTutor;
    private TutorAdapter adapterTutor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tutor, null);

        recTutor = (RecyclerView)view.findViewById(R.id.rec_tutor);
        //LayoutManager: @idLAyoutManager or StaggeredByidLayoutManager
        recTutor.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapterTutor = new TutorAdapter(TutorData.getListTutors(), getActivity());
        recTutor.setAdapter(adapterTutor);

        return view;
    }
}

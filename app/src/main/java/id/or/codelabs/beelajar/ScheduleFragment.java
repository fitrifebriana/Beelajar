package id.or.codelabs.beelajar;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.or.codelabs.beelajar.adapter.AdapterJadwal;
import id.or.codelabs.beelajar.model.ModelJadwal;

public class ScheduleFragment extends Fragment {
    private View parentview;
    RecyclerView recyclerView;
    ArrayList<ModelJadwal> arrayJadwal = new ArrayList<>();
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_schedule, null);
        parentview = view;
        recyclerView = (RecyclerView)parentview.findViewById(R.id.jadwal_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext()));
        setJadwal();
        AdapterJadwal aj = new AdapterJadwal(arrayJadwal,context);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(aj);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }

    private void setJadwal() {
        arrayJadwal.add(new ModelJadwal("Android Studio","12/08/2016","Adams Bach M.Kom","13.45"));
        arrayJadwal.add(new ModelJadwal("Web Service","13/08/2016","Samsul M.Kom","12.40"));
        arrayJadwal.add(new ModelJadwal("UI Design","14/08/2016","Azka Kiwir S.Kom","12.00"));
        arrayJadwal.add(new ModelJadwal("Matematika","14/08/2016","Fitri Bach S.Kom","14.30"));

    }
}

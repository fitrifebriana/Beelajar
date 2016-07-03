package id.or.codelabs.beelajar.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.or.codelabs.beelajar.R;
import id.or.codelabs.beelajar.model.ModelJadwal;

/**
 * Created by Rizal Y on 7/3/2016.
 */
public class AdapterJadwal extends RecyclerView.Adapter<AdapterJadwal.JadwalView> {

    private ArrayList<ModelJadwal> arrayJadwal;
    private Context context;

    public AdapterJadwal(ArrayList<ModelJadwal> arrayJadwal, Context context) {
        this.arrayJadwal = arrayJadwal;
        this.context = context;
    }

    @Override
    public JadwalView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_jadwal,parent,false);
        JadwalView v = new JadwalView(view);
        return v;
    }

    @Override
    public void onBindViewHolder(JadwalView holder, int position) {
        holder.subject.setText(arrayJadwal.get(position).getSubject());
        holder.date.setText(arrayJadwal.get(position).getTanggal());
        holder.nama.setText(arrayJadwal.get(position).getNama());
        holder.jam.setText(arrayJadwal.get(position).getJam());
    }

    @Override
    public int getItemCount() {
        return arrayJadwal.size();
    }

    public class JadwalView extends RecyclerView.ViewHolder{
        TextView subject;
        TextView date;
        TextView nama;
        TextView jam;
        public JadwalView(View itemView) {
            super(itemView);
            context = itemView.getContext();
            subject = (TextView)itemView.findViewById(R.id.subject);
            date = (TextView)itemView.findViewById(R.id.date);
            nama = (TextView)itemView.findViewById(R.id.nama);
            jam = (TextView)itemView.findViewById(R.id.jam);
        }
    }
}

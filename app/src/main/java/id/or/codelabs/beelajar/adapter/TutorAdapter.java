package id.or.codelabs.beelajar.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import id.or.codelabs.beelajar.R;
import id.or.codelabs.beelajar.model.ListTutor;

/**
 * Created by FitriFebriana on 7/4/2016.
 */
public class TutorAdapter extends RecyclerView.Adapter<TutorAdapter.TutorHolder>{

    private List<ListTutor> listTutors;
    private LayoutInflater inflater;

    public TutorAdapter(List<ListTutor> listTutors, Context context) {
        this.inflater = LayoutInflater.from(context);
        this.listTutors = listTutors;
    }

    @Override
    public TutorHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_tutor, parent, false);

        return new TutorHolder(view);
    }

    @Override
    public void onBindViewHolder(TutorHolder holder, int position) {
        ListTutor tutor = listTutors.get(position);
        holder.tutorName.setText(tutor.getTutorName());
        holder.tutorAddress.setText(tutor.getTutorAddress());
        holder.tutorClassPrice.setText(tutor.getTutorClassPrice());
        holder.tutorImage.setImageResource(tutor.getImgTutorResId());
    }

    @Override
    public int getItemCount() {
        return listTutors.size();
    }

    class TutorHolder extends RecyclerView.ViewHolder{

        private TextView tutorName;
        private TextView tutorAddress;
        private ImageView tutorImage;
        private TextView tutorClassPrice;
        private View container;

        public TutorHolder(View itemView) {
            super(itemView);

            tutorName = (TextView)itemView.findViewById(R.id.txt_tutors_name);
            tutorAddress = (TextView)itemView.findViewById(R.id.txt_tutors_address);
            tutorImage = (ImageView)itemView.findViewById(R.id.img_tutor);
            tutorClassPrice = (TextView)itemView.findViewById(R.id.txt_harga);
            container = itemView.findViewById(R.id.cont_tutor_root);
        }

    }

}

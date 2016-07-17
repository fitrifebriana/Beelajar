package id.or.codelabs.beelajar.adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import id.or.codelabs.beelajar.R;
import id.or.codelabs.beelajar.TutorFragment;
import id.or.codelabs.beelajar.model.SubjectModel;

/**
 * Created by Rizal Y on 7/15/2016.
 */
public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.ViewHolder> {
    FragmentManager mFragmentManager;
    private List<SubjectModel> arraySubject;
    private Context context;

    public SubjectAdapter(List<SubjectModel> arraySubject, Context context) {
        this.arraySubject = arraySubject;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final SubjectModel sm = arraySubject.get(position);
        holder.subject.setText(arraySubject.get(position).getSubject());
        holder.image.setImageResource(sm.getImgId());

    }


    @Override
    public int getItemCount() {
        return arraySubject.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView subject;
        ImageView image;
        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            subject = (TextView)itemView.findViewById(R.id.name_subject);
            image = (ImageView) itemView.findViewById(R.id.icon_img);
        }
    }

}
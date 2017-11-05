package org.swsd.school_yearbook.presenter.adapter;

/**
 * author     :  骆景钊
 * time       :  2017/11/04
 * description:  记录Recyclerview的每一个List的适配器
 * version:   :  1.0
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.swsd.school_yearbook.R;
import org.swsd.school_yearbook.model.bean.SchoolyearbookBean;

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder>{
    private List<SchoolyearbookBean> mSchoolyearbookBeanList;

    public NoteAdapter(List<SchoolyearbookBean> schoolyearbookBeanList){

        mSchoolyearbookBeanList = schoolyearbookBeanList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(NoteAdapter.ViewHolder holder, int position) {
        SchoolyearbookBean schoolyearbookBean = mSchoolyearbookBeanList.get(position);
        holder.noteName.setText(schoolyearbookBean.getName());
    }

    @Override
    public int getItemCount() {
        return mSchoolyearbookBeanList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView noteName;
        public ViewHolder(View view){
            super(view);
            noteName = (TextView) view.findViewById(R.id.tv_note_name);
        }
    }
}

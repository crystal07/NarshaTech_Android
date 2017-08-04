package com.sejin.cnctown.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sejin.cnctown.ActDetailActivity;
import com.sejin.cnctown.R;
import com.sejin.cnctown.data.ActData;

import java.util.ArrayList;

/**
 * Created by sejin on 2017. 7. 8..
 */

public class ActThumbRcvAdapter extends RecyclerView.Adapter<ActThumbRcvAdapter.ViewHolder> {


    ArrayList<ActData> actList = new ArrayList<>();
    private Context context;


    public ActThumbRcvAdapter(Context context, ArrayList<ActData> actList) {
        this.actList = actList;
        this.context = context;
    }


    @Override
    public ActThumbRcvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_act_thumb, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    /**
     * params
     *
     * @param holder   - instance of the following custom viewholder
     * @param position - The position in the list of item to draw
     */
    @Override
    public void onBindViewHolder(ActThumbRcvAdapter.ViewHolder holder, final int position) {
        final ActData act = actList.get(position);


        holder.tvActCategory.setText(act.getActBasicData().getCategory());
        holder.tvActTitle.setText(act.getActBasicData().getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActDetailActivity.class);
                intent.putExtra("position", position);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        /*****************************************************************/
        /** TODO Set data and listener for each component of viewholder **/
        /*****************************************************************/
        if (act != null) {
            //TODO 트립 이미지 누르면 트립 소개 페이지로 넘어가기
        }

    }

    @Override
    public int getItemCount() {
        return actList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivActImage;
        TextView tvActTitle, tvActCategory;
        /***********************************************/
        /** TODO declare view components in item view **/
        /***********************************************/
        public ViewHolder(View itemView) {
            super(itemView);

            ivActImage = (ImageView) itemView.findViewById(R.id.thumb_iv_img);
            tvActCategory = (TextView) itemView.findViewById(R.id.thumb_tv_desc);
            tvActTitle = (TextView) itemView.findViewById(R.id.thumb_tv_name);

        }
    }
}

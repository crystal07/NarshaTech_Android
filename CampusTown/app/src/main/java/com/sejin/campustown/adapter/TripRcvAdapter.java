package com.sejin.campustown.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sejin.campustown.R;
import com.sejin.campustown.data.TripData;

import java.util.ArrayList;

/**
 * Created by sejin on 2017. 7. 8..
 */

public class TripRcvAdapter extends RecyclerView.Adapter<TripRcvAdapter.ViewHolder>{


    ArrayList<TripData> tripList= new ArrayList<>();
    private Context context;


    public TripRcvAdapter(Context context, ArrayList<TripData> tripList){
        this.tripList= tripList;
        this.context=context;
    }



    @Override
    public TripRcvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trips, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }


    /** params
     *
     * @param holder - instance of the following custom viewholder
     * @param position - The position in the list of item to draw
     */
    @Override
    public void onBindViewHolder(TripRcvAdapter.ViewHolder holder, int position) {
        final TripData trip= tripList.get(position);

        holder.tvTripDesc.setText(trip.getDescription());
        holder.tvTripName.setText(trip.getName());
        /*****************************************************************/
        /** TODO Set data and listener for each component of viewholder **/
        /*****************************************************************/
        if (trip != null){
            //TODO 트립 이미지 누르면 트립 소개 페이지로 넘어가기
        }

    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivTripImage;
        TextView tvTripName, tvTripDesc;
        /***********************************************/
        /** TODO declare view components in item view **/
        /***********************************************/
        public ViewHolder(View itemView) {
            super(itemView);

            ivTripImage=(ImageView)itemView.findViewById(R.id.ivTrip);
            tvTripDesc=(TextView)itemView.findViewById(R.id.tvTripDesc);
            tvTripName=(TextView)itemView.findViewById(R.id.tvTripName);

        }
    }
}

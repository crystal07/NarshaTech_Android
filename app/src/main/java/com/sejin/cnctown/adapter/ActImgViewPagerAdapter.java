package com.sejin.cnctown.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.sejin.cnctown.R;

/**
 * Created by sejin on 2017. 8. 1..
 */

public class ActImgViewPagerAdapter extends PagerAdapter{

    private Context context;
    private LayoutInflater layoutInflater;

    public ActImgViewPagerAdapter(Context context, LayoutInflater layoutInflater) {
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @Override
    public int getCount() {


        return 3;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view== object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view= layoutInflater.inflate(R.layout.item_viewpager_detail,null);
        ImageView imageView= (ImageView) view.findViewById(R.id.img_viewpager_childimage);
        imageView.setImageResource(R.drawable.places_ic_search);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }
}

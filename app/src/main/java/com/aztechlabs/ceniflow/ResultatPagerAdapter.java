package com.aztechlabs.ceniflow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;


public class ResultatPagerAdapter extends PagerAdapter {
    List<Integer> images;
    Context context;
    LayoutInflater layoutInflater;
    public ResultatPagerAdapter(List<Integer> images, Context context) {
        this.images = images;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return images.size();
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View view= layoutInflater.inflate(R.layout.item_resultat,container,false);
        ImageView imageView =(ImageView)view.findViewById(R.id.profile_image);
        imageView.setImageResource(images.get(position));
        container.addView(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Clicked image " +position,Toast.LENGTH_LONG ).show();
            }
        });
        return view;
    }
}

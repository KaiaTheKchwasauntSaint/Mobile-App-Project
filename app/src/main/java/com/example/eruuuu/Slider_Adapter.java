package com.example.eruuuu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Slider_Adapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] list_img = {
            R.drawable.slide1,
            R.drawable.slide2,
            R.drawable.slide3
    };

    public Slider_Adapter(Context context) {
           this.context = context;
    }

    @Override
    public int getCount() {
        return list_img.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view  = inflater.inflate(R.layout.slide,container,false);
        LinearLayout linearLayout = view.findViewById(R.id.slider_layout);
        ImageView imageView = view.findViewById(R.id.slide_img);
        imageView.setImageResource(list_img[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

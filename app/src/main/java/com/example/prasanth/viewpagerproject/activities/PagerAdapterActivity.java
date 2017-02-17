package com.example.prasanth.viewpagerproject.activities;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.prasanth.viewpagerproject.Model;
import com.example.prasanth.viewpagerproject.R;

import java.util.List;

public class PagerAdapterActivity extends PagerAdapter {
    private Context context;
    private ImageView image;
    private LayoutInflater minflater;
    private List<Integer> imagesList;

    public PagerAdapterActivity(Context context, List<Integer> imagesList) {
        this.context = context;
        minflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.imagesList = imagesList;
    }

    public Object instantiateItem(ViewGroup viewGroup, int pos) {
        View view = minflater.inflate(R.layout.activity_pager_adapter, viewGroup, false);
        image = (ImageView) view.findViewById(R.id.image);
        image.setImageResource(imagesList.get(pos));
        viewGroup.addView(view);
        return view;
    }

    public void destroyItem(ViewGroup viewGroup, int position, Object object) {
        viewGroup.removeView((RelativeLayout) object);
    }

    public int getCount() {
        return imagesList.size();
    }

    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}

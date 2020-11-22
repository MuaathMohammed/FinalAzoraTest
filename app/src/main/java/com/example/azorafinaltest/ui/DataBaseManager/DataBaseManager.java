package com.example.azorafinaltest.ui.DataBaseManager;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.azorafinaltest.R;
import com.example.azorafinaltest.ui.LocalData.DBHelper;
import com.example.azorafinaltest.ui.Model.NewsItems;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class DataBaseManager extends Fragment {
    TextView u1;
    TextView u2;
    ImageView im1, im2;
    public static ArrayList<NewsItems> newsItems;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.database_fragment, container, false);
        NewsItems information = new NewsItems();
        information.setNewsId(2);
        information.setUser("naveen");
//        information.setNewsId(2);
//        information.setUser("naveen");
        information.setIMageID(2);
        information.setImage("https://i.redd.it/tpsnoz5bzo501.jpg");
        if (new DBHelper(getActivity()).create(information) && new DBHelper(getActivity()).createim(information)) {
            Log.v(TAG, "save ok.");

        } else {
            Log.v(TAG, "save failed.");
        }
        newsItems = new ArrayList<NewsItems>();

        u1 = root.findViewById(R.id.Uid);
        u2 = root.findViewById(R.id.Uid1);
        im1 = root.findViewById(R.id.uimage);
        im2 = root.findViewById(R.id.uimage1);
        Button bt = root.findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newsItems.size() != 0) {
                    u1.setText(newsItems.get(0).getUser());
                    u2.setText(newsItems.get(1).getUser());
                    Picasso.get().load(newsItems.get(0).getImage()).into(im1);
                    Picasso.get().load(newsItems.get(1).getImage()).into(im2);
                }
            }
        });

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
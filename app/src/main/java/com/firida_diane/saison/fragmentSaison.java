package com.firida_diane.saison;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

public class fragmentSaison extends Fragment {

    private String title="";

    private static final String ARG_SECTION_TITLE = "titre_page";

    public static fragmentSaison newInstance(String title) {
        fragmentSaison fragment = new fragmentSaison();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title = getArguments().getString(ARG_SECTION_TITLE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_saison, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.section_label1);
        tvLabel.setText( title);
        MainActivity mainActivity = (MainActivity) getActivity();
        ImageView imageView=view.findViewById(R.id.imageView01);
        imageView.setImageResource(R.drawable.print);
        imageView.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                mainActivity.viewPager.setCurrentItem(0);
            }
        });
        ImageView imageView1=view.findViewById(R.id.imageView02);
        imageView1.setImageResource(R.drawable.aut);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                mainActivity.viewPager.setCurrentItem(1);
            }
        });

        ImageView imageView2=view.findViewById(R.id.imageView03);
        imageView2.setImageResource(R.drawable.et);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                mainActivity.viewPager.setCurrentItem(3);
            }
        });
        ImageView imageView3=view.findViewById(R.id.imageView04);
        imageView3.setImageResource(R.drawable.hiv);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                mainActivity.viewPager.setCurrentItem(3);
            }
        });

        return view;
    }
}

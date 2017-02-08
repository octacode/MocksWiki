package octacode.allblue.code.wikipediaeditor.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;
import octacode.allblue.code.wikipediaeditor.R;
import octacode.allblue.code.wikipediaeditor.SearchActivity;
import octacode.allblue.code.wikipediaeditor.adapters.MainRandomAdapter;
import octacode.allblue.code.wikipediaeditor.adapters.SlidingImageAdapter;


public class HomeFragment extends Fragment {

    private final Integer[] IMAGES= {R.drawable.apple,R.drawable.police,R.drawable.apple,R.drawable.police};
    private ArrayList<Integer> ImagesArray = new ArrayList<>();
    private final String LOG_TAG = getClass().getSimpleName();
    public HomeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_home, container, false);
        //Code for the ViewPager
        AutoScrollViewPager mPager;
        final EditText msearchText;
        ImageView msearchButton;

        mPager = (AutoScrollViewPager)rootView.findViewById(R.id.pager);
        msearchText = (EditText)rootView.findViewById(R.id.search_text);
        msearchButton = (ImageView)rootView.findViewById(R.id.search_image);

        Collections.addAll(ImagesArray, IMAGES);
        mPager.setAdapter(new SlidingImageAdapter(getContext(),ImagesArray));
        mPager.setInterval(5000);
        mPager.startAutoScroll();
        msearchText.setHint("Apple");
        mPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                //Log.d(LOG_TAG,String.valueOf(position));
                if(position%2==0)
                    msearchText.setHint("Apple");
                else
                    msearchText.setHint("Police");
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        msearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchQuery = msearchText.getText().toString().trim();
                if(searchQuery.equals(""))
                    startActivity(new Intent(getContext(),SearchActivity.class).putExtra("SEARCH_QUERY",msearchText.getHint().toString()));
                else
                    startActivity(new Intent(getContext(),SearchActivity.class).putExtra("SEARCH_QUERY",msearchText.getText().toString()));
            }
        });
        //Code for the ViewPager ends here.

        RecyclerView recyclerView = (RecyclerView)rootView.findViewById(R.id.main_random_rv);

        MainRandomAdapter mainRandomAdapter = new MainRandomAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mainRandomAdapter);

        /*
        FloatingActionButton fab = (FloatingActionButton)rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */

        return rootView;
    }
}

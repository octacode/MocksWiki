package octacode.allblue.code.wikipediaeditor.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;
import octacode.allblue.code.wikipediaeditor.R;

/**
 * Created by shasha on 1/2/17.
 */

public class MainRandomAdapter extends RecyclerView.Adapter<MainRandomAdapter.RandomViewHolder>{

    private AutoScrollViewPager mPager;
    private Context mContext;
    private final Integer[] IMAGES= {R.drawable.apple,R.drawable.police,R.drawable.apple,R.drawable.police};
    private ArrayList<Integer> ImagesArray = new ArrayList<>();
    private final String LOG_TAG = getClass().getSimpleName();
    private EditText msearchText;
    private ImageView msearchButton;

    class RandomViewHolder extends RecyclerView.ViewHolder{

        public RandomViewHolder(View itemView) {
            super(itemView);
        }
    }

    public MainRandomAdapter(Context mContext){this.mContext=mContext;}

    @Override
    public RandomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //if(viewType==0){
        //    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_random_list_item_first,parent,false);
        //    mPager = (AutoScrollViewPager) view.findViewById(R.id.pager);
        //    msearchText = (EditText) view.findViewById(R.id.search_text);
        //    msearchButton = (ImageView) view.findViewById(R.id.search_image);
        //    return new RandomViewHolder(view);
        //}
        //else{
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_random_list_item,parent,false);
            return new RandomViewHolder(view);
        //}
    }

    @Override
    public void onBindViewHolder(RandomViewHolder holder, int position) {
/*
        if(position==0){
            Collections.addAll(ImagesArray, IMAGES);
            mPager.setAdapter(new SlidingImageAdapter(mContext,ImagesArray));
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
                        mContext.startActivity(new Intent(mContext,SearchActivity.class).putExtra("SEARCH_QUERY",msearchText.getHint().toString()));
                    else
                        mContext.startActivity(new Intent(mContext,SearchActivity.class).putExtra("SEARCH_QUERY",msearchText.getText().toString()));
                }
            });
        }
        else{

        }*/
    }

    @Override
    public int getItemCount() {
        return 11;
    }

    @Override
    public int getItemViewType(int position) {
        /*
        if(position==0)
            return 0;
        else
            return 1;
        */
        return super.getItemViewType(position);
    }
}

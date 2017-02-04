package octacode.allblue.code.wikipediaeditor;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shasha on 4/2/17.
 */
public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {

    Context mContext;

    public class SearchViewHolder extends RecyclerView.ViewHolder{
        public SearchViewHolder(View itemView) {
            super(itemView);
            frame = (CardView)itemView.findViewById(R.id.frame);
        }
    }

    CardView frame;
    public SearchAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType!=0)
        return new SearchViewHolder(LayoutInflater.from(mContext).inflate(R.layout.search_list_item,parent,false));
        else{
            return new SearchViewHolder(LayoutInflater.from(mContext).inflate(R.layout.search_list_item_first,parent,false));
        }
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    @Override
    public int getItemViewType(int position) {
        if(position==0)
            return 0;
        else
            return 1;
    }

    @Override
    public void onBindViewHolder(SearchViewHolder holder, int position) {
        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext,));
            }
        });
    }
}

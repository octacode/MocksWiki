package octacode.allblue.code.wikipediaeditor.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import octacode.allblue.code.wikipediaeditor.R;

/**
 * Created by shasha on 5/2/17.
 */

public class SectionsAdapter extends RecyclerView.Adapter<SectionsAdapter.SectionsViewHolder> {

    public class SectionsViewHolder extends RecyclerView.ViewHolder{

        public SectionsViewHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public void onBindViewHolder(SectionsViewHolder holder, int position) {

    }

    @Override
    public SectionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SectionsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.sections_item,parent,false));
    }

}

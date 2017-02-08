package octacode.allblue.code.wikipediaeditor.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import octacode.allblue.code.wikipediaeditor.R;

/**
 * Created by shasha on 6/2/17.
 */

public class LoadProjectAdapter extends RecyclerView.Adapter<LoadProjectAdapter.LoadProjectHolder> {

    public class LoadProjectHolder extends RecyclerView.ViewHolder{

        public LoadProjectHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public LoadProjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LoadProjectHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_load_project,parent,false));
    }

    @Override
    public void onBindViewHolder(LoadProjectHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

}

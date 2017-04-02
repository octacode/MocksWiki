package octacode.allblue.code.wikipediaeditor.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import octacode.allblue.code.wikipediaeditor.activities.EditorActivity;
import octacode.allblue.code.wikipediaeditor.R;

/**
 * Created by shasha on 5/2/17.
 */

public class SectionsAdapter extends RecyclerView.Adapter<SectionsAdapter.SectionsViewHolder> {
    TextView sections_text;
    Context mContext;

    class SectionsViewHolder extends RecyclerView.ViewHolder{
        SectionsViewHolder(View itemView) {
            super(itemView);
            sections_text=(TextView)itemView.findViewById(R.id.sections_text);
        }
    }

    public SectionsAdapter(Context context){
        mContext=context;
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @Override
    public void onBindViewHolder(SectionsViewHolder holder, int position) {
        sections_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, EditorActivity.class));
            }
        });
    }

    @Override
    public SectionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SectionsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.sections_item,parent,false));
    }
}
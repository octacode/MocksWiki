package octacode.allblue.code.wikipediaeditor.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import octacode.allblue.code.wikipediaeditor.R;
import octacode.allblue.code.wikipediaeditor.adapters.LoadProjectAdapter;

public class SavedPagesFragment extends Fragment {

    RecyclerView recyclerView;
    public SavedPagesFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_load_project,container,false);
        Toast.makeText(getContext(),getClass().getSimpleName(),Toast.LENGTH_SHORT).show();
        recyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_load_project);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new LoadProjectAdapter());
        return rootView;
    }
}
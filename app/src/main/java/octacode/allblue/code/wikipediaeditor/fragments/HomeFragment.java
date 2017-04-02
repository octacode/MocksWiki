package octacode.allblue.code.wikipediaeditor.fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import octacode.allblue.code.wikipediaeditor.R;
import octacode.allblue.code.wikipediaeditor.adapters.MainRandomAdapter;


public class HomeFragment extends Fragment {

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
        RecyclerView recyclerView = (RecyclerView)rootView.findViewById(R.id.main_random_rv);

        MainRandomAdapter mainRandomAdapter = new MainRandomAdapter(getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mainRandomAdapter);
        return rootView;
    }
}

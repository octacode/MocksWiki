package octacode.allblue.code.wikipediaeditor.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import octacode.allblue.code.wikipediaeditor.R;

/**
 * Created by shasha on 13/2/17.
 */

public class HtmlTextFragment extends Fragment {
    public HtmlTextFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_content_detail, container, false);
        return rootView;
    }
}
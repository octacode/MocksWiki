package octacode.allblue.code.wikipediaeditor.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URL;

import octacode.allblue.code.wikipediaeditor.R;
import octacode.allblue.code.wikipediaeditor.adapters.SectionsAdapter;

public class DetailActivity extends AppCompatActivity {

    private String LOG_TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Aurio");

        final TextView preview = (TextView) findViewById(R.id.preview);

        preview.setText("15 Words 15 Words 15 Words 15 Words 15 Words 15 Words 15 Words 15 Words 15 Words 15 Words 15 Words 15 Words 15 Words 15 Words 15 Words");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View dialogView = View.inflate(DetailActivity.this,R.layout.dialog_forgot_password,null);
                AlertDialog dialog = new AlertDialog.Builder(DetailActivity.this)
                        .setView(dialogView)
                        .setTitle("Enter the title of the section.")
                        .setPositiveButton("Create", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                startActivity(new Intent(DetailActivity.this, EditorActivity.class));
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .create();
                        dialog.show();
            }
        });

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_sections);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new SectionsAdapter(this));
    }
}
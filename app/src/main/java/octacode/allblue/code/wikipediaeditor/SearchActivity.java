package octacode.allblue.code.wikipediaeditor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import octacode.allblue.code.wikipediaeditor.adapters.SearchAdapter;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toast.makeText(this,getIntent().getStringExtra("SEARCH_QUERY"),Toast.LENGTH_SHORT).show();
        RecyclerView recv = (RecyclerView)findViewById(R.id.recv);
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recv.setLayoutManager(llm);
        recv.setAdapter(new SearchAdapter(this));
    }
}

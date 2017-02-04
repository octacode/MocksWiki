package octacode.allblue.code.wikipediaeditor;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;
import octacode.allblue.code.wikipediaeditor.adapter.MainRandomAdapter;
import octacode.allblue.code.wikipediaeditor.adapter.SlidingImageAdapter;

public class MainRandomActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private final Integer[] IMAGES= {R.drawable.apple,R.drawable.police,R.drawable.apple,R.drawable.police};
    private ArrayList<Integer> ImagesArray = new ArrayList<>();
    private final String LOG_TAG = getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_random);

        //Code for the ViewPager
        AutoScrollViewPager mPager;
        final EditText msearchText;
        ImageView msearchButton;

        mPager = (AutoScrollViewPager)findViewById(R.id.pager);
        msearchText = (EditText)findViewById(R.id.search_text);
        msearchButton = (ImageView)findViewById(R.id.search_image);

        Collections.addAll(ImagesArray, IMAGES);
        mPager.setAdapter(new SlidingImageAdapter(this,ImagesArray));
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
                    startActivity(new Intent(MainRandomActivity.this,SearchActivity.class).putExtra("SEARCH_QUERY",msearchText.getHint().toString()));
                else
                    startActivity(new Intent(MainRandomActivity.this,SearchActivity.class).putExtra("SEARCH_QUERY",msearchText.getText().toString()));
            }
        });


        //Code for the ViewPager ends here.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.main_random_rv);

        MainRandomAdapter mainRandomAdapter = new MainRandomAdapter(this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mainRandomAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_random, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        /*

        if (id == R.id.nav_home) {
            Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_saved_pages) {
            Toast.makeText(this,"Saved Pages",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_edited_pages) {
            Toast.makeText(this,"Edited Pages",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_drafts) {
            Toast.makeText(this,"Drafts",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_settings) {
            Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_how_to) {
            Toast.makeText(this,"How To",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_about){
            Toast.makeText(this,"About BuildmLearn",Toast.LENGTH_SHORT).show();
        }
        */

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

package octacode.allblue.code.wikipediaeditor.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import octacode.allblue.code.wikipediaeditor.R;
import octacode.allblue.code.wikipediaeditor.fragments.AboutFragment;
import octacode.allblue.code.wikipediaeditor.fragments.DraftsFragment;
import octacode.allblue.code.wikipediaeditor.fragments.EditedPagesFragment;
import octacode.allblue.code.wikipediaeditor.fragments.HomeFragment;
import octacode.allblue.code.wikipediaeditor.fragments.SavedPagesFragment;

public class MainRandomActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FrameLayout fragment_container;
    TextView toolbar_title;
    FloatingActionButton fab;
    private int double_press_counter=0;
    TextView login_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_random);
        double_press_counter=0;

        toolbar_title = (TextView)findViewById(R.id.toolbar_title);
        fragment_container = (FrameLayout)findViewById(R.id.fragment_container);
        fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setVisibility(View.VISIBLE);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new HomeFragment()).commit();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Editing Enabled",Snackbar.LENGTH_SHORT).show();
                fab.setImageResource(R.drawable.search);
                fab.setSize(FloatingActionButton.SIZE_MINI);
                if(fab.getSize()==FloatingActionButton.SIZE_MINI) {
                    fab.setImageResource(R.drawable.edit);
                    fab.setSize(FloatingActionButton.SIZE_NORMAL);
                }
            }
        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View headerView = navigationView.getHeaderView(0);
        login_signup = (TextView)headerView.findViewById(R.id.login_signup);
        login_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainRandomActivity.this,LogSignAskActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        double_press_counter++;
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        if(double_press_counter==1)
            Toast.makeText(this,"Press again to exit.",Toast.LENGTH_SHORT).show();
        if(getSupportFragmentManager().findFragmentById(R.id.fragment_container).isVisible()) {
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory(Intent.CATEGORY_HOME);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                double_press_counter = 0;
        }
        else{
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
        //Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();

        if (id == R.id.nav_home) {

            if(!fab.isShown())
                fab.setVisibility(View.VISIBLE);

            getSupportFragmentManager().beginTransaction().setTransition(android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(R.id.fragment_container, new HomeFragment()).commit();
            toolbar_title.setText("wikiEdit");

        } else if (id == R.id.nav_saved_pages) {

            if(fab.isShown())
                fab.setVisibility(View.GONE);

            getSupportFragmentManager().beginTransaction().setTransition(android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(R.id.fragment_container, new SavedPagesFragment()).commit();
            toolbar_title.setText(item.getTitle());

        } else if (id == R.id.nav_edited_pages) {

            if(fab.isShown())
                fab.setVisibility(View.GONE);

            getSupportFragmentManager().beginTransaction().setTransition(android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(R.id.fragment_container, new EditedPagesFragment()).commit();
            toolbar_title.setText(item.getTitle());

        } else if (id == R.id.nav_drafts) {

            if(fab.isShown())
                fab.setVisibility(View.GONE);

            getSupportFragmentManager().beginTransaction().setTransition(android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(R.id.fragment_container, new DraftsFragment()).commit();
            toolbar_title.setText(item.getTitle());

        } else if (id == R.id.nav_settings) {

            if(fab.isShown())
                fab.setVisibility(View.GONE);

            toolbar_title.setText(item.getTitle());
        }

        else if (id == R.id.nav_how_to) {

            if(fab.isShown())
                fab.setVisibility(View.GONE);
            startActivity(new Intent(this,IntroActivity.class));
        }

        else if (id == R.id.nav_about){

            if(fab.isShown())
                fab.setVisibility(View.GONE);

            toolbar_title.setText(item.getTitle());
            getSupportFragmentManager().beginTransaction().setTransition(android.support.v4.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(R.id.fragment_container,new AboutFragment()).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

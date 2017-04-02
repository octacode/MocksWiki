package octacode.allblue.code.wikipediaeditor.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import octacode.allblue.code.wikipediaeditor.R;
import octacode.allblue.code.wikipediaeditor.fragments.HtmlTextFragment;
import octacode.allblue.code.wikipediaeditor.fragments.TextFragment;
import octacode.allblue.code.wikipediaeditor.fragments.WikiTextFragment;

public class EditorActivity extends AppCompatActivity {

    EditText editor;
    TextView textView_box, htmlTv;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TextFragment(), "Text");
        adapter.addFragment(new WikiTextFragment(), "wikiText");
        adapter.addFragment(new HtmlTextFragment(), "HTML Text");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
        /*
        editor = (EditText)findViewById(R.id.editor_box);
        textView_box = (TextView)findViewById(R.id.textview_box);
        htmlTv = (TextView)findViewById(R.id.htmltextview_box);
        String twenty_words = "20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words";
        final String wikiText = "This is a simple [[Hello World]] wiki tag";
        final String htmlText = WikiModel.toHtml(wikiText);
        //Toast.makeText(this,Html.fromHtml(htmlText),Toast.LENGTH_SHORT).show();
        textView_box.setText(wikiText);
        htmlTv.setText(htmlText);
        editor.setText(Html.fromHtml(htmlText));
        editor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                htmlTv.setText(Html.toHtml(editor.getText()));
                HTML2WikiConverter conv=new HTML2WikiConverter();
                conv.setInputHTML(String.valueOf(htmlTv.getText()));
                textView_box.setText(conv.toWiki(new ToWikipedia()));
                if(editor.getText().length()==50)
                Toast.makeText(getApplicationContext(),Html.fromHtml(WikiModel.toHtml(String.valueOf(textView_box.getText()))),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.edit_menu, menu);
        return true;
    }

    private CharSequence noTrailingWhiteLines(CharSequence text) {

        while (text.charAt(text.length() - 1) == '\n') {
            text = text.subSequence(0, text.length() - 1);
        }
        return text;
    }
}
*/
}
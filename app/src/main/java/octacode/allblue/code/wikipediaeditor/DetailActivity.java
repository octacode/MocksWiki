package octacode.allblue.code.wikipediaeditor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import octacode.allblue.code.wikipediaeditor.adapter.SectionsAdapter;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Aurio");
        TextView textView = (TextView)findViewById(R.id.qwe);
        String html = "<div class=\\\"mf-section-0\\\" id=\\\"mf-section-0\\\"></div><h3 class=\\\"section-heading in-block\\\"><div class=\\\"mw-ui-icon mw-ui-icon-element indicator\\\"></div><span class=\\\"mw-headline\\\" id=\\\"Ancient_policing\\\">Ancient policing</span><span class=\\\"mw-editsection\\\"><span class=\\\"mw-editsection-bracket\\\">[</span><a href=\\\"/w/index.php?title=Police&amp;action=edit&amp;section=1\\\" title=\\\"Edit section: Ancient policing\\\">edit source</a><span class=\\\"mw-editsection-bracket\\\">]</span></span></h3><div class=\\\"mf-section-1\\\" id=\\\"mf-section-1\\\">\\n<p>Law enforcement in <a href=\\\"/wiki/History_of_China\\\" title=\\\"History of China\\\">ancient China</a> was carried out by \\\"prefects\\\" for thousands of years since it developed in both the <a href=\\\"/wiki/Chu_(state)\\\" title=\\\"Chu (state)\\\">Chu</a> and <a href=\\\"/wiki/Jin_(Chinese_state)\\\" title=\\\"Jin (Chinese state)\\\">Jin</a> kingdoms of the <a href=\\\"/wiki/Spring_and_Autumn_period\\\" title=\\\"Spring and Autumn period\\\">Spring and Autumn period</a>. In Jin, dozens of prefects were spread across the state, each having limited authority and employment period. They were appointed by local magistrates, who reported to higher authorities such as governors, who in turn were appointed by the emperor, and they oversaw the civil administration of their \\\"prefecture\\\", or jurisdiction. Under each prefect were \\\"subprefects\\\" who helped collectively with law enforcement in the area. Some prefects were responsible for handling investigations, much like modern police detectives. Prefects could also be women.<sup id=\\\"cite_ref-1\\\" class=\\\"reference\\\"><a href=\\\"#cite_note-1\\\">[1]</a></sup> The concept of the \\\"prefecture system\\\" spread to other cultures such as Korea and Japan.</p>\\n<p>In <a href=\\\"/wiki/Ancient_Greece\\\" title=\\\"Ancient Greece\\\">ancient Greece</a>, publicly owned slaves were used by magistrates as police. In <a href=\\\"/wiki/Athens\\\" title=\\\"Athens\\\">Athens</a>, a group of 300 <a href=\\\"/wiki/Scythian\\\" class=\\\"mw-redirect\\\" title=\\\"Scythian\\\">Scythian</a> slaves (the <span lang=\\\"grc\\\" xml:lang=\\\"grc\\\">\\u1fe5\\u03b1\\u03b2\\u03b4\\u03bf\\u1fe6\\u03c7\\u03bf\\u03b9</span>, \\\"rod-bearers\\\") was used to guard public meetings to keep order and for <a href=\\\"/wiki/Crowd_control\\\" title=\\\"Crowd control\\\">crowd control</a>, and also assisted with dealing with <a href=\\\"/wiki/Criminals\\\" class=\\\"mw-redirect\\\" title=\\\"Criminals\\\">criminals</a>, handling prisoners, and making arrests. Other duties associated with modern policing, such as investigating crimes, were left to the citizens themselves.<sup id=\\\"cite_ref-2\\\" class=\\\"reference\\\"><a href=\\\"#cite_note-2\\\">[2]</a></sup></p>\\n<p>In the <a href=\\\"/wiki/Roman_empire\\\" class=\\\"mw-redirect\\\" title=\\\"Roman empire\\\">Roman empire</a>, the army, rather than a dedicated police organization, provided security. Local watchmen were hired by cities to provide some extra security. Magistrates such as <i><a href=\\\"/wiki/Procurator_Fiscal\\\" class=\\\"mw-redirect\\\" title=\\\"Procurator Fiscal\\\">procurators fiscal</a></i> and <i><a href=\\\"/wiki/Quaestor\\\" title=\\\"Quaestor\\\">quaestors</a></i> investigated crimes. There was no concept of public prosecution, so victims of crime or their families had to organize and manage the prosecution themselves.</p>\\n<p>Under the reign of <a href=\\\"/wiki/Augustus\\\" title=\\\"Augustus\\\">Augustus</a>, when the capital had grown to almost one million inhabitants, 14 <a href=\\\"/wiki/Ward_(country_subdivision)\\\" class=\\\"mw-redirect\\\" title=\\\"Ward (country subdivision)\\\">wards</a> were created; the wards were protected by seven squads of 1,000 men called <i>\\\"<a href=\\\"/wiki/Vigiles\\\" title=\\\"Vigiles\\\">vigiles</a>\\\"</i>, who acted as firemen and nightwatchmen. Their duties included apprehending thieves and robbers and capturing runaway slaves. The vigiles were supported by the <a href=\\\"/wiki/Urban_Cohort\\\" class=\\\"mw-redirect\\\" title=\\\"Urban Cohort\\\">Urban Cohorts</a> who acted as a heavy-duty anti-riot force and even the <a href=\\\"/wiki/Praetorian_Guard\\\" title=\\\"Praetorian Guard\\\">Praetorian Guard</a> if necessary.</p>\\n<ol class=\\\"references\\\"><li id=\\\"cite_note-1\\\"><span class=\\\"mw-cite-backlink\\\"><b><a href=\\\"#cite_ref-1\\\">^</a></b></span> <span class=\\\"reference-text\\\">Whittaker, Jake. \\\"UC Davis East Asian Studies\\\". University of California, Davis. <a rel=\\\"nofollow\\\" class=\\\"external text\\\" href=\\\"http://eastasian.ucdavis.edu/research.htm\\\">UCdavis.edu</a> <a rel=\\\"nofollow\\\" class=\\\"external text\\\" href=\\\"https://web.archive.org/web/20081007143652/http://eastasian.ucdavis.edu/research.htm\\\">Archived</a> October 7, 2008, at the <a href=\\\"/wiki/Wayback_Machine\\\" title=\\\"Wayback Machine\\\">Wayback Machine</a>.</span></li>\\n<li id=\\\"cite_note-2\\\"><span class=\\\"mw-cite-backlink\\\"><b><a href=\\\"#cite_ref-2\\\">^</a></b></span> <span class=\\\"reference-text\\\"><cite class=\\\"citation book\\\">Hunter, Virginia J. (1994). <a rel=\\\"nofollow\\\" class=\\\"external text\\\" href=\\\"http://press.princeton.edu/titles/5349.html\\\"><i>Policing Athens: Social Control in the Attic Lawsuits, 420-320 B.C.</i></a> Princeton, NJ: Princeton University Press. p.\\u00a03. <a href=\\\"/wiki/International_Standard_Book_Number\\\" title=\\\"International Standard Book Number\\\">ISBN</a>\\u00a0<a href=\\\"/wiki/Special:BookSources/978-1-4008-0392-7\\\" title=\\\"Special:BookSources/978-1-4008-0392-7\\\">978-1-4008-0392-7</a>.</cite><span title=\\\"ctx_ver=Z39.88-2004&amp;rfr_id=info%3Asid%2Fen.wikipedia.org%3APolice&amp;rft.aufirst=Virginia+J.&amp;rft.aulast=Hunter&amp;rft.btitle=Policing+Athens%3A+Social+Control+in+the+Attic+Lawsuits%2C+420-320+B.C.&amp;rft.date=1994&amp;rft.genre=book&amp;rft_id=http%3A%2F%2Fpress.princeton.edu%2Ftitles%2F5349.html&amp;rft.isbn=978-1-4008-0392-7&amp;rft.pages=3&amp;rft.place=Princeton%2C+NJ&amp;rft.pub=Princeton+University+Press&amp;rft_val_fmt=info%3Aofi%2Ffmt%3Akev%3Amtx%3Abook\\\" class=\\\"Z3988\\\"><span style=\\\"display:none;\\\">\\u00a0</span></span></span></li>\\n</ol></div>";
        /*
        html = html.replaceAll("<(.*?)\\>"," ");//Removes all items in brackets
        html = html.replaceAll("<(.*?)\\\n"," ");//Must be undeneath
        html = html.replaceFirst("(.*?)\\>", " ");//Removes any connected item to the last bracket
        html = html.replaceAll("&nbsp;"," ");
        html = html.replaceAll("&amp;"," ");
        */
        textView.setText(Html.fromHtml(html));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_sections);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new SectionsAdapter(this));
    }
}

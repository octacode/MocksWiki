package octacode.allblue.code.wikipediaeditor.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.WindowManager;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

import octacode.allblue.code.wikipediaeditor.R;

/**
 * Created by shasha on 7/2/17.
 */

public class IntroActivity extends AppIntro{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        addSlide(AppIntroFragment.newInstance("wikiEdit", "I noe the colors suck, Well they aren't permanent I will be changing them soon.", R.drawable.wiki,Color.GRAY));
        addSlide(AppIntroFragment.newInstance("Test", "Is it lookin' good?", R.drawable.wiki, Color.YELLOW));
        addSlide(AppIntroFragment.newInstance("Test", "Is it lookin' good?", R.drawable.wiki_logo, Color.GREEN));
        addSlide(AppIntroFragment.newInstance("Test", "Is it lookin' good?", R.drawable.apple, Color.BLACK));
        addSlide(AppIntroFragment.newInstance("Test", "Is it lookin' good?", R.drawable.police, Color.BLUE));
        addSlide(AppIntroFragment.newInstance("Test", "Is it lookin' good?", R.drawable.logo_buildmlearn, Color.RED));
        setSlideOverAnimation();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(this,MainRandomActivity.class));
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(this,MainRandomActivity.class));
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
    }
}

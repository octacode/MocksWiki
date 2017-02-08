package octacode.allblue.code.wikipediaeditor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditorActivity extends AppCompatActivity {

    EditText editor;
    TextView textView_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);
        editor = (EditText)findViewById(R.id.editor_box);
        textView_box = (TextView)findViewById(R.id.textview_box);
        String twenty_words = "20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words 20 Words";
        editor.setText(twenty_words);
        textView_box.setText(twenty_words);

        editor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView_box.setText(editor.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}

package octacode.allblue.code.wikipediaeditor.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import octacode.allblue.code.wikipediaeditor.R;

public class LoginActivity extends AppCompatActivity {
    private final String LOG_TAG = getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        EditText loginUsername = (EditText)findViewById(R.id.login_username);
        EditText loginPassword = (EditText)findViewById(R.id.login_password);
        TextView forgotPassword = (TextView)findViewById(R.id.forgot_password);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = View.inflate(LoginActivity.this,R.layout.dialog_forgot_password, null);

                final AlertDialog dialog_confirm = new AlertDialog.Builder(LoginActivity.this)
                        .setTitle("Confimation Message")
                        .setMessage("An email has been sent to your email id")
                        .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).create();

                final AlertDialog alertDialog = new AlertDialog.Builder(LoginActivity.this)
                        .setTitle("Enter your email")
                        .setView(dialogView)
                        .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog_confirm.show();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).create();
                alertDialog.show();
            }
        });
    }
}

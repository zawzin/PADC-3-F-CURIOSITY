package xyz.zzp.ass_curiosity;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvFacebook;
    TextView tvGoogle;
    TextView tvTwitter;
    TextView tvEmailSignUp;
    TextView tvEmailSignIn;
    Typeface typeface;

    public static class FontManager {

        public static final String ROOT = "fonts/",
                FONTAWESOME = ROOT + "fontawesome-webfont.ttf";

        public static Typeface getTypeface(Context context, String font) {
            return Typeface.createFromAsset(context.getAssets(), font);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeface = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        tvFacebook=findViewById(R.id.tv_facebook);
        tvGoogle = findViewById(R.id.tv_google);
        tvTwitter = findViewById(R.id.tv_twitter);
        tvEmailSignUp = findViewById(R.id.tv_email_sign_up);
        tvEmailSignIn = findViewById(R.id.tv_email_sign_in);

        tvFacebook.setTypeface(typeface);
        tvGoogle.setTypeface(typeface);
        tvTwitter.setTypeface(typeface);
        tvEmailSignIn.setTypeface(typeface);
        tvEmailSignUp.setTypeface(typeface);
    }

}


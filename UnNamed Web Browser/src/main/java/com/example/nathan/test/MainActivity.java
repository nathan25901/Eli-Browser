package com.example.nathan.test;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    WebView wv;
    EditText urlBox;

    private ArrayList<String> formerURLList = new ArrayList<>();

    @Override
    public void onBackPressed()
    {
        if(wv.canGoBack())
        {
            wv.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Activity activity = this;
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        urlBox = (EditText) findViewById(R.id.urlBar);
        // urlSpinnerBox = (Spinner) findViewById(R.id.urlSpinner);

        wv = (WebView) findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setFocusable(true);
        wv.setFocusableInTouchMode(true);
        wv.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);

        wv.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        wv.getSettings().setDomStorageEnabled(true);
        wv.getSettings().setDatabaseEnabled(true);
        wv.getSettings().setAppCacheEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        wv.loadUrl("https://www.google.com/");
        wv.setWebViewClient(new WebViewClient());
        goToTabActivityListener();
        generalInputListener();
        checkForTab();

    }


    public void loadNewURL()
    {
        String url = urlBox.getText().toString();



        if(!url.toLowerCase().contains("www.".toLowerCase()))
        {
            url = "www." + url;
        }

        if (!url.toLowerCase().contains("http".toLowerCase()) || !url.toLowerCase().contains("https".toLowerCase()));
        {
            url = "https://" + url;
        }

        if(url != null)
        {
            formerURLList.add(url);
            wv.loadUrl(url);
            wv.setWebViewClient(new WebViewClient());

        }
    }


    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        View view = activity.getCurrentFocus();
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }


    private void goToTabActivityListener()
    {
        ImageButton tabButton = (ImageButton) findViewById(R.id.tabButton);
        tabButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, Tabs.class);
                intent.putStringArrayListExtra("key", formerURLList);
                startActivity(intent);
                //startActivity(new Intent(MainActivity.this, Tabs.class));

            }
        });
    }

    private void generalInputListener()
    {
        urlBox.setOnKeyListener(new View.OnKeyListener()
        {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if((event.getAction() == KeyEvent.ACTION_DOWN) && keyCode == KeyEvent.KEYCODE_ENTER)
                {
                    loadNewURL();
                    // hideKeyboard(activity);
                    return true;
                }
                return false;
            }
        });
    }

    private void checkForTab()
    {
        if(getIntent().getExtras() != null)
        {
            Bundle extras = getIntent().getExtras();
            if(extras != null)
            {
                String newUrl = extras.getString("key");
                wv.loadUrl(newUrl);
                wv.setWebViewClient(new WebViewClient());
            }

        }
    }





}

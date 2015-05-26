package com.ismaeltoe.flowlayout.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.ismaeltoe.FlowLayout;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlowLayout flowContainer = (FlowLayout) findViewById(R.id.flow_container);

        for (Locale locale : Locale.getAvailableLocales()) {
            String countryName = locale.getDisplayCountry();
            if (!countryName.isEmpty()) {
                flowContainer.addView(createDummyTextView(countryName),
                        new FlowLayout.LayoutParams(
                                FlowLayout.LayoutParams.WRAP_CONTENT,
                                FlowLayout.LayoutParams.WRAP_CONTENT));
            }
        }
    }

    private View createDummyTextView(String text) {
        TextView textView = new TextView(this);
        textView.setText(text);
        return textView;
    }
}

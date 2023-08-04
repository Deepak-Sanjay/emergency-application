package com.example.medicalapplicationsystem;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;


public class firstaid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstaid);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textViewGradient = findViewById(R.id.textgrad1);
        TextView textgrad1 = null;
        applyTextGradient(null, "#FF0000", "#0000FF");
    }

    private void applyTextGradient(TextView textgrad1, String startColor, String endColor) {
        TextView textView = null;
        String text = textView.getText().toString();
        SpannableString spannableString = new SpannableString(text);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(android.graphics.Color.parseColor(startColor));
        spannableString.setSpan(foregroundColorSpan, 0, text.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        textView.setText(spannableString);

        Shader textShader = new LinearGradient(0, 0, textView.getPaint().measureText(text), textView.getTextSize(),
                new int[]{android.graphics.Color.parseColor(startColor), android.graphics.Color.parseColor(endColor)},
                null, Shader.TileMode.CLAMP);
        textView.getPaint().setShader(textShader);
    }

    }
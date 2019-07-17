package com.example.anagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mSourceLine;
    private TextView mAnagrams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSourceLine = findViewById(R.id.source_text);
        mAnagrams = findViewById(R.id.palindrome);

        mSourceLine.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mAnagrams.setText(getAnagram(mSourceLine.getText().toString()));
            }
        });
    }

    public static String getAnagram(String source) {

        String result = "";

        for (String word: source.split(" ")) {

            int size = word.length();
            char tmp;
            char[] characters = word.toCharArray();

            int left = 0;
            int right = size - 1;

            while (left < right) {

                if (!Character.isLetter(characters[left]) &&
                        Character.isLetter(characters[right])) {

                    while (!Character.isLetter(characters[left]) && left < right) {
                        left++;
                    }

                } else if (Character.isLetter(characters[left]) &&
                        !Character.isLetter(characters[right])) {

                    while (!Character.isLetter(characters[right]) && left < right) {
                        right--;
                    }

                }

                if (Character.isLetter(characters[left]) &&
                        Character.isLetter(characters[right]) && left < right) {

                    tmp = characters[left];
                    characters[left] = characters[right];
                    characters[right] = tmp;

                }

                right--;
                left++;
            }

            if (result == "") {
                result += new String(characters);
            } else {
                result += " " + new String(characters);
            }
        }

        return result;
    }

}

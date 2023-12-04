package com.example.excerise3_2_nhom4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int voteCount1 = 0;
    private int voteCount2 = 0;
    private int voteCount3 = 0;
    private TextView textViewVoteCount1,textViewVoteCount2,textViewVoteCount3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewVoteCount1 = findViewById(R.id.textViewVoteCount1);
        textViewVoteCount2= findViewById(R.id.textViewVoteCount2);
        textViewVoteCount3 = findViewById(R.id.textViewVoteCount3);
    }

    public void onVoteButtonClick1(View view) {
        String selectedOption1 = ((Button) view).getText().toString();

        // Tăng số lượng bình chọn
        voteCount1++;

        // Hiển thị số lượng bình chọn mớ
        textViewVoteCount1.setText("Độc Thân: " + voteCount1);

    }
    public void onVoteButtonClick2(View view) {
        String selectedOption1 = ((Button) view).getText().toString();

        // Tăng số lượng bình chọn
        voteCount2++;

        // Hiển thị số lượng bình chọn mớ
        textViewVoteCount2.setText("Đã có chủ: " + voteCount2);

    }
    public void onVoteButtonClick3(View view) {
        String selectedOption1 = ((Button) view).getText().toString();

        // Tăng số lượng bình chọn
        voteCount3++;

        // Hiển thị số lượng bình chọn mớ
        textViewVoteCount3.setText("LGBT: " + voteCount3);

    }
}
package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    private Button likeButton;
    private Button deleteButton;
    private Button saveButton;

    private TextView likeCounter;

    private int likeCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likeButton = findViewById(R.id.likeButton);
        deleteButton = findViewById(R.id.deleteButton);
        saveButton = findViewById(R.id.saveButton);

        likeCounter = findViewById(R.id.likeCounter);
        System.out.println(likeCounter);

        likeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                likeCount++;
                updateLikeCounter();
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(likeCount > 0)
                {
                    likeCount--;
                    updateLikeCounter();
                }
            }
        });
    }

    public void updateLikeCounter()
    {
        if(likeCount == 1)
            likeCounter.setText(likeCount + " polubienie");
        else if(likeCount > 1 && likeCount < 5)
            likeCounter.setText(likeCount + " polubienia");
        else
            likeCounter.setText(likeCount + " polubień");
    }
}
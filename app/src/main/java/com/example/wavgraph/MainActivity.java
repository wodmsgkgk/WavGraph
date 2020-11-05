package com.example.wavgraph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.net.URISyntaxException;

public class MainActivity extends AppCompatActivity {
    static final int REQUEST_AUDIO_OPEN = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectAudio();
    }

    public void selectAudio() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("audio/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent, REQUEST_AUDIO_OPEN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_AUDIO_OPEN && resultCode == RESULT_OK) {
            Uri uri = data.getData();
            File file = new File(uri.getPath());//create path from uri
            Log.d("wodms", "uri : " + uri + ", file : " + PathUtil.getPath(this, uri));
        }
    }
}
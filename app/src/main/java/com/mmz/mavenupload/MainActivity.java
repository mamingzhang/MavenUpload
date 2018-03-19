package com.mmz.mavenupload;

import android.app.Activity;
import android.os.Bundle;

import com.mmz.localrepo.LocalRepo;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //test local repo
        LocalRepo.localrepo();
    }
}

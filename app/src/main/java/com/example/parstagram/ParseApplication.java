package com.example.parstagram;

import com.example.parstagram.models.Post;
import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("9OM0w3PZIWTAHnBwRWLWW7F1cTOhdPlnn8th4Uoo")
                .clientKey("ckpADzmPovlW9mpWheMeO6cawqAAD7ktmVIOYP1Q")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

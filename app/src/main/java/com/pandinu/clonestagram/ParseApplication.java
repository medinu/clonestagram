package com.pandinu.clonestagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("v7rH20HSTg9UA9fKK3xYjadM6gCZecnUlHm2nCcY")
                .clientKey("N9pDBUxrqhcpQNgEaCKnHCJfBru2EudYMA6ggZvL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

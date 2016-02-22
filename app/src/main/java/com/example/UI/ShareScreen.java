package com.example.UI;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import Controller.LifeStreamController;

/**
 * Created by محمد on 22/02/2016.
 */
public class ShareScreen {

    public static void shareUrl(Activity firstScreen){
        LifeStreamController lifeStreamController=new LifeStreamController();
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody =lifeStreamController.urlValue() ;
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
       firstScreen. startActivity(Intent.createChooser(sharingIntent, "Share "));
    }
}

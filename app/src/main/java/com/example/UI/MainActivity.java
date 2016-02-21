package com.example.UI;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.app.Activity;
//import android.support.v4.app.Fragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import Controller.LifeStreamController;


public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
PlaceholderFragment n=new PlaceholderFragment();
            getFragmentManager().beginTransaction()
                   .add(R.id.container, new PlaceholderFragment()).commit();

         //   getSupportFragmentManager().beginTransaction().add(R.id.container,new PlaceholderFragment()).commit();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment  implements MediaPlayer.OnCompletionListener/*implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener, MediaController.MediaPlayerControl */{
      VideoView life_vv;
  /*private MediaPlayer mediaPlayer;
        private SurfaceHolder vidHolder;
        private SurfaceView vidSurface;
        private MediaController mediaController;
        private Handler handler = new Handler();
        String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
    */
  String url = "http://lb218.cdn.mangomolo.com/218/smil:218.smil/playlist.m3u8";
   LifeStreamController lifeStreamController=new LifeStreamController();
        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            life_vv=(VideoView)rootView.findViewById(R.id.life_stream);
           // String vidAddress = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
            //Uri vidUri = Uri.parse(vidAddress);
            life_vv.setMediaController(new MediaController(getActivity()));
            life_vv.setOnCompletionListener(this);
            life_vv.setVideoURI(Uri.parse(lifeStreamController.urlValue()));
            life_vv.start();
          /* life_vv.setVideoURI(vidUri);
            MediaController vidControl = new MediaController(getActivity());
            vidControl.setAnchorView(life_vv);
            life_vv.setMediaController(vidControl);

            life_vv.start();*/
            /*
            vidSurface = (SurfaceView)rootView.findViewById(R.id.surfView);
            vidHolder = vidSurface.getHolder();
            vidHolder.addCallback(this);*/
            return rootView;
        }

        @Override
        public void onCompletion(MediaPlayer mp) {
            getActivity().finish();
        }

        public static void showRemoteVideo(Context ctx, String url) {
            Intent i = new Intent(ctx, MainActivity.class);

            i.putExtra("url", url);
            ctx.startActivity(i);
        }
        /*  @Override
        public void surfaceCreated(SurfaceHolder holder) {
            try {
                mediaPlayer = new MediaPlayer();
                mediaController = new MediaController(getActivity());
                mediaPlayer.setDisplay(vidHolder);
                mediaPlayer.setDataSource(vidAddress);
                mediaPlayer.prepare();
                mediaPlayer.setOnPreparedListener(this);
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {

        }

        @Override
        public void onPrepared(MediaPlayer mp) {
            mediaPlayer.start();
            handler.post(new Runnable() {
                public void run() {
                    mediaController.setEnabled(true);
                    mediaController.show();
                }
            });
        }

        @Override
        public void start() {
       mediaPlayer.start();
        }

        @Override
        public void pause() {
        mediaPlayer.pause();
        }

        @Override
        public int getDuration() {
            return mediaPlayer.getDuration();
        }

        @Override
        public int getCurrentPosition() {
            return mediaPlayer.getCurrentPosition();
        }

        @Override
        public void seekTo(int pos) {
         mediaPlayer.seekTo(pos);
        }

        @Override
        public boolean isPlaying() {
            return mediaPlayer.isPlaying();
        }

        @Override
        public int getBufferPercentage() {
            return 0;
        }

        @Override
        public boolean canPause() {
            return true;
        }

        @Override
        public boolean canSeekBackward() {
            return false;
        }

        @Override
        public boolean canSeekForward() {
            return true;
        }

        @Override
        public int getAudioSessionId() {
            return 0;
        }

        @Override
        public void onStop() {
            super.onStop();
            mediaController.hide();
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        public boolean onTouchEvent(MotionEvent event) {
            //the MediaController will hide after 3 seconds - tap the screen to make it appear again
            mediaController.show();
            return false;
        }*/

    }
}

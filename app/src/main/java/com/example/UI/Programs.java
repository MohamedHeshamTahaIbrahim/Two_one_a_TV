package com.example.UI;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import Controller.ProgramsController;


public class Programs extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_programs, menu);
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
    public static class PlaceholderFragment extends Fragment {

        ListView list_Images_lv;
        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_programs, container, false);
            final ProgramsController programsController=new ProgramsController();
            CustomListAdapter adapter=new CustomListAdapter(getActivity(), programsController.displayProgramsName(), programsController.displayProgramsImages(),programsController.displayProgramsDescription());
            list_Images_lv=(ListView)rootView.findViewById(R.id.list);
            list_Images_lv.setAdapter(adapter);

            list_Images_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    // TODO Auto-generated method stub
                    /*String Slecteditem= programsController.displayProgramsName()[+position];
                    //Integer Selctimage=imgid[+position]
                    if(Slecteditem==programsController.displayProgramsName()[0]){
                        Intent intent=new Intent(getActivity(),OutsideProgram.class);
                        getActivity().startActivity(intent);
                    }*/
                    ProgramsScreenManager programsScreenManager=new ProgramsScreenManager();
                    programsScreenManager.openProgramsscreen(getActivity(),position);
                  // Toast.makeText(getActivity(), Slecteditem, Toast.LENGTH_SHORT).show();

                }
            });
            return rootView;
        }
    }
}

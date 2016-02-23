package com.example.UI;

import android.app.Activity;
import android.content.Intent;

import Controller.ProgramsController;

/**
 * Created by محمد on 23/02/2016.
 */
public class ProgramsScreenManager {
    public static void openProgramsscreen(Activity activity,int position){
        ProgramsController programsController=new ProgramsController();
        String value=programsController.displayProgramsName()[+position];
        if(value==programsController.displayProgramsName()[0]){
            Intent intent=new Intent(activity,OutsideProgram.class);
            activity.startActivity(intent);
        }
        else if (value==programsController.displayProgramsName()[1]){
            Intent intent=new Intent(activity,WeAndWorldProgram.class);
            activity.startActivity(intent);
        }
        else if (value==programsController.displayProgramsName()[2]){
            Intent intent=new Intent(activity,GameProgram.class);
            activity.startActivity(intent);
        }
        else if (value==programsController.displayProgramsName()[3]){
            Intent intent=new Intent(activity,GovernmentProgram.class);
            activity.startActivity(intent);
        }
        else if (value==programsController.displayProgramsName()[4]){
            Intent intent=new Intent(activity,FanProgram.class);
            activity.startActivity(intent);
        }
        else if (value==programsController.displayProgramsName()[5]){
            Intent intent=new Intent(activity,MeragePrograms.class);
            activity.startActivity(intent);
        }
        else if (value==programsController.displayProgramsName()[6]){
            Intent intent=new Intent(activity,MorningProgram.class);
            activity.startActivity(intent);
        }
        else if (value==programsController.displayProgramsName()[7]){
            Intent intent=new Intent(activity,NewsProgram.class);
            activity.startActivity(intent);
        }
        else if (value==programsController.displayProgramsName()[8]){
            Intent intent=new Intent(activity,CountriesProgram.class);
            activity.startActivity(intent);
        }
        else{
            Intent intent=new Intent(activity,EveProgram.class);
            activity.startActivity(intent);
        }
    }
}

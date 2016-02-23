package Controller;

import Communication.ProgramsCommunication;
import Data.ProgramsModel;

/**
 * Created by محمد on 22/02/2016.
 */
public class ProgramsController {
    ProgramsCommunication programsCommunication=new ProgramsCommunication();
    public String [] displayProgramsName() {
    String []programsNameValue;
     programsNameValue=programsCommunication.displayProgramsName();
        return programsNameValue;
    }
    public String [] displayProgramsDescription(){
        String []programsDescriptionValue;
        programsDescriptionValue=programsCommunication.displayProgramsDescription();
        return programsDescriptionValue;
    }
    public Integer []displayProgramsImages(){
        Integer []programsImageValue;
        programsImageValue=programsCommunication.displayProgramsImages();
        return programsImageValue;
    }
    }

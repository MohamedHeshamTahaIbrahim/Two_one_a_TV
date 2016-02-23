package Data;

/**
 * Created by محمد on 22/02/2016.
 */
public class ProgramsModel {
    private String[]programNames;
    private String []programDescription;
    private Integer []programImages;

    public void setProgramNames(String[] programNames) {
        this.programNames = programNames;
    }

    public void setProgramDescription(String[] programDescription) {
        this.programDescription = programDescription;
    }

    public void setProgramImages(Integer[] programImages) {
        this.programImages = programImages;
    }

    public String[] getProgramNames() {
        return programNames;
    }

    public String[] getProgramDescription() {
        return programDescription;
    }

    public Integer[] getProgramImages() {
        return programImages;
    }
}

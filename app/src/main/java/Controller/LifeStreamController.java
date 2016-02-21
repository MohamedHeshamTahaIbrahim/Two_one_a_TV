package Controller;

import Communication.LifeStreamCommunication;

/**
 * Created by محمد on 21/02/2016.
 */
public class LifeStreamController {
    LifeStreamCommunication lifeStreamCommunication=new LifeStreamCommunication();
    public String urlValue(){
            String url;
        url=lifeStreamCommunication.urlValue();
        return url;
    }
}

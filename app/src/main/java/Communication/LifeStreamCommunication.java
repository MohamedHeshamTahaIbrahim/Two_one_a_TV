package Communication;

import Data.LifeStreamModel;

/**
 * Created by محمد on 21/02/2016.
 */
public class LifeStreamCommunication {
    String urlValue="http://lb218.cdn.mangomolo.com/218/smil:218.smil/playlist.m3u8";
    LifeStreamModel lifeStreamModel=new LifeStreamModel();

    public String urlValue(){
        lifeStreamModel.setUrl(urlValue);
       return lifeStreamModel.getUrl();
    }

}

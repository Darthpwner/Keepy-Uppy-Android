package matthewallenlinsoftware.keepy_uppy.Music;

/**
 * Created by Darthpwner on 12/25/15.
 */
public class Music {
    private static Boolean startSongStarted = false;
    private static Boolean gameplaySongStarted = false;

    //Getters
    public Boolean getStartSongStarted() {
        return startSongStarted;
    }

   public Boolean getGameplaySongStarted() {
        return gameplaySongStarted;
    }

    //Setters
   public void setStartSongStarted(Boolean value) {
        startSongStarted = value;
    }

    public void setGameplaySongStarted(Boolean value) {
        gameplaySongStarted = value;
    }
}

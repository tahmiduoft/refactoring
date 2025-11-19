package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private final String playId;
    private final int audience;

    /**
     * Creates a performance for a play.
     * @param playId the identifier of the play being performed
     * @param audience the audience size for the performance
     */
    public Performance(String playId, int audience) {
        this.playId = playId;
        this.audience = audience;
    }

    /**
     * Returns the play identifier for this performance.
     * @return the play identifier
     */
    public String getPlayId() {
        return playId;
    }

    /**
     * Returns the audience size for this performance.
     * @return the audience size
     */
    public int getAudience() {
        return audience;
    }
}

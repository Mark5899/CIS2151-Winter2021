package chapte6review;

public class Ball {

    private boolean isMoving;
    private String description;

    public Ball(String description) {
        isMoving = false;
        setDescription(description);
    }

    public void toss() {
        isMoving = true;
    }

    public void capture() {
        isMoving = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsMoving() {
        return isMoving;
    }
}

package chapte6review;

public class Chapte6Review {

    public static void main(String[] args) {
        Ball soccerBall = new Ball("soccer ball");
        soccerBall.toss();
        if (soccerBall.getIsMoving()) {
            System.out.println("The " + soccerBall.getDescription() + " is moving!");
        } else {
            System.out.println("Someone captured the " + soccerBall.getDescription());
        }
        
        soccerBall.capture();
        if (soccerBall.getIsMoving()) {
            System.out.println("The " + soccerBall.getDescription() + " is moving!");
        } else {
            System.out.println("Someone captured the " + soccerBall.getDescription());
        }

    }

}

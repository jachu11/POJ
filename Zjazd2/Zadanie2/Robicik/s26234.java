package gamers;

import main.Config;
import main.Pair;
import main.PhysicalObject;
import main.Unit;

public class s26234 extends Unit {

    public s26234(String id, Pair<Double, Double> position, double r, CollisionModel model) {
        super(id, position, r, model);
    }

    @Override
    public void run() {
        this.enableStopOnWall();
        this.enableMovement();
       // this.rotateBy();
        this.rotateRight();
        this.forward();
       /* try {
            this.wait(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       */
        if (nearestCollision() > 0 && whatIsInRange() == 0) {
            this.stopRotate();
        }

        while (true) {
            if (whatIsInRange() !=0 ) {
                this.attackInNextMove();
            }

            while (this.whatIsInRange() != 0) {
                atakujJesliMozesz();
            }

            for (;;) {

                try {
                    Thread.sleep((long) (100d / Config.EMULATION_SPEED));
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }
                final int randAngle = -120 + (int) (Math.random() * 360);
                if (this.nearestCollision() <= 2 && nearestCollision() >= 0) {
                    if (this.whatIsInRange() == 3) {
                        for (int i = 0; i < 1100; i++) {
                            try {
                                Thread.sleep(1);
                            } catch (final InterruptedException e) {
                                e.printStackTrace();
                            }
                            this.attackInNextMove();
                        }
                    } else {
                        rotateBy(120);
                    }
                } else {
                    rotateBy(randAngle);
                }
                // System.out.println(this.nearestCollision());
            }
        }
    }
    void atakujJesliMozesz() {
        while (this.whatIsInRange() == 3)
            this.attackInNextMove();
    }
    //private void rotateBy() {
  //  }
}

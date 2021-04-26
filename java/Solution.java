package java;

public class Solution {

    public static void main(String args[]) {

        Fan.rotate("anti-clockwise");
        Fan.rotate("anti-clockwise");
        Fan.rotate("anti-clockwise");
        Fan.rotate("clockwise");
        Fan.rotate("clockwise");
        Fan.rotate("clockwise");
        Fan.rotate("clockwise");

    }
}

class Fan {

    static String state = "clockwise";
    static int speed = 1;

    public static void rotate(String state) {

        ++speed;
        Fan.state = state;
        if (speed > 3) {
            Fan.speed = 0;
            System.out.println("Fan is switched off!");
        } else {
            System.out.println("Fan speed is : " + speed);
            System.out.println("Fan rotates in " + state);
        }
    }
}
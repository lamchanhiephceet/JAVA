
    public class Fan {

    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public Fan() {
        }
        public String toString() {
            if(on) {
                return "fan is on" + "\nSpeed: "+speed+ "\nColor: "+color+ "\nRadius: " + radius;
            }
            else {
                return "fan is off" + "\nColor: "+color+ "\nRadius " + radius;
            }
        }

        public static void main(String[] args) {
            Fan fan1 = new Fan();
            Fan fan2 = new Fan();

            fan1.setOn(true);
            fan1.setSpeed(Fan.FAST);
            fan1.setColor("yellow");
            fan1.setRadius(10);

            fan2.setOn(false);
            fan2.setSpeed(Fan.MEDIUM);
            fan2.setColor("blue");
            fan2.setRadius(5);

            System.out.println("Fan 1: ");
            System.out.println(fan1.toString());
            System.out.println("");
            System.out.println("Fan 2: ");
            System.out.println(fan2.toString());
        }
    }
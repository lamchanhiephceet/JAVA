
    public class Circle extends Shape implements Resizeable {
        private double radius = 1;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        @Override
        public void resize(double percent) {
            this.setRadius(this.getRadius() + (getRadius() * percent / 100));
        }

    }

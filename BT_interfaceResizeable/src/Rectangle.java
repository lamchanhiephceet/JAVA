import javax.swing.plaf.metal.MetalButtonUI;

    public class Rectangle extends Shape implements Resizeable {
        private double height = 1;
        private double width = 2;

        public Rectangle() {
        }

        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }

        public Rectangle(String color, boolean filled, double height, double width) {
            super(color, filled);
            this.height = height;
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getAreaRetanle() {
            return width * height;
        }

        @Override
        public void resize(double percent) {
            this.setHeight(this.getHeight() + (this.getHeight() * percent / 100));
            this.setWidth(this.getWidth() + (this.getWidth() * percent / 100));
        }
    }


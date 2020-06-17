
    public class Square extends Rectangle implements Resizeable {
        public Square() {
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(String color, boolean filled, double side) {
            super(color, filled, side, side);
        }

        public double getSide() {
            return getWidth();
        }

        public void setSide(double side) {
            super.setWidth(side);
            super.setHeight(side);
        }

        @Override
        public void setHeight(double height) {
            setSide(height);
        }

        @Override
        public void setWidth(double width) {
            setSide(width);
        }

        @Override
        public double getAreaRetanle() {
            return super.getAreaRetanle();
        }

        @Override
        public void resize(double percent) {
            this.setSide(this.getSide()+(this.getSide()*percent/100));
        }
    }


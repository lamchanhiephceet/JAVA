public class point3D extends point2D {
    private float z = 0.0f;

    public point3D() {

    }

    public point3D(float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] f = new float[3];
        f[0] = getX();
        f[1] = getY();
        f[2] = z;
        return f;
    }

    @Override
    public String toString() {
        return "("+getX()+", "+getY()+", "+z+")";

    }
}

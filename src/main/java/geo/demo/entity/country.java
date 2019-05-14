package geo.demo.entity;

public class country {

    private int OBJECTID;
    private String DLBM;
    private String DLMC;
    private double SHAPE_Leng;
    private double SHAPE_Length;
    private double SHAPE_Area;

    public int getOBJECTID() {
        return OBJECTID;
    }

    public void setOBJECTID(int OBJECTID) {
        this.OBJECTID = OBJECTID;
    }

    public String getDLBM() {
        return DLBM;
    }

    public void setDLBM(String DLBM) {
        this.DLBM = DLBM;
    }

    public String getDLMC() {
        return DLMC;
    }

    public void setDLMC(String DLMC) {
        this.DLMC = DLMC;
    }

    public double getSHAPE_Leng() {
        return SHAPE_Leng;
    }

    public void setSHAPE_Leng(double SHAPE_Leng) {
        this.SHAPE_Leng = SHAPE_Leng;
    }

    public double getSHAPE_Length() {
        return SHAPE_Length;
    }

    public void setSHAPE_Length(double SHAPE_Length) {
        this.SHAPE_Length = SHAPE_Length;
    }

    public double getSHAPE_Area() {
        return SHAPE_Area;
    }

    public void setSHAPE_Area(double SHAPE_Area) {
        this.SHAPE_Area = SHAPE_Area;
    }
}

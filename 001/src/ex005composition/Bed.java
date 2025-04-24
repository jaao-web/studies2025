package ex005composition;

public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int sheets, int quilt, int pillows, int height) {
        this.style = style;
        this.sheets = sheets;
        this.quilt = quilt;
        this.pillows = pillows;
        this.height = height;
    }

    public void make(){
        System.out.print("Bed -> Making | ");
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getSheets() {
        return sheets;
    }

    public String getStyle() {
        return style;
    }
}

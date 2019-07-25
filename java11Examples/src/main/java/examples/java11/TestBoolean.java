package examples.java11;

public class TestBoolean {

    private boolean isflag;


    public boolean isIsflag() {
        return isflag;
    }

    public void setIsflag(boolean isflag) {
        this.isflag = isflag;
    }


    public static void main(String[] args) {
        TestBoolean testBoolean  = new TestBoolean();

        System.out.println(testBoolean.isflag);
    }
}

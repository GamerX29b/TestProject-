package spring;

public class SpringReaderDB {
    private String OVNER, TABLE_NAME;

    public SpringReaderDB(String OVNER, String TABLE_NAME) {
        this.OVNER = OVNER;
        this.TABLE_NAME = TABLE_NAME;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[OVNER=%d, TABLE_NAME='%s']",
                OVNER, TABLE_NAME);
    }

}

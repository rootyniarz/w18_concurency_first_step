public class MyImmutableClass {
    private final String fieldOne;
    private final long fieldTwo;
    public MyImmutableClass(String fieldOne, long fieldTwo) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
    }
    public String getFieldOne() {
        return fieldOne;
    }
    public long getFieldTwo() {
        return fieldTwo;
    }
}

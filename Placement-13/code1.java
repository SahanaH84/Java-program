public class Code1 {
    private int intValue;
    private String stringValue;
    public Code1() {
        System.out.println("No-arguments constructor called.");
    }
    public Code1(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
        System.out.println("Parameterized constructor with int and String called.");
    }
    public Code1(int intValue) {
        this.intValue = intValue;
        System.out.println("Parameterized constructor with int called.");
    }
    public Code1(String stringValue) {
        this.stringValue = stringValue;
        System.out.println("Parameterized constructor with String called.");
    }
    public int getIntValue() {
        return intValue;
    }
    public String getStringValue() {
        return stringValue;
    }
    public static void main(String[] args) {
        Code1 obj1 = new Code1();
        Code1 obj2 = new Code1(42, "Hello");
        Code1 obj3 = new Code1(10);
        Code1 obj4 = new Code1("World");
        System.out.println("Int Value in obj2: " + obj2.getIntValue());
        System.out.println("String Value in obj2: " + obj2.getStringValue());
    }
}

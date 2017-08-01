public class HelloWorldTest {
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();

        String greeting = hw.greet();
        String greetingWithName = hw.greet("Derek");

        if(greeting.equals("Hello World") || greetingWithName.equals("Hello Derek")){
            System.out.println("Successful");
        } else {
            System.out.println("Fail");
        }

    }
}

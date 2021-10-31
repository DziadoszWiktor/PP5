package pl.wiktordziadosz.Greeter;

public class Greeter {
    public String hello(String name) {
        //return "Hello "+name;
        return String.format("Hello %s",name);
    }
}

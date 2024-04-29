public class Main {
    public static void main(String[] args) {
        SomeBean someBean = new SomeBean();
        someBean = new Injector().inject(someBean);
        someBean.foo();
    }
}

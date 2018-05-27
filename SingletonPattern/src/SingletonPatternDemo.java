public class SingletonPatternDemo {

    public static void main(String[] args) {
        Singleton singleObject = Singleton.getUniqueInstance();
        singleObject.showMessage();
    }
}

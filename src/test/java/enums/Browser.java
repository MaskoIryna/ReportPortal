package enums;

public enum Browser {
    CHROME("chrome"),
    FIREFOX("firefox");



    final String browserName;

    Browser(String browserName){
        this.browserName = browserName;
    }
}

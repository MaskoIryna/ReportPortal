package enums;

public enum Browser {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE ("edge");



    final String browserName;

    Browser(String browserName){
        this.browserName = browserName;
    }
}

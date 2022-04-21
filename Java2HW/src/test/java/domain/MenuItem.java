package domain;

public enum MenuItem {
    NEW("Новинки"), LOCATION("Адреса");

    public final String rusName;

    MenuItem(String rusName){
        this.rusName= rusName;
    }
}

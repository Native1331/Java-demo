package domain;

public enum MenuItem {
    New("Новинки"), Location("Адреса");

    public final String rusName;

    MenuItem(String rusName){
        this.rusName= rusName;
    }
}

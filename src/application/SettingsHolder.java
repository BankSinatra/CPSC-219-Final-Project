package application;

public final class SettingsHolder {
    private Settings settings;

    private final static SettingsHolder INSTANCE = new SettingsHolder();

    private SettingsHolder(){}

    public static SettingsHolder getInstance() {
        return INSTANCE;
    }

    public void setSettings(Settings s){
        this.settings = s;
    }

    public Settings getSettings(){
        return this.settings;
    }
}

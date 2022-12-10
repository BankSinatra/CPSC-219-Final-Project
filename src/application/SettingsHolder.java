package application;

/**
 * Settings holder singleton
 */
public final class SettingsHolder {
    private Settings settings;

    private final static SettingsHolder INSTANCE = new SettingsHolder();

    private SettingsHolder(){}

    public static SettingsHolder getInstance() {
        return INSTANCE;
    }
/**
 * settings setter
 * @param s stores settings that are inputted by the user as a program 
 */
    public void setSettings(Settings s){
        this.settings = s;
    }
/**
 * Settings getter
 * @return the settings that have been saved
 */
    public Settings getSettings(){
        return this.settings;
    }
}

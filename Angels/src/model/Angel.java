package model;

public class Angel {

    private static final String POWERS = "la protección, la salud, la abundancia, la justicia, la lealtad, pero el usuario puede crear más poderes. Cada arcángel se le asigna una vela especial, la cual tiene un color, un tamaño, una esencia y un grado de iluminancia.";

    private String name, type, photo, prayer, cDay, power;

    private Candle candle;

    public Angel(String name, String type, String photo, String prayer, String cDay, String power, Candle candle) {
        this.name = name;
        this.type = type;
        this.photo = photo;
        this.prayer = prayer;
        this.cDay = cDay;
        this.power = power;
        this.candle = candle;
    }

    public static String getPowers() {
        return POWERS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPrayer() {
        return prayer;
    }

    public void setPrayer(String prayer) {
        this.prayer = prayer;
    }

    public String getcDay() {
        return cDay;
    }

    public void setcDay(String cDay) {
        this.cDay = cDay;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Candle getCandle() {
        return candle;
    }

    public void setCandle(Candle candle) {
        this.candle = candle;
    }

}
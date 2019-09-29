package model;

/**
 * This class represents an angel
 * 
 * @author Camilo Cordoba.
 * @since 1.0
 */
public class Angel {

    //Angel's attributes
    private String name, type, photo, prayer, cDay, power, cMonth;

    //Relation
    private Candle candle;

    //Constructor method
    public Angel(String name, String type, String photo, String prayer, String cMonth, String cDay, String power,
            Candle candle) {
        this.name = name;
        this.type = type;
        this.photo = photo;
        this.prayer = prayer;
        this.cMonth = cMonth;
        this.cDay = cDay;
        this.power = power;
        this.candle = candle;

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
 
    /**
     * This method is a basic toString with some modifications
     * <b>pre:</b> Nothing <br>
     * <b>post:</b> Something <br>
     * @return Super String
     */
    public String toString() {
        return "\n   Nombre: " + name + "\n   Tipo: " + type + "\n   Link de la foto: " + photo + "\n   Oracion: "
                + prayer + "\n   Fecha de celebracion: " + cDay + " de " + cMonth + "\n   Poder:   " + power + "\n"
                + getCandle().toString();
    }

    public String getcMonth() {
        return cMonth;
    }

    public void setcMonth(String cMonth) {
        this.cMonth = cMonth;
    }

    /**
     * This method is a basic toString with some modifications
     * <b>pre:</b> Nothing <br>
     * <b>post:</b> Something <br>
     * @return subString
     */
    public String byMonth() {
        return "\n   Nombre: " + name + "\n   Dia: " + cDay + "\n   Color de la vela: " + getCandle().getColor()
                + "\n   Esencia de la vela: " + getCandle().getEssence() + "\n";
    }

    /**
     * This method is a basic toString with some modifications
     * <b>pre:</b> Nothing <br>
     * <b>post:</b> Something <br>
     * @return subString
     */
    public String toFinalString() {
        return "\n   Nombre: " + name + "\n   Fecha de celebracion: " + cDay + " de " + cMonth + "\n";
    }

}
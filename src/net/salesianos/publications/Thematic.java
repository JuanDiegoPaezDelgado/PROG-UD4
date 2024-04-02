package net.salesianos.publications;

public enum Thematic {
    DARK_NOVEL("Novela Negra"),
    HISTORICAL_NOVEL("Novela Historica"),
    JUVENIL_NOVEL("Novela Juvenil");

    private String type;

    Thematic(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
}

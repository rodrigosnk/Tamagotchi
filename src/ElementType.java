/**
 *
 * @author Rodrigo
 */
public enum ElementType {
    FIRE("Infernoar", 110),
    AQUA("Djinn", 120),
    EARTH("Golem", 160),
    PLANT("Leafy", 110),
    SPIRIT("Specter", 90),
    SHADOW("Shade", 95),
    MECHA("Jaeger", 130),
    CELESTIAL("Ki-rin", 140);

    private final String specieName;
    private final int defaultMaxEnergy;

    ElementType(String specieName, int defaultMaxEnergy) {
        this.specieName = specieName;
        this.defaultMaxEnergy = defaultMaxEnergy;
    }

    public String getSpecieName() {
        return specieName;
    }

    public int getDefaultMaxEnergy() {
        return defaultMaxEnergy;
    }
}


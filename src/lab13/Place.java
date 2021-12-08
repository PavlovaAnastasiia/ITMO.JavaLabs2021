package lab13;

public class Place {
    String display_name;
    String osm_type;
    String type;

    @Override
    public String toString() {
        return "{display_name: " + display_name
                + ", osm_type: " + osm_type
                + ", type: " + type + "}";
    }
}

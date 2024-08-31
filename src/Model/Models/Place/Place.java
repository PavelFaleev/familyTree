package Model.Models.Place;

import java.io.Serializable;

public class Place implements Serializable{
    private int placeId;
    private String placeName;

    public Place(int placeId, String placeName) {
        this.placeId = placeId;
        this.placeName = placeName;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    
}

package com.josp.thinkingplaces;

import com.strongloop.android.loopback.ModelRepository;

/**
 * Created by Joachim on 16.04.2015.
 * Place Mapping class
 */
public class PlaceRepository extends ModelRepository<Place> {
    public PlaceRepository() {
        super("place", Place.class);
    }
}

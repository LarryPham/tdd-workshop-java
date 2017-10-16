package org.braddle.tddworkshop.shop;

import java.util.Map;

/**
 * Created by mark.bradley on 13/10/2017.
 */
public class MyHttpRequest {

    private final String sessionID;
    private final Map<String, String> attributes;

    public MyHttpRequest(String sessionID, Map<String, String> attributes) {

        this.sessionID = sessionID;
        this.attributes = attributes;
    }

    public String getSessionID() {
        return sessionID;
    }

    public String getAttribute(String index) throws Exception {
        if (!attributes.containsKey(index)) {
            throw new Exception("No attribute with index " + index);
        }

        return attributes.get(index);
    }
}

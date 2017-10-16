package org.braddle.tddworkshop.shop;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MyHttpRequestTest {

    @Test
    public void testGetSession() {
        MyHttpRequest httpReq = new MyHttpRequest("abc-123-def-456", new HashMap<String, String>());

        assertEquals("abc-123-def-456", httpReq.getSessionID());
    }

    @Test (expected = Exception.class)
    public void testGetAttributeThrowExceptionWhenIndexDoesNotExist() throws Exception {
        MyHttpRequest httpReq = new MyHttpRequest("abc-123-def-456", new HashMap<String, String>());

        httpReq.getAttribute("NOT_THERE");
    }

    @Test
    public void  testGetAttributeReturnsValueWhenIndexDoesExists() throws Exception {
        Map<String, String> values = new HashMap<String, String>();
        values.put("key", "value");

        MyHttpRequest httpReq = new MyHttpRequest("abc-123-def-456", values);

        assertEquals("value", httpReq.getAttribute("key"));
    }
}

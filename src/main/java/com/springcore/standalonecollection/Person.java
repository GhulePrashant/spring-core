package com.springcore.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friendsList;
    private Map<String, String> contactDetails;
    private Properties properties;

    public Person() {
    }

    public Person(List<String> friendsList, Map<String, String> contactDetails, Properties properties) {
        this.friendsList = friendsList;
        this.contactDetails = contactDetails;
        this.properties = properties;
    }

    public List<String> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<String> friendsList) {
        this.friendsList = friendsList;
    }

    public Map<String, String> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(Map<String, String> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                " friendsList = " + friendsList +
                '}';
    }
}

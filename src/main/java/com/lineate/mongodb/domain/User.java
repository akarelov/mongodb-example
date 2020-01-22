package com.lineate.mongodb.domain;

import org.bson.types.ObjectId;

import javax.persistence.Id;

public class User {
    @Id
    private ObjectId _id;

    private String firstName;

    private String lastName;

    private String position;

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

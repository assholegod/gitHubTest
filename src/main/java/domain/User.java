package domain;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



}

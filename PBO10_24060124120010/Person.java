/**
 * File         : Person.java
 * Deskripsi    : Person database model
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Rabu, 20 Mei 2026
 */

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n; 
    }

    public int getId() {
        return id; 
    }

    public String getName() {
        return name;
    }
}
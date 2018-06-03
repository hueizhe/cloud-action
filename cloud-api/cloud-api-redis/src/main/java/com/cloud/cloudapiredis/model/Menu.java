package com.cloud.cloudapiredis.model;


import javax.persistence.*;

@Entity(name = "sys_menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "menu_name", length = 50)
    private String menuName;
    @Column(name = "menu_url", length = 50)
    private String menuUrl;
    @Column(name = "menu_desc", length = 50)
    private String menuDesc;
    @Column(name = "menu_order", length = 5, columnDefinition="int")
    private String menuOrder;


    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    public String getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(String menuOrder) {
        this.menuOrder = menuOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

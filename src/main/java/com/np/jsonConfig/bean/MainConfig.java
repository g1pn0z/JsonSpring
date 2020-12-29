package com.np.jsonConfig.bean;


public class MainConfig {

    private String text;

    public MainConfig(){

    }

    public MainConfig(String text){ this.text = text; }

    public String getText(){ return text; }

    public void setText(String text){ this.text = text;}

    @Override
    public String toString(){ return "MainConfig{"+"text='" + text + "\'"+"}"; }
}

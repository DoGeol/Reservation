package kr.co.hivelab.home.dto;

import java.util.ArrayList;
import java.util.Arrays;

public class DetailDTO {

    //Banner
    private String title;
    private String description;
    private String[] img_file_name;

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public String[] getImg_file_name() {
        return img_file_name;
    }

    public void setImg_file_name( String[] img_file_name ) {
        this.img_file_name = img_file_name;
    }

    @Override
    public String toString() {
        return "DetailDTO{" +
               "title='" + title + '\'' +
               ", description='" + description + '\'' +
               ", img_file_name=" + Arrays.toString( img_file_name ) +
               '}';
    }
}

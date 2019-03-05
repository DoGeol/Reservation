package kr.co.hivelab.home.dto;

public class EventItemDTO {
    private String id;
    private String img_file_name;
    private String title;
    private String address;
    private String content;

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getImg_file_name() {
        return img_file_name;
    }

    public void setImg_file_name(String img_file_name) {
        this.img_file_name = img_file_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "EventItemDTO{" +
                "img_file_name='" + img_file_name + '\'' +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

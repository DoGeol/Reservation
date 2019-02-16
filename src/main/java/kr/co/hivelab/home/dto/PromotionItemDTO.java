package kr.co.hivelab.home.dto;

public class PromotionItemDTO {
    private String img_file_name;
    private String title;
    private String address;
    private String event;

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

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "PromotionItemDTO{" +
                "img_file_name='" + img_file_name + '\'' +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", event='" + event + '\'' +
                '}';
    }
}

package  com.ShoppingWebsiteApplication.model;

public class Item {

    private Long id;

    private String title;

    private Double price;

    private Long quantity;

    private String pictureUrl;

    private Boolean liked ;


    public Item(Long id , String title ,Double price , Long quantity,String pictureUrl , Boolean liked) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.pictureUrl = pictureUrl;
        this.liked=liked;

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }


    public Boolean getLiked() {
        return liked;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }
}

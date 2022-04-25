package lab2.emt.dto;

public class BookTransferObject {
    private String name;
    private String category;
    private Long authorId;
    private Integer Copies;

    public BookTransferObject(String name, String category, Long authorId, Integer copies) {
        this.name = name;
        this.category = category;
        this.authorId = authorId;
        Copies = copies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Integer getCopies() {
        return Copies;
    }

    public void setCopies(Integer copies) {
        Copies = copies;
    }
}

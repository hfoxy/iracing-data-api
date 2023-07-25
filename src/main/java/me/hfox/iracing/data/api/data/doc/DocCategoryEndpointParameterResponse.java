package me.hfox.iracing.data.api.data.doc;

public class DocCategoryEndpointParameterResponse {

    private String type;
    private String note;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "DocCategoryEndpointParameterResponse{" +
                "type='" + type + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

}

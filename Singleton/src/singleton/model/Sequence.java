package singleton.model;

/**
 *
 * @author angepf
 */
public class Sequence {
    
    private Long id;
    private String tableName;
    private Long value;

    public Sequence() {
    }

    public Sequence(Long id, String tableName, Long value) {
        this.id = id;
        this.tableName = tableName;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Sequence{" + "id=" + id + ", table=" + tableName + ", value=" + value + '}';
    }
}

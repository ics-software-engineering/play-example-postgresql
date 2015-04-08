package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.db.ebean.Model;

@Entity
public class PageRetrieval extends Model {

  private static final long serialVersionUID = 1L;

  @Id
  private Long id;
  private Long timestamp = System.currentTimeMillis();

  /**
   * The EBean ORM finder method for database queries on LastTimeStamp.
   * @return The finder method for products.
   */
  public static Finder<Long, PageRetrieval> find() {
    return new Finder<Long, PageRetrieval>(Long.class, PageRetrieval.class);
  }

  /**
   * @return the timestamp associated with the page retrieval.
   */
  public Long getTimestamp() {
    return timestamp;
  }

  /**
   * @param timestamp the timestamp to set
   */
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

}

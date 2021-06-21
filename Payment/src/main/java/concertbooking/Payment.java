package concertbooking;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Payment_table")
public class Payment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long bookingId;
    private Long ccId;
    private String ccName;
    private String bookingStatus;

    @PostPersist
    public void onPostPersist(){
        StatusChanged statusChanged = new StatusChanged();
        BeanUtils.copyProperties(this, statusChanged);
        statusChanged.publishAfterCommit();


    }


    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }
    public Long getCcId() {
        return ccId;
    }

    public void setCcId(Long ccId) {
        this.ccId = ccId;
    }
    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }
    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }




}

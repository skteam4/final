package concertbooking;

import javax.persistence.*;

@Entity
@Table(name="Mypage_table")
public class Mypage {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long bookingId;
        private Long ccId;
        private String ccName;
        private Integer qty;
        private String status;


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
        public Integer getQty() {
            return qty;
        }

        public void setQty(Integer qty) {
            this.qty = qty;
        }
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

}
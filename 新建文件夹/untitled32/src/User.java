import java.io.Serializable;
public class User implements Serializable {
        protected String customernumber;
        private String name;
        private String contactinformation;
        private String contactaddress;
        private String creditrating;
        private String time;
        private String contactnumber;
        private String purchasedgoods;
    public User() {
    }

    public  User(String customernumber, String name, String contactinformation, String contactaddress, String creditrating, String time, String contactnumber, String purchasedgoods) {
            this.customernumber = customernumber;
            this.name = name;
            this.contactinformation = contactinformation;
            this.contactaddress = contactaddress;
            this.creditrating = creditrating;
            this.time = time;
            this.contactnumber = contactnumber;
            this.purchasedgoods = purchasedgoods;
        }

        public String getCustomernumber() {
            return customernumber;
        }

        public  void setCustomernumber(String customernumber) {
            this.customernumber = customernumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContactinformation() {
            return contactinformation;
        }

        public void setContactinformation(String contactinformation) {
            this.contactinformation = contactinformation;
        }

        public String getContactaddress() {
            return contactaddress;
        }

        public void setContactaddress(String contactaddress) {
            this.contactaddress = contactaddress;
        }

        public String getCreditrating() {
            return creditrating;
        }

        public void setCreditrating(String creditrating) {
            this.creditrating = creditrating;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getContactnumber(String q) {
            return contactnumber;
        }

        public void setContactnumber(String contactnumber) {
            this.contactnumber = contactnumber;
        }

        public String getPurchasedgoods() {
            return purchasedgoods;
        }

        public void setPurchasedgoods(String purchasedgoods) {
            this.purchasedgoods = purchasedgoods;
        }

    @Override
    public String toString() {
        return "Users{" +
                "客户编号" + customernumber + '\'' +
                ", 姓名='" + name + '\'' +
                ", 联系方式='" + contactinformation + '\'' +
                ", 联系地址='" + contactaddress + '\'' +
                ", 信用度='" + creditrating + '\'' +
                ", 消费时间='" + time + '\'' +
                ", 联系人编号='" + contactnumber + '\'' +
                ", 所购产品='" + purchasedgoods + '\'' +
                '}';
    }


}

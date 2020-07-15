import java.io.Serializable;

public class Contact implements Serializable {
    private String fullName;
    private String phoneNumber;
    private String group;
    private String gender;
    private String address;
    private String birth;
    private String mail;

    public Contact(String fullName, String phoneNumber, String group, String gender, String address, String birth, String mail) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.gender = gender;
        this.address = address;
        this.birth = birth;
        this.mail = mail;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "Ho ten = " + fullName + '\'' +
                ", So dien thoai = " + phoneNumber + '\'' +
                ", Nhom danh ba = " + group + '\'' +
                ", Gioi tinh = " + gender + '\'' +
                ", Dia chi = " + address + '\'' +
                ", Ngay sinh = " + birth + '\'' +
                ", Email = " + mail + '\'' +
                '}';
    }
}
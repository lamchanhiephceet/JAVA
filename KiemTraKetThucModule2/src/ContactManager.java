import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    List<Contact> contacts = new ArrayList<>();

    public void showContactsList() {
        if (contacts.size() != 0) {
            for (Contact c : contacts) {
                System.out.println(c.toString());
            }
        } else {
            System.out.println("Khong co du lieu");
        }
    }

    public boolean addNewContact(String fullName, String phoneNumber, String group, String gender, String address, String birth, String mail) {
        contacts.add(new Contact(fullName, phoneNumber, group, gender, address, birth, mail));
        return true;
    }

    public boolean updateContacts(String fullName, String phoneNumber, String group, String gender, String address, String birth, String mail) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                c.setFullName(fullName);
                c.setGroup(group);
                c.setGender(gender);
                c.setAddress(address);
                c.setBirth(birth);
                c.setMail(mail);
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean searchFullName(String fullName){
        for (Contact c : contacts){
            if (c.getFullName().toLowerCase().contains(fullName)){
                System.out.println(c.toString());
            }
        }
        return true;
    }

    public boolean searchPhoneNumber(String phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().contains(phoneNumber)) {
                System.out.println(c.toString());
            }
        }
        return true;
    }

    public void readFile(String filePath) {
        ContactIO csvManager = new ContactIO();
        if (csvManager.readFile(filePath, ",").size() == 0) {
            return;
        }
        contacts.clear();
        contacts.addAll(csvManager.readFile(filePath, ","));
    }

    public void writeFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        ContactIO csvManager = new ContactIO();
        csvManager.writeFile(contacts, filePath, ",");
    }

    public boolean isExistedPhoneNum(String phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
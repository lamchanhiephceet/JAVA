import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactIO {


    public List<Contact> readFile(String filePath, String delimiter) {
        List<Contact> list = new ArrayList<>();
        File file = new File(filePath);
        if (!file.exists()) {
            return list;
        }
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] splitData = line.split(delimiter);
                list.add(readContactInfo(splitData));
            }
        } catch (Exception e) {
        } finally {
            try {
                if (buffer != null)
                    buffer.close();
            } catch (Exception e) {
            }
        }

        return list;

    }

    public boolean writeFile(List<Contact> list, String filePath, String delimiter) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            for (Contact c : list) {
                bufferedWriter.append(c.getFullName());
                bufferedWriter.append(delimiter);
                bufferedWriter.append(c.getPhoneNumber());
                bufferedWriter.append(delimiter);
                bufferedWriter.append(c.getGroup());
                bufferedWriter.append(delimiter);
                bufferedWriter.append(c.getGender());
                bufferedWriter.append(delimiter);
                bufferedWriter.append(c.getAddress());
                bufferedWriter.append(delimiter);
                bufferedWriter.append(c.getBirth());
                bufferedWriter.append(delimiter);
                bufferedWriter.append(c.getMail());
                bufferedWriter.append(delimiter);
                bufferedWriter.append("\n");
            }
        } catch (Exception e) {
        } finally {
            try {
                bufferedWriter.close();
            } catch (Exception e) {
            }
        }

        return true;

    }

    public Contact readContactInfo(String[] contactInfo) {
        Contact contact = new Contact(contactInfo[0], contactInfo[1], contactInfo[2], contactInfo[3], contactInfo[4], contactInfo[5], contactInfo[6]);
        return contact;
    }
    }



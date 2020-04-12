public class Main {

    public static void main(String[] args) {
        /*Dictionary dict = new Dictionary();
        dict.addElement("abc");
        dict.addElement("Abc");
        dict.addElement("abcdef");
        dict.addElement("aBc");
        dict.addElement("abC");
        dict.addElement("abcdefg");
        dict.addElement("abcdef");
        dict.addElement("Abcdef");
        dict.addElement("abcdefg");
        dict.addElement("abcdefgh");
        dict.getCounts(false);*/

        PhoneBook pb = new PhoneBook();
        pb.add("Иванов", 89762455476L);
        pb.add("Петров", 8987567646L);
        pb.add("Сидоров", 89874567623L);
        pb.add("Иванов", 8923457689L);
        pb.add("Иванов", 89087123456L);
        pb.add("Жмышенко", 89065678734L);
        pb.add("Пупкин", 89763425674L);
        pb.add("Пушкин", 89087653645L);
        pb.add("Путин", 89076786545L);

        pb.printPhoneBook();

        pb.get("Иванов");
        pb.get("Петров");
        pb.get("Жмышенко");
        pb.get("Путин");
        pb.get("Медведев");

    }
}

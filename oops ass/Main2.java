interface BackupSerializable {}

class UserData implements BackupSerializable {
    String name;
    int age;

    UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class TemporaryData {
    String tempMessage;

    TemporaryData(String tempMessage) {
        this.tempMessage = tempMessage;
    }
}

class BackupProcessor {
    public static void processBackup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("✅ Backup started for: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("❌ " + obj.getClass().getSimpleName() + " is not eligible for backup.");
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        UserData user = new UserData("Krish", 20);
        TemporaryData temp = new TemporaryData("Temporary log data");

        BackupProcessor.processBackup(user);
        BackupProcessor.processBackup(temp);
    }
}

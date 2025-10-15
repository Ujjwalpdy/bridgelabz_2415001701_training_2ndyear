interface SensitiveData {}

class BankAccount implements SensitiveData {
    String accountNumber;
    double balance;
    BankAccount(String a,double b){accountNumber=a;balance=b;}
}

class CustomerInfo {
    String name,email;
    CustomerInfo(String n,String e){name=n;email=e;}
}

class EncryptionProcessor {
    static void process(Object obj){
        System.out.println(obj instanceof SensitiveData ? "🔒 Encrypting: "+obj.getClass().getSimpleName() 
                                                        : "⚠️ "+obj.getClass().getSimpleName()+" is not sensitive.");
    }
}

public class Main3{
    public static void main(String[] args){
        EncryptionProcessor.process(new BankAccount("12345",5000));
        EncryptionProcessor.process(new CustomerInfo("Krish","krish@example.com"));
    }
}

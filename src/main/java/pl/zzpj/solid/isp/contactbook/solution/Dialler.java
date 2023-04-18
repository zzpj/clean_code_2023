package pl.zzpj.solid.isp.contactbook.solution;

public class Dialler extends Contact {

    public Dialler(String name, String address, String emailAddress, String telephone) {
        super(name, address, emailAddress, telephone);
    }
    public void makeCall(Contact dialable) {
        String telephone = dialable.getTelephone();

        // call using telephone
    }
}

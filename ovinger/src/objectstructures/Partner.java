package objectstructures;


public class Partner {

    private String name;
    private Partner partner;


    public Partner(String name){
        this.name = "name";
    }

    public String getName() {
        return name;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        if (partner == this.partner) {
			return;
		}
		Partner oldPartner = this.partner;
		this.partner = partner;
		if (oldPartner != null && oldPartner.getPartner() == this) {
			oldPartner.setPartner(null);
		}
		if (this.partner != null) {
			this.partner.setPartner(this);
		}
    }

}
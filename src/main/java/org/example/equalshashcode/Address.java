
package org.example.equalshashcode;

import org.example.Resturant;

public class Address {
    public String area;
    public String pincode;
    public String faltNo;
    public String state;
    public String street;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", pincode='" + pincode + '\'' +
                ", faltNo='" + faltNo + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (this.getClass() != object.getClass())
            return false;
        Address otheraddress = (Address) object;
        return this.area.equals(otheraddress.area) &&
                this.pincode.equals(otheraddress.pincode) &&
                this.faltNo.equals(otheraddress.faltNo) &&
                this.state.equals(otheraddress.state) &&
                this.street.equals(otheraddress.street);



    }


}

package med.voll.api.doctor;

import med.voll.api.address.AddressData;

public record CreateDoctorData(String name, String crm, String email, Area actuationArea, AddressData address) {

}

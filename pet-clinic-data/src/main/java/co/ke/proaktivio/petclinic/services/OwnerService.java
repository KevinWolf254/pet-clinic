package co.ke.proaktivio.petclinic.services;

import co.ke.proaktivio.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}

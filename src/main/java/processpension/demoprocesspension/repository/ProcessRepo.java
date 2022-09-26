package processpension.demoprocesspension.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import processpension.demoprocesspension.model.ProcessModel;



@Repository
public interface ProcessRepo extends CrudRepository<ProcessModel, Long>  // Crud to interact with DB & concept of Java Inheritence to inherit attributes and methods from one class to another (Superclass or Parent class--->CrudRepository & Subclass or Child class----->PMRepository)  
{
 ProcessModel findByAadharNumber(long aadharNumber);
}

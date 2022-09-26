package processpension.demoprocesspension.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Pension")
public class ProcessModel {
	@Id
	
	@Column(name="aadhar_Number")
	private long aadharNumber;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Date_Of_Birth")
	private String date_of_birth;
	
	@Column(name="Pan")
	private String pan;
	
	@Column(name="Salary_Earned")
	private Double salaryEarned;
	
	@Column(name="Allowances")
	private Double allowances;
		
	@Column(name="Self_Pension")
	private Double selfPension;
	
	@Column(name="Family_Pension")
	private Double familyPension;
	
	@Column(name="Pension_type")
	private String pensionType;
	
	@Column(name="Bank_Name")
	private String bankName;
	
	@Column(name="Bank_Account_Number")
	private Long bankAccountNumber;
	
	
	public ProcessModel()
	{
		
	}
	
//Generate Getters & Setters from Source
	
	public long getAadharNumber()  //getAadharNumber() ---> this method is non-static so we need to create object to access it
	{
		return aadharNumber;      //since method is not void it will return
	}

	public void setAadharNumber(long aadharNumber)  //since method is void it will not return we need to create S.O.Pln
	{
		this.aadharNumber = aadharNumber;
	}

	
	
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}



	
	public String getDate_of_birth()
	{
		return date_of_birth;
	}
	
	public void setDate_of_birth(String date_of_birth) 
	{
		this.date_of_birth = date_of_birth;
	}

	


	public String getPan()
	{
		return pan;
	}
	
	public void setPan(String pan) 
	{
		this.pan = pan;
	}


	

	public Double getSalaryEarned() 
	{
		return salaryEarned;
	}

	public void setSalaryEarned(Double salaryEarned)
	{
		this.salaryEarned = salaryEarned;
	}


	

	public Double getAllowances()
	{
		return allowances;
	}

	public void setAllowances(Double allowances)
	{
		this.allowances = allowances;
	}



	
	public Double getSelfPension() 
	{
		return selfPension;
	}

	public void setSelfPension(Double selfPension)
	{
		this.selfPension = selfPension;
	}


	

	public Double getFamilyPension() 
	{
		return familyPension;
	}
	
	public void setFamilyPension(Double familyPension) 
	{
		this.familyPension = familyPension;
	}
	
	
	
	
	public String getPensionType()
	{
		return pensionType;
	}

	public void setPensionType(String pensionType)
	{
		this.pensionType = pensionType;
	}



	

	public Long getBankAccountNumber() 
	{
		return bankAccountNumber;
	}

	public void setBankAccountNumber(Long bankAccountNumber) 
	{
		this.bankAccountNumber = bankAccountNumber;
	}




	public String getBankName() 
	{
		return bankName;
	}

	public void setBankName(String bankName)
	{
		this.bankName = bankName;
	}



	public ProcessModel(long aadharNumber, String name, String date_of_birth, String pan, Double salaryEarned,
			Double allowances, Double selfPension, Double familyPension, String bankName, Long bankAccountNumber) {
		super();
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.pan = pan;
		this.salaryEarned = salaryEarned;
		this.allowances = allowances;
		this.selfPension = selfPension;
		this.familyPension = familyPension;
		this.pensionType = pensionType;
		this.bankName = bankName;
		this.bankAccountNumber = bankAccountNumber;
	}



}

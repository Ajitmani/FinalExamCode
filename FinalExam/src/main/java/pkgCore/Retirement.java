package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	public Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, 
			double dAnnualReturnRetired, double dRequiredIncome, double dMonthlySSI) 
	{
		super();
		this.iYearsToWork = iYearsToWork;
		this.dAnnualReturnWorking = dAnnualReturnWorking;
		this.iYearsRetired = iYearsRetired;
		this.dAnnualReturnRetired = dAnnualReturnRetired;
		this.dRequiredIncome = dRequiredIncome;
		this.dMonthlySSI = dMonthlySSI;
	}
	
	public int getiYearsToWork() 
	{
		return iYearsToWork;
	}

	public void setiYearsToWork(int iYearsToWork) 
	{
		this.iYearsToWork = iYearsToWork;
	}

	public double getdAnnualReturnWorking() 
	{
		return dAnnualReturnWorking;
	}

	public void setdAnnualReturnWorking(double dAnnualReturnWorking) 
	{
		this.dAnnualReturnWorking = dAnnualReturnWorking;
	}

	public int getiYearsRetired() 
	{
		return iYearsRetired;
	}

	public void setiYearsRetired(int iYearsRetired) 
	{
		this.iYearsRetired = iYearsRetired;
	}

	public double getdAnnualReturnRetired() 
	{
		return dAnnualReturnRetired;
	}

	public void setdAnnualReturnRetired(double dAnnualReturnRetired) 
	{
		this.dAnnualReturnRetired = dAnnualReturnRetired;
	}

	public double getdRequiredIncome() 
	{
		return dRequiredIncome;
	}

	public void setdRequiredIncome(double dRequiredIncome) 
	{
		this.dRequiredIncome = dRequiredIncome;
	}
	
	public double getdMonthlySSI() 
	{
		return dMonthlySSI;
	}
	
	public void setdMonthlySSI(double dMonthlySSI) 
	{
		this.dMonthlySSI = dMonthlySSI;
	}


	public double AmountToSave(double TotalAmountSaved, int iYearsToWork, double dAnnualReturn)
	{
		int MonthstoWork=iYearsToWork*12;
		double MonthlyReturn=dAnnualReturn/12;
		return TotalAmountSaved*MonthlyReturn/(Math.pow(1+MonthlyReturn, MonthstoWork)-1);
	}
	
	public double TotalAmountSaved(double dRequiredIncome, double dMonthlySSI, double dAnnualReturnRetired, int iYearsRetired)
	{
		double MoneyNeeded = dRequiredIncome-dMonthlySSI;
		double MonthlyReturnRetired=dAnnualReturnRetired/12;
		int MonthsRetired= iYearsRetired*12;
		return MoneyNeeded*(1-Math.pow(1+(MonthlyReturnRetired), MonthsRetired));
	}
}

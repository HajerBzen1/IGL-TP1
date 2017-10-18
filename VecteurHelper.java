
public class VecteurHelper 
{	
	int tab [] = new int [5];
	int max=tab[0];
	int min=tab[0];	
	
	public VecteurHelper() {for(int i=0; i<5; i++) tab[i]= 0;}

	public void Trier() 
	{		
		int x;
		for (int i=0; i<4; i++)
		{
			for (int j=i+1; j<5; j++)
			{
				if (this.tab[i]>this.tab[j])
				{
					x=this.tab[i];
					this.tab[i]=this.tab[j];
					this.tab[j]=x;
				}
			}
		}
		
	}

	public void Sommer (int tab1 [], int tab2 [])
	{
		try {
			for (int i=0; i<5; i++){tab [i] = tab1[i] + tab2[i];}
		} catch (Exception e) {	e.getMessage();	}
	}
	
	public void Inverser() {
		int x;
		for(int i=0; i<5; i++)
		{
			x = this.tab[i];
			this.tab[i]=this.tab[4-i];
			this.tab[4-i] = x;
		}
	}

	public void extrimum ()
	{
		this.Trier();
		this.max = this.tab[4];
		this.min = this.tab[0];
	}

	public void formule ()
	{
		for (int i=0; i<4; i++)
		{
			this.tab[i] = this.tab[i]+this.tab[i];
		}
	}
}

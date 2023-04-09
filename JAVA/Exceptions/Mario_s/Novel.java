
public class Novel extends Book{
	private int pages ;
	//Constructors:
	public Novel(int maxPages,String name){
		super(maxPages,name);
	}
	//Getters:
	public int getPages() {
		return pages;
	}
	//Methods:
   public String toString(){
	  return super.toString()+" "+pages;
   }
   public void read(int p) throws TooManyPages{
	   if (p>getMaxPages())
		   throw new TooManyPages("Can't read more pages "+
					"than maxPages: "+getMaxPages() );
	
	   pages=p;
   	}

}
